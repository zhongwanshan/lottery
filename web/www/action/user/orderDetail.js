(function () {
    var queryParam = utility.getQueryParams();
    var pageVue = new Vue({
        el: "#js-pageOrderDetail",
        data: {
            orderDetailInfo: null,
            userInfo: USERINFO,
            orderInfo: {
                action: CONFIG.ACTION.getOrderDetail,
                sysOpStr: "sss@2018",
                orderCode: queryParam["orderCode"]
            },
            paramInfo: {
                orderCode: queryParam["orderCode"],
                action: CONFIG.ACTION.payOrder,
                goToUrl: "/www//app/view/user/order.html"
            },
            url: LOCATION,
            shopDealStatus: CONFIG.SHOPDEALSTATUS,
            matchStatu: CONFIG.MATCHSTATU,
            orderStatuList: CONFIG.ORDERSTATU,
            downTimeInfo: null,
            timeInterval: null
        },
        methods: {
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },

            // 获取订单详细
            getOrderDetail: function () {
                var self = this;

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonOrderService, CONFIG.ACTION.getOrderList, self.orderInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonOrderService,
                    dataObj: self.orderInfo,
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.orderDetailInfo = data.data;

                            if(self.orderDetailInfo.lotteryTypeId==1001) {
                                utility.geFbMatchScoreData({
                                    "mid": "",
                                    "num": "",
                                    "callback": function (data) {
                                        self.footBallData = data.data;
                                    }
                                });
                            }

                            self.dountDownTime();
                        }
                    }
                });
            },
            // 修改订单状态
            modifyOrderByShop: function (shopDealStatus) {
                var self = this;

                if (self.isClick == true) {
                    return;
                }

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonOrderService, CONFIG.ACTION.modifyOrderByShop, {
                            shopWorkerId: USERINFO["userId"],
                            shopDealStatus: shopDealStatus,
                            action: CONFIG.ACTION.modifyOrderByShop
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonOrderService,
                    dataObj: {
                        shopWorkerId: USERINFO["userId"],
                        shopDealStatus: shopDealStatus,
                        action: CONFIG.ACTION.modifyOrderByShop
                    },
                    completeCallback: function () {
                        self.isClick = false;
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            // self.getOrderList();
                        } else {
                            alert(data.message);
                        }
                    }
                });
            },
            // 倒计时
            dountDownTime: function () {
                var self = this;

                self.timeInterval = setInterval(function () {
                    if (!!self.orderDetailInfo.planAwardTime) {
                        self.downTimeInfo = utility.leftTimer(new Date(self.orderDetailInfo.planAwardTime.replace(/-/g,"/")), new Date());
                        if (self.downTimeInfo.days <= 0 && self.downTimeInfo.minutes <= 0 && self.downTimeInfo.seconds <= 0) {
                            clearInterval(self.timeInterval);
                        }
                    }
                }, 1000);

            },
            // 提交数字彩订单
            submitOrder: function() {
                var self = this;

                self.orderInfo.backUrl = CONFIG.HOST+"/www/view/order/result.html" + "?paramInfo="+JSON.stringify(self.paramInfo);
                window.location.href = CONFIG.HOST + utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.payOrder, self.orderInfo, true) + "&userId=" + USERINFO["userId"] + "&userToken=" + USERINFO["userToken"]+"&appType=2";
            }
        },
        created: function () {
            var self = this;

            self.getOrderDetail();

            setTimeout(function() {
                self.userInfo = USERINFO;
            }, 2000);

        }
    });
}())