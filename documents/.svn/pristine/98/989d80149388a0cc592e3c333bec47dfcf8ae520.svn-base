package lottery.common.utils

object Password{
    private const val SALT = "Sa1t0f!:lotteryU5er@*Passw0rd"
    /** 加密密码 */
    fun encrypt(pass: String): String {
        return Encrypt.md5(pass, SALT).toLowerCase()
    }
}