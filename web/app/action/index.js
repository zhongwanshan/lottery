(function () {
    var pageVue = new Vue({
        el: "#js-index",
        data: {
            type: {
                "id11": "ssq",
                "id12": "fc3d",
                "id13": "qcl",
                "id14": "dlt",
                "id15": "qxc",
                "id16": "pl3",
                "id17": "pl5",
            },
            lottoIdList: [6, 11, 12, 13, 14, 15, 16, 17],
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
            numList: [],
            num: "",
            digitalData: [],
            cmsList: [],
            cmsImgHost: CONFIG.HOST+":9090/cms/uploads/"
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
                var action = "";

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

            // 重新格式化数字彩数据
            formatDigitalData: function (data) {
                var self = this;
                var time = [];
                var typeObj = {};

                for (var i = 0, len = data.length; i < len; i++) {
                    time = data[i]["offTime"].split(" ")[1].split(":");
                    typeObj["lottoId" + data[i]["lottoId"]] = data[i];

                    // 如果已经过了销售时间
                    if (Date.parse(new Date()) >= Date.parse(new Date(data[i]["offTime"]))) {
                        typeObj["lottoId" + data[i]["lottoId"]]["statu"] = "暂停销售";
                    } else {
                        typeObj["lottoId" + data[i]["lottoId"]]["statu"] = "截至" + time[0] + "时" + time[1] + "分";
                    }
                }

                self.digitalData = typeObj;
            },
            // 获取数字彩列表数据
            getDigitalIssueList: function () {
                var self = this;

                utility.getDigitalIssue({
                    appType: 1,
                    lottoId: "6,11,12,13,14,15,16,17",
                    callback: function (data) {
                        self.formatDigitalData(data.data);
                    }
                });

                // utility.getDigitalIssue("6,11,12,13,14,15,16,17", function (data) {
                //     self.formatDigitalData(data.data);
                // });
            },

            // 获取指定足球赛事赛果比分接口
            geFbMatchScoreData: function () {
                var self = this;

                utility.geFbMatchScoreData({
                    "mid": "",
                    "num": "",
                    "callback": function (data) {
                        self.footBallData = data.data;
                    }
                });
            },
            // 获取当前篮球赛事及赔率赛果
            geRecentBkBlendIssueNo: function () {
                var self = this;
                utility.geRecentBkBlendIssueNo({
                    "recent": 1,
                    "callback": function (data) {
                        self.basetballData = data.data;
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

                        }
                    },
                });
            }
        },
        created: function () {
            var self = this;

            utility.findByCodeWithContents({
                code: "H5_News",
                callback: function (data) {
                    self.cmsList = data.data.contents;
                    setTimeout(function () {
                        var swiper = new Swiper('.swiper-container', {
                            speed: 2000,
                            spaceBetween: 0,
                            autoplay: {
                                delay: self.cmsList * 3000
                            }
                        });

                        utility.setiScroll();
                    }, 2000);
                }
            });

            // 获取数字彩开奖数据
            self.getDigitalPrizeData();

            // 获取数字彩数据
            self.getDigitalIssueList();

            // 获取指定足球赛事赛果比分接口
            self.geFbMatchScoreData();

            // 获取当前篮球赛事及赔率赛果
            self.geRecentBkBlendIssueNo();

            // 14场和任选9
            self.geFbTraditionMatches();
        }
    });
}())