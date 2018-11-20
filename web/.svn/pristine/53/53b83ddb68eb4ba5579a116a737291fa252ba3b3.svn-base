/**
 * @description: 项目配置文件
 */
var LOCATION = window.location.protocol + "//" + window.location.host;
var pathNameList = window.location.pathname.split("/");
var URL = LOCATION + "/" + (pathNameList.slice(1,pathNameList.length-1)).join("/") + "/";
var CONFIG = (function (CONFIG) {
    // 服务器信息配置
    CONFIG.HOST = LOCATION;

    // 接口服务
    CONFIG.SERVICE = {
        lotteryService: "/lotteryCore/base/lotteryService",
        commonService: "/lotteryCore/user/commonService",
        imageService: "/lotteryCore/user/imageService",
        getBankList: "/lotteryCore/json/getBankList.json",
        walletService: "/lotteryCore/user/walletService",
        siteMessageService: "/lotteryCore/user/siteMessageService",
        active: "/lotteryCore/service/active",
        dOrderService: "/lotteryCore/order/dOrderService",
        bOrderService: "/lotteryCore/order/bOrderService",
        commonOrderService: "/lotteryCore/order/commonOrderService",
        uploadService: "/lotteryCore/user/uploadService"
    };

    // 内容管理系统接口
    CONFIG.CMS = {
        "findByCodeWithContents": ":9090/cms/api.category/findByCodeWithContents.do",
        "findByContentId": ":9090/cms/api.content/findByContentId.do"
    };

    // 接口动作
    CONFIG.ACTION = {
        registerUserByPhone: "registerUserByPhone", // 注册账号
        getImgCode: "getImgCode", // 获取图片验证码
        validImgCode: "validImgCode", // 验证图片验证码
        sendSms: "sendSms", // 发送短信验证码
        userLogin: "userLogin", // 用户登录
        userLogout: "userLogout", // 用户退出
        getUserInfo: "getUserInfo", // 获取用户最新数据
        modifyUserNickName: "modifyUserNickName", // 修改用户昵称
        resetUserPwd: "resetUserPwd", // 忘记密码
        modifyUserPhoto: "modifyUserPhoto", // 修改头像
        resetUserPayPwd: "resetUserPayPwd", // 修改支付密码
        bindBankCard: "bindBankCard", // 绑定银行卡
        getUserBankCards: "getUserBankCards", // 获取用户绑定的银行卡列表
        userWithdrawCash: "userWithdrawCash", // 用户提现申请
        getWithdrawCashList: "getWithdrawCashList", // 获取提现历史
        setDefaultBankCard: "setDefaultBankCard", // 设置默认银行卡
        userRrecharge: "userRrecharge", // 用户充值
        getWalletTransList: "getWalletTransList", // 账单明细
        getUserCoinList: "getUserCoinList", // 金币明细
        getUserSiteMessageList: "getUserSiteMessageList", // 获取站内消息列表
        modifySiteMessage: "modifySiteMessage", // 修改信息状态
        getDigitalIssue: "getDigitalIssue", // 获取数字彩当前期数接口
        getDigitalPrizeData: "getDigitalPrizeData", // 获取指定数字彩的近N期开奖数据接口
        getOldSscIssue: "getOldSscIssue", // 获取指定高频数字彩的近N期开奖数据接口
        previewOrder: "previewOrder", // 预计算数字彩订单接口
        saveOrder: "saveOrder", // 创建数字彩订单接口
        payOrder: "payOrder", // 请求支付彩票订单接口（数字+球类）
        queryPay: "queryPay", // 查询支付状态
        geFbBlendMatches: "geFbBlendMatches", // 竞彩足球获取当前可售足球赛事信息接口
        geFbTraditionMatches: "geFbTraditionMatches", // 传统足球获取14场/任选9赛事信息接口
        geBkBlendMatches: "geBkBlendMatches", // 获取当前篮球赛事及赔率赛果接口
        geRecentBkBlendIssueNo: "geRecentBkBlendIssueNo", // 获取篮球近N期历史期数号接口
        geRecentFbTraditionIssueNo: "geRecentFbTraditionIssueNo", //获取传统足球近N期历史期数号接口
        geFbMatchScore: "geFbMatchScore", // 获取指定足球赛事赛果比分接口
        getRechargePolicy: "getRechargePolicy", // 获取充值优惠方案接口
        getRrechargeList: "getRrechargeList", // 获取用户充值列表接口
        identifyRealUser: "identifyRealUser", // 实名认证
        getPayChannel: "getPayChannel", // 获取支付通道接口
        getPay: "getPay", // 请求支付接口
        getOrderList: "getOrderList", // 用户查询彩票订单列表接口（数字+球类）
        getOrderDetail: "getOrderDetail", // 查询指定彩票订单详细信息接口（数字+球类）
        geFbMatchLeagueStat: "geFbMatchLeagueStat", // 获取指定足球赛事的主客队历史交锋（不含赛事详情）接口
        geFbMatchLeagueDetail: "geFbMatchLeagueDetail", // 获取指定足球赛事的主客队近期战绩（赛事详情）接口
        geFbPkMatchHisStat: "geFbPkMatchHisStat", // 获取指定足球赛事的主客队历史交锋（不含赛事详情）接口
        geFbPkMatchHisDetail: "geFbPkMatchHisDetail", // 获取指定足球赛事的主客队历史交锋（赛事详情）接口
        getShopOrderStat: "getShopOrderStat", // 获取彩票店订单统计接口（数字+球类）
        modifyOrderByShop: "modifyOrderByShop", // 彩票店修改订单状态接口（数字+球类）
        uploadService: "uploadService"
    };

    // 数字彩投注功能 1、	普通投注 2、	定胆投注 3、	缩水投注 4、	和值 5、	复式(组3) 6、	复式（组6） 7、复式（组3+组6）
    CONFIG.DBETFUNCTION = {
        "d_1": "普通",
        "d_2": "定胆",
        "d_3": "缩水",
        "d_4": "和值",
        "d_5": "复式(组3)",
        "d_6": "复式(组6)",
        "d_7": "复式(组3+组6)",
    };
    // // 投注方式 1、普通投注 2、追号投注 3、七乐彩定胆投注 4、追加1元投注 5、组选 6、直选
    CONFIG.DIGITALISSUE = {
        "d_1": "普通",
        "d_2": "追号",
        "d_3": "定胆",
        "d_4": "追加1元",
        "d_5": "组选",
        "d_6": "直选"
    };

    // 彩票类型
    CONFIG.LOTTERYTYPE = {
        "lottoId6": "gd115",
        "lottoId11": "ssq",
        "lottoId12": "fc3d",
        "lottoId13": "qcl",
        "lottoId14": "dlt",
        "lottoId15": "qxc",
        "lottoId16": "pl3",
        "lottoId17": "pl5",
    };

    CONFIG.LOTTERYNAME = {
        "lottoId11": "双色球",
        "lottoId12": "福彩3D",
        "lottoId13": "七乐彩",
        "lottoId14": "大乐透",
        "lottoId15": "七星彩",
        "lottoId16": "排列3",
        "lottoId17": "排列5",
        "lottoId1001": "竞彩足球",
        "lottoId1002": "传统足球14场",
        "lottoId1003": "传统足球任选9场",
        "lottoId1004": "竞彩篮球"
    };
    // 彩种
    CONFIG.LOTTERYID = {
        "双色球": "11",
        "福彩3D": "12",
        "七乐彩": "13",
        "大乐透": "14",
        "七星彩": "15",
        "排列3": "16",
        "排列5": "17",
        "竞彩足球": "1001",
        "传统足球14场": "1002",
        "传统足球任选9场": "1003",
        "竞彩篮球": "1004"
    };

    // 赛事状态
    CONFIG.MATCHSTATU = {
        "Played": "完场",
        "Fixture": "未开赛",
        "Playing": "进行中",
        "Postponed": "延期",
        "Suspended": "暂停",
        "Cancelled": "取消"
    };

    // 充值结果：1 待审核、2 审核通过、3、审核不通过、4线下充值成功 5、线上充值成功
    CONFIG.RECHARGESTATU = {
        "statu_1": "待审核",
        "statu_2": "审核通过",
        "statu_3": "审核不通过",
        "statu_4": "线下充值成功",
        "statu_5": "线上充值成功",
    };

    // 充值方式：0：在线充值1：线下充值
    CONFIG.RECHARGETYPE = {
        "type_0": "在线充值",
        "type_1": "线下充值"
    };

    // 交易类型:
    // 1充值，
    // 2 店铺返点，
    // 3提现失败从冻结资金返回，
    // 4撤单资金退还，
    // 5：彩票中奖返现
    // 6:充值赠送 
    // 7:充值卡兑换到余额  
    // 8:购买充值卡
    // 9:充值卡充值
    // 10：系统赠送
    // 11: 推荐人返点，
    // 12 :代理商返点
    // 13 : 金币兑换为系统赠送彩金
    // 101提现，
    // 102余额投注，
    // 103 提现资金冻结，
    // 104开奖扣除冻结资金.
    CONFIG.TRANSTYPE = {
        "transtype1": {
            id: 1,
            name: "充值"
        },
        "transtype2": {
            id: 2,
            name: "店铺返点"
        },
        "transtype3": {
            id: 3,
            name: "提现失败从冻结资金返回"
        },
        "transtype4": {
            id: 4,
            name: "撤单资金退还"
        },
        "transtype5": {
            id: 5,
            name: "彩票中奖返现"
        },
        "transtype6": {
            id: 6,
            name: "充值赠送"
        },
        "transtype7": {
            id: 7,
            name: "充值卡兑换到余额"
        },
        "transtype8": {
            id: 8,
            name: "购买充值卡"
        },
        "transtype9": {
            id: 9,
            name: "充值卡充值"
        },
        "transtype10": {
            id: 10,
            name: "系统赠送"
        },
        "transtype11": {
            id: 11,
            name: "推荐人返点"
        },
        "transtype12": {
            id: 12,
            name: "代理商返点"
        },
        "transtype13": {
            id: 13,
            name: "金币兑换为系统赠送彩金"
        },
        "transtype101": {
            id: 101,
            name: "提现"
        },
        "transtype102": {
            id: 102,
            name: "余额投注"
        },
        "transtype103": {
            id: 103,
            name: "提现资金冻结"
        },
        "transtype104": {
            id: 104,
            name: "开奖扣除冻结资金"
        }
    };

    // 竞彩过头方式枚举值
    CONFIG.CG = {
        "单场": "CG_1_1",
        "2串1": "CG_2_1",
        "2串3": "CG_2_1",
        "3串1": "CG_3_1",
        "3串3": "CG_3_3",
        "3串4": "CG_3_4",
        "3串6": "CG_3_6",
        "3串7": "CG_3_7",
        "4串1": "CG_4_1",
        "4串4": "CG_4_4",
        "4串5": "CG_4_5",
        "4串6": "CG_4_6",
        "4串10": "CG_4_10",
        "4串11": "CG_4_11",
        "4串14": "CG_4_14",
        "4串15": "CG_4_15",
        "5串1": "CG_5_1",
        "5串5": "CG_5_5",
        "5串6": "CG_5_6",
        "5串10": "CG_5_10",
        "5串15": "CG_5_15",
        "5串16": "CG_5_16",
        "5串20": "CG_5_20",
        "5串25": "CG_5_25",
        "5串26": "CG_5_26",
        "5串30": "CG_5_30",
        "5串31": "CG_5_31",
        "6串1": "CG_6_1",
        "6串6": "CG_6_6",
        "6串7": "CG_6_7",
        "6串15": "CG_6_15",
        "6串20": "CG_6_20",
        "6串21": "CG_6_11",
        "6串22": "CG_6_22",
        "6串35": "CG_6_35",
        "6串41": "CG_6_41",
        "6串42": "CG_6_42",
        "6串50": "CG_6_50",
        "6串56": "CG_6_56",
        "6串57": "CG_6_57",
        "6串62": "CG_6_62",
        "6串63": "CG_6_63",
        "7串1": "CG_7_1",
        "7串6": "CG_7_6",
        "7串8": "CG_7_8",
        "7串21": "CG_7_21",
        "7串35": "CG_7_35",
        "7串120": "CG_7_120",
        "7串127": "CG_7_127",
        "8串1": "CG_8_1",
        "8串8": "CG_8_8",
        "8串9": "CG_8_9",
        "8串28": "CG_8_28",
        "8串56": "CG_8_56",
        "8串70": "CG_8_70",
        "8串247": "CG_8_247",
        "8串255": "CG_8_255",
    };

    // 订单状态
    // 0：暂存
    // 1：待付款
    // 2：待继续支付（付款不成功）
    // 3：已付款（并提交给平台）
    // 4：已中奖
    // 5：未中奖（已开奖且未中奖）
    // 6：已取消
    // 7：退款中（比赛无效，系统取消订单，退款中）
    // 8：已删除
    // 9：已退款（比赛无效，系统取消订单，已退款）
    CONFIG.ORDERSTATU = {
        "s_0": "暂存订单",
        "s_1": "待付款",
        "s_2": "待继续支付(付款不成功)",
        "s_3": "已付款",
        "s_4": "已中奖",
        "s_5": "未中奖(已开奖)",
        "s_6": "已取消",
        "s_7": "退款中",
        "s_8": "已删除",
        "s_9": "已退款",
    };

    // 彩票店对订单处理状态：
    // 0：未处理
    // 1：已接单
    // 2：已打印出单
    // 3：出单失败
    // 4：超时撤销
    // 5：确认收款
    // 6：已向用户转交彩票
    // 7：已退款
    CONFIG.SHOPDEALSTATUS = {
        "s_0": "未处理",
        "s_1": "已接单",
        "s_2": "已打印出单",
        "s_3": "出单失败",
        "s_4": "超时撤销",
        "s_5": "确认收款",
        "s_6": "已向用户转交彩票",
        "s_7": "已退款",
    };

    // 交易状态:
    // 0:待处理
    // 1：成功
    // 2：失败
    // 3：撤销
    CONFIG.TRANSSTATUS = {
        "s_0": "待处理",
        "s_1": "成功",
        "s_2": "失败",
        "s_3": "撤销"
    };

    // 平台审批状态 0：待审批；1：已审批；2：被驳回 3：重新提交
    CONFIG.AUTHSTATE = {
        "state_0": "待审批",
        "state_1": "已审批",
        "state_2": "被驳回",
        "state_3": "重新提交"
    };

    // 提现付款处理状态 0：待审批；1：已审批；2：被驳回 3：重新提交
    CONFIG.RESULTSTATE = {
        "state_0": "待支付",
        "state_1": "支付处理中",
        "state_2": "已付款"
    };

    return CONFIG;
}(CONFIG || {}));