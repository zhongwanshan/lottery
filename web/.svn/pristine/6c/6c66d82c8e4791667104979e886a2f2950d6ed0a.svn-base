(function () {
    var pageVue = new Vue({
        el: "#js-pageDeposit",
        data: {
            userInfo: USERINFO,
            isAction: false,
            showAddList: false,
            allCarList: [],
            myCarList: [],
            bindCarInfo: {
                bankId: "",
                bankName: "",
                cardNo: "",
                bankAccountName: "",
                subBankName: "",
                action: CONFIG.ACTION.bindBankCard,
                payPwd: "",
            },
            payPwd: "",
            amount: "",
            bankAccountName: "",
            subBankName: "",
            depositInfo: {
                amount: "",
                action: CONFIG.ACTION.userWithdrawCash,
                remark: "",
                payPwd: "",
                bindBankCardId: ""
            },
            depositPwd: "",
            remark: "",
            defaultBankId: "" // 默认银行卡id
        },
        watch: {
            // 设置银行卡名称
            "bindCarInfo.bankId": function (value) {
                var self = this;

                for (var i = 0, len = self.allCarList.length; i < len; i++) {
                    if (self.allCarList[i]["bankId"] == value) {
                        self.bindCarInfo.bankName = encodeURIComponent(self.allCarList[i]["bankName"]);
                        break;
                    }
                }
            }
        },
        methods: {
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
            // 获取银行卡列表
            getAllBankList: function () {
                var self = this;

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: "",
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.getBankList,
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.allCarList = data.data;
                        }
                    },
                });
            },
            // 绑定银行卡
            bindBankCard: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                if (utility.checkLen(self.bindCarInfo.bankId, 0)) {
                    alert("请选择一张银行卡");
                    return;
                }
                if (utility.checkLen(self.bindCarInfo.cardNo, 0)) {
                    alert("请输入银行卡号");
                    return;
                }
                if (utility.checkLen(self.bindCarInfo.bankAccountName, 0)) {
                    alert("请输入开户人");
                    return;
                }
                if (utility.checkLen(self.bindCarInfo.subBankName, 0)) {
                    alert("请输入开户行");
                    return;
                }
                if (utility.checkLen(self.payPwd, 0)) {
                    alert("请输入支付密码");
                    return;
                }

                self.bindCarInfo.payPwd = md5(self.payPwd).toUpperCase();
                self.bindCarInfo.bankAccountName = encodeURIComponent(self.bankAccountName);
                self.bindCarInfo.subBankName = encodeURIComponent(self.subBankName);

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.bindBankCard, self.bindCarInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: self.bindCarInfo,
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            // 当成功绑定银行卡后，重新获取用户已经绑定的银行卡列表
                            self.getUserBindCardList();

                            self.showAddList = false;

                        } else {
                            alert(data.message);
                        }
                    },
                });
            },

            isShowAddList: function (bool) {
                var self = this;
                self.showAddList = bool;
            },

            // 获取用户绑定的银行卡列表
            getUserBindCardList: function () {
                var self = this;

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getUserBankCards, {
                            action: CONFIG.ACTION.getUserBankCards
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: {
                        action: CONFIG.ACTION.getUserBankCards
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.myCarList = data.data || [];

                            for (var i = 0, len = self.myCarList.length; i < len; i++) {
                                if (self.myCarList[i]["isDefault"] == 1) {
                                    self.depositInfo.bindBankCardId = self.myCarList[i]["bindBankCardId"];
                                    break;
                                }
                            }
                        }
                    },
                });
            },

            // 设置默认银行卡
            setDefaultBankCard: function (bindBankCardId) {
                var self = this;

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.setDefaultBankCard, {
                            action: CONFIG.ACTION.setDefaultBankCard,
                            bindBankCardId: bindBankCardId
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: {
                        action: CONFIG.ACTION.setDefaultBankCard,
                        bindBankCardId: bindBankCardId
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            // 获取用户绑定的银行卡
                            self.getUserBindCardList();
                        }
                    },
                });
            },

            // 用户提现
            depositAction: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                if (utility.checkLen(self.depositInfo.bindBankCardId, 0)) {
                    alert("请选择一张银行卡");
                    return;
                }
                if (utility.checkLen(self.amount, 0)) {
                    alert("请输入提现金额");
                    return;
                }
                if (utility.checkLen(self.depositPwd, 0)) {
                    alert("请输入支付密码");
                    return;
                }

                self.depositInfo.amount = self.amount;
                self.depositInfo.payPwd = md5(self.depositPwd).toUpperCase();
                self.depositInfo.remark = encodeURIComponent(self.remark);

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.userWithdrawCash, self.depositInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: self.depositInfo,
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            window.location.href = CONFIG.HOST+"/www/view/user/depRech.html";
                        } else {
                            alert(data.message);
                        }
                    },
                });
            }

        },
        created: function () {
            var self = this;

            // 获取用户绑定的银行卡
            self.getUserBindCardList();

            // 获取所有银行卡
            self.getAllBankList();
        }
    });
}())