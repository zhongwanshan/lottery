package lottery.api.controller

import com.alibaba.fastjson.JSON
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import lottery.api.bean.CookieBean
import lottery.common.utils.Beans
import lottery.cookie.Cookier
import lottery.entity.User
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.CookieValue
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
@Api(position = 1, basePath = "/cookie", value = "Cookie", description = "cookie测试")
@RequestMapping(value = "/cookie")
open class  CookieController{
    @ApiOperation(value = "写cookie", notes = "测试")
    @RequestMapping(value = "/write",produces = ["application/json;charset=UTF-8"], method = [(RequestMethod.POST)],name = "cookie")
    @ResponseBody
    fun test(request: HttpServletRequest, response: HttpServletResponse):String{
        val bean=CookieBean(id=10L,username = "liyifei",role = "admin")
        val jwt = Cookier.createJwtCookie(bean.id.toString(), bean.username, bean.role, true)
        response.addCookie(jwt)

        val userCookier = Cookier.userCookie(Beans.json(bean))

        response.addCookie(userCookier)
        return JSON.toJSONString("OK")
    }

    @ApiOperation(value = "读cookie", notes = "测试")
    @RequestMapping(value = "/read",produces = ["application/json;charset=UTF-8"], method = [(RequestMethod.GET)],name = "cookie")
    @ResponseBody
    fun readtest(@CookieValue(Cookier.JWT_COOKIE_NAME, required = false) jwtCookie: String? = "",
                 @CookieValue(Cookier.USER_COOKIE_NAME, required = false) userCookie: String? = "",
                 model: ModelMap):String{
        val user=Cookier.readUserCookie(userCookie) as User
        val userId = Cookier.readJwtCookie(jwtCookie).id
        val userName = Cookier.readJwtCookie(jwtCookie).username
        return JSON.toJSONString("OK muserId:$userId username:$userName : ${user.id}")
    }


}