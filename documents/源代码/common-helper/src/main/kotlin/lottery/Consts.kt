package lottery

object Consts {
    const val JWT_ISSUER = "lottery.com"
    const val JWT_EXPIRES = 7 * 24 * 3600 * 1000L

    const val IS_TEST_ENV = "is_test_env"
}

/**
 * 用户权限定义
 */
enum class UserRole(val v:String,val mean:String){
    Admin("Admin","系统管理员")
}

/**
 * 支付类型
 */
enum class PayType(val v:String,val mean: String){
    ALIPAY("ALIPAY","支付宝"),
    WXPAY("WXPAY","微信"),
    JDPAY("JDPAY","京东支付")
}

enum class SysUserInit(val v: String,val mean: String){
    UserName("admin","用户名"),
    Password("123456","默认密码"),
    Phone("13800138000","默认手机号码")
}

/**
 * 阿里支付需要的参数
 */
enum class AlipayBaseParam(val v:String,val mean: String){
    APPID("2016072201653224","阿里支付应该id"),
    RSA_PRIVATE_KEY("MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAK1NVfhPKsd8UwtAMDY+9v/3uI4yLIvg00W487p9nJPKAE8Dzc4vUSQGNTj3HOONzNLpEd0Ifk7EUJdR9EPyjGIkZpCLGMSkmrYyjZcK14ARM21rKDwWQJf00mVkYivBYH+dxhjpJRNJ2NBoOAc/yKZruTX7c1kgZ1uukgr8Pw+jAgMBAAECgYATFODSZmUfceDy7C5iyqwHow7/GScuf6LDmom7jvkejK9cA981RKB6hvR1QUA9De/viRoebED8C0GUZ8GteZdbSHVZoTJRNg+jCqTHXxFis9pOXmmtAMMIbL/IW/qA/gUOcdv5XUh0orfrowtDPjGk38eupajtft7/NAKfCwHTAQJBAOY+tfTZPusuxwmNu567zC52wVRUeBPmEzlimjeppuIanrweFg6rYLE5pbWL047pGQZLtzhbvW8++ckaxqX9HysCQQDAsAKn/QZHTGRLWOc0vNiYe+JFp6dB7TVFpYl686jl3rIXNhZkWCO5qpPjPm1A4JQoPwFpI2qZcRtnY0qqPFVpAkEA12e6EY0hqSOFQLHh4tptZtbhfkTcZjlsqNZP012b7JLdCL/ZAPZiqst09YkQbvYy3En/6vEhJC+1vuiXCnnqKwJBALip9mG4hEPgWl47nZlVQt8gGwJWYl00UFGnC9LhoYRroJHOLDeOoO5XI9QtB9edY2AOwfNZFdhoJbM33V6448ECQQCan094QO/29S4mEEJY3+GDaOCX+t3YR/ycw8EUrIvVAOScOhs7OthWtu4EfYpuMmtJTlpNETWQWK65CaVhJZj3","阿里支付PKCS8密钥（JAVA用）RSA2"),
    ALIPAY_PUBLIC_KEY("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB","阿里支付公钥")
}