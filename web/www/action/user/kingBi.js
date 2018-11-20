(function () {
    var pageVue = new Vue({
        el: "#js-pageKingBi",
        data: {
            userInfo: USERINFO,
            coinInfoList: {},
            coinInfo: {
                transType: "",
                pageSize: 10,
                pageNum: 1,
                beginDay: "",
                endDay: "",
                coinTransType: "",
                action: CONFIG.ACTION.getUserCoinList
            },
            pageCount: 1,
            // 0：存入、
            // 1：转移、
            // 2：消费
            // 3：过期失效
            coinTypeList: [
                {
                    "id": 0,
                    "type": "存入"
                },
                {
                    "id": 1,
                    "type": "转移"
                },
                {
                    "id": 2,
                    "type": "消费"
                },
                {
                    "id": 4,
                    "type": "过期失效"
                }
            ]
        },
        methods: {
            // 退出登录
            userLogout: function() {
                utility.userLogout(function() {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
            // 获取账单明细列表
            getUserCoinList: function (bool) {
                var self = this;
                // 如果是重新获取，则重新设置分页数据
                if (bool == true) {
                    self.coinInfo.pageNum = 1;
                }
                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getUserCoinList, self.coinInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: self.coinInfo,
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.coinListInfo = data;
                            if (data.data.length > 0) {
                                self.pageCount = Math.ceil(data.count / self.coinInfo.pageSize);
                                self.coinInfoList = data.data;
                            } else {
                                self.coinInfoList = [];
                            }
                        } else {
                            alert(data.message);
                        }
                    },
                });
            },
            // 分页
            getByPage: function (page) {
                var self = this;

                self.coinInfo.pageNum = page;

                self.getUserCoinList();
            },

            // 获取上一页数据
            getPreViewData: function () {
                var self = this;

                if (self.coinInfo.pageNum > 1) {
                    self.coinInfo.pageNum = self.coinInfo.pageNum - 1;
                    self.getUserCoinList();
                }
            },
            // 获取下一页数据
            getNextData: function () {
                var self = this;

                if (self.coinInfo.pageNum < self.pageCount) {
                    self.coinInfo.pageNum = self.coinInfo.pageNum + 1;
                    self.getUserCoinList();
                }
            },
        },
        created: function () {
            var self = this;

            self.getUserCoinList();

        },
        mounted: function () {
            var self = this;

            $('#starTime').fdatepicker({
                format: 'yyyy-mm-dd'
            }).on('changeDate', function (ev) {
                self.coinInfo.beginDay = $('#starTime').val();
            });
            $('#endTime').fdatepicker({
                format: 'yyyy-mm-dd'
            }).on('changeDate', function (ev) {
                self.coinInfo.endDay = $('#endTime').val();
            });
        }
    });
}())