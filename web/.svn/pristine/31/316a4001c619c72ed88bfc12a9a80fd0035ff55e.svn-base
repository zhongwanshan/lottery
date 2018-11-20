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
                    alert("手机号不能为空");
                    return;
                }

                if (!utility.checkPhone(self.paramInfo.phone)) {
                    alert("手机号格式错误");
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
            // 提交注册信息
            doAction: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                if (utility.checkLen(self.paramInfo.phone, 0)) {
                    alert("手机号不能为空");
                    return;
                }

                if (!utility.checkPhone(self.paramInfo.phone)) {
                    alert("手机号格式错误");
                    return;
                }

                if (utility.checkLen(self.paramInfo.smsCode, 0)) {
                    alert("验证码不能为空");
                    return;
                }

                if (self.pwd.length < 6 || self.pwd.length > 16) {
                    alert("密码为6到16位");
                    return;
                }

                self.paramInfo.pwd = md5(self.pwd).toUpperCase();
                self.paramInfo.nickName = encodeURI(self.nickName);

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.registerUserByPhone, self.paramInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonService,
                    dataObj: self.paramInfo,
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        window.location.href = window.history.back();
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