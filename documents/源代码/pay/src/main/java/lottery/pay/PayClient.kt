package lottery.pay

import lottery.common.bean.Resp
import lottery.pay.alipay.AlipayHelper
import lottery.pay.alipay.request.AlipayQueryRequest
import lottery.pay.alipay.request.AlipayRefundRequest
import lottery.pay.alipay.request.AlipayRequest
import lottery.pay.wxplay.WxpayHelper
import lottery.pay.wxplay.bean.WxPayRequest
import org.slf4j.LoggerFactory


object PayClient {

    private val logger = LoggerFactory.getLogger(PayClient::class.java)

    /**
     * 阿里支付接口
     */
    object alipay{
        /**AlipayRequest 参数说明

         * bizContent内容
        @param bizContent:BizBean=BizBean(

        ),
        /**@param
         * 同步通知接口
        */
        @param notifyUrl:String="",
        /**
         * 异步返回接口
        */
        @param returnUrl:String=""

         */
        fun pay(request: AlipayRequest): Resp {
            return AlipayHelper.alipay(request)
        }

        /**
         * /**AlipayQueryRequest 元素定义
         * @param out_trade_no 订单支付时传入的商户订单号,不能和支付宝交易号（trade_no）同时为空。
         * @param trade_no 支付宝交易号
        */
         */
        fun query(request: AlipayQueryRequest): Resp {
            return AlipayHelper.alipayQuery(request)
        }
        /**
         * 支付宝退款 AlipayRefundRequest定义
         *必须的参数其实只有两个:商户订单号（out_trade_no）和支付宝交易号（trade_no）
         * 二 选一即可、另一个必须请求参数是：退款金额（refund_amount）
         * out_request_no是部分退款是需要
         *  @param out_trade_no 订单支付时传入的商户订单号,不能和支付宝交易号（trade_no）同时为空。
         * @param trade_no 支付宝交易号
         * @param refund_amount 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
         */
        fun  refund(request: AlipayRefundRequest): Resp {
            return AlipayHelper.alipayRefund(request)
        }
    }

    /**
     * 微信支付接口
     */
    object wxpay{
        /**
         * 微信APP支付
         */
        fun appPay(request:WxPayRequest):Resp{
            return WxpayHelper.appPay(request)
        }

        /**
         * 微信H5支付
         */
        fun h5Pay(request: WxPayRequest):Resp{
            return WxpayHelper.h5Pay(request)
        }

        /**
         * 微信扫描支付
         * @param request:微信支付必须参数
         * @param qrcodeUrl：生成的二维码地址
         *
         */
        fun native2Pay(request: WxPayRequest,qrcodeUrl:String):Resp{
            return WxpayHelper.native2Pay(request,qrcodeUrl)
        }


    }

    /**
     * 京东支付接口
     */
    object jdpay{

    }
}

