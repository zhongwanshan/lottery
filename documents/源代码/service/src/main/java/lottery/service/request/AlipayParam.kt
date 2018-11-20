package lottery.service.request

data class AlipayParam(
        //订单号
        var out_trade_no: String = "",
        //        主题
        var subject: String = "",
        //金额
        var total_amount: String = "",
        //内容
        var body: String = "",
        //超时time
        var timeout_express: String = "",
        /**
         * 同步通知接口
         */
        var notifyUrl:String="",
        /**
         * 异步返回接口
         */
        var returnUrl:String=""
)