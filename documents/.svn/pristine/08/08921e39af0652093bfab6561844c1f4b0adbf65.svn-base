package lottery.admin.web

import com.alipay.api.internal.util.AlipaySignature
import lottery.AlipayBaseParam
import lottery.admin.Routing
import lottery.common.bean.Head
import lottery.common.bean.Resp
import lottery.common.utils.Beans
import lottery.cookie.Cookier
import lottery.pay.alipay.bean.AlipayNotifyForm
import lottery.pay.alipay.config.AlipayConfig
import lottery.service.impl.PayService
import lottery.service.request.AlipayParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CookieValue
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@Controller
class PayController  {

    @Autowired
    private lateinit var payService: PayService
    /** 登录页面地址*/
    @Value("\${rediretc.base.url}")
    lateinit var BASE_URL: String

    @GetMapping(value = Routing.pay.ali_pc_pay, name = "账户充值")
    fun recharge(@CookieValue(Cookier.JWT_COOKIE_NAME, required = false) jwtCookie: String? = "",
                 @CookieValue(Cookier.USER_COOKIE_NAME, required = false) userCookie: String? = "",
                 @RequestParam rechargeAmount: String,
                 response: HttpServletResponse) {

        val userId = Cookier.readJwtCookie(jwtCookie).id
        var baseUrl =BASE_URL

        if (baseUrl.isNullOrBlank()) throw RuntimeException("NO baseUrl configured in application.yml")

        val returnUrl = "$baseUrl${Routing.pay.ali_return}"
        val notifyUrl = "$baseUrl${Routing.pay.ali_notify}"
        val params=AlipayParam(
                out_trade_no = "t808080ff900",
                total_amount = "0.01",
                body = "阿里测试支付",
                subject = "阿里支付",
                timeout_express = "3m",
                returnUrl = returnUrl,
                notifyUrl = notifyUrl
        )

        val html = payService.aliPcPay(params)

        response.contentType = "text/html;charset=${AlipayConfig.CHARSET}"
        response.writer.print(html.body)
        response.writer.flush()
        response.writer.close()
    }

    /*@GetMapping(value = Routing.Pay.ali_return, name = "alipay回调同步地址")
    fun returnUrl(@RequestParam params: MutableMap<String, String>,
                  request: HttpServletRequest,
                  model: ModelMap): String {
        // 默认回到支付页面
        return redirect("/service/${Routing.ConfigManage.pay}")
    }*/

    @RequestMapping(value = Routing.pay.ali_notify, name = "充值alipay回调异步通知地址")
    fun alipayNotifyUrl(response: HttpServletResponse, request: HttpServletRequest) {

        val maps = request.parameterMap
        val params = mutableMapOf<String, String>()
        maps.keys.forEach {
            val v = maps[it] as Array<String>
            params.put(it, v.joinToString(","))
        }

        val signVerified = AlipaySignature.rsaCheckV1(params, AlipayBaseParam.ALIPAY_PUBLIC_KEY.v, AlipayConfig.CHARSET, "RSA2")

        val alipayNotifyForm = Beans.fromMap(AlipayNotifyForm::class.java, params)

        //处理相关的逻辑
       /* val resp = payService.recharge(alipayNotifyForm)*/
        val resp= Resp.succ()


        if (signVerified && (resp.head.status == Head.SUCC_CODE)) {
            response.contentType = "text/html;charset=${AlipayConfig.CHARSET}"
            response.writer.print("success")
            response.writer.flush()
            response.writer.close()
        } else {
            response.contentType = "text/html;charset=${AlipayConfig.CHARSET}"
            response.writer.print("fail")
            response.writer.flush()
            response.writer.close()
        }
    }
}