(function () {
    var queryInfo = utility.getQueryParams();
    var pageVue = new Vue({
        el: "#js-pageResult",
        data: {
            userInfo: USERINFO,
            queryInfo: queryInfo,
            paramInfo: JSON.parse(decodeURI(queryInfo.paramInfo))
        },
        methods: {
            // 退出登录
            userLogout: function () {
                utility.userLogout(function() {
                    window.location.replace(CONFIG.HOST+"/shop/view/user/login.html");
                });
            },
            rePay: function () {
                var self = this;
                
                self.paramInfo.backUrl = CONFIG.HOST + "/shop/view/order/result.html" + "?paramInfo=" + queryInfo.paramInfo;

                window.location.href = CONFIG.HOST + utility.formatActionUrl(CONFIG.SERVICE.walletService, self.paramInfo.action, self.paramInfo, true) + "&userId=" + USERINFO["userId"] + "&userToken=" + USERINFO["userToken"] + "&appType=2";
            }
        }
    });
}())