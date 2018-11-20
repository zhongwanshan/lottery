(function () {
    var pageVue = new Vue({
        el: "#js-trFootball",
        data: {
            issueNoList: [],
            matchList: null,
            numList: [],
            num: ""
        },
        methods: {
        
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
                        (function(issueno) {
                            utility.geFbTraditionMatches({
                                num: issueno,
                                type: 2,
                                callback: function (data) {
                                    obj[issueno]["list"] = (function () {
                                        var arr = [];
    
                                        for (var a = 0, alen = data.data.length; a < alen; a++) {
                                            if (data.data[a]["number"].length > 0) {
                                                arr.push(data.data[a]["number"]);
                                            }
                                        }
                                        return arr;
                                    }());
    
                                    arr.push(obj[issueno]);
                                    self.matchList = arr.sort(function(a, b) {
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
                    "recent": 20,
                    "callback": function (data) {
                        self.issueNoList = data.data;

                        self.geFbTraditionMatches();

                        utility.setiScroll();
                    }
                });
            }

        },
        created: function () {
            var self = this;

            self.geRecentFbTraditionIssueNo();
        }
    });
}())