(function () {
    var pageVue = new Vue({
        el: "#js-pagePay",
        data: {
            isAction: false,
            userInfo: USERINFO,
            lotterName: CONFIG.LOTTERYNAME,
            orderInfo: utility.getSessionStorage("orderInfo"),
            generateOrder: utility.getSessionStorage("generateOrder"),
            payOrderInfo: {
                orderCode: utility.getSessionStorage("generateOrder").orderCode,
                action: CONFIG.ACTION.payOrder,
                backUrl: ""
            },
            paramInfo: {
                orderCode: utility.getSessionStorage("generateOrder").orderCode,
                action: CONFIG.ACTION.payOrder,
                goToUrl: "/www/view/user/order.html"
            }
        },
        methods: {
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
            // 提交数字彩订单
            submitOrder: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                // 如果还没有登录，则要先登录
                if (!!!self.userInfo) {
                    alert("请先登录", function () {
                        window.location.href = CONFIG.HOST + "/www/user/login.html";
                    });
                    return;
                }
                self.payOrderInfo.backUrl = CONFIG.HOST + "/www/view/order/result.html" + "?paramInfo=" + encodeURI(JSON.stringify(self.paramInfo));
                window.location.href = CONFIG.HOST + utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.payOrder, self.payOrderInfo, true) + "&userId=" + USERINFO["userId"] + "&userToken=" + USERINFO["userToken"] + "&appType=2";
            }
        },
        created: function () {
            var self = this;

        }
    });
}())