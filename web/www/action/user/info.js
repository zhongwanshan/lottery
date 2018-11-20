(function () {
    var pageVue = new Vue({
        el: "#js-pageInfo",
        data: {
            isAction: false,
            tabType: 0, // 0：昵称，1：头像
            userInfo: USERINFO,
            imageData: USERINFO["headImageUrl"] || "",
            paramInfo: {
                nickName: USERINFO["nickName"],
                action: CONFIG.ACTION.modifyUserNickName
            },
            nickName: "",
            fileImg: "",
            resultFile: null,
            cropper: null
        },
        methods: {
            // tab切换
            switchTab: function (type) {
                var self = this;
                self.tabType = type;
            },
            // 退出登录
            userLogout: function () {
                utility.userLogout(function () {
                    window.location.replace(CONFIG.HOST + "/www/index.html");
                });
            },
            // 修改用户信息
            doNikNameAction: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                if (utility.checkLen(self.paramInfo.nickName, 0)) {
                    alert("昵称不能为空");
                    return;
                }

                if (self.paramInfo.nickName.length > 10) {
                    alert("昵称长度过长");
                    return;
                }

                self.paramInfo.nickName = encodeURI(self.nickName);

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.modifyUserNickName, self.paramInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonService,
                    dataObj: self.paramInfo,
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.userInfo.nickName = self.nickName;
                            utility.setLocalStorage("userInfo", self.userInfo);
                        } else {
                            alert(data.message);
                        }
                    },
                });
            },
            // 预览图片
            previewImg: function () {
                var self = this;
                var resultFile = document.getElementById("fileEle").files[0];

                self.fileImg = "";
                self.cropper = null;

                if (resultFile) {
                    var reader = new FileReader();
                    reader.readAsDataURL(resultFile);
                    reader.onload = function (e) {
                        self.fileImg = this.result;

                        setTimeout(function () {
                            var image = document.getElementById("js-fileImg");
                            self.cropper = new Cropper(image, {
                                viewMode: 3,
                                data: {
                                    width: 120,
                                    height: 120,
                                },
                                crop: function (event) {
                                    // {
                                    //     width: 160,
                                    //     height: 90,
                                    //     minWidth: 256,
                                    //     minHeight: 256,
                                    //     maxWidth: 4096,
                                    //     maxHeight: 4096,
                                    // }
                                    self.canvas = self.cropper.getCroppedCanvas();
                                    $("body").find("#js-canvas").html("");
                                    $("body").find("#js-canvas")[0].appendChild(self.canvas);
                                },
                            });
                        }, 500);
                    };
                }
            },
            // 修改头像
            modifyUserPhoto: function () {
                var self = this;
                var uploadImg = "";

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                if (self.fileImg.length == 0) {
                    alert("请选择一张图片");
                    return;
                }

                uploadImg = self.canvas.toDataURL('image/jpg').split("base64,")[1];

                utility.interactWithServer({
                    headerInfo: {
                        appType: "2",
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.modifyUserPhoto, {
                            "action": CONFIG.ACTION.modifyUserPhoto
                        }),
                    },
                    contentType: 'plain/text',
                    url: CONFIG.HOST + CONFIG.SERVICE.commonService + "?action=" + CONFIG.ACTION.modifyUserPhoto + "&userToken=" + USERINFO["userToken"] + "&userId=" + USERINFO["userId"] + "&from=1",
                    dataObj: JSON.stringify({
                        "imageData": uploadImg
                    }),
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        alert(data.message);
                        if (data.code == 200) {
                            self.userInfo.headImageUrl = data.data.headImageUrl;
                            utility.setLocalStorage("userInfo", self.userInfo);
                            self.fileImg = "";
                            self.cropper.destroy();
                            $("body").find("#js-canvas").html("");
                        }
                    },
                });
            }
        },
        created: function () {
            var self = this;
        }
    });
}())