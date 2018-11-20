(function () {
    var pageVue = new Vue({
        el: "#js-recharge",
        data: {
            userInfo: USERINFO,
            isAction: false,
            canModify: 1,
            rechargeInfo: {
                rechargeMoney: "",
                rechargePolicyId: "",
                remark: "",
                action: CONFIG.ACTION.userRrecharge
            },
            paramInfo: {
                rechargeMoney: "",
                rechargePolicyId: "",
                remark: "",
                goToUrl: "/www/user/view/depRech.html",
                action: CONFIG.ACTION.userRrecharge
            },
            remark: "",
            payPwd: "",
            rechargePolicyList: []
        },
        watch: {
            "rechargeInfo.rechargePolicyId": function (value) {
                var self = this;

                for (var i = 0, len = self.rechargePolicyList.length; i < len; i++) {
                    if (self.rechargePolicyList[i]["rechargePolicyId"] == value) {
                        self.canModify = self.rechargePolicyList[i]["canModify"];
                        self.paramInfo.rechargePolicyId = self.rechargePolicyList[i]["rechargePolicyId"];
                        self.rechargeInfo.rechargePolicyId = self.rechargePolicyList[i]["rechargePolicyId"];
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
            // 充值
            rechargeAction: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                if (utility.checkLen(self.rechargeInfo.rechargeMoney, 0)) {
                    app.showPreloader("请输入充值金额")
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.userRrecharge, self.rechargeInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: self.rechargeInfo,
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {

                        } else {
                            alert(data.message);
                        }
                    },
                });
            },

            // 获取充值优惠
            getRechargePolicy: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getRechargePolicy, {
                            action: CONFIG.ACTION.getRechargePolicy
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                    dataObj: {
                        action: CONFIG.ACTION.getRechargePolicy
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.rechargePolicyList = data.data;
                            for (var i = 0, len = self.rechargePolicyList.length; i < len; i++) {
                                if (self.rechargePolicyList[i]["canModify"] == 1) {
                                    self.paramInfo.rechargePolicyId = self.rechargePolicyList[i]["rechargePolicyId"];
                                    self.rechargeInfo.rechargePolicyId = self.rechargePolicyList[i]["rechargePolicyId"];
                                    break;
                                }
                            }
                        } else {
                            alert(data.message);
                        }
                    },
                });
            },
            // 提交充值信息
            doRechargeAction: function () {
                var self = this;

                // 如果可以输入金额
                if (self.canModify == 1) {
                    // 如果充值金额为0
                    if (self.rechargeInfo.rechargeMoney == 0) {
                        alert("充值金额不能为0");
                        return;
                    }
                }

                // if (utility.checkLen(self.payPwd, 0)) {
                //     app.showPreloader("请输入支付密码")
                //     setTimeout(function () {
                //         app.hidePreloader();
                //     }, 1000);
                //     return;
                // }
                self.rechargeInfo.remark = encodeURIComponent(self.remark);
                self.paramInfo.rechargeMoney = self.rechargeInfo.rechargeMoney;
                self.paramInfo.rechargePolicyId = self.rechargeInfo.rechargePolicyId;
                self.paramInfo.remark = self.rechargeInfo.remark;

                self.rechargeInfo.backUrl = CONFIG.HOST + "/www/view/order/result.html" + "?paramInfo=" + encodeURI(JSON.stringify(self.paramInfo));
                window.location.href = CONFIG.HOST + utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.userRrecharge, self.rechargeInfo, true) + "&userId=" + USERINFO["userId"] + "&userToken=" + USERINFO["userToken"] + "&appType=2";
            }

        },
        created: function () {
            var self = this;
            var query = utility.getQueryParams();

            // 获取优惠
            self.getRechargePolicy();

            if (!!query["code"] && query["code"] != 200) {
                alert(query["message"]);
            }
        }
    });
}())