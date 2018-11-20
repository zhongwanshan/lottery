(function () {
    var queryInfo = utility.getQueryParams();
    var pageVue = new Vue({
        el: "#js-pageContent",
        data: {
            userInfo: USERINFO,
            contentInfo: null
        },
        methods: {
           
        },
        created: function () {
            var self = this;

            utility.findByContentId({
                contentId: PAGE.query["contentId"],
                callback: function (data) {
                    self.contentInfo = data.data;
                }
            });
        }
    });
}())