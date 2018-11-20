/*
 *  消息功能，适合buyer, oss端
 * */

var msgPageInfo = {
    currentPage: 0,
    pageNum: 0
};

function getMsgPostForm() {
    return {page: msgPageInfo.currentPage + 1};
}

// 使用ajax 加载列表数据
var MsgCustomConfig = {
    apis: Apis.message_list,   // 访问后台的Api, 需要为 Api 格式(依赖 api-prototype.js)
    view: "#MESSAGE_BOX_ALL,#MESSAGE_BOX_UNREAD,#MESSAGE_BOX_READ", // ROW视图模板
    beansKey: "listAll,listUnRead,listRead", // 返回值根据这个key获取Bean中的数据model，该数据是一个列表或数组
    attrKey: "data",
    attachHandle: onDataLoadFinish,  // 附加回调，常用与数据格式化. 参数 params1: 	DataLoad, params2:  model[array]
    failedHandle: onDataLoadFailed,  // 错误回调，回调参数 params1: 	DataLoad, params2:  msg
    afterOneDataSetHandle: afterDateSet
};

// 若已读，隐藏’已读‘按钮; 若删除，隐藏’删除‘按钮
function afterDateSet(dataLoad, view, model, key) {
    switch (key) {
        case 'readFlag': {
            if (model[key])
                view.hide();
            break;
        }
        case 'delFlag': {
            if (model[key])
                view.hide();
            break;
        }
        // 格式化数据
        case 'content': {
            var content = view.text();
            view.html(content);
            break;
        }
    }
}


function onDataLoadFinish(dataLoad, respBody) {
    msgPageInfo = respBody['pageSource'];
    if (msgPageInfo.pageNum == 0) {
    }

    $("#msg-nav-tabs li:eq(0) a span").text(respBody['statistic']['listAll']);
    $("#msg-nav-tabs li:eq(1) a span").text(respBody['statistic']['listUnRead']);
    $("#msg-nav-tabs li:eq(2) a span").text(respBody['statistic']['listRead']);
}

function onDataLoadFailed(msg) {
    $.alert(msg);
}

var msgLoad = new DataLoad(MsgCustomConfig);


function loadMsgMoreData() {
    if ((msgPageInfo.currentPage == msgPageInfo.pageNum) && msgPageInfo.currentPage !== 0) {
        // alert("已没有更多.");
        return;
    }
    msgLoad.getDatas(getMsgPostForm())
}

// 页面初始化
$(function () {
    // 触发消息列表
    $(".btn-sidebar-toggle[data-action='toggle']").on("click", function () {
        msgLoad.getDatas(getMsgPostForm(), LOAD_WAY.APPEND_AND_CLEAN);
        return false;
    });


});


function markMessageRead(_self, msgId) {
    Apis.message_read.call({
        data: JSON.stringify({id: msgId}),
        success: function (result) {
            msgLoad.getDatas({page: 1}, LOAD_WAY.APPEND_AND_CLEAN);
        },
        error: function (resp) {
            console.log(resp.head.message);
        }
    });
}


function markMessageDel(_self, msgId) {
    Apis.message_del.call({
        data: JSON.stringify({id: msgId}),
        success: function (result) {
            msgLoad.getDatas({page: 1}, LOAD_WAY.APPEND_AND_CLEAN);
        },
        error: function (resp) {
            console.log(resp.head.message);
        }
    });
}


function changeMsgTag(tagId) {
    $("#message-all").hide();
    $("#message-unread").hide();
    $("#message-read").hide();
    $("#message-all").parent(".slimScrollDiv").hide();
    $("#message-unread").parent(".slimScrollDiv").hide();
    $("#message-read").parent(".slimScrollDiv").hide();


    $("#" + tagId).show();
    $("#" + tagId).parent(".slimScrollDiv").show();
}



