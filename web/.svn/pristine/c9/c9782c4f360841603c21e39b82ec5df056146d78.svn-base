(function () {
    var pageVue = new Vue({
        el: "#js-orderDetail",
        data: {
            userInfo: USERINFO,
            statu: CONFIG.ORDERSTATU,
            orderDetail: null,
            downTimeInfo: null,
            timeInterval: null,
            orderInfo: {
                orderCode: "",
                action: CONFIG.ACTION.payOrder,
                backUrl: ""
            },
            paramInfo: {
                orderCode: "",
                action: CONFIG.ACTION.payOrder,
                goToUrl: "/app/view/order/order.html"
            }
        },
        methods: {
            getOrderDetail: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        appType: 1,
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonOrderService, CONFIG.ACTION.getOrderDetail, {
                            action: CONFIG.ACTION.getOrderDetail,
                            orderCode: PAGE.query.orderCode
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonOrderService,
                    dataObj: {
                        action: CONFIG.ACTION.getOrderDetail,
                        orderCode: PAGE.query.orderCode
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.orderDetail = data.data;
                            self.orderInfo.orderCode = self.orderDetail.orderCode;
                            self.paramInfo.orderCode = self.orderDetail.orderCode;

                            utility.setiScroll();

                            self.dountDownTime();
                        }
                    },
                });
            },
            // 倒计时
            dountDownTime: function () {
                var self = this;

                self.timeInterval = setInterval(function () {
                    if (!!self.orderDetail.planAwardTime) {
                        self.downTimeInfo = utility.leftTimer(new Date(self.orderDetail.planAwardTime.replace(/-/g,"/")), new Date());
                        if (self.downTimeInfo.days <= 0 && self.downTimeInfo.minutes <= 0 && self.downTimeInfo.seconds <= 0) {
                            clearInterval(self.timeInterval);
                        }
                    }
                }, 1000);

            },
            // 提交数字彩订单
            submitOrder: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                self.orderInfo.backUrl = CONFIG.HOST+"/app/app.html#page//app/view/order/result.html" + "?paramInfo="+ encodeURI(JSON.stringify(self.paramInfo));
                window.location.href = CONFIG.HOST + utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.payOrder, self.orderInfo, true) + "&userId=" + USERINFO["userId"] + "&userToken=" + USERINFO["userToken"]+"&appType=1";
            }
        },
        created: function () {
            var self = this;

            self.getOrderDetail();

        }
    });
}())