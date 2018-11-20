(function () {
    var pageVue = new Vue({
        el: "#js-message",
        data: {
            mescroll: null,
            userInfo: USERINFO,
            imageData: USERINFO["headImageUrl"] || "",
            messageInfo: {
                curPage: 1,
                pageSize: 5,
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
                self.messageInfo.curPage = 1;
                self.messageList = [];
                self.mescroll.destroy();
                self.setMescrollAction();
            },
            "messageInfo.readStatus": function () {
                var self = this;
                self.messageInfo.curPage = 1;
                self.messageList = [];
                self.mescroll.destroy();
                self.setMescrollAction();
            }
        },

        methods: {
            // 获取站内信息
            getUserSiteMessageList: function () {
                var self = this;

                utility.getUserSiteMessageList({
                    messageInfo: self.messageInfo,
                    callback: function(data) {
                        if (data.data.length > 0) {
                            // 如果不是最后一页
                            if (self.messageInfo.curPage <= Math.ceil(data.count / self.messageInfo.pageSize)) {
                                self.messageInfo.curPage = self.messageInfo.curPage + 1;
                                self.messageList = data.data.concat(self.messageList);
                            }
                        }
                        self.mescroll.endBySize(self.messageList.length, data.count);
                        self.mescroll.endSuccess(); //无参
                    }
                });

                // utility.interactWithServer({
                //     headerInfo: {
                //         userId: !!USERINFO ? USERINFO["userId"] : "",
                //         userToken: !!USERINFO ? USERINFO["userToken"] : "",
                //         actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.getUserSiteMessageList, self.messageInfo),
                //     },
                //     url: CONFIG.HOST + CONFIG.SERVICE.commonService,
                //     dataObj: self.messageInfo,
                //     successCallback: function (data) {
                //         if (data.code == 200) {
                //             if (data.data.length > 0) {
                //                 // 如果不是最后一页
                //                 if (self.messageInfo.curPage <= Math.ceil(data.count / self.messageInfo.pageSize)) {
                //                     self.messageInfo.curPage = self.messageInfo.curPage + 1;
                //                     self.messageList = data.data.concat(self.messageList);
                //                 }
                //             }
                //             self.mescroll.endBySize(self.messageList.length, data.count);
                //             self.mescroll.endSuccess(); //无参
                //         } else {
                //             app.showPreloader(data.message);
                //             setTimeout(function () {
                //                 app.hidePreloader();
                //             }, 1000);
                //         }
                //     },
                // });
            },
            setMescrollAction: function() {
                var self = this;
                self.mescroll = new MeScroll("mescroll", { //请至少在vue的mounted生命周期初始化mescroll,以确保您配置的id能够被找到
                    down: {
                        // auto: false, //是否在初始化完毕之后自动执行下拉回调callback; 默认true
                        callback: function () {
                            self.getUserSiteMessageList();
                        } //下拉刷新的回调
                    },
                    up: {
                        // auto: false, //是否在初始化完毕之后自动执行下拉回调callback; 默认true
                        callback: function () {
                            self.getUserSiteMessageList();
                        } //下拉刷新的回调
                    }
                });
            },

            // 修改信息状态
            modifySiteMessage: function(msgId ,index) {
                var self = this;

                utility.interactWithServer({
                    headerInfo: {
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.modifySiteMessage, {
                            action: CONFIG.ACTION.modifySiteMessage,
                            msgId: msgId,
                            state: 1
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonService,
                    dataObj: {
                        action: CONFIG.ACTION.modifySiteMessage,
                        msgId: msgId,
                        state: 1
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            var contentType = self.messageList[index]["contentType"];

                            // 如果是中奖通知
                            if(contentType == 2) {
                                self.messageList[index]["readStatus"] = 1;
                                setTimeout(function() {
                                    mainView.router.loadPage("/app/view/order/detail.html?orderCode="+ self.messageList[index]["msgUrl"].split("=")[1]);
                                },1000);
                            } else {
                                self.messageList = [];
                                self.getUserSiteMessageList();
                            }
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
        },
        mounted: function () {
            //创建MeScroll对象,down可以不用配置,因为内部已默认开启下拉刷新,重置列表数据为第一页
            //解析: 下拉回调默认调用mescroll.resetUpScroll(); 而resetUpScroll会将page.num=1,再执行up.callback,从而实现刷新列表数据为第一页;
            var self = this;
            self.setMescrollAction();
        }
    });
}())