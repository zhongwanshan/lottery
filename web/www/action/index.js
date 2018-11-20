(function () {
    var pageVue = new Vue({
        el: "#js-index",
        data: {
            type: CONFIG.LOTTERYTYPE,
            ballType: 0, //  0： 足球，1，篮球
            userInfo: USERINFO,
            playStatu: CONFIG.MATCHSTATU,
            digitalPirzeData: [],
            footBallData: [],
            matchList: [],
            basketBallList: [],
            basketMatchNum: 0,
            mnlList: ['(主负) ', '(主胜)'],
            hdcList: ['(主胜) ', '(主负)'],
            wnmList: ['(1-5分) ', '(6-10分) ', '(11-15分) ', '(16-20分) ', '(21-25分) ', '(26+) '],
            issueNoList: [],
            trMatchList: [],
            cmsList: [],
            cmsImgHost: CONFIG.HOST+":9090/cms/uploads/"
        },
        methods: {
            // 设置竞彩类型
            setBallType: function (ballType) {
                var self = this;
                self.ballType = ballType;
            },
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
            // 获取数字彩列表数据
            getDigitalPrizeData: function () {
                var self = this;
                var list = [];
                var action = "";
                var lottoIdList = [11, 12, 13, 14, 15, 16, 17, 6];

                for (var i = 0, len = lottoIdList.length; i < len; i++) {
                    (function (lottoId) {
                        if (lottoId == 6) {
                            action = CONFIG.ACTION.getOldSscIssue;
                        } else {
                            action = CONFIG.ACTION.getDigitalPrizeData;
                        }
                        utility.getDigitalPrizeData({
                            "appType": "2",
                            "lottoId": lottoId,
                            "fetchNum": "2",
                            "action": action,
                            "callback": function (data) {
                                if (lottoId == 6) {
                                    if (!!data.data[0]["winNumber"]) {
                                        self.digitalPirzeData.push(data.data[0]);
                                    } else {
                                        self.digitalPirzeData.push(data.data[1]);
                                    }
                                } else {
                                    self.digitalPirzeData.push(data.data[0]);
                                }

                            }
                        });
                    }(lottoIdList[i]));
                }
            },
            // 获取指定足球赛事赛果比分接口
            geFbMatchScoreData: function () {
                var self = this;

                utility.geFbMatchScoreData({
                    "appType": "2",
                    "mid": "",
                    "num": "",
                    "callback": function (data) {
                        self.footBallData = data.data;
                    }
                });
            },
            // 获取指定足球赛事赛果比分接口
            geBkBlendMatches: function () {
                var self = this;

                utility.geBkBlendMatches({
                    "appType": "2",
                    "mid": "",
                    "type": "2",
                    "callback": function (data) {
                        self.basketBallData = data.data;
                    }
                });
            },
            // 重新格式化赛事数据
            geBkBlendMatches: function () {
                var self = this;
                var obj = {};

                for (var i = 0, len = self.matchList.length; i < len; i++) {

                    (function (issueno) {
                        obj[issueno] = {
                            "issueno": issueno,
                            "weekDay": utility.getCurrentTimeInfo(issueno)["weekDay"],
                            "list": []
                        };
                        // 获取当前篮球赛事及赔率赛果
                        utility.geBkBlendMatches({
                            "appType": "2",
                            "matchDay": issueno,
                            "type": 2,
                            "callback": function (data) {

                                obj[issueno]["list"] = data.data;

                                self.basketMatchNum = self.basketMatchNum + data.data.length;
                                self.basketBallList.push(obj[issueno]);
                                self.basketBallList.sort(function (a, b) {
                                    return Date.parse(b.issueno) - Date.parse(a.issueno);
                                });

                            }
                        });
                    }(self.matchList[i]["issueno"]));
                }

            },
            // 获取篮球近N期历史期数号接口
            geRecentBkBlendIssueNo: function () {
                var self = this;
                utility.geRecentBkBlendIssueNo({
                    "appType": "2",
                    "recent": 10,
                    "callback": function (data) {
                        self.matchList = data.data;

                        self.geBkBlendMatches();
                    }
                });
            },
            // 竞彩足球获取当前可售足球赛事信息接口
            geFbTraditionMatches: function () {
                var self = this;
                var obj = {};
                var arr = [];

                for (var i = 0, len = self.issueNoList.length; i < len; i++) {
                    obj[self.issueNoList[i]["issueno"]] = {
                        "name": self.issueNoList[i]["issueName"],
                        "issueno": self.issueNoList[i]["issueno"],
                        "list": []
                    };
                }

                for (var key in obj) {
                    if (obj.hasOwnProperty(key)) {
                        (function (issueno) {
                            utility.geFbTraditionMatches({
                                appType: "2",
                                num: issueno,
                                type: 1,
                                callback: function (data) {
                                    obj[issueno]["list"] = (function () {
                                        var arr = [];

                                        for (var a = 0, alen = data.data.length; a < alen; a++) {
                                            if (!!data.data[a]["number"] && data.data[a]["number"].length > 0) {
                                                arr.push(data.data[a]["number"]);
                                            }
                                        }
                                        return arr;
                                    }());

                                    arr.push(obj[issueno]);
                                    self.trMatchList = arr.sort(function (a, b) {
                                        return b["issueno"] - a["issueno"];
                                    });
                                }
                            });
                        }(obj[key]["issueno"]));
                    }
                }
            },

            // 获取传统足球近N期历史期数号接口
            geRecentFbTraditionIssueNo: function () {
                var self = this;
                utility.geRecentFbTraditionIssueNo({
                    appType: "2",
                    "recent": 20,
                    "callback": function (data) {
                        self.issueNoList = data.data;

                        self.geFbTraditionMatches();
                    }
                });
            }
        },
        created: function () {
            var self = this;

            utility.findByCodeWithContents({
                code: "Match",
                callback: function (data) {
                    self.cmsList = data.data.contents;

                    setTimeout(function () {
                        var swiper = new Swiper('.swiper-container', {
                            spaceBetween: 30,
                            centeredSlides: true,
                            autoplay: {
                                delay: 2500,
                                disableOnInteraction: false,
                            },
                            pagination: {
                                el: '.swiper-pagination',
                                clickable: true,
                            },
                            navigation: {
                                nextEl: '.swiper-button-next',
                                prevEl: '.swiper-button-prev',
                            },
                        });
                    }, 1000);
                }
            });

            // 获取数字彩开奖数据
            self.getDigitalPrizeData();

            // 获取指定足球赛事赛果比分接口
            self.geFbMatchScoreData();

            // 获取指定篮球赛事赛果比分接口
            // self.geBkBlendMatches();
            self.geRecentBkBlendIssueNo();

            // 获取传统足球近N期历史期数号接口
            self.geRecentFbTraditionIssueNo();

            utility.setSessionStorage("resultList", null);
            utility.setSessionStorage("orderInfo", null);
            utility.setSessionStorage("generateOrder", null);
        }
    });
}())