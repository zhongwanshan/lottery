(function () {
    var pageVue = new Vue({
        el: "#js-pageLogin",
        data: {
            isAction: false,
            pwd: !!utility.getLocalStorage("remember") ? utility.getLocalStorage("remember")["pwd"] : "",
            paramInfo: {
                userAccount: !!utility.getLocalStorage("remember") ? utility.getLocalStorage("remember")["phone"] : "",
                userType: "1",
                action: CONFIG.ACTION.userLogin
            },
            isChecked: 1,
        },
        methods: {
            // 提交登录信息
            doAction: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                if (utility.checkLen(self.paramInfo.userAccount, 0)) {
                    app.showPreloader("手机号不能为空");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                if (!utility.checkPhone(self.paramInfo.userAccount)) {
                    app.showPreloader("手机号格式错误");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                if (utility.checkLen(self.pwd, 0)) {
                    app.showPreloader("密码不能为空");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                self.paramInfo.pwd = md5(self.pwd).toUpperCase();

                utility.setLocalStorage("remember", {
                    phone: self.paramInfo.userAccount,
                    pwd: self.pwd,
                })

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
                        if (data.code == 200) {
                            // 如果登录成功，则把用户信息保存在本地
                            utility.setLocalStorage("userInfo", data.data);
                            window.location.href = CONFIG.HOST+"/shop/view/user/order.html";
                        } else {
                            alert(data.message);
                        }
                    }
                });
            }
        },
        created: function () {
            var self = this;
        }
    });
}())