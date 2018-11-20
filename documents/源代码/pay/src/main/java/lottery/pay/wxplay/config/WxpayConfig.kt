package lottery.pay.wxplay.config


object WxpayConfig{
    /**
     * 预支付接口
     */
    const val prePayURL = "https://api.mch.weixin.qq.com/pay/unifiedorder"
    const val APPID="wx52bf8f5ae4bfa01f"
    const val MACH_ID="1375502702"
    const val KEY="52ecebd4210c5b8b1dff6edf6828838G"
}
/**
 * 交易类型枚举
 * 统一下单接口trade_type的传参可参考这里
 * JSAPI--公众号支付、小程序支付
 * NATIVE--原生扫码支付
 * APP--APP支付
 * MWEB--WAP支付
 * MICROPAY--刷卡支付,刷卡支付有单独的支付接口，不调用统一下单接口
 */
 enum class WxTradeType(val v:String,val mean:String) {
    JSAPI("JSAPI","公众号支付、小程序支付"),
    NATIVE("NATIVE","原生扫码支付"),
    APP("APP","PP支付"),
    MICROPAY("MICROPAY","刷卡支付,刷卡支付有单独的支付接口，不调用统一下单接口"),
    MWEB("MWEB","h5支付")
}


enum class Charset(val v:String,val mean:String){
    UTF_8("UTF-8","utf-8编码"),
    ISO_8859("ISO-8859-1","中文编码")
}

enum class WxNative1PayUrl(val v:String,val mean:String){
    QRCODE_URL_MODEL("weixin://wxpay/bizpayurl?sign=XXXXX&appid=XXXXX&mch_id=XXXXX&product_id=XXXXX&time_stamp=XXXXX&nonce_str=XXXXX","微信扫描支付一模板url"),
    REPLACE_STR("XXXXX","将X替换成需要的内容")
}

