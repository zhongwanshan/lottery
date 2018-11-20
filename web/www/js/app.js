$(function() {
    $(".selectMenu").on("mouseover", function () {
        $(".c-menu").show();
    });
    
    $(".selectMenu").on("mouseout", function () {
        $(".c-menu").hide();
    });
});

var LOCATION = window.location.protocol + "//" + window.location.host;
var pathNameList = window.location.pathname.split("/");
var URL = LOCATION + "/" + (pathNameList.slice(1,pathNameList.length-1)).join("/") + "/";

// 将获得的用户信息保存在全局中
var USERINFO = utility.getLocalStorage("userInfo") || null;

// 获取用户信息
if (!!USERINFO) {
    utility.getUserInfo({
        appType: 2,
        callback: function (data) {
            var userToken = USERINFO["userToken"];
            USERINFO = data;
            USERINFO["userToken"] = userToken;   
        }
    });
}