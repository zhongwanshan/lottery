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
    dynamicNavbar: true,
    animatePages: false,
    uniqueHistory: true
});
mainView.router.loadPage('/app/view/index.html');

// 当页面初始化后
$(document).on('pageInit', function (event) {
    var actionJs;
    var page = event.detail.page;
    var pageName = page.name;

    // 给底部导航设置当前样式
    setTimeout(function () {
        var pageName = $("body").find(".page-on-center").attr("data-page");
        $('.tabWrap .link').removeClass('active');
        $('#' + pageName).addClass('active');
    }, 100);

    // 将获得的用户信息保存在全局中
    PAGE = page;
    USERINFO = utility.getLocalStorage("userInfo") || null;
    actionJs = CONFIG.HOST + "/app/action/" + pageName.replace(/-/g, "/") + ".min.js";

    // 防止重复加载同样的脚本
    $("script").each(function (index, item) {
        var self = $(this);
        var src = self.attr("src");

        if (!!src && src.indexOf("action") != -1) {
            self.remove();
        }
    });

    // 获取用户信息
    if (!!USERINFO) {
        utility.getUserInfo({
            appType: "1",
            callback: function (data) {
                var userToken = USERINFO["userToken"];
                USERINFO = data;
                USERINFO["userToken"] = userToken;

                utility.getUserSiteMessageList({
                    messageInfo: {
                        curPage: 1,
                        pageSize: 5,
                        type: 0, // 0：全部  1：优惠 2：中奖 3：活动 4：其它
                        readStatus: 0, // 0：未读； 1：已读 2：全部 
                        action: CONFIG.ACTION.getUserSiteMessageList
                    },
                    callback: function (data) {
                        if (data.data.length > 0) {
                            $("body").find(".js-message").find(".babo").show();
                        } else {
                            $("body").find(".js-message").find(".babo").hide();
                        }
                    }
                });
            }
        });
    } else {
        // 如果还没有登录，则隐藏消息模块
        $("body").find(".js-message").hide();
    }

    $LAB.script(actionJs + "?v=" + Date.parse(new Date())).wait(function () {
        // 重新设置轮播图
        if (!!$('body').find('.swiper-container')) {
            var mySwiper = app.swiper('body .swiper-container', {
                speed: 400,
                spaceBetween: 100,
                pagination: '.swiper-pagination'
            });
        }
        utility.setiScroll();
    });

});
