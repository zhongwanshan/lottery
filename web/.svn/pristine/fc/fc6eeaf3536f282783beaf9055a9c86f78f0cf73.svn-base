(function () {
    var pageVue = new Vue({
        el: "#js-detailDigital",
        data: {
            lottoid: PAGE.query.lottoid,
            type: CONFIG.LOTTERYTYPE,
            digitalData: null
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
                    action: action,
                    fetchNum: "",
                    callback: function(data) {
                        for (var i = 0, len = data.data.length; i < len; i++) {
                            if(PAGE.query.issueno == data.data[i]["issueno"]) {
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