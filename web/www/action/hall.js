(function () {
    var pageVue = new Vue({
        el: "#js-pageHall",
        data: {
            userInfo: USERINFO,
            digitalData: null
        },
        methods: {
            // 退出登录
            userLogout: function() {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
        },
        created: function () {
            var self = this;

            utility.setSessionStorage("resultList", null);
            utility.setSessionStorage("orderInfo", null);
            utility.setSessionStorage("generateOrder", null);
        }
    });
}())