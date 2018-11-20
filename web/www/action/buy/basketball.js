(function () {
    var pageVue = new Vue({
        el: "#js-pageBuyBasketball",
        data: {
            userInfo: USERINFO,
            matchList: [],
            matchData: null,
            matchInfoObj: null,
            totalOrderPrice: 0,
            selectItem: {
                "num": 0,
            },
            buyInfo: {
                "action": CONFIG.ACTION.previewOrder,
                "lotteryTypeId": "1004", // 彩种ID
                "issueNo": "", // 投注的彩票期号,
                "type": 0, // 0：预计算 1：暂存 2：正式订单
                "betDetail": "", // 用户原始投注内容
                "multipleNum": 1 // 投注倍数
            },
            isDg: false,
            cgDetail: "",
            cgList: [],
            cgInfo: CONFIG.CG,
            // 主队胜分差
            winList: [
                {
                    name: "1-5分",
                    value: "h0105"
                }, {
                    name: "6-10分",
                    value: "h0610"
                }, {
                    name: "11-15分",
                    value: "h1115"
                }, {
                    name: "16-20分",
                    value: "h1620"
                }, {
                    name: "21-25分",
                    value: "h2125"
                }, {
                    name: "26+",
                    value: "h2600"
                }
            ],
            // 主队胜
            loseList: [
                {
                    name: "1-5分",
                    value: "c0105"
                }, {
                    name: "6-10分",
                    value: "c0610"
                }, {
                    name: "11-15分",
                    value: "c1115"
                }, {
                    name: "16-20分",
                    value: "c1620"
                }, {
                    name: "21-25分",
                    value: "c2125"
                }, {
                    name: "26+",
                    value: "c2600"
                }
            ],
            isShowMenu: false
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
                            "win": [], // 主胜胜分差
                            "lose": [] // 客胜胜分差
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
                            "time": ""
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

            geBkBlendMatches: function () {
                var self = this;
                var obj = {};

                utility.geBkBlendMatches({
                    "matchDay": "",
                    "type": 1,
                    "callback": function (data) {
                        self.matchList = self.setCheckBox(data.data);

                        // 重新格式化数据
                        self.formatMatchData();
                    }
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

                for (var key in data) {
                    if (data.hasOwnProperty(key)) {

                        for (var i = 0, len = data[key]["list"].length; i < len; i++) {
                            var listInfo = data[key]["list"][i];
                            var matchInfo = listInfo["matchInfo"];
                            var sfArr = matchInfo["sf"];
                            var rangArr = matchInfo["rang"];
                            var scoreArr = matchInfo["score"];
                            var ballArr = matchInfo["win"];
                            var halfArr = matchInfo["lose"];
                            var sfLen = sfArr.length;
                            var rangLen = rangArr.length;
                            var scoreLen = scoreArr.length;
                            var ballLen = ballArr.length;
                            var halfLen = halfArr.length;
                            if ((sfLen + rangLen + scoreLen + ballLen + halfLen) > 0) {
                                num++;
                                detailArr.push(listInfo["mid"] + "|" + listInfo["num"] + "|" + (sfArr.length > 0 ? self.getCheckResult(sfArr) : "") + (rangArr.length > 0 ? "," + self.getCheckResult(rangArr) : "") + (scoreArr.length > 0 ? "," + self.getCheckResult(scoreArr) : "") + (ballArr.length > 0 ? "," + self.getCheckResult(ballArr) : "") + (halfArr.length > 0 ? self.getCheckResult(halfArr) : ""));
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
                        utility.setSessionStorage("resultList", data.matchList);
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
                        app.showPreloader("请至少选择两场球赛");
                        setTimeout(function () {
                            app.hidePreloader();
                            self.totalOrderPrice = 0;
                        }, 1000);
                        return;
                    }
                } else {
                    if (self.cgList.length == 0) {
                        app.showPreloader("必须选择至少一种串关方式");
                        setTimeout(function () {
                            app.hidePreloader();
                            self.totalOrderPrice = 0;
                        }, 1000);
                        return;
                    }
                }

                // 至少要选择一种串关方式
                if (self.cgList.length == 0) {
                    app.showPreloader("必须选择至少一种串关方式");
                    setTimeout(function () {
                        app.hidePreloader();
                        self.totalOrderPrice = 0;
                    }, 1000);
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

            self.geBkBlendMatches();

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
