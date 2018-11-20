(function () {
    var pageVue = new Vue({
        el: "#js-historyDigital",
        data: {
            lottoid: PAGE.query.lottoid,
            type: CONFIG.LOTTERYTYPE,
            digitalData: []
        },

        methods: {
            // 获取开奖历史
            getPrizeList: function () {
                var self = this;
                var action = "";

                if (PAGE.query.lottoid == 6) {
                    action = CONFIG.ACTION.getOldSscIssue;
                } else {
                    action = CONFIG.ACTION.getDigitalPrizeData;
                }

                utility.getDigitalPrizeData({
                    lottoId: PAGE.query.lottoid,
                    fetchNum: "10",
                    action: action,
                    callback: function (data) {
                        self.digitalData = data.data;

                        utility.setiScroll("page-"+PAGE.name);
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