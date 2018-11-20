package lottery.pay.alipay.request

// 支付宝支付请求参数
data class AlipayRequest(
         /**bizContent内容*/
        var out_trade_no: String = "",
        var subject: String = "",
        var total_amount: String = "",
        var body: String = "",
        var timeout_express: String = "",
        var product_code: String = "",
        /**
         * 同步通知接口
         */
        var notifyUrl:String="",
        /**
         * 异步返回接口
         */
        var returnUrl:String="",
        // APPID 即创建应用后生成
        var APPID:String="",
        // 私钥 pkcs8格式的
        var RSA_PRIVATE_KEY:String = "" ,
        // 支付宝公钥
        var ALIPAY_PUBLIC_KEY:String = ""

)
