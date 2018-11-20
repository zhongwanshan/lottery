(function () {
    var pageVue = new Vue({
        el: "#js-message",
        data: {
            userInfo: USERINFO,
            imageData: USERINFO["headImageUrl"] || "",
            messageInfo: {
                curPage: 1,
                pageSize: 10,
                type: 0, // 0：全部  1：优惠 2：中奖 3：活动 4：其它
                readStatus: 2, // 0：未读； 1：已读 2：全部 
                action: CONFIG.ACTION.getUserSiteMessageList
            },
            pageCount: 1,
            listInfo: {
                "type_0": [],
                "type_1": [],
                "type_2": [],
                "type_3": [],
                "type_4": []
            },
            typeStr: {
                "0": "全部",
                "1": "优惠信息",
                "2": "中奖通知",
                "3": "活动",
                "4": "其它",
            },
            readStatusStr: {
                "0": "未读",
                "1": "已读",
                "2": "全部",
            },
            messageList: []
        },
        watch: {
            "messageInfo.type": function () {
                var self = this;
                self.getUserSiteMessageList();
            },
            "messageInfo.readStatus": function () {
                var self = this;
                self.getUserSiteMessageList();
            }
        },

        methods: {
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST+"/shop/view/user/login.html");
                });
            },
            // 获取站内信息
            getUserSiteMessageList: function () {
                var self = this;

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.getUserSiteMessageList, self.messageInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonService,
                    dataObj: self.messageInfo,
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.messageList = data.data;
                        } else {
                            alert(data.message);
                        }
                    },
                });
            },
            // 分页
            getByPage: function (page) {
                var self = this;

                self.messageInfo.curPage = page;

                self.getUserSiteMessageList();
            },

            // 获取上一页数据
            getPreViewData: function () {
                var self = this;

                if (self.messageInfo.curPage > 1) {
                    self.messageInfo.curPage = self.messageInfo.curPage - 1;
                    self.getUserSiteMessageList();
                }
            },
            // 获取下一页数据
            getNextData: function () {
                var self = this;

                if (self.messageInfo.curPage < self.pageCount) {
                    self.messageInfo.curPage = self.messageInfo.curPage + 1;
                    self.getUserSiteMessageList();
                }
            },
        },
        created: function () {
            var self = this;

            self.getUserSiteMessageList();

            setTimeout(function () {
                self.userInfo = USERINFO;
            }, 1000);
        }
    });
}())