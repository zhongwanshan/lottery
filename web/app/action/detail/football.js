(function () {
    var pageVue = new Vue({
        el: "#js-detailFootball",
        data: {
            teamInfo: null,
            leagueList: [],
            hisDetailList: []
        },
        methods: {
            // 获取指定足球赛事的主客队近期战绩（不含赛事详情）接口
            geFbMatchLeagueStat: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        userId: (typeof USERINFO != 'undefined' && !!USERINFO) ? USERINFO["userId"] : "",
                        userToken: (typeof USERINFO != 'undefined' && !!USERINFO) ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.lotteryService, CONFIG.ACTION.geFbMatchLeagueStat, {
                            mid: PAGE.query.mid,
                            action: CONFIG.ACTION.geFbMatchLeagueStat
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.lotteryService,
                    dataObj: {
                        mid: PAGE.query.mid,
                        action: CONFIG.ACTION.geFbMatchLeagueStat
                    },
                    beforeSendCallback: function () {
                        app.showIndicator();
                    },
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        app.hideIndicator();
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.teamInfo = data.data[0];
                            self.leagueList = data.data;
                        } else {
                            app.showPreloader(data.message);
                            setTimeout(function () {
                                app.hidePreloader();
                            }, 1000);
                        }
                    },
                });
            },
            // 获取指定足球赛事的主客队历史交锋（不含赛事详情）接口
            geFbPkMatchHisStat: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        userId: (typeof USERINFO != 'undefined' && !!USERINFO) ? USERINFO["userId"] : "",
                        userToken: (typeof USERINFO != 'undefined' && !!USERINFO) ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.lotteryService, CONFIG.ACTION.geFbPkMatchHisDetail, {
                            mid: PAGE.query.mid,
                            action: CONFIG.ACTION.geFbPkMatchHisDetail
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.lotteryService,
                    dataObj: {
                        mid: PAGE.query.mid,
                        action: CONFIG.ACTION.geFbPkMatchHisDetail
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.hisDetailList = data.data;
                        } else {
                            app.showPreloader(data.message);
                            setTimeout(function () {
                                app.hidePreloader();
                            }, 1000);
                        }
                    },
                });
            },
        },
        created: function () {
            var self = this;

            self.geFbMatchLeagueStat();

            self.geFbPkMatchHisStat();

        }
    });
}())