(function () {
    var query = utility.getQueryParams();
    var pageVue = new Vue({
        el: "#js-detailDigital",
        data: {
            userInfo: USERINFO,
            lottoid: query.lottoid,
            type: CONFIG.LOTTERYTYPE,
            digitalData: null,
            digitalList: []
        },

        methods: {
            // 退出登录
            userLogout: function() {
                utility.userLogout(function() {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
            // 获取开奖历史
            getPrizeList: function () {
                var self = this;

                utility.getDigitalPrizeData({
                    appType: "2",
                    lottoId: query.lottoid,
                    fetchNum: 100,
                    callback: function(data) {
                        self.digitalList = data.data;
                        for (var i = 0, len = data.data.length; i < len; i++) {
                            if(query.issueno == data.data[i]["issueno"]) {
                                self.digitalData = data.data[i];
                                break;
                            }
                        }
                    }
                });
            }
        },
        created: function () {
            var self = this;
            
            self.getPrizeList();
        }
    });
}())