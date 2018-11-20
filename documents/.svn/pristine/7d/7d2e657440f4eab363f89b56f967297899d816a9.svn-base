package lottery.cookie


import lottery.Consts
import lottery.common.utils.Beans
import lottery.common.utils.Encrypt
import lottery.entity.User
import lottery.jwt.Jwt
import java.lang.Exception
import javax.servlet.http.Cookie

/**
 * Created by denghh on 2018/3/1.
 */
object Cookier {
    const val COOKIE_DOMAIN = "lottery.com"
    const val JWT_COOKIE_NAME = "lottery.jwt"
    const val USER_COOKIE_NAME = "lottery.user"
    // COOKIE 最大生命周期
    const val COOKIE_MAX_AGE = 7 * 24 * 3600
    // COOKIE 正常生命周期
    const val COOKIE_MIN_AGE = -1
    // cookie 的根 path
    const val COOKIE_PATH = "/"


    private val invalidJWT = UserJwt(id = "", expired = true, valid = false)
    /**
     * 创建一个JWT Cookie
     */
    fun createJwtCookie(id: String, name: String, role: String, remember: Boolean = true): Cookie {
        val jwt = Jwt.create(
                Consts.JWT_ISSUER,
                Consts.JWT_EXPIRES,
                mapOf("id" to id, "name" to name, "role" to role))

        val cookieAge = if (remember) COOKIE_MAX_AGE else COOKIE_MIN_AGE
        val decrypt=Jwt.decrypt(jwt)
        println("decrypt:"+decrypt)
        return Cookie(JWT_COOKIE_NAME, jwt).apply {
            maxAge = cookieAge
            path = COOKIE_PATH
            domain = COOKIE_DOMAIN
        }
    }

    /**
     * 创建一个用户信息Cookie
     */
    fun userCookie(userJson: String): Cookie {
        val value = Encrypt.base64(userJson)
        return Cookie(USER_COOKIE_NAME, value).apply {
            maxAge = COOKIE_MAX_AGE
            path = COOKIE_PATH
            domain = COOKIE_DOMAIN
        }
    }


    /**
     * 解析jwt cookie的内容到 map
     */
    fun readJwtCookie(value: String?): UserJwt {
        if (value == null || value.trim().isNullOrBlank()) return invalidJWT
        val jwt = Jwt.decrypt(value)
        // 如果JWT不正确或者过期了，则需要重新登录
        if (!jwt.valid || jwt.expired) return invalidJWT
        val uid = jwt.payload["id"] ?: return invalidJWT
        val name = jwt.payload["name"] ?: return invalidJWT
        val type = jwt.payload["role"] ?: return invalidJWT
        val userid = uid as String
        if (userid.isNullOrBlank()) return invalidJWT


        return UserJwt(id = userid, username = name.toString(), role = type.toString(), expired = false, valid = true)
    }


    /**
     * 将用户的cookie读取到map
     */
    fun readUserCookie(value: String?): User? {
        if (value == null || value.trim().isNullOrBlank()) return null
        val txt = Encrypt.debase64(value)
        try {
            return Beans.bean(txt, User::class.java)
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }

    /**
     * 删除 JWT cookie
     */
    fun removeJwtCookie(): Cookie {
        // 删除cookie
        val cookie = Cookie(JWT_COOKIE_NAME, null)
        cookie.maxAge = 1 //5 minute
        cookie.path = COOKIE_PATH
        cookie.domain = COOKIE_DOMAIN
        return cookie
    }


    /**
     * 删除 user cookie
     */
    fun removeUserCookie(): Cookie {
        // 删除cookie
        val cookie = Cookie(USER_COOKIE_NAME, null)
        cookie.maxAge = 1 //5 minute
        cookie.path = COOKIE_PATH
        cookie.domain = COOKIE_DOMAIN
        return cookie
    }
}
