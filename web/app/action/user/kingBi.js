(function () {
    var pageVue = new Vue({
        el: "#js-pageKingBi",
        data: {
            userInfo: USERINFO,
            coinList: [],
            coinInfo: {
                transType: "",
                curPage: 0,
                action: CONFIG.ACTION.getUserCoinList,
                pageSize: 20,
                pageNum: 1
            },
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
        watch: {
            "coinInfo.transType": function (value) {
                var self = this;

                self.coinInfo.pageNum = 1;
                self.coinInfo.curPage = 0;
                self.coinList = [];

                self.getUserCoinList();
            }
        },
        methods: {
            // 获取账单明细列表
            getUserCoinList: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        appType: "1",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getUserCoinList, self.coinInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: self.coinInfo,
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
                                if (self.coinInfo.pageNum <= Math.ceil(data.count / self.coinInfo.pageSize)) {
                                    self.coinInfo.pageNum = self.coinInfo.pageNum + 1;
                                    self.coinInfo.curPage = self.coinInfo.curPage + 1;
                                    self.coinList = data.data.concat(self.coinList);
                                }
                            }
                            self.mescroll.endBySize(self.coinList.length, data.count);
                            self.mescroll.endSuccess(); //无
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
            // self.getUserCoinList();
        },
        mounted: function () {
            //创建MeScroll对象,down可以不用配置,因为内部已默认开启下拉刷新,重置列表数据为第一页
            //解析: 下拉回调默认调用mescroll.resetUpScroll(); 而resetUpScroll会将page.num=1,再执行up.callback,从而实现刷新列表数据为第一页;
            var self = this;
            self.mescroll = new MeScroll("mescroll", { //请至少在vue的mounted生命周期初始化mescroll,以确保您配置的id能够被找到
                down: {
                    // auto: false, //是否在初始化完毕之后自动执行下拉回调callback; 默认true
                    callback: function () {
                        self.getUserCoinList();
                    } //下拉刷新的回调
                }
            });
        }
    });
}())