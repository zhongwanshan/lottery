(function () {
    var pageVue = new Vue({
        el: "#js-pageRs9",
        data: {
            userInfo: USERINFO,
            matchData: [],
            matchList: [],
            matchInfoObj: null,
            numList: [],
            num: "",
            matchNum: 0,
            betNum: 0,
            selectItem: {
                "num": 0,
            },
            buyInfo: {
                "action": CONFIG.ACTION.previewOrder,
                "lotteryTypeId": "1003", // 彩种ID
                "issueNo": "", // 投注的彩票期号,
                "type": 0, // 0：预计算 1：暂存 2：正式订单
                "betDetail": "", // 用户原始投注内容
                "multipleNum": 1 // 投注倍数
            },
            isShowMenu: false,
            totalOrderPrice: 0
        },
        watch: {
            "buyInfo.multipleNum": function (value) {
                var self = this;

                if (value <= 0) {
                    self.buyInfo.multipleNum = 1;
                }

                if(self.selectItem.num >= 9) {
                    self.setOrderInfo();
                }
            }
        },
        methods: {
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
            // 设置复选框
            setCheckBox: function (data) {
                var self = this;
                var dataArr = [];

                for (var i = 0, len = data.length; i < len; i++) {
                    (function (i) {
                        data[i]["matchInfo"] = {
                            "sf": []
                        };
                        dataArr.push(data[i]);
                    })(i);
                }

                return dataArr;

            },

            // 重新格式化赛事数据
            formatMatchData: function () {
                var self = this;
                var numList = [];
                var timeObj = {};

                for (var i = 0, len = self.matchList.length; i < len; i++) {
                    (function (i) {
                        var num = self.matchList[i]["num"];
                        numList.push(num);
                        timeObj[num] = [];
                    })(i);
                }

                // 设置当前期号
                self.numList = $.unique(numList); // 去除重复的数据
                self.num = self.numList[0];
                self.buyInfo.issueNo = self.numList[0];

                for (var key in timeObj) {
                    if (timeObj.hasOwnProperty(key)) {
                        for (var t = 0, tlen = self.matchList.length; t < tlen; t++) {
                            (function (t) {
                                var num = self.matchList[t]["num"];
                                if (key == num) {
                                    timeObj[key].push(self.matchList[t])
                                }
                            })(t);
                        }
                    }
                }

                self.matchInfoObj = timeObj;
            },
            // 竞彩足球获取当前可售足球赛事信息接口
            geFbTraditionMatches: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.lotteryService, CONFIG.ACTION.geFbTraditionMatches, {
                            action: CONFIG.ACTION.geFbTraditionMatches
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.lotteryService,
                    dataObj: {
                        action: CONFIG.ACTION.geFbTraditionMatches
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            if(data.data) {
                                self.matchList = self.setCheckBox(data.data);
                                self.formatMatchData();
                                self.matchData = self.matchInfoObj[self.num];
                            }
                        }
                    },
                });
            },
            // 给每个比分绑定点击事件
            bindClickEvent: function(index) {
                var self = this;
                
                setTimeout(function() {
                    var num = 0;
                    var flagNum = 1;
                    var betNumArr = [];

                    for (var i = 0, len = self.matchData.length; i < len; i++) {
                        if(self.matchData[i]["matchInfo"]["sf"].length > 0) {
                            num++;
                        }
                        if(self.matchData[i]["matchInfo"]["sf"].length!==0) {
                            betNumArr.push(self.matchData[i]["matchInfo"]["sf"].length * flagNum);
                        }
                    }

                    if(betNumArr.length >=9) {
                        for (var f = 0, flen = betNumArr.length; f < flen; f++) {
                            flagNum = flagNum * betNumArr[f];
                        }
                        self.betNum = flagNum;
                    } else {
                        self.betNum = 0;
                    }

                    self.matchNum = num;
                }, 500);
            },

            // getCheckResult
            getCheckResult: function (list) {
                var arr = [];

                for (var i = 0, len = list.length; i < len; i++) {
                    arr.push(list[i].split(","));
                }
                return arr.join(",");
            },

            // 重新格式化比赛结果
            reFormatMatch: function (list) {
                var detail = [];

                for (var i = 0, len = list.length; i < len; i++) {
                    detail.push((i + 1) + "|" + list[i]);
                }
                return detail.join("#");
            },

            // 计算选择比赛数据
            countSelectItem: function (data) {
                var self = this;
                var num = 0;
                var detail = "";
                var detailArr = [];

                for (var key in data) {
                    if (data.hasOwnProperty(key)) {
                        for (var i = 0, len = data[key].length; i < len; i++) {
                            var listInfo = data[key][i];
                            var matchInfo = listInfo["matchInfo"];
                            var sfArr = matchInfo["sf"];
                            var sfLen = sfArr.length;
                            var detailStr = "";

                            if (sfLen> 0) {
                                num++;
                                detailArr.push(listInfo["lottoid"] + "|" + listInfo["num"] + "|" + (sfLen > 0 ? self.getCheckResult(sfArr) : ""));
                            }
                        }
                    }
                }

                detail = self.reFormatMatch(detailArr)+"%CG_9_1";;
                self.buyInfo.betDetail = detail;
                self.selectItem.num = num;

                self.setOrderInfo();
            },

             // 设置订单信息
             setOrderInfo: function () {
                var self = this;

                if (self.selectItem.num >= 9) {
                    utility.previewOrder({
                        "appType": "2",
                        "service": CONFIG.SERVICE.bOrderService,
                        "params": self.buyInfo,
                        "callback": function (data) {
                            utility.setSessionStorage("orderInfo", { "buyInfo": self.buyInfo });
                            utility.setSessionStorage("resultList", data.matchList);
                            self.totalOrderPrice = data.totalOrderPrice;
                        }
                    });
                }

                // 数字彩订单格式为：投注方式ID|投注功能ID|红球胆区号码1,红球胆区号码2|红球号1,红球号2|蓝球胆区号码1,蓝球胆区号码2|蓝球号1,蓝球号2，其中各区各数字间以英文半角逗号分割,如果胆区和蓝球区没有则为空
            },
            // 生成订单
            generateOrder: function () {
                var self = this;
                if (self.selectItem.num < 9) {
                    alert("请选择9场球赛");
                    return false;
                }
                utility.generateOrder({
                    "appType": "2",
                    "service": CONFIG.SERVICE.bOrderService,
                    "callback": function (data) {
                        window.location.href = CONFIG.HOST + "/www/view/order/pay.html";
                    }
                });
            }
        },
        created: function () {
            var self = this;

            self.geFbTraditionMatches();

            // 深度监听对象的变化
            self.$watch('matchInfoObj', function (newVal, oldVal) {
                self.countSelectItem(newVal);
            }, { deep: true });

        }
    });

}())
