package lottery.admin.filter

import lottery.UserRole
import lottery.admin.Routing
import lottery.cookie.Cookier
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import javax.servlet.*
import javax.servlet.annotation.WebFilter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


/**
 * 登录状态检查Filter。
 * 监控的 urlPatterns 和 application.yml 配置中的 dispatcherServletUrlPattern 保存一致
 */
@Component
@WebFilter(urlPatterns = ["/*"])
@Order(value = 1)
class LoginCheckFilter : Filter {

    private var URIS_NOT_NEED_LOGIN_CHECK = arrayOf(
            Routing.login.index,
            Routing.login.login,
            "/swagger-ui.html",
            "/swagger-resources",
            "/configuration/security",
            "/v2/api-docs",
            "/configuration/ui",
            "/index.html",
            ".js",
            ".css"
    )
    /** 登录页面地址*/
    @Value("\${rediretc.base.url}")
    lateinit var LOGIN_URL: String



    override fun init(filterConfig: FilterConfig?) {
    }

    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        val req = request as HttpServletRequest
        val res = response as HttpServletResponse

        val needCheck = isRequestNeedLoginCheck(request.requestURI)

        if (!needCheck) {
            chain.doFilter(request, response)
        } else {
            // 检查是否有cookie，没有则跳转到登录页面
            var (jwtCookie, userCookie) = arrayOf("", "")
            if (req.cookies == null) {
                res.sendRedirect(if(LOGIN_URL.isNullOrEmpty())"http://www.lottery.com:19001" else LOGIN_URL)
                return
            }

            req.cookies.forEach {
                if (it.name == lottery.cookie.Cookier.JWT_COOKIE_NAME) jwtCookie = it.value
                else if (it.name == Cookier.USER_COOKIE_NAME) userCookie = it.value
            }

            if (!isUserValid(jwtCookie, userCookie)) {
                toLoginPage(res)
            } else {
                chain.doFilter(request, response)
            }
        }
    }

    /** 重定向到登录页面*/
    private fun toLoginPage(res: HttpServletResponse) {
        // 调到登录页之前，清理cookie
        res.addCookie(Cookier.removeJwtCookie())
        res.addCookie(Cookier.removeUserCookie())
        res.sendRedirect(LOGIN_URL)
    }

    /**
     * 检查当前访问的URL是不是需要检查用户的登录状态。
     */
    private fun isRequestNeedLoginCheck(requestURI: String): Boolean {
        URIS_NOT_NEED_LOGIN_CHECK.forEach { uri ->
            //如果当前request.uri在 "无需登录检查的URIs"列表中，则直接返回false
            if (uri.endsWith("*")) {
                if (requestURI.startsWith(uri.substringBefore("*")))
                    return false
            } else if(requestURI.endsWith(uri)) {
                return false
            } else {
                if (uri == requestURI)
                    return false
            }
        }
        // 否则，返回true
        return true
    }


    /**
     * 检查当前用户是否为有效用户
     */
    private fun isUserValid(jwtCookie: String?, userCookie: String?): Boolean {
        if (jwtCookie == null || userCookie == null) return false

        val jwt = Cookier.readJwtCookie(jwtCookie)
        if (jwt.id.isNullOrEmpty()) return false


        Cookier.readUserCookie(userCookie) ?: return false

        // check admin
        if (jwt.role != UserRole.Admin.v) {
            return false
        }

        return true
    }

    override fun destroy() {
    }
}