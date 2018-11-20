(function () {
    var pageVue = new Vue({
        el: "#js-pageKingBi",
        data: {
            userInfo: USERINFO,
            coinInfoList: {},
            coinInfo: {
                pageSize: 10,
                pageNum: 1,
                beginDay: "",
                endDay: "",
                transType: "",
                transStatus: "",
                action: CONFIG.ACTION.getWalletTransList
            },
            pageCount: 1,
            coinTypeList: CONFIG.TRANSTYPE,
            transStatus: CONFIG.TRANSSTATUS
        },
        methods: {
            // 退出登录
            userLogout: function() {
                utility.userLogout(function() {
                    window.location.replace(CONFIG.HOST+"/shop/view/user/login.html");
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
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getWalletTransList, self.coinInfo),
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

            setTimeout(function() {
                self.userInfo = USERINFO;
            }, 1000);

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