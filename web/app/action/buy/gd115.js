(function () {
    var pageVue = new Vue({
        el: "#js-buyGd115",
        data: {
            offTime: "",
            currentIssueName: "",
            buyInfo: {
                "action": CONFIG.ACTION.previewOrder,
                "type": 0, // 0：预计算 1：暂存 2：正式订单
                "lotteryTypeId": "6", // 彩种ID
                "issueNo": "", // 投注的彩票期号,
                "digitalBetType": 105, // 投注方式 1、普通投注 2、追号投注 3、七乐彩定胆投注 4、追加1元投注 5、组选 6、直选,102：任选二, 103：任选三, 104：任选四, 105：任选五, 106：任选六,107：任选七, 108：任选八, 109：前一直选,110：前二组选,111：前二直选,112：前三组选, 113：前三直选
                "dBetFunction": 1, // 数字彩投注功能 1、普通投注  2、定胆投注 3、	缩水投注 4、和值 5、复式(组3) 6、复式（组6） 7、复式（组3+组6）
                "betDetail": "", // 用户原始投注内容
                "extraAdd": 0, // 仅对大乐透彩种，是否追加一元投注：0：否 1:是
                "multipleNum": 1, // 投注倍数
                "followFlag": 0, // 是否追号 0=否 1=是
                "followIssueNum": "", // 追号期数，followFlag=1时必传
                "followStopFor": 0 // 追号盈利到多少后自动停止追号，followFlag=1时必传
            },
            isCheck: true,
            betNum: 0, // 注数
            betMoney: 0, // 金额
            firstBetList: [], // 第一位
            secondBetList: [], // 第二位
            threeBetList: [], // 第三位
            dAreaList: [], // 胆区
            resultList: [], // 投注结果集
            orderInfoDetail: {},
            isShowTypeSelect: false,
            isShowMenu: false,
            downTimeInfo: null,
            isEndDownTime: false,
            dNum: {
                "n_102": 1,
                "n_103": 2,
                "n_104": 3,
                "n_105": 4,
                "n_106": 5,
                "n_107": 6,
                "n_108": 7,
                "n_109": 0,
                "n_110": 1,
                "n_111": 1,
                "n_112": 2,
                "n_113": 1,
            },
            playType: [
                // 109：前一直选,110：前二组选,111：前二直选,112：前三组选, 113：前三直选
                { "id": "102", "name": "任选二" },
                { "id": "103", "name": "任选三" },
                { "id": "104", "name": "任选四" },
                { "id": "105", "name": "任选五" },
                { "id": "106", "name": "任选六" },
                { "id": "107", "name": "任选七" },
                { "id": "108", "name": "任选八" },
                { "id": "109", "name": "前一直选" },
                { "id": "110", "name": "前二组选" },
                { "id": "111", "name": "前二直选" },
                { "id": "112", "name": "前三组选" },
                { "id": "113", "name": "前三直选" },
            ]
        },
        watch: {
            // 监听投注倍数变化，重新计算金额
            "buyInfo.multipleNum": function (value) {
                var self = this;
                if (value < 0) {
                    self.buyInfo.multipleNum = 1;
                }

                if (self.resultList.length > 0 && value > 0) {
                    self.setOrderInfo();
                }
            },
            "buyInfo.digitalBetType": function (value) {
                var self = this;
                // 重新设置滚动
                utility.setiScroll();
            },
            "buyInfo.dBetFunction": function (value) {
                var self = this;
                // 重新设置滚动
                utility.setiScroll();
            },
            // 胆区不能超过6个
            "dAreaList": function (value) {
                var self = this;

                if (value.length > self.dNum["n_" + self.buyInfo.digitalBetType]) {
                    self.dAreaList = value.slice(0, value.length - 1);
                }
            }
        },
        methods: {
            // 显示菜单栏
            showMenu: function () {
                var self = this;
                self.isShowMenu = !self.isShowMenu;
            },
            // 显示弹出层
            showTypeSelect: function () {
                var self = this;
                self.isShowTypeSelect = !self.isShowTypeSelect;
            },
            // 计算三位不一样
            countDiff: function () {
                var self = this;
                var first = 0;
                var second = 0;
                var third = 0;

                if (self.firstBetList.length == self.secondBetList.length) {
                    first = 0;
                    second = 0;
                    for (var f = 0, flen = self.firstBetList.length; f < flen; f++) {
                        first = first + parseInt(self.firstBetList[f], 10);
                    }

                    for (var s = 0, slen = self.secondBetList.length; s < slen; s++) {
                        second = second + parseInt(self.secondBetList[s], 10);
                    }

                    if (first == second) {
                        return false;
                    }
                }
                if (self.firstBetList.length == self.threeBetList.length) {
                    first = 0;
                    third = 0;
                    for (var f = 0, flen = self.firstBetList.length; f < flen; f++) {
                        first = first + parseInt(self.firstBetList[f], 10);
                    }

                    for (var t = 0, tlen = self.threeBetList.length; t < tlen; t++) {
                        third = third + parseInt(self.threeBetList[t], 10);
                    }
                    if (first == third) {
                        return false;
                    }
                }
                if (self.secondBetList.length == self.threeBetList.length) {
                    second = 0;
                    third = 0;

                    for (var s = 0, slen = self.secondBetList.length; s < slen; s++) {
                        second = second + parseInt(self.secondBetList[s], 10);
                    }

                    for (var t = 0, tlen = self.threeBetList.length; t < tlen; t++) {
                        third = third + parseInt(self.threeBetList[t], 10);
                    }
                    if (second == third) {
                        return false;
                    }
                }

                return true;
            },
            // 清空所有
            clearAll: function () {
                var self = this;

                self.emptySelect();

                self.resultList = [];
                self.orderInfoDetail = {};
                self.betNum = 0;
                self.betMoney = 0;
                utility.setSessionStorage("resultList", null);
                utility.setSessionStorage("orderInfo", null);
                // 重新设置滚动
                utility.setiScroll();
            },
            // 清空选择
            emptySelect: function () {
                var self = this;
                self.firstBetList = [];
                self.secondBetList = [];
                self.threeBetList = [];
                self.dAreaList = [];
            },
            // 随机投注
            randomBuyTime: function (num) {
                var self = this;
                var redArr = utility.genreateArr(11);
                var redNum = [];
                var firstNum = "";
                var secondNum = "";
                var thirdNum = "";

                if ((self.buyInfo.digitalBetType >= 102 && self.buyInfo.digitalBetType <= 110) || self.buyInfo.digitalBetType == 112) {
                    redNum = utility.getArrByNum(redArr, (self.dNum["n_" + self.buyInfo.digitalBetType] + 1), 0);
                    self.firstBetList = redNum.sort(function (a, b) {
                        return a - b;
                    });
                } else if (self.buyInfo.digitalBetType == 111) {
                    firstNum = utility.getArrByNum(redArr, 1, 0)[0];
                    self.firstBetList = utility.getArrByNum(redArr, 1, 0);
                    redArr.splice(redArr.indexOf(firstNum), 1);

                    self.secondBetList = utility.getArrByNum(redArr, 1, 0);
                } else if (self.buyInfo.digitalBetType == 113) {
                    firstNum = utility.getArrByNum(redArr, 1, 0)[0];
                    self.firstBetList = utility.getArrByNum(redArr, 1, 0);

                    redArr.splice(redArr.indexOf(firstNum), 1);

                    secondNum = utility.getArrByNum(redArr, 1, 0)[0];
                    self.secondBetList = utility.getArrByNum(redArr, 1, 0);

                    redArr.splice(redArr.indexOf(secondNum), 1);

                    self.threeBetList = utility.getArrByNum(redArr, 1, 0);
                }

                // 把随机选择的号码添加到结果区域
                self.addToResult();
            },

            // 验证
            validate: function () {
                var self = this;

                if (self.buyInfo.digitalBetType == 111 || self.buyInfo.digitalBetType == 113) {

                    if (self.firstBetList.length < self.dNum["n_" + self.buyInfo.digitalBetType]) {
                        app.showPreloader("第一位至少选择" + self.dNum["n_" + self.buyInfo.digitalBetType] + "个球");
                        setTimeout(function () {
                            app.hidePreloader();
                        }, 1000);
                        return false;
                    }
                    if (self.secondBetList.length < self.dNum["n_" + self.buyInfo.digitalBetType]) {
                        app.showPreloader("第二位至少选择" + self.dNum["n_" + self.buyInfo.digitalBetType] + "个球");
                        setTimeout(function () {
                            app.hidePreloader();
                        }, 1000);
                        return false;
                    }

                    if (self.buyInfo.digitalBetType == 113) {
                        if (self.threeBetList.length < self.dNum["n_" + self.buyInfo.digitalBetType]) {
                            app.showPreloader("第三位至少选择" + self.dNum["n_" + self.buyInfo.digitalBetType] + "个球");
                            setTimeout(function () {
                                app.hidePreloader();
                            }, 1000);
                            return false;
                        }
                    }

                    if (self.countDiff() == false) {
                        app.showPreloader("每位至少选择1个不同的号码");
                        setTimeout(function () {
                            app.hidePreloader();
                        }, 1000);
                        return false;
                    }
                } else {
                    if (self.firstBetList.length < self.dNum["n_" + self.buyInfo.digitalBetType] + 1) {
                        app.showPreloader("至少选择" + (self.dNum["n_" + self.buyInfo.digitalBetType] + 1) + "个球");
                        setTimeout(function () {
                            app.hidePreloader();
                        }, 1000);
                        return false;
                    }
                }

                return true;
            },
            // 添加号码到结果区域
            addToResult: function () {
                var self = this;

                if (self.validate() == false) {
                    return;
                }

                self.resultList.push({
                    digitalBetType: self.buyInfo.digitalBetType,
                    dBetFunction: self.buyInfo.dBetFunction,
                    firstBetList: self.firstBetList.sort(function (a, b) {
                        return a - b;
                    }),
                    secondBetList: self.secondBetList.sort(function (a, b) {
                        return a - b;
                    }),
                    threeBetList: self.threeBetList.sort(function (a, b) {
                        return a - b;
                    }),
                    dAreaList: self.dAreaList.sort(function (a, b) {
                        return a - b;
                    })
                });

                // 清空选择
                self.emptySelect();

                // 把结果保存到本次会话中
                utility.setSessionStorage("resultList", self.resultList);

                // 重新设置滚动
                utility.setiScroll();

                // 设置订单信息
                self.setOrderInfo();
            },

            // 删除
            deleteResult: function (index) {
                var self = this;
                self.resultList.splice(index, 1);
                self.orderInfoDetail.digitalOrderItems.splice(index, 1);

                // 把结果保存到本次会话中
                utility.setSessionStorage("resultList", self.resultList);

                if (self.resultList.length == 0) {
                    self.betNum = 0;
                    self.betMoney = 0;
                } else {
                    // 重新计算注数和金额
                    self.setOrderInfo();
                }
            },

            // 获取当前期数
            getDigitalIssue: function () {
                var self = this;
                utility.getDigitalIssue({
                    lottoId: self.buyInfo.lotteryTypeId,
                    appType: 1,
                    callback: function (data) {
                        self.buyInfo.issueNo = data.data[0]["currentIssueNo"];
                        self.currentIssueName = data.data[0]["currentIssueName"];
                        self.offTime = data.data[0]["offTime"];
                    }
                });
            },
            // 设置订单信息
            setOrderInfo: function () {
                var self = this;

                utility.setDigitalOrderInfo(self, self.buyInfo.lotteryTypeId, "广东11选5", function (data, i) {
                    return self.resultList[i]["digitalBetType"] + "|" + self.resultList[i]["dBetFunction"] + "|" + (self.resultList[i].dAreaList.length == 0 ? "" : self.resultList[i].dAreaList.join(",")) + "|" + utility.duplicate(self.resultList[i].firstBetList, self.resultList[i].dAreaList).join(",") + "|" + self.resultList[i].secondBetList.join(",") + "|" + self.resultList[i].threeBetList.join(",");
                }, function () {
                    var orderInfo = utility.getSessionStorage("orderInfo");
                    utility.previewOrder({
                        "service": CONFIG.SERVICE.dOrderService,
                        "params": orderInfo.buyInfo,
                        "callback": function (data) {
                            self.orderInfoDetail = data;
                            self.betNum = data.totalBetsNum;
                            self.betMoney = data.totalOrderPrice;
                        },
                        "otherCallback": function (data) {
                            if (data.code == "7001") {
                                self.getDigitalIssue();
                                self.setOrderInfo();
                            }
                        }
                    });
                });

                // 数字彩订单格式为：投注方式ID|投注功能ID|红球胆区号码1,红球胆区号码2|红球号1,红球号2|蓝球胆区号码1,蓝球胆区号码2|蓝球号1,蓝球号2，其中各区各数字间以英文半角逗号分割,如果胆区和蓝球区没有则为空
            },
            // 生成订单
            generateOrder: function () {
                var self = this;
                if (self.resultList.length == 0) {
                    app.showPreloader("投注不能为空");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return false;
                }
                utility.generateOrder({
                    "service": CONFIG.SERVICE.dOrderService,
                    "callback": function (data) {
                        mainView.router.loadPage('/app/view/order/pay.html');
                    }
                });
            },
            // 倒计时
            dountDownTime: function () {
                var self = this;

                setInterval(function () {
                    if (!!self.offTime) {
                        self.downTimeInfo = utility.leftTimer(Date.parse(new Date(self.offTime.replace(/-/g, "/"))), Date.parse(new Date()));
                        if (self.downTimeInfo.hours <= 0 && self.downTimeInfo.minutes <= 0 && self.downTimeInfo.seconds <= 0) {
                            self.offTime = "";
                            self.isEndDownTime = true;
                        }
                    } else {
                        self.getDigitalIssue();
                    }
                }, 1000);

            },
            // 初始化
            init: function () {
                var self = this;

                if (!!utility.getSessionStorage("orderInfo")) {
                    if (utility.getSessionStorage("orderInfo")["buyInfo"]["lotteryTypeId"] != self.buyInfo.lotteryTypeId) {
                        utility.setSessionStorage("resultList", null);
                        utility.setSessionStorage("orderInfo", null);
                        utility.setSessionStorage("generateOrder", null);
                    } else {
                        self.buyInfo = utility.getSessionStorage("orderInfo")["buyInfo"];
                    }
                }

                // 如果有会话数据
                if (!!utility.getSessionStorage("resultList")) {
                    self.resultList = utility.getSessionStorage("resultList");
                    if (self.resultList.length > 0) {
                        self.setOrderInfo();
                    }
                }

                // 获取期数
                self.getDigitalIssue();
            }
        },
        created: function () {
            var self = this;

            self.init();

            // 设置倒计时
            self.dountDownTime();

            $("body").find(".js-showMenu").on("click", function () {
                self.isShowMenu = !self.isShowMenu;
            });

        }
    });

}())