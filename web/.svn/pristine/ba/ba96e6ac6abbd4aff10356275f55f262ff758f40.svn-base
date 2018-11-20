var LOCATION = window.location.protocol + "//" + window.location.host;
var pathNameList = window.location.pathname.split("/");
var URL = LOCATION + "/" + (pathNameList.slice(1, pathNameList.length - 1)).join("/") + "/";

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

            utility.getShopOrderStat(function(data) {
                USERINFO["totalUntreatedOrders"] = data.data.totalUntreatedOrders; // 未处理订单数
                USERINFO["totalReceivedOrders"] = data.data.totalReceivedOrders; // 接单数
                USERINFO["totalPrintedOrders"] = data.data.totalPrintedOrders; // 打单数
                USERINFO["totalOrders"] = data.data.totalOrders; // 总订单数
                USERINFO["totalRejectedOrders"] = data.data.totalRejectedOrders; // 回退拒收订单数
            });

            utility.getUserSiteMessageList({
                appType: "2",
                messageInfo: {
                    curPage: 1,
                    pageSize: 5,
                    type: 0, // 0：全部  1：优惠 2：中奖 3：活动 4：其它
                    readStatus: 0, // 0：未读； 1：已读 2：全部 
                    action: CONFIG.ACTION.getUserSiteMessageList
                },
                callback: function (data) {
                    if (data.data.length > 0) {
                        $("body").find(".babo").html(data.data.length).show();
                    } else {
                        $("body").find(".babo").hide();
                    }
                }
            });
        }
    });
} else {
    if((window.location.href.indexOf('login') != -1 && window.location.href.indexOf('register') != -1)) {
        window.location.replace(URL+"login.html");
    }
}