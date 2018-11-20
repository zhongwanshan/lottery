(function () {
    var queryInfo = utility.getQueryParams();
    var pageVue = new Vue({
        el: "#js-payQrcode",
        data: {
            userInfo: USERINFO,
        },
        methods: {
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
            getOrderDetail: function () {
                var self = this;

                // queryPay

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.queryPay, {
                            action: CONFIG.ACTION.queryPay,
                            orderCode: queryInfo["orderCode"]
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: {
                        action: CONFIG.ACTION.queryPay,
                        orderCode: queryInfo["orderCode"]
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            // 如果是店主
                            if(USERINFO["userId"]==1) {
                                window.location.href = CONFIG.HOST + "/shop/view/user/depRech.html"
                            } else {
                                window.location.href = CONFIG.HOST + "/www/view/user/order.html"
                            }
                            
                        }
                    }
                });
            },
        },
        created: function () {
            var self = this;

            setTimeout(function () {
                if (!!queryInfo && queryInfo["qrcode"]) {
                    $("#js-QRcode").empty().qrcode(decodeURIComponent(queryInfo["qrcode"]));
                }
            }, 1000);

            // 监听
            setInterval(function() {
                self.getOrderDetail();
            }, 4000);
        }
    });
}())