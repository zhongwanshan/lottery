package lottery.common.utils

import org.apache.commons.codec.binary.Base64
import java.security.MessageDigest

object Encrypt{

    /**
     * 根据给定的 原始字符串 和 盐 生成 MD5 字符串
     * @param text 需要加密的字符串
     * @param salt 盐，如果为空则不进行加盐操作
     * @return 经过加密之后的 MD5 数据，小写格式
     */
    fun md5(text: String, salt: String? = null): String {
        return if (salt.isNullOrEmpty()) md5Encrypt(text) ?: "" else md5Encrypt(text + salt) ?: ""
    }

    /**
     * 对给定的字符串进行Base64编码
     */
    fun base64(text: String): String {
        val base64 = Base64()
        return base64.encodeAsString(text.toByteArray(Charsets.UTF_8))
    }

    /**
     * base64 反编码
     */
    fun debase64(text: String): String {
        val base64 = Base64()
        return String(base64.decode(text), Charsets.UTF_8)
    }


    private val hexDigits =
            charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f')

    private fun md5Encrypt(s: String): String? {
        try {
            val btInput = s.toByteArray()
            // 获得MD5摘要算法的 MessageDigest 对象
            val mdInst = MessageDigest.getInstance("MD5")
            // 使用指定的字节更新摘要
            mdInst.update(btInput)
            // 获得密文
            val md = mdInst.digest()
            // 把密文转换成十六进制的字符串形式
            val j = md.size
            val str = CharArray(j * 2)
            var k = 0
            for (i in 0..j - 1) {
                val byte0 = md[i].toInt()
                str[k++] = hexDigits[byte0.ushr(4) and 0xf]
                str[k++] = hexDigits[byte0 and 0xf]
            }
            return String(str)
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }

    }

}
