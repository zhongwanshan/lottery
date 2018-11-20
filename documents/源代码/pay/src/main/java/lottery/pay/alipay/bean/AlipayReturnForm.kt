package lottery.pay.alipay.bean


// 支付宝支付同步回调参数
data class AlipayReturnForm(
        var charset: String = "",
        var method: String = "",
        var version: String = "",
        var out_trade_no: String = "",
        var total_amount: String = "",
        var trade_no: String = "",
        var auth_app_id: String = "",
        var app_id: String = "",
        var seller_id: String = "",
        var timestamp: String = ""
)