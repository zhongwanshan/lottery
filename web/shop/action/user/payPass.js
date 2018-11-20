(function () {
    var pageVue = new Vue({
        el: "#js-pagePayPass",
        data: {
            userInfo: USERINFO,
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
        methods: {
            // 退出登录
            userLogout: function() {
                utility.userLogout(function() {
                    window.location.replace(CONFIG.HOST+"/shop/view/user/login.html");
                });
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
                    alert("手机号不能为空");
                    return;
                }

                if (!utility.checkPhone(self.userAccount)) {
                    alert("手机号格式错误");
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
                    alert("手机号不能为空");
                    return;
                }

                if (!utility.checkPhone(self.userAccount)) {
                    alert("手机号格式错误");
                    return;
                }

                if (utility.checkLen(self.paramInfo.smsCode, 0)) {
                    alert("验证码不能为空");
                    return;
                }

                if (self.payPwd.length < 6 || self.payPwd.length > 16) {
                    alert("密码为6到16位");
                    return;
                }

                self.paramInfo.payPwd = md5(self.payPwd).toUpperCase();

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.resetUserPayPwd, self.paramInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonService,
                    dataObj: self.paramInfo,
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            // 如果登录成功，则把用户信息保存在本地
                            window.location.href = window.history.back();
                        } else {
                            alert(data.message);
                        }
                    },
                });
            }
        },
        created: function () {
            var self = this;

            // 获取图片验证码
            self.getImgCode();

            setTimeout(function() {
                self.userInfo = USERINFO;
            }, 1000);
        }
    });
}())