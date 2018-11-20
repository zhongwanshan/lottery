(function () {
    var pageVue = new Vue({
        el: "#js-pageResult",
        data: {
            userInfo: USERINFO,
            queryInfo: PAGE.query,
            paramInfo: JSON.parse(decodeURI(PAGE.query.paramInfo))
        },
        methods: {
            rePay: function () {
                var self = this;
                
                self.paramInfo.backUrl = CONFIG.HOST + "/app/app.html#page//app/view/order/result.html" + "?paramInfo=" + PAGE.query.paramInfo;
                window.location.href = CONFIG.HOST + utility.formatActionUrl(CONFIG.SERVICE.walletService, self.paramInfo.action, self.paramInfo, true) + "&userId=" + USERINFO["userId"] + "&userToken=" + USERINFO["userToken"] + "&appType=1";
            },
            toIndexPage: function() {
                window.location.replace(CONFIG.HOST + "/app/app.html");
            }
        },
        created: function () {
            var self = this;
        }
    });
}())