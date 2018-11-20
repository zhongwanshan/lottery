(function () {
    var pageVue = new Vue({
        el: "#js-pageSecurity",
        data: {
            userInfo: USERINFO
        },
        methods: {
            // 退出登录
            userLogout: function() {
                utility.userLogout(function() {
                    window.location.replace(CONFIG.HOST+"/shop/view/user/login.html");
                });
            },
        },
        created: function () {
            var self = this;
            setTimeout(function() {
                self.userInfo = USERINFO;
            }, 1000);
        }
    });
}())