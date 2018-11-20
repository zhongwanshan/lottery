(function () {
    var pageVue = new Vue({
        el: "#js-pageBuyFootball",
        data: {
            userInfo: USERINFO,
            matchList: [],
            matchInfoObj: null,
            totalOrderPrice: 0,
            selectItem: {
                "num": 0,
            },
            buyInfo: {
                "action": CONFIG.ACTION.previewOrder,
                "lotteryTypeId": "1001", // 彩种ID
                "issueNo": "", // 投注的彩票期号,
                "type": 0, // 0：预计算 1：暂存 2：正式订单
                "betDetail": "", // 用户原始投注内容
                "multipleNum": 1 // 投注倍数
            },
            isDg: false,
            cgDetail: "",
            cgList: [],
            cgInfo: CONFIG.CG,
            // 胜平负数据
            sfList: [{
                name: "胜",
                value: "s"
            }, {
                name: "平",
                value: "p"
            }, {
                name: "负",
                value: "f"
            }],
            // 让分胜平负
            rangList: [{
                name: "胜",
                value: "rang_s"
            }, {
                name: "平",
                value: "rang_p"
            }, {
                name: "负",
                value: "rang_f"
            }],
            // 主队胜
            scoreSList: [
                {
                    name: "1:0",
                    value: "vs10"
                }, {
                    name: "2:0",
                    value: "vs20"
                }, {
                    name: "2:1",
                    value: "vs21"
                }, {
                    name: "3:0",
                    value: "vs30"
                }, {
                    name: "3:1",
                    value: "vs31"
                }, {
                    name: "3:2",
                    value: "vs32"
                }, {
                    name: "4:0",
                    value: "vs40"
                }, {
                    name: "4:1",
                    value: "vs41"
                }, {
                    name: "4:2",
                    value: "vs42"
                }, {
                    name: "5:0",
                    value: "vs50"
                }, {
                    name: "5:1",
                    value: "vs51"
                }, {
                    name: "5:2",
                    value: "vs52"
                }, {
                    name: "胜其它",
                    value: "vsmore_s"
                }
            ],
            // 平比分
            scorePList: [
                {
                    name: "0:0",
                    value: "vs00"
                }, {
                    name: "1:1",
                    value: "vs11"
                }, {
                    name: "2:2",
                    value: "vs22"
                }, {
                    name: "3:3",
                    value: "vs33"
                }, {
                    name: "平其它",
                    value: "vsmore_p"
                }
            ],
            // 主队胜
            scoreFList: [
                {
                    name: "0:1",
                    value: "vs01"
                }, {
                    name: "0:2",
                    value: "vs02"
                }, {
                    name: "1:2",
                    value: "vs12"
                }, {
                    name: "0:3",
                    value: "vs03"
                }, {
                    name: "1:3",
                    value: "vs13"
                }, {
                    name: "2:3",
                    value: "vs23"
                }, {
                    name: "0:4",
                    value: "vs04"
                }, {
                    name: "1:4",
                    value: "vs14"
                }, {
                    name: "2:4",
                    value: "vs24"
                }, {
                    name: "0:5",
                    value: "vs05"
                }, {
                    name: "1:5",
                    value: "vs15"
                }, {
                    name: "2:5",
                    value: "vs25"
                }, {
                    name: "负其它",
                    value: "vsmore_f"
                }
            ],
            ballList: [
                {
                    name: "0球",
                    value: "g0"
                }, {
                    name: "2球",
                    value: "g2"
                }, {
                    name: "3球",
                    value: "g3"
                }, {
                    name: "4球",
                    value: "g4"
                }, {
                    name: "6球",
                    value: "g6"
                }, {
                    name: "7球以上",
                    value: "g7"
                }
            ],
            halfList: [
                {
                    name: "胜/胜",
                    value: "ss"
                }, {
                    name: "胜/平",
                    value: "sp"
                }, {
                    name: "胜/负",
                    value: "sf"
                }, {
                    name: "平/平",
                    value: "pp"
                }, {
                    name: "平/负",
                    value: "pf"
                }, {
                    name: "负/胜",
                    value: "fs"
                }, {
                    name: "负/平",
                    value: "fp"
                }, {
                    name: "负/负",
                    value: "ff"
                }
            ],
            isShowMenu: false,
            weekList: {
                "w_1": "星期一",
                "w_2": "星期二",
                "w_3": "星期三",
                "w_4": "星期四",
                "w_5": "星期五",
                "w_6": "星期六",
                "w_7": "星期日",
            }
        },
        watch: {
            "cgList": function (value) {
                var self = this;
                self.setCgDetail();
                self.countSelectItem(self.matchInfoObj);
            },
            "isDg": function (value) {
                var self = this;

                if (value) {
                    self.cgList.push("单场");
                } else {
                    self.cgList.splice(self.cgList.indexOf("单场"), 1);
                }
            },
            "buyInfo.multipleNum": function (value) {
                var self = this;

                // if (value > 0) {
                //     self.countSelectItem(self.matchInfoObj);
                // } else {
                //     self.buyInfo.multipleNum = 1;
                // }

                if (value < 0) {
                    self.buyInfo.multipleNum = 1;
                }

                self.countSelectItem(self.matchInfoObj);
            }
        },
        methods: {
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
            // 设置cgDetail
            setCgDetail: function () {
                var self = this;
                var arr = [];

                for (var i = 0, len = self.cgList.length; i < len; i++) {
                    arr.push(self.cgInfo[self.cgList[i]]);
                }
                self.cgDetail = arr.join(",");
            },
            // 设置复选框
            setCheckBox: function (data) {
                var self = this;
                var dataArr = [];

                for (var i = 0, len = data.length; i < len; i++) {
                    (function (i) {
                        data[i]["isShow"] = false;
                        data[i]["matchInfo"] = {
                            "sf": [], // 胜负
                            "rang": [], // 让胜负
                            "score": [], // 比分
                            "ball": [], // 总进球
                            "half": [] // 半全场
                        };
                        dataArr.push(data[i]);
                    })(i);
                }

                return dataArr;

            },

            // 重新格式化赛事数据
            formatMatchData: function () {
                var self = this;
                var timeObj = {};

                for (var i = 0, len = self.matchList.length; i < len; i++) {
                    (function (i) {
                        var time = self.matchList[i]["dtime"].split(" ")[0];
                        timeObj[time] = {
                            "list": [],
                            "weekDay": "",
                            "time": "",
                            "isShow": false
                        };
                    })(i);
                }

                for (var key in timeObj) {
                    if (timeObj.hasOwnProperty(key)) {
                        for (var t = 0, tlen = self.matchList.length; t < tlen; t++) {
                            (function (t) {
                                var dtime = self.matchList[t]["dtime"];
                                var time = dtime.split(" ")[0];
                                var date = utility.getCurrentTimeInfo(time);
                                if (key == time) {
                                    timeObj[key]["list"].push(self.matchList[t]);
                                    timeObj[key]["weekDay"] = date["weekDay"];
                                    timeObj[key]["time"] = time;
                                }
                            })(t);
                        }
                    }
                }

                self.matchInfoObj = timeObj;

            },
            // 竞彩足球获取当前可售足球赛事信息接口
            geFbBlendMatches: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.lotteryService, CONFIG.ACTION.geFbBlendMatches, {
                            action: CONFIG.ACTION.geFbBlendMatches
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.lotteryService,
                    dataObj: {
                        action: CONFIG.ACTION.geFbBlendMatches
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {

                            self.matchList = self.setCheckBox(data.data)

                            // 重新格式化数据
                            self.formatMatchData();
                        }
                    },
                });
            },

            // getCheckResult
            getCheckResult: function (list) {
                var arr = [];

                for (var i = 0, len = list.length; i < len; i++) {
                    arr.push(list[i].split(",")[3]);
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
                var detailArr = [];
                var cgArr = [];

                for (var key in data) {
                    if (data.hasOwnProperty(key)) {
                        for (var i = 0, len = data[key]["list"].length; i < len; i++) {
                            var listInfo = data[key]["list"][i];
                            var matchInfo = listInfo["matchInfo"];
                            var sfArr = matchInfo["sf"];
                            var rangArr = matchInfo["rang"];
                            var scoreArr = matchInfo["score"];
                            var ballArr = matchInfo["ball"];
                            var halfArr = matchInfo["half"];
                            var sfLen = sfArr.length;
                            var rangLen = rangArr.length;
                            var scoreLen = scoreArr.length;
                            var ballLen = ballArr.length;
                            var halfLen = halfArr.length;
                            if ((sfLen + rangLen + scoreLen + ballLen + halfLen) > 0) {
                                num++;
                                detailArr.push(listInfo["mid"] + "|" + listInfo["num"] + "|" + (sfLen > 0 ? self.getCheckResult(sfArr) : "") + (rangLen > 0 ? "," + self.getCheckResult(rangArr) : "") + (scoreLen > 0 ? "," + self.getCheckResult(scoreArr) : "") + (ballLen > 0 ? "," + self.getCheckResult(ballArr) : "") + (halfLen > 0 ? self.getCheckResult(halfArr) : ""));
                            }
                        }
                    }
                }
                self.selectItem.num = num;
                setTimeout(function () {
                    self.isDg = $("body").find(".isDg").find(".active").length != 0 && $("body").find(".noDg").find(".active").length == 0;
                    self.setCgDetail();
                    setTimeout(function () {
                        self.buyInfo.betDetail = self.reFormatMatch(detailArr) + (self.cgDetail.length > 0 ? ("%" + self.cgDetail) : "");;
                        self.setOrderInfo();
                    }, 500);
                }, 500);
            },
            // 设置订单信息
            setOrderInfo: function () {
                var self = this;

                // 如果不是单关
                if (self.isDg == false) {
                    if (self.selectItem.num <= 1) {
                        self.totalOrderPrice = 0;
                        return;
                    }
                } else {
                    if (self.cgList.length == 0) {
                        self.totalOrderPrice = 0;
                        return;
                    }
                }

                // 至少要选择一种串关方式
                if (self.cgList.length == 0) {
                    self.totalOrderPrice = 0;
                    return;
                }

                utility.previewOrder({
                    "appType": "2",
                    "service": CONFIG.SERVICE.bOrderService,
                    "params": self.buyInfo,
                    "callback": function (data) {
                        utility.setSessionStorage("orderInfo", { "buyInfo": self.buyInfo });
                        self.totalOrderPrice = data.totalOrderPrice;
                    }
                });
                // 数字彩订单格式为：投注方式ID|投注功能ID|红球胆区号码1,红球胆区号码2|红球号1,红球号2|蓝球胆区号码1,蓝球胆区号码2|蓝球号1,蓝球号2，其中各区各数字间以英文半角逗号分割,如果胆区和蓝球区没有则为空
            },
            // 生成订单
            generateOrder: function () {
                var self = this;
                var orderInfo = utility.getSessionStorage("orderInfo");

                // 如果不是单关
                if (self.isDg == false) {
                    if (self.selectItem.num <= 1) {
                        alert("请至少选择两场球赛");
                        self.totalOrderPrice = 0;
                        return;
                    }
                } else {
                    if (self.cgList.length == 0) {
                        alert("必须选择至少一种串关方式");
                        self.totalOrderPrice = 0;
                        return;
                    }
                }

                if (self.cgList.length == 0) {
                    alert("必须选择至少一种串关方式");
                    self.totalOrderPrice = 0;
                    return;
                }
                if (!!orderInfo) {
                    utility.generateOrder({
                        "appType": "2",
                        "service": CONFIG.SERVICE.bOrderService,
                        "callback": function (data) {
                            window.location.href = CONFIG.HOST + "/www/view/order/pay.html";
                        }
                    });
                }
            }
        },
        created: function () {
            var self = this;

            self.geFbBlendMatches();

            // 深度监听对象的变化
            self.$watch('matchInfoObj', function (newVal, oldVal) {
                self.countSelectItem(newVal);
            }, { deep: true });

            if (!!utility.getSessionStorage("orderInfo")) {
                if (utility.getSessionStorage("orderInfo")["buyInfo"].lotteryTypeId != self.buyInfo.lotteryTypeId) {
                    utility.setSessionStorage("resultList", null);
                    utility.setSessionStorage("orderInfo", null);
                    utility.setSessionStorage("generateOrder", null);
                }
            }
        }
    });

}())
