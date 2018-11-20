(function () {
    var pageVue = new Vue({
        el: "#js-pagePl3",
        data: {
            userInfo: USERINFO,
            offTime: "",
            currentIssueName: "",
            buyInfo: {
                "action": CONFIG.ACTION.previewOrder,
                "type": 0, // 0：预计算 1：暂存 2：正式订单
                "lotteryTypeId": "16", // 彩种ID
                "issueNo": "", // 投注的彩票期号,
                "digitalBetType": "6", // 投注方式 1、普通投注 2、追号投注 3、七乐彩定胆投注 4、追加1元投注 5、组选 6、直选
                "dBetFunction": "1", // 数字彩投注功能 1、普通投注  2、定胆投注 3、	缩水投注 4、和值 5、复式(组3) 6、复式（组6） 7、复式（组3+组6）
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
            bList: [], // 百位
            sList: [], // 十位
            gList: [], // 个位
            aList: [], // 和值
            zPList: [], // 组合普通
            zDList: [], // 组合定胆
            zDDList: [], // 组合定胆胆区
            zHList: [], // 组合和值
            gCheck: ["5", "6"], // 组三或组六
            resultList: [], // 投注结果集
            orderInfoDetail: {},
            groupNum: 7,
            isShowTypeSelect: false,
            isShowMenu: false,
            digitalData: null,
            digitalList: [],
        },
        watch: {
            // 监听投注功能变化
            "buyInfo.digitalBetType": function (value) {
                var self = this;
                self.emptySelect();
            },
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

            // 胆区不能超过4个
            "zDDList": function (value) {
                var self = this;

                if (value.length > 3) {
                    self.zDDList = value.slice(0, value.length - 1);
                }
            },
            "gCheck": function (value) {
                var self = this;

                if (value.length == 2) {
                    self.groupNum = 7;
                } else if (value.length == 1) {
                    self.groupNum = value[0];
                }
            },
            // 监听是否追号，如果追号，则设置追号期数
            "buyInfo.followFlag": function (value) {
                var self = this;

                if (value == 0) {
                    self.buyInfo.followIssueNum = "";
                } else if (value == 1) {
                    self.buyInfo.followIssueNum = self.buyInfo.issueNo;
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
            // 添加倍数
            addMultipleNum: function () {
                var self = this;
                self.buyInfo.multipleNum = self.buyInfo.multipleNum + 1;
            },
            // 减少倍数
            reduceMultipleNum: function () {
                var self = this;
                self.buyInfo.multipleNum = self.buyInfo.multipleNum - 1;
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
            },
            // 清空选择
            emptySelect: function () {
                var self = this;
                self.bList = [];
                self.sList = [];
                self.gList = [];
                self.aList = [];
                self.zPList = [];
                self.zDList = [];
                self.zDDList = [];
                self.zHList = [];
            },
            // 随机投注
            randomBuyTime: function (time) {
                var self = this;

                self.emptySelect();

                self.buyInfo.digitalBetType = 6;
                self.buyInfo.dBetFunction = 1;

                for (var i = 0; i < time; i++) {
                    (function (i) {

                        var arr = utility.genreateArr(9);
                        var bNum = utility.getArrByNum(arr, 1, 1);
                        var sNum = utility.getArrByNum(arr, 1, 1);
                        var gNum = utility.getArrByNum(arr, 1, 1);

                        self.bList = bNum;
                        self.sList = sNum;
                        self.gList = gNum;

                        // 把随机选择的号码添加到结果区域
                        self.addToResult();
                    })(i);
                }
            },

            // 全选
            selectAll: function(type) {
                var self = this;
                var arr = utility.genreateArr(10);
                var numbers = utility.getArrByNum(arr, 10, 1);
                self[type] = [];
                $.each(numbers,function(index, item) {
                    self[type].push(item-1);
                    self[type].sort(function(a,b) {
                        return a - b;
                    });
                });
            },

            // 全清
            clearNumbs: function(type) {
                var self = this;
                self[type] = [];
            },

            // 验证
            validate: function () {
                var self = this;
                // 如果是直选投注
                if (self.buyInfo.digitalBetType == 6) {

                    // 如果是普通投注
                    if (self.buyInfo.dBetFunction == 1) {
                        if (self.bList.length == 0) {
                            alert("至少选择1个百位");
                            return false;
                        }
                        if (self.sList.length == 0) {
                            alert("至少选择1个十位");
                            return false;
                        }
                        if (self.gList.length == 0) {
                            alert("至少选择1个个位");
                            return false;
                        }
                        // 如果是和值投注
                    } else if (self.buyInfo.dBetFunction == 4) {
                        if (self.aList.length == 0) {
                            alert("至少选择1个球");
                            return false;
                        }
                    }

                    // 如果是组选投注
                } else if (self.buyInfo.digitalBetType == 5) {

                    // 如果是普通投注
                    if (self.buyInfo.dBetFunction == 1) {
                        if (self.zPList.length <= 1) {
                            alert("至少选择2个球");
                            return false;
                        }

                        // 如果定胆投注
                    } else if (self.buyInfo.dBetFunction == 2) {
                        if (self.zDList.length <= 3) {
                            alert("至少选择4个球");
                            return false;
                        }

                        if (self.zDDList.length == 0) {
                            alert("至少选择1个胆码");
                            return false;
                        }
                    } else if (self.buyInfo.dBetFunction == 4) {
                        if (self.zHList.length == 0) {
                            alert("至少选择1个球");
                            return false;
                        }
                    }
                }
            },

            // 添加号码到结果区域
            addToResult: function (isCheck) {
                var self = this;

                if (self.validate() == false) {
                    return;
                }

                self.resultList.push({
                    aList: self.aList,
                    bList: self.bList,
                    sList: self.sList,
                    gList: self.gList,
                    zPList: self.zPList,
                    zDList: self.zDList,
                    zDDList: self.zDDList,
                    zHList: self.zHList,
                    dBetFunction: self.buyInfo.dBetFunction,
                    digitalBetType: self.buyInfo.digitalBetType
                });

                // 清空选择
                self.emptySelect();

                // 把结果保存到本次会话中
                utility.setSessionStorage("resultList", self.resultList);

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

            // 获取开奖历史
            getPrizeList: function (issueno) {
                var self = this;

                utility.getDigitalPrizeData({
                    appType: "2",
                    lottoId: self.buyInfo.lotteryTypeId,
                    fetchNum: 100,
                    callback: function (data) {
                        self.digitalList = data.data;
                        self.digitalData = data.data[0];
                        // for (var i = 0, len = data.data.length; i < len; i++) {
                        //     if (issueno == data.data[i]["issueno"]) {
                        //         self.digitalData = data.data[i];
                        //         break;
                        //     }
                        // }
                    }
                });
            },
            // 获取当前期数
            getDigitalIssue: function () {
                var self = this;
                utility.getDigitalIssue({
                    lottoId: self.buyInfo.lotteryTypeId,
                    appType: 2,
                    callback: function (data) {
                        self.buyInfo.issueNo = data.data[0]["currentIssueNo"];
                        self.currentIssueName = data.data[0]["currentIssueName"];
                        self.offTime = data.data[0]["offTime"];
    
                        self.getPrizeList();
                    }
                });
                // utility.getDigitalIssue(self.buyInfo.lotteryTypeId, function (data) {
                //     self.buyInfo.issueNo = data.data[0]["currentIssueNo"];
                //     self.currentIssueName = data.data[0]["currentIssueName"];
                //     self.offTime = data.data[0]["offTime"];

                //     self.getPrizeList();
                // });
            },
            // 设置订单信息
            setOrderInfo: function () {
                var self = this;

                utility.setDigitalOrderInfo(self, self.buyInfo.lotteryTypeId, "排列3", function (data, i) {
                    // 如果是直选
                    if (self.resultList[i].digitalBetType == 6) {
                        // 普通投注
                        if (self.resultList[i].dBetFunction == 1) {
                            return self.resultList[i].digitalBetType + "|" + self.resultList[i].dBetFunction + "||" + self.resultList[i]["bList"].join("") + "," + self.resultList[i]["sList"].join("") + "," + self.resultList[i]["gList"].join("") + "||";
                            // 和值投注
                        } else if (self.resultList[i].dBetFunction == 4) {
                            return self.resultList[i].digitalBetType + "|" + self.resultList[i].dBetFunction + "||" + self.resultList[i]["aList"].join(",") + "||";
                        }
                        // 如果是组选
                    } else if (self.resultList[i].digitalBetType == 5) {
                        // 普通投注
                        if (self.resultList[i].dBetFunction == 1) {
                            return self.resultList[i].digitalBetType + "|" + self.groupNum + "||" + self.resultList[i]["zPList"].join(",") + "||";
                            // 定胆
                        } else if (self.resultList[i].dBetFunction == 2) {
                            return self.resultList[i].digitalBetType + "|" + self.groupNum + "|" + self.resultList[i]["zDDList"].join(",") + "|" + utility.duplicate(self.resultList[i]["zDList"], self.resultList[i]["zDDList"]).join(",") + "||";
                            // 和值
                        } else if (self.resultList[i].dBetFunction == 4) {
                            return self.resultList[i].digitalBetType + "|" + self.resultList[i].dBetFunction + "||" + self.resultList[i]["zHList"].join(",") + "||";
                        }
                    }
                }, function () {
                    var orderInfo = utility.getSessionStorage("orderInfo");
                    utility.previewOrder({
                        "appType": "2",
                        "service": CONFIG.SERVICE.dOrderService,
                        "params": orderInfo.buyInfo,
                        "callback": function (data) {
                            self.orderInfoDetail = data;
                            self.betNum = data.totalBetsNum;
                            self.betMoney = data.totalOrderPrice;
                        }
                    });
                });

                // 数字彩订单格式为：投注方式ID|投注功能ID|红球胆区号码1,红球胆区号码2|红球号1,红球号2|蓝球胆区号码1,蓝球胆区号码2|蓝球号1,蓝球号2，其中各区各数字间以英文半角逗号分割,如果胆区和蓝球区没有则为空
            },
            // 生成订单
            generateOrder: function () {
                var self = this;
                if (self.resultList.length == 0) {
                    alert("投注不能为空");
                    return false;
                }
                utility.generateOrder({
                    "appType": "2",
                    "service": CONFIG.SERVICE.dOrderService,
                    "callback": function (data) {
                        window.location.href = CONFIG.HOST + "/www/view/order/pay.html";
                    }
                });
            },
            // 初始化
            init: function () {
                var self = this;

                if (!!utility.getSessionStorage("orderInfo")) {
                    if (utility.getSessionStorage("orderInfo")["buyInfo"].lotteryTypeId != self.buyInfo.lotteryTypeId) {
                        utility.setSessionStorage("resultList", null);
                        utility.setSessionStorage("orderInfo", null);
                        utility.setSessionStorage("generateOrder", null);
                    }
                }

                if (!!utility.getSessionStorage("orderInfo")) {
                    self.buyInfo = utility.getSessionStorage("orderInfo")["buyInfo"];
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
        }
    });

}());