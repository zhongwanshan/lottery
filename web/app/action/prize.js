(function () {
    var pageVue = new Vue({
        el: "#js-pagePrize",
        data: {
            ssqList: null,
            fc3dList: null,
            qxcList: null,
            qclList: null,
            pl3List: null,
            pl5List: null,
            dltList: null,
            gd115List: null,
            footBallData: [],
            basetballData: [],
            lottoIdList: [6, 11, 12, 13, 14, 15, 16, 17],
            numList: [],
            num: ""
        },
        methods: {
            // 格式化数字彩
            formatDititalList: function (data) {
                var self = this;

                if (data["lottoId"] == 6) {
                    self.gd115List = data;
                }
                if (data["lottoid"] == 11) {
                    self.ssqList = data;
                }
                if (data["lottoid"] == 12) {
                    self.fc3dList = data;
                }
                if (data["lottoid"] == 13) {
                    self.qclList = data;
                }
                if (data["lottoid"] == 14) {
                    self.dltList = data;
                }
                if (data["lottoid"] == 15) {
                    self.qxcList = data;
                }
                if (data["lottoid"] == 16) {
                    self.pl3List = data;
                }
                if (data["lottoid"] == 17) {
                    self.pl5List = data;
                }
            },
            // 获取数字彩列表数据
            getDigitalPrizeData: function () {
                var self = this;
                var list = [];
                var action = CONFIG.ACTION.getDigitalPrizeData;

                for (var i = 0, len = self.lottoIdList.length; i < len; i++) {
                    (function (lottoId) {
                        if (lottoId == 6) {
                            action = CONFIG.ACTION.getOldSscIssue;
                        } else {
                            action = CONFIG.ACTION.getDigitalPrizeData;
                        }
                        utility.getDigitalPrizeData({
                            "lottoId": lottoId,
                            "fetchNum": "10",
                            "action": action,
                            "callback": function (data) {
                                if (lottoId == 6) { 
                                    for(var i = 0, len = data.data.length; i < len; i++) {
                                        if (!!data.data[i]["winNumber"]) {
                                            self.formatDititalList(data.data[i]);
                                            break;
                                        }
                                    }
                                } else {
                                    self.formatDititalList(data.data[0]);
                                }
                            }
                        });
                    }(self.lottoIdList[i]));
                }
            },

            // 获取指定足球赛事赛果比分接口
            geFbMatchScoreData: function () {
                var self = this;

                utility.geFbMatchScoreData({
                    "mid": "",
                    "num": "",
                    "callback": function (data) {
                        self.footBallData = data.data;
                        utility.setiScroll();
                    }
                });
            },

            geRecentBkBlendIssueNo: function () {
                var self = this;
                utility.geRecentBkBlendIssueNo({
                    "recent": 1,
                    "callback": function (data) {
                        self.basetballData = data.data;
                        utility.setiScroll();
                    }
                });
            },

            // 格式化传统足球数据
            format14And9List: function (data) {
                var self = this;

                for (i = 0, len = data.length; i < len; i++) {
                    self.numList.push(data[i]["number"]);
                    self.num = data[i]["num"];
                }
            },

            // 竞彩足球获取当前可售足球赛事信息接口
            geFbTraditionMatches: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.lotteryService, CONFIG.ACTION.geFbTraditionMatches, {
                            action: CONFIG.ACTION.geFbTraditionMatches,
                            type: 2
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.lotteryService,
                    dataObj: {
                        action: CONFIG.ACTION.geFbTraditionMatches,
                        type: 2
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.format14And9List(data.data);
                            utility.setiScroll();
                        }
                    },
                });
            }

        },
        created: function () {
            var self = this;

            // 获取数字彩数据列表
            self.getDigitalPrizeData();

            // 获取指定足球赛事赛果比分接口
            self.geFbMatchScoreData();

            // 获取当前篮球赛事及赔率赛果
            self.geRecentBkBlendIssueNo();

            // 14场和任选9
            self.geFbTraditionMatches();

        }
    });
}())