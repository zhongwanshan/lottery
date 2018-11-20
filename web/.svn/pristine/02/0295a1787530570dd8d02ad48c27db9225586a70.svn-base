// Initialize your app
var app = new Framework7({
    pushState: true,
    uniqueHistory: true,
    pushStateSeparator: '#page/',
    modalTitle: "消息提示",
    modalButtonOk: "确认",
    modalButtonCancel: "关闭",
    modalPreloaderTitle: "加载中...",
    // Hide and show indicator during ajax requests
    onAjaxStart: function (xhr) {
        app.showIndicator();
    },
    onAjaxComplete: function (xhr) {
        app.hideIndicator();
    }
});

// Export selectors engine
var $ = Dom7;

// Add view
var mainView = app.addView('.view-main', {
    // Because we use fixed-through navbar we can enable dynamic navbar
    dynamicNavbar: true,
    animatePages: false
});
var queryInfo = utility.getQueryParams();
var USERINFO = utility.getLocalStorage("userInfo");
var pageVue = new Vue({
    el: "#js-cashier",
    data: {
        queryInfo: queryInfo,
        location: LOCATION,
        payChannelId: "",
        amount: "",
        walletLeftCash: 0,
        payChannelList: [],
        isAction: false,
        userAccount: "",
        payPwd: "",
        paramInfo: {
            action: CONFIG.ACTION.resetUserPayPwd,
            smsCode: "",
            payPwd: ""
        },
        imgSrc: "",
        imgCode: "",
        reqId: "",
        time: null,
        smsTxt: "获取验证码"
    },
    watch: {
        "payChannelId": function (value) {
            var self = this;

            for (var i = 0, len = self.payChannelList.length; i < len; i++) {
                if (self.payChannelList[i]["payChannelId"] == "wallet") {
                    self.walletLeftCash = self.payChannelList[i]["walletLeftCash"];
                    break;
                }
            }
        }
    },
    methods: {
        setPayChannelId: function (payChannelId) {
            var self = this;
            self.payChannelId = payChannelId;
        },
        // 获取支付通道
        getPayChannel: function () {
            var self = this;
            utility.interactWithServer({
                headerInfo: {
                    appType: queryInfo["appType"],
                    userId: !!USERINFO ? USERINFO["userId"] : "",
                    userToken: !!USERINFO ? USERINFO["userToken"] : "",
                    actionUrl: utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getPayChannel, {
                        action: CONFIG.ACTION.getPayChannel,
                        orderCode: queryInfo["orderCode"],
                        payFlag: queryInfo["payFlag"]
                    }),
                },
                url: CONFIG.HOST + CONFIG.SERVICE.walletService,
                dataObj: {
                    action: CONFIG.ACTION.getPayChannel,
                    orderCode: queryInfo["orderCode"],
                    payFlag: queryInfo["payFlag"]
                },
                beforeSendCallback: function () {
                    app.showIndicator();
                },
                completeCallback: function (XMLHttpRequest, textStatus) {
                    app.hideIndicator();
                },
                successCallback: function (data) {
                    if (data.code == 200) {
                        self.payChannelList = data.data;
                        self.amount = self.payChannelList[0]["amount"];
                    } else {
                        app.showPreloader(data.message);
                        setTimeout(function () {
                            app.hidePreloader();
                        }, 1000);
                    }
                },
            });
        },
        // 支付
        payAction: function () {
            var self = this;

            if (utility.checkLen(self.payChannelId, 0)) {
                app.showPreloader("请选择一种支付方式");
                setTimeout(function () {
                    app.hidePreloader();
                }, 1000);
                return;
            }

            // 如果是钱包支付，则需要填写支付密码
            if (self.payChannelId == "wallet") {
                if (self.walletLeftCash < queryInfo["amount"]) {
                    app.showPreloader("钱包余额不足!");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                if (self.payPwd.length == 0) {
                    app.showPreloader("请输入支付密码");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }
            }

            window.location.href = CONFIG.HOST + utility.formatActionUrl(CONFIG.SERVICE.walletService, CONFIG.ACTION.getPay, {
                action: CONFIG.ACTION.getPay,
                payChannelId: self.payChannelId,
                orderCode: queryInfo["orderCode"],
                payPwd: md5(self.payPwd).toUpperCase(),
            }, true) + "&userId=" + USERINFO["userId"] + "&userToken=" + USERINFO["userToken"] + "&appType=" + queryInfo["appType"] + "&orderCode=" + USERINFO["orderCode"];

        },
        // 获取图片验证码
        getImgCode: function () {
            var self = this;
            utility.getImgCode(function (data) {
                self.reqId = data.data.reqId;
                self.imgSrc = data.data.imgCodeUrl;
            });
        },

        // 获取手机验证码
        getSmsCode: function () {
            var self = this;

            // 防止重复点击
            if (self.isAction == true) {
                return;
            }

            if (utility.checkLen(self.userAccount, 0)) {
                app.showPreloader("手机号不能为空")
                setTimeout(function () {
                    app.hidePreloader();
                }, 1000);
                return;
            }

            if (!utility.checkPhone(self.userAccount)) {
                app.showPreloader("手机号格式错误")
                setTimeout(function () {
                    app.hidePreloader();
                }, 1000);
                return;
            }

            // 先校验图片验证码,然后再获取短信验证码
            utility.checkImgCode(self.reqId, self.imgCode, function () {

                utility.getSmsCode(self.reqId, self.imgCode, self.userAccount, "4", function () {
                    var second = 60;
                    self.time = setInterval(function () {
                        second--;
                        self.smsTxt = "还有" + second + "秒";
                        if (second == 0) {
                            self.smsTxt = "重新发送";
                            clearInterval(self.time);
                        }
                    }, 1000);
                }, function () {
                    self.isAction = false;
                });
            });
        },
        // 提交信息
        doAction: function () {
            var self = this;

            // 防止重复点击
            if (self.isAction == true) {
                return;
            }

            if (utility.checkLen(self.userAccount, 0)) {
                app.showPreloader("手机号不能为空")
                setTimeout(function () {
                    app.hidePreloader();
                }, 1000);
                return;
            }

            if (!utility.checkPhone(self.userAccount)) {
                app.showPreloader("手机号格式错误")
                setTimeout(function () {
                    app.hidePreloader();
                }, 1000);
                return;
            }

            if (utility.checkLen(self.paramInfo.smsCode, 0)) {
                app.showPreloader("验证码不能为空")
                setTimeout(function () {
                    app.hidePreloader();
                }, 1000);
                return;
            }

            if (self.payPwd.length < 6 || self.payPwd.length > 16) {
                app.showPreloader("密码为6到16位");
                setTimeout(function () {
                    app.hidePreloader();
                }, 1000);
                return;
            }

            self.paramInfo.payPwd = md5(self.payPwd).toUpperCase();

            utility.interactWithServer({
                headerInfo: {
                    appType: queryInfo["appType"],
                    userId: !!USERINFO ? USERINFO["userId"] : "",
                    userToken: !!USERINFO ? USERINFO["userToken"] : "",
                    actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.resetUserPayPwd, self.paramInfo),
                },
                url: CONFIG.HOST + CONFIG.SERVICE.commonService,
                dataObj: self.paramInfo,
                beforeSendCallback: function () {
                    app.showIndicator()
                },
                completeCallback: function (XMLHttpRequest, textStatus) {
                    app.hideIndicator();
                    self.isAction = false;
                },
                successCallback: function (data) {
                    if (data.code == 200) {
                        // 如果登录成功，则把用户信息保存在本地
                        app.closeModal(".popup-about");
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

        self.getPayChannel();

        // 获取图片验证码
        self.getImgCode();
    }
});

