package lottery.admin.web

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import lottery.admin.Routing
import lottery.common.bean.Resp
import lottery.common.http.MediaType
import lottery.common.utils.Beans
import lottery.cookie.Cookier
import lottery.entity.User
import lottery.service.bean.CookieBean
import lottery.service.form.UserForm
import lottery.service.impl.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@Controller
@Api(position = 1, basePath = "/", value = "用户登录登出", description = "用户登录登出处理类")
class LoginController{
    @Autowired private lateinit var userService:UserService



    @RequestMapping(value = Routing.login.login,method = arrayOf(RequestMethod.POST),produces = arrayOf("application/json;charset=UTF-8"))
    @ApiOperation(value = "登录", notes = "用户登录处理")
    @ResponseBody
    fun login(@RequestBody form: UserForm ,
              response: HttpServletResponse,
              request:HttpServletRequest): Resp {
        form.ip=request.remoteAddr
        val resp=userService.login(form)

        if(resp.success){
            //写用户cookie
            val user=resp.body as User
            val cookieBean =CookieBean(username = user.username,id=user.id,role=user.role)
            val jwt = Cookier.createJwtCookie(cookieBean.id.toString(), cookieBean.username, cookieBean.role, true)
            response.addCookie(jwt)

            val userCookier = Cookier.userCookie(Beans.json(cookieBean))
            response.addCookie(userCookier)
        }
        return resp
    }


    @RequestMapping(value = Routing.login.logout,method = arrayOf(RequestMethod.GET),produces = arrayOf(MediaType.HTML))
    @ApiOperation(value = "登出", notes = "用户登录处理")
    fun logout(response: HttpServletResponse):String {
        val jwtCookie = Cookier.removeJwtCookie()
        val userCookie = Cookier.removeUserCookie()
        response.addCookie(jwtCookie)
        response.addCookie(userCookie)

        return "redirect:${Routing.login.index}"
    }



    @RequestMapping(value = "/main",method = arrayOf( RequestMethod.GET))
    @ApiOperation(value = "登录成功主页面", notes = "用户登录处理")
    fun main(@CookieValue(Cookier.JWT_COOKIE_NAME, required = false) jwtCookie: String? = "",
             @CookieValue(Cookier.USER_COOKIE_NAME, required = false) userCookie: String? = "",
             model:ModelMap): String {
        val user=Cookier.readJwtCookie(jwtCookie)
        model.addAttribute("username",user.username)
        return  "main/index"

    }




}