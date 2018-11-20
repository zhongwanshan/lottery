package lottery.pay.alipay

import com.alipay.api.DefaultAlipayClient
import com.alipay.api.request.*
import lottery.common.bean.Resp
import lottery.common.utils.Beans
import lottery.pay.alipay.bean.BizBean
import lottery.pay.alipay.config.AlipayConfig
import lottery.pay.alipay.config.AlipayProductCode
import lottery.pay.alipay.request.AlipayQueryRequest
import lottery.pay.alipay.request.AlipayRefundRequest
import lottery.pay.alipay.request.AlipayRequest
import org.slf4j.LoggerFactory


/**
 * 阿里支付接口
 */
object  AlipayHelper{
    private val logger = LoggerFactory.getLogger(AlipayHelper::class.java)
    /**
     * 支付宝退款交易
     */
    fun  alipayRefund(request: AlipayRefundRequest): Resp
    {

        //获得初始化的AlipayClient
        val client = getDefaultAlipayClient(request.APPID,request.RSA_PRIVATE_KEY,request.ALIPAY_PUBLIC_KEY)
        //设置请求参数
        val request_refund = AlipayTradeRefundRequest()
        request_refund.bizContent=Beans.json(request)
        val response= client.execute(request_refund)
        return if(response.isSuccess){
            Resp.succ("支付宝退款成功",data=response.body)
        }else{
            Resp.fail(response.subMsg,data=response.body)
        }

    }

    /**
     * 支付宝查询接口
     */
    fun alipayQuery(request: AlipayQueryRequest):Resp{

        //获得初始化的AlipayClient
        val client = getDefaultAlipayClient(request.APPID,request.RSA_PRIVATE_KEY,request.ALIPAY_PUBLIC_KEY)
        //设置请求参数
        val request_query=AlipayTradeQueryRequest()
        request_query.bizContent=Beans.json(request)
        val response=client.execute(request_query)
        return if (response.isSuccess){
            Resp.succ("查询订单成功",data = response.body)
        }else{
            Resp.fail(response.subMsg,data=response.body)
        }
    }

    /**
     * 支付宝支付
     */
    fun alipay(request: AlipayRequest):Resp{
        //获得初始化的AlipayClient
        val client = getDefaultAlipayClient(request.APPID,request.RSA_PRIVATE_KEY,request.ALIPAY_PUBLIC_KEY)
        //设置请求参数,支付宝PC支付，扫描支付
        if (request.product_code.isNullOrEmpty())return  Resp.fail("支付失败，缺少必要的参数(product_code)",data=request)
        var biz=BizBean(
                body = request.body,
                product_code =request.product_code,
                subject = request.subject,
                total_amount = request.total_amount,
                out_trade_no = request.out_trade_no,
                timeout_express =request.timeout_express

        )
        when {//PC端支付
            request.product_code==AlipayProductCode.PCPAY.v -> {

                val request_pay = AlipayTradePagePayRequest()
                request_pay.notifyUrl = request.notifyUrl
                request_pay.returnUrl = request.returnUrl

                request_pay.bizContent = Beans.json(biz)
                //请求
                val response = client.pageExecute(request_pay)

                if (logger.isDebugEnabled) {
                    logger.debug(" alipayRequest = {}", Beans.json(request))
                    logger.debug(" html = {}", response.body)
                }
                return if (response.isSuccess) {
                    Resp.succ("支付成功", data = response.body)
                } else {
                    Resp.fail(response.subMsg, data = response.body)
                }
            }
            //wap支付
            request.product_code==AlipayProductCode.WAPPAY.v -> {
                val request_pay = AlipayTradeWapPayRequest()
                request_pay.notifyUrl = request.notifyUrl
                request_pay.returnUrl = request.returnUrl
                request_pay.bizContent = Beans.json(biz)
                //请求
                val response = client.pageExecute(request_pay)

                if (logger.isDebugEnabled) {
                    logger.debug(" alipayRequest = {}", Beans.json(request))
                    logger.debug(" html = {}", response.body)
                }
                return if (response.isSuccess) {
                    Resp.succ("支付成功", data = response.body)
                } else {
                    Resp.fail(response.subMsg, data = response.body)
                }
            }
            //手机app支付
            request.product_code==AlipayProductCode.APPPAY.v -> {
                val request_pay = AlipayTradeAppPayRequest()
                request_pay.notifyUrl = request.notifyUrl
                request_pay.returnUrl = request.returnUrl
                request_pay.bizContent = Beans.json(biz)
                //请求
                val response = client.sdkExecute(request_pay)

                if (logger.isDebugEnabled) {
                    logger.debug(" alipayRequest = {}", Beans.json(request))
                    logger.debug(" html = {}", response.body)
                }
                return if (response.isSuccess) {
                    Resp.succ("支付成功", data = response.body)
                } else {
                    Resp.fail(response.subMsg, data = response.body)
                }
            }
            else -> return Resp.fail("未知的支付类型",data=request)
        }
    }

    /**
     * 得到支付宝支付客户端
     */
    private fun getDefaultAlipayClient(APPID:String,RSA_PRIVATE_KEY:String,ALIPAY_PUBLIC_KEY:String):DefaultAlipayClient{

        return DefaultAlipayClient(AlipayConfig.URL, APPID, RSA_PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET, ALIPAY_PUBLIC_KEY, AlipayConfig.SIGNTYPE)
    }

}

fun main(array: Array<String>){
    val alipay= AlipayRequest(
            body = "alipay",
            out_trade_no = "O9988888868888812",
            total_amount = "0.01",
            subject = "支付宝支付",
            product_code = AlipayProductCode.PCPAY.v,
            returnUrl = "http://www.lottery.com/alipayruturn",
            notifyUrl = "http://www.lottery.com/alipayruturn",
            timeout_express = "2m",
            RSA_PRIVATE_KEY = AlipayConfig.PRIVATE_KEY,
            APPID = AlipayConfig.APPID,
            ALIPAY_PUBLIC_KEY = AlipayConfig.ALIPAY_PUBLIC_KEY


    )
    val help=AlipayHelper.alipay(alipay)
    println(help.body)
}