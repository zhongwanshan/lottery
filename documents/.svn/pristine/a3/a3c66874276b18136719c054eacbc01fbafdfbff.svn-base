package lottery.pay.alipay.request

/**
 * * @param out_trade_no 订单支付时传入的商户订单号,不能和支付宝交易号（trade_no）同时为空。
 * @param trade_no 支付宝交易号
 */

data class  AlipayQueryRequest(
        var out_trade_no: String? = null,
        var trade_no: String? = null,

        // APPID 即创建应用后生成
        var APPID:String="",
        // 私钥 pkcs8格式的
        var RSA_PRIVATE_KEY:String = "",
        // 支付宝公钥
        var ALIPAY_PUBLIC_KEY:String = ""

)