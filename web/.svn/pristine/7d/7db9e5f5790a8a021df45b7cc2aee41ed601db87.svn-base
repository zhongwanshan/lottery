(function () {
    var pageVue = new Vue({
        el: "#js-historyBasketBall",
        data: {
            matchList: [],
            basketBallList: []
        },
        methods: {
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
                            "matchDay": issueno,
                            "type": 2,
                            "callback": function (data) {

                                obj[issueno]["list"] = data.data;

                                self.basketBallList.push(obj[issueno]);

                                self.basketBallList.sort(function(a,b) {
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
                    "recent": 10,
                    "callback": function (data) {
                        self.matchList = data.data;

                        self.geBkBlendMatches();

                        utility.setiScroll();
                    }
                });
            }
        },
        created: function () {
            var self = this;

            // 获取篮球近N期历史期数号接口
            self.geRecentBkBlendIssueNo();
        }
    });
}())