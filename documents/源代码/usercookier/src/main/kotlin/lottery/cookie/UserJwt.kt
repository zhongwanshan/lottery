package lottery.cookie

/**
 * Created by denghh on 2018/3/1.
 */

data class UserJwt(
        /** 用户ID */
        var id: String = "",
        var username: String = "",
        var role: String = "",
        var expired: Boolean = true,
        var valid: Boolean = false)