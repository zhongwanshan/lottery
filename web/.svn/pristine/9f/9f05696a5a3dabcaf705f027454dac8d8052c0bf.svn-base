(function () {
     window.vuePage = new Vue({
        el: "#js-pageInfo",
        data: {
            userInfo: USERINFO,
            isAction: false,
            imageData: "",
            paramInfo: {
                nickName: "",
                action: CONFIG.ACTION.modifyUserNickName
            },
            nickName: "",
            fileImg: "",
            resultFile: null,
            cropper: null,
            canvas: null,
            isApp: (typeof jsBridge != "undefined"),
            base64ImgStr: ""
        },
        methods: {
            // 提交登录信息
            doNikNameAction: function () {
                var self = this;

                // 防止重复点击
                if (self.isAction == true) {
                    return;
                }

                if (utility.checkLen(self.nickName, 0)) {
                    app.showPreloader("昵称不能为空");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                if (self.nickName.length > 10) {
                    app.showPreloader("昵称长度过长");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                self.paramInfo.nickName = encodeURIComponent(self.nickName);

                utility.interactWithServer({
                    headerInfo: {
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.modifyUserNickName, self.paramInfo),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonService,
                    dataObj: self.paramInfo,
                    beforeSendCallback: function () {
                        app.showIndicator();
                    },
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        app.hideIndicator();
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.userInfo.nickName = self.nickName;
                            utility.setLocalStorage("userInfo", self.userInfo);
                            app.closeModal();
                        } else {
                            app.showPreloader(data.message);
                            setTimeout(function () {
                                app.hidePreloader();
                            }, 1000);
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
                                    //     width: 120,
                                    //     height: 120,
                                    //     minWidth: 120,
                                    //     minHeight: 120,
                                    //     maxWidth: 320,
                                    //     maxHeight: 320,
                                    //     imageSmoothingQuality: 'high'
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
            // 上传头像信息
            uploadHeadInfo: function(uploadImg) {
                var self = this;

                utility.interactWithServer({
                    headerInfo: {
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonService, CONFIG.ACTION.modifyUserPhoto, {
                            "action": CONFIG.ACTION.modifyUserPhoto,
                        }),
                    },
                    contentType: 'plain/text',
                    url: CONFIG.HOST + CONFIG.SERVICE.commonService + "?action=" + CONFIG.ACTION.modifyUserPhoto + "&userToken=" + USERINFO["userToken"] + "&userId=" + USERINFO["userId"] + "&from=1",
                    dataObj: JSON.stringify({
                        "imageData": uploadImg
                    }),
                    beforeSendCallback: function () {
                        app.showIndicator();
                    },
                    completeCallback: function (XMLHttpRequest, textStatus) {
                        app.hideIndicator();
                        self.isAction = false;
                    },
                    successCallback: function (data) {
                        if (data.code == 200) {
                            self.userInfo.headImageUrl = data.data.headImageUrl;
                            utility.setLocalStorage("userInfo", self.userInfo);
                            setTimeout(function() {
                                app.closeModal(".popup-img");
                            }, 500);
                        }
                        app.showPreloader(data.message);
                        setTimeout(function () {
                            app.hidePreloader();
                        }, 1000);
                    },
                });
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
                    app.showPreloader("请选择一张图片");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                    return;
                }

                uploadImg = self.canvas.toDataURL('image/jpg').split("base64,")[1];

                self.uploadHeadInfo(uploadImg);
            },
            // 修改头像
            "modifiedImg": function(type) {
                // "source:来源1:相机 2:相册"
                // "isSquare:是否裁剪为正方形 1:是 0:否"
                if(typeof jsBridge != "undefined") {
                    jsBridge.cpApi(8, JSON.stringify({
                        "source": type,
                        "isSquare": 1
                    }),(function (res) {
                        if (app.device["ios"] == true) {
                            window.vuePage.base64ImgStr = JSON.parse(res)["imgBase64"];
                        } else {
                            window.vuePage.base64ImgStr = res.substring(res.indexOf(":") + 2, res.lastIndexOf(",") - 1);
                        }
                        window.vuePage.fileImg = "data:image/jpeg;base64," + window.vuePage.base64ImgStr;
                    }).toString());
                }
            },
            "saveImgByApp": function() {
                var self = this;

                if(!!window.vuePage.base64ImgStr) {
                    self.uploadHeadInfo(window.vuePage.base64ImgStr);
                } else {
                    app.showPreloader("请选择一张图片");
                    setTimeout(function () {
                        app.hidePreloader();
                    }, 1000);
                }
            }
        },
        created: function () {
            var self = this;

            console.log(self.isApp);
        }
    });
}())