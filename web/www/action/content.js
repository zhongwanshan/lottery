(function () {
    var queryInfo = utility.getQueryParams();
    var pageVue = new Vue({
        el: "#js-pageContent",
        data: {
            userInfo: USERINFO,
            digitalData: null,
            contentInfo: null
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

            utility.findByContentId({
                contentId: queryInfo["contentId"],
                callback: function (data) {
                    self.contentInfo = data.data;
                }
            });
        }
    });
}())