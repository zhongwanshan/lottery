(function () {
    var pageVue = new Vue({
        el: "#js-account",
        data: {
            mescroll: null,
            userInfo: USERINFO,
            walletTransList: [],
            transInfo: {
                transType: "",
                curPage: 0,
                pageSize: 10,
                pageNum: 1,
                action: CONFIG.ACTION.getWalletTransList
            },
            transType: CONFIG.TRANSTYPE
        },
        watch: {
            "transInfo.transType": function (value) {
                var self = this;

                self.transInfo.pageNum = 1;
                self.walletTransList = [];

                self.getWalletTransList();
            }
        },
        methods: {
            // 获取账单明细列表
            getWalletTransList: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getWalletTransList, self.transInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: self.transInfo,
                    beforeSendCallback: function () {
                        app.showIndicator();
                    },
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        app.hideIndicator();
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            if (data.data.length > 0) {
                                // 如果不是最后一页
                                if (self.transInfo.pageNum <= Math.ceil(data.count / self.transInfo.pageSize)) {
                                    self.transInfo.pageNum = self.transInfo.pageNum + 1;
                                    self.walletTransList = self.walletTransList.concat(data.data);
                                }
                            }
                            self.mescroll.endBySize(self.walletTransList.length, data.count);
                            self.mescroll.endSuccess(); //无参
                        } else {
                            app.showPreloader(data.message);
                            setTimeout(function () {
                                app.hidePreloader();
                            }, 1000);
                        }
                    },
                });
            }
        },
        created: function () {
            var self = this;

            setTimeout(function() {
                self.userInfo = USERINFO;
            }, 1000);
        },
        mounted: function () {
            //创建MeScroll对象,down可以不用配置,因为内部已默认开启下拉刷新,重置列表数据为第一页
            //解析: 下拉回调默认调用mescroll.resetUpScroll(); 而resetUpScroll会将page.num=1,再执行up.callback,从而实现刷新列表数据为第一页;
            var self = this;
            self.mescroll = new MeScroll("mescroll", { //请至少在vue的mounted生命周期初始化mescroll,以确保您配置的id能够被找到
                up: {
                    // auto: false, //是否在初始化完毕之后自动执行下拉回调callback; 默认true
                    callback: function () {
                        self.getWalletTransList();
                    } //下拉刷新的回调
                }
            });
        }
    });
}())