package lottery.pay.wxplay

import com.alibaba.fastjson.JSONObject
import lottery.common.bean.Resp
import lottery.common.utils.Beans
import lottery.common.utils.Encrypt
import lottery.common.utils.HttpClient
import lottery.common.utils.QRCodeUtil
import lottery.pay.wxplay.bean.WxPayBean
import lottery.pay.wxplay.bean.WxPayCallBack
import lottery.pay.wxplay.bean.WxPayRequest
import lottery.pay.wxplay.config.Charset
import lottery.pay.wxplay.config.WxNative1PayUrl
import lottery.pay.wxplay.config.WxTradeType
import lottery.pay.wxplay.config.WxpayConfig
import lottery.pay.wxplay.utils.WxUtilsHelper
import java.util.*
import javax.servlet.http.HttpServletRequest

object WxpayHelper{

    /**
     * 微信app支付
     */
    fun appPay(request: WxPayRequest):Resp{
        var callback= doPrePay(request)
        if (callback.result_code!="SUCCESS"){
            return Resp.fail(callback.err_code_des,data=Beans.json(callback))
        }
        /**
         * PayReq *request = [[[PayReq alloc] init] autorelease];
        request.partnerId = @"10000100";
        request.prepayId= @"1101000000140415649af9fc314aa427";
        request.package = @"Sign=WXPay";
        request.nonceStr= @"a462b76e7436e98e0ed6e13c64b4fd1c";
        request.timeStamp= @"1397527777";
        request.sign= @"582282D72DD2B03AD892830965F428CB16E7A256";
         */

        var chatBean= WxPayBean(
                appId = request.appid,
                nonceStr = request.nonce_str,
                partnerId = request.mch_id,
                prepayId = callback.prepay_id,
                timestamp = (Date().time/1000).toString(),
                key= request.key
        )
        val sign = Encrypt.md5(WxUtilsHelper.toRequestParamsStr(chatBean)).toUpperCase()
        var json=JSONObject()
        json["appId"] = chatBean.appId
        json["nonceStr"]=chatBean.nonceStr
        json["partnerId"]=chatBean.partnerId
        json["prepayId"]=callback.prepay_id
        json["timestamp"]=chatBean.timestamp
        json["outTradeNo"]=request.out_trade_no
        json["package"]=chatBean.packaged
        json["sign"]=sign

        return Resp.succ("调用app支付成功",data= json.toJSONString())
    }

    /**
     * 微信预下单处理
     * 微信扫描支付1返回时候需要统一下单需要参数
     *公众账号ID	appid	String(32)	是	wx8888888888888888	微信分配的公众账号ID
    用户标识	openid	String(128)	是	o8GeHuLAsgefS_80exEr1cTqekUs	用户在商户appid下的唯一标识
    商户号	mch_id	String(32)	是	1900000109	微信支付分配的商户号
    是否关注公众账号	is_subscribe	String(1)	是	Y	用户是否关注公众账号，仅在公众账号类型支付有效，取值范围：Y或N;Y-关注;N-未关注
    随机字符串	nonce_str	String(32)	是	5K8264ILTKCH16CQ2502SI8ZNMTM67VS	随机字符串，不长于32位。推荐随机数生成算法
    商品ID	product_id	String(32)	是	88888	商户定义的商品id 或者订单号
    签名	sign	String(32)	是	C380BEC2BFD727A4B6845133519F3AD6	返回数据签名，签名生成算法

     */
    @Throws(Exception::class)
    private fun doPrePay(params: WxPayRequest): WxPayCallBack {


        val paramQ = WxUtilsHelper.toRequestParamsStr(params)
        params.sign= Encrypt.md5(paramQ).toUpperCase()
        val key = params.key
        params.key= null

        val paramXml = WxUtilsHelper.xml.toXml(params, "xml")
        val callBackXml = HttpClient.doXmlPost(WxpayConfig.prePayURL, paramXml,Charset.UTF_8.v)
        params.key=key
        val callback= WxUtilsHelper.xml.fromXml(callBackXml, WxPayCallBack::class.java, "xml") as WxPayCallBack
        return callback

    }


    /**参考文档:https://pay.weixin.qq.com/wiki/doc/api/H5.php?chapter=9_20&index=1
     * 微信H5支付(商户号)trade_type=MWEB
     */
    fun h5Pay(request: WxPayRequest): Resp {
        var callback= doPrePay(request)
        if (callback.result_code!="SUCCESS"){
            return Resp.fail(callback.err_code_des,data=Beans.json(callback))
        }
        var chatBean= WxPayBean(
                appId = request.appid,
                nonceStr = request.nonce_str,
                partnerId = request.mch_id,
                prepayId = callback.prepay_id,
                timestamp = (Date().time/1000).toString(),
                key= request.key
        )

        return Resp.succ(data=Beans.json(callback))
    }

    /**
     * 微信原生支付（扫码支付,第二种方式）
     */

    fun native2Pay(request: WxPayRequest,qrcodeUrl:String):Resp{
        var callback= doPrePay(request)
        if (callback.result_code!="SUCCESS"){
            return Resp.fail(callback.err_code_des,data=Beans.json(callback))
        }
         QRCodeUtil.encode(callback.code_url,null,qrcodeUrl,true)

        return  Resp.succ("",data=Beans.json(callback))

    }

    /**
     * 微信原生支付的QrCode（扫码支付,第一种方式product_id不能为空）
     * 生成二维码需要的参数
     * appid
     * mach_id
     * product_id
     * key
     * time_stamp
     * nonce_str
     * 以上必须不能为空
     *
     *公众账号ID	appid	String(32)	是	wx8888888888888888	微信分配的公众账号ID
    商户号	mch_id	String(32)	是	1900000109	微信支付分配的商户号
    时间戳	time_stamp	String(10)	是	1414488825	系统当前时间，定义规则详见时间戳
    随机字符串	nonce_str	String(32)	是	5K8264ILTKCH16CQ2502SI8ZNMTM67VS	随机字符串，不长于32位。推荐随机数生成算法
    商品ID	product_id	String(32)	是	88888	商户定义的商品id 或者订单号
    签名	sign	String(32)	是	C380BEC2BFD727A4B6845133519F3AD6	签名，详见签名生成算法
     */

    fun native1QrCodeUrl(request: WxPayRequest):Resp{
        val paramQ = WxUtilsHelper.toRequestParamsStr(request)
        val sign= Encrypt.md5(paramQ).toUpperCase()
        val qrCodeUrl=WxUtilsHelper.replace(WxNative1PayUrl.QRCODE_URL_MODEL.v,WxNative1PayUrl.REPLACE_STR.v,
                sign,request.appid,request.mch_id,request.product_id,request.time_stamp,request.nonce_str)
        return  Resp.succ("生成二维码内容成功",data=qrCodeUrl)

    }

    /**
     * 扫描支付1方式返回
     */
    fun native1Pay(request:HttpServletRequest,key:String):Resp{
        /**
         * 获取用户扫描二维码后，微信返回的信息
         */
        val notityXml=StringBuilder()
        request.reader.forEachLine {
            notityXml.append(it).append("\n")
        }
        request.reader.close()


        /**
         * 获取返回的信息内容中各个参数的值
         */
        val wxrequest = WxUtilsHelper.xml.fromXml(notityXml.toString(),WxPayRequest::class.java,"xml") as WxPayRequest
        val sign=wxrequest.sign
        val signStr="appid=${wxrequest.appid}&is_subscribe=${wxrequest.is_subscribe}&=mch_id=${wxrequest.mch_id}&nonce_str=${wxrequest.nonce_str}&openid=${wxrequest.openid}&product_id=${wxrequest.product_id}&key=$key"
        val packageSign=Encrypt.md5(signStr)
        val newRequest=WxPayRequest(
                appid = wxrequest.appid,
                mch_id = wxrequest.mch_id,
                body = "测试扫码支付",
                out_trade_no = System.currentTimeMillis().toString(),
                total_fee = "1",
                key=key,
                spbill_create_ip = "127.0.0.1",
                nonce_str = System.currentTimeMillis().toString(),
                notify_url = "http://www.lottery.com/return",
                openid = wxrequest.openid,
                trade_type = WxTradeType.NATIVE.v
        )
        val callback=doPrePay(newRequest)


        val return_code = callback.return_code
        val result_code = callback.result_code

        if (return_code=="SUCCESS" && result_code=="SUCCESS") {
            // 以下字段在return_code 和result_code都为SUCCESS的时候有返回
            val prepayCallback=WxPayCallBack(
                    prepay_id = callback.prepay_id,
                    return_code = callback.return_code,
                    appid = callback.appid,
                    mch_id = callback.mch_id,
                    nonce_str = System.currentTimeMillis().toString(),
                    result_code = if(sign==packageSign) callback.result_code else "FAIL",
                    err_code_des = if(sign==packageSign) "" else "订单失效",
                    key=key
            )


            prepayCallback.sign=Encrypt.md5(WxUtilsHelper.toRequestParamsStr(prepayCallback)).toUpperCase()
            val xml = WxUtilsHelper.xml.toXml(prepayCallback,"xml")
            return Resp.succ(data=xml)
        }


        return Resp.succ()
    }


}

fun main(array: Array<String>){
    //www.aiyuezhan.com/nativepayreturn
    /*appid = "wxa54d9730c700172e",
    mch_id = "1366809902",
    key = "201b709090b4c0924ri702edce69f6a2",*/
    val nonce_str = System.currentTimeMillis().toString()
    //native 2
    val request=WxPayRequest(
            //微信商户号
            appid = WxpayConfig.APPID,
            mch_id = WxpayConfig.MACH_ID,
            key = WxpayConfig.KEY,
            nonce_str = nonce_str,
            out_trade_no= "L000000076007e3e344343466",
            total_fee ="1",
            spbill_create_ip = "127.0.0.1",
            trade_type = WxTradeType.APP.v,

            body = "订单支付",
            notify_url="http://www.aiyuezhan.com/nativepayreturn"


    )
    println(WxpayHelper.appPay(request).body)
    /*//native 1
    val request=WxPayRequest(
            //微信商户号
            appid = WxpayConfig.APPID,
            mch_id = WxpayConfig.MACH_ID,
            key = WxpayConfig.KEY,
            nonce_str = nonce_str,
            product_id= "L0000000007366",
            time_stamp = (System.currentTimeMillis()/1000).toString()


    )
    val url=WxpayHelper.native1QrCodeUrl(request).body.toString()
    println(url)
    QRCodeUtil.encode(url,"c:/li/1.jpg")
*/
}