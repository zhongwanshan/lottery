(function () {
    var pageVue = new Vue({
        el: "#js-depRech",
        data: {
            type: 0, // 0:充值，1：提现
            userInfo: USERINFO,
            rechargeStatu: CONFIG.RECHARGESTATU,
            rechargeType: CONFIG.RECHARGETYPE,
            state: CONFIG.AUTHSTATE,
            resultState: CONFIG.RESULTSTATE,
            resultStatus: "",
            authState: "",

            rechargeParamInfo: {
                action: CONFIG.ACTION.getRrechargeList,
                pageSize: 10,
                pageNum: 1,
                beginDay: "",
                endDay: "",
                resultStatus: ""
            },
            rechargePageCount: 1,
            rechargeList: [],

            depositPageCount: 1,
            depositList: [],
            depositParamInfo: {
                action: CONFIG.ACTION.getWithdrawCashList,
                pageSize: 10,
                pageNum: 1,
                beginDay: "",
                endDay: "",
                authState: ""
            }
        },
        methods: {
            switchType: function (type) {
                var self = this;
                self.type = type;
            },
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },

            // 提现列表
            getDepositList: function (bool) {
                var self = this;

                // 如果是重新获取，则重新设置分页数据
                if (bool == true) {
                    self.depositParamInfo.pageNum = 1;
                }

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getWithdrawCashList, self.depositParamInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: self.depositParamInfo,
                    successCallback: function (data) {
                        if (data.code == 200) {
                            if (data.data.length > 0) {
                                self.depositPageCount = Math.ceil(data.count / self.depositParamInfo.pageSize);
                                self.depositList = data.data;
                            } else {
                                self.depositList = [];
                            }
                        } else {
                            alert(data.message);
                        }
                    },
                });
            },
            // 获取充值列表
            getRrechargeList: function (bool) {
                var self = this;

                // 如果是重新获取，则重新设置分页数据
                if (bool == true) {
                    self.rechargeParamInfo.pageNum = 1;
                }

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getRrechargeList, self.rechargeParamInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: self.rechargeParamInfo,
                    successCallback: function (data) {
                        if (data.code == 200) {
                            if (data.data.length > 0) {
                                self.rechargePageCount = Math.ceil(data.count / self.rechargeParamInfo.pageSize);

                                self.rechargeList = data.data;
                            } else {
                                self.rechargeList = [];
                            }
                        } else {
                            alert(data.message);
                        }
                    },
                });
            },
            // 分页
            getByPage: function (page, type) {
                var self = this;

                // 如果是充值
                if (type == 0) {
                    self.rechargeParamInfo.pageNum = page;
                    self.getRrechargeList();
                    // 如果是提现
                } else if (type == 1) {
                    self.depositParamInfo.pageNum = page;
                    self.getDepositList();
                }
            },

            // 获取上一页数据
            getPreViewData: function (type) {
                var self = this;

                // 如果是充值
                if (type == 0) {
                    if (self.rechargeParamInfo.pageNum > 1) {
                        self.rechargeParamInfo.pageNum = self.rechargeParamInfo.pageNum - 1;
                        self.getRrechargeList();
                    }
                    // 如果是提现
                } else if (type == 1) {
                    if (self.depositParamInfo.pageNum > 1) {
                        self.depositParamInfo.pageNum = self.depositParamInfo.pageNum - 1;
                        self.getDepositList();
                    }
                }
            },
            // 获取下一页数据
            getNextData: function (type) {
                var self = this;

                // 如果是充值
                if (type == 0) {
                    if (self.rechargeParamInfo.pageNum < self.rechargePageCount) {
                        self.rechargeParamInfo.pageNum = self.rechargeParamInfo.pageNum + 1;
                        self.getRrechargeList();
                    }
                    // 如果是提现
                } else if (type == 1) {
                    if (self.depositParamInfo.pageNum < self.depositParamInfo) {
                        self.depositParamInfo.pageNum = self.depositParamInfo.pageNum + 1;
                        self.getDepositList();
                    }
                }
            },
        },
        created: function () {
            var self = this;

            // 获取提现列表
            self.getDepositList();

            // 获取充值列表
            self.getRrechargeList();
        },
        mounted: function () {
            var self = this;

            $('#rechargeStarTime').fdatepicker({
                format: 'yyyy-mm-dd'
            }).on('changeDate', function (ev) {
                self.rechargeParamInfo.beginDay = $('#rechargeStarTime').val();
            });
            $('#rechargeEndTime').fdatepicker({
                format: 'yyyy-mm-dd'
            }).on('changeDate', function (ev) {
                self.rechargeParamInfo.endDay = $('#rechargeEndTime').val();
            });
            $('#depositStarTime').fdatepicker({
                format: 'yyyy-mm-dd'
            }).on('changeDate', function (ev) {
                self.depositParamInfo.beginDay = $('#depositStarTime').val();
            });
            $('#depositEndTime').fdatepicker({
                format: 'yyyy-mm-dd'
            }).on('changeDate', function (ev) {
                self.depositParamInfo.endDay = $('#depositEndTime').val();
            });
        }
    });
}())