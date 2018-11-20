(function () {
    var pageVue = new Vue({
        el: "#js-pageRegister",
        data: {
            isAction: false,
            pwd: "",
            paramInfo: {
                phone: "",
                userType: "0",
                action: CONFIG.ACTION.registerUserByPhone,
                smsCode: "",
                pwd: "",
                nickName: ""
            },
            nickName: "",
            imgSrc: "",
            imgCode: "",
            reqId: "",
            time: null,
            smsTxt: "获取验证码"
        },
        methods: {
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

                if (utility.checkLen(self.paramInfo.phone, 0)) {
                    app.showPreloader("手机号不能为空")
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                if (!utility.checkPhone(self.paramInfo.phone)) {
                    app.showPreloader("手机号格式错误")
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                // 先校验图片验证码,然后再获取短信验证码
                utility.checkImgCode(self.reqId, self.imgCode, function () {

                    utility.getSmsCode(self.reqId, self.imgCode, self.paramInfo.phone, "1", function () {
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
            // 登录
            login: function () {
                var self = this;

                utility.setLocalStorage("remember", {
                    phone: self.paramInfo.userAccount,
                    pwd: self.pwd,
                })

                utility.interactWithServer({
                    headerInfo: {
                        appType: "1",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.registerUserByPhone, {
                            userType: "0",
                            pwd: self.paramInfo.pwd,
                            action: CONFIG.ACTION.userLogin,
                            userAccount: self.paramInfo.phone
                        }),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonService,
                    dataObj: {
                        userType: "0",
                        pwd: self.paramInfo.pwd,
                        action: CONFIG.ACTION.userLogin,
                        userAccount: self.paramInfo.phone
                    },
                    beforeSendCallback: function () {
                        app.showIndicator();
                    },
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        app.hideIndicator();
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            // 如果登录成功，则把用户信息保存在本地
                            utility.setLocalStorage("userInfo", data.data);

                            setTimeout(function() {
                                window.location.href = CONFIG.HOST + "/app/app.html";
                            }, 500);
                        }
                    }
                });
            },
            // 提交注册信息
            doAction: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                if (utility.checkLen(self.paramInfo.phone, 0)) {
                    app.showPreloader("手机号不能为空")
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                if (!utility.checkPhone(self.paramInfo.phone)) {
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

                if (self.pwd.length < 6 || self.pwd.length > 16) {
                    app.showPreloader("密码为6到16位");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                self.paramInfo.pwd = md5(self.pwd).toUpperCase();
                self.paramInfo.nickName = encodeURI(self.nickName);

                utility.interactWithServer({
                    headerInfo: {
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.registerUserByPhone, self.paramInfo),
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
                        if(data.code == 200) {
                            self.login();
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

            // 获取图片验证码
            self.getImgCode();
        }
    });
}())