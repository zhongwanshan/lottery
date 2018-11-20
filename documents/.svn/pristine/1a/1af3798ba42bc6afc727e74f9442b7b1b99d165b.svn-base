package lottery.pay.alipay.config
object AlipayConfig {
    //支付宝网关（固定）
    var URL = "https://openapi.alipay.com/gateway.do"
   // 编码
    var CHARSET = "UTF-8"
    // json（固定）
    var FORMAT = "json"
    // 日志记录目录
    var log_path = "/log"
    // RSA2
    var SIGNTYPE = "RSA2"
    var PRIVATE_KEY="MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAK1NVfhPKsd8UwtAMDY+9v/3uI4yLIvg00W487p9nJPKAE8Dzc4vUSQGNTj3HOONzNLpEd0Ifk7EUJdR9EPyjGIkZpCLGMSkmrYyjZcK14ARM21rKDwWQJf00mVkYivBYH+dxhjpJRNJ2NBoOAc/yKZruTX7c1kgZ1uukgr8Pw+jAgMBAAECgYATFODSZmUfceDy7C5iyqwHow7/GScuf6LDmom7jvkejK9cA981RKB6hvR1QUA9De/viRoebED8C0GUZ8GteZdbSHVZoTJRNg+jCqTHXxFis9pOXmmtAMMIbL/IW/qA/gUOcdv5XUh0orfrowtDPjGk38eupajtft7/NAKfCwHTAQJBAOY+tfTZPusuxwmNu567zC52wVRUeBPmEzlimjeppuIanrweFg6rYLE5pbWL047pGQZLtzhbvW8++ckaxqX9HysCQQDAsAKn/QZHTGRLWOc0vNiYe+JFp6dB7TVFpYl686jl3rIXNhZkWCO5qpPjPm1A4JQoPwFpI2qZcRtnY0qqPFVpAkEA12e6EY0hqSOFQLHh4tptZtbhfkTcZjlsqNZP012b7JLdCL/ZAPZiqst09YkQbvYy3En/6vEhJC+1vuiXCnnqKwJBALip9mG4hEPgWl47nZlVQt8gGwJWYl00UFGnC9LhoYRroJHOLDeOoO5XI9QtB9edY2AOwfNZFdhoJbM33V6448ECQQCan094QO/29S4mEEJY3+GDaOCX+t3YR/ycw8EUrIvVAOScOhs7OthWtu4EfYpuMmtJTlpNETWQWK65CaVhJZj3"
    var APPID="2016072201653224"
    var ALIPAY_PUBLIC_KEY="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB"
}
//支付宝支付类型
enum class AlipayProductCode(val v:String,val mean:String){
    WAPPAY("QUICK_WAP_WAY","wap支付"),
    APPPAY("QUICK_MSECURITY_PAY","app支付"),
    PCPAY("FAST_INSTANT_TRADE_PAY","PC支付(含扫描支付)")

}
//支付宝密钥：https://docs.open.alipay.com/291/105971
