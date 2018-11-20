package lottery.pay.alipay.request

/**
 * 支付宝退款
 *必须的参数其实只有两个:商户订单号（out_trade_no）和支付宝交易号（trade_no）
 * 二 选一即可、另一个必须请求参数是：退款金额（refund_amount）
 * out_request_no是部分退款是需要
 *  @param out_trade_no 订单支付时传入的商户订单号,不能和支付宝交易号（trade_no）同时为空。
 * @param trade_no 支付宝交易号
 * @param refund_amount 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
 */
data class AlipayRefundRequest(
        var out_request_no: String? = null,
        var out_trade_no: String? = null,
        var refund_amount: String? = null,
        var refund_reason: String? = null,
        var trade_no: String? = null,

        // APPID 即创建应用后生成
        var APPID:String="2017021705722526",
        // 私钥 pkcs8格式的
        var RSA_PRIVATE_KEY:String = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCcABH8UE5HPZUlcIYpNNNleJ1ErHXsmOM4QCngh1sFt6W94itervrUy3LeEPPx5kngx0HGU8ZOlSGvE0tcqqQpf2FU9iPRGZx3/r/F7E/O3FJAECYWwYiRSH6UAEyRva9eywAznEXNfi+UyVcukRtFs0D8+O+ljeXAYwO/sx9u9oCjXuN6CXh+ihzy1pL3DeY0eV60YJnyKX/wbbWm1SCIl4i5IwE27qrqiwmio18Y402N/Ipw1QTCfxm1kzMP+1k3QWP7vqVOZssXWouctAWC9ceHasM4ElF2A88bmS/0lhxyCDDd4DIVJMkbSibWD8jehnw2Fqo7nwBLoQVj0aXxAgMBAAECggEAISYKrFjMKWs2lBwTBhKJkRhOIteav0nFjqBjxag9eTuK5ox2tsnr1ufcYr+rdo1+yVrN6TzH+M7Lt44cB3bjJ0ZAAnPDLJ2KmBzz1zTdyJEckSxdS5yYTnbfHsfpfVaXO0dbpZvhYUcdCTq3YdfHucnbV2X2VnGOjpD7rPJ9DXDSxXoMH7KnJRV/7o2l5D8HlyX6RLc9mCs7mYNDrQmFjb2AhStcbE840LFOJKzMASvoHhziezNZPDyoekgGoJ395Xs2CkqqCuRdMU+yTXY5sKxl8FGjUZROmTZNhhtEWrrFNN+23vyQ/pZw+9ZCSr/wZHeiUD+oiX820tESkxMNoQKBgQDWWcXtQHS7dDJZPJgFri+UZLZPq8fByoGdMycvJfzFkVVoWbh43Cp87Nj+bJBp1OjMAGdxXuT12If0jjZRcGOp3QTHWtnzkodMKNgwufL0G2LL8fzcUpswnxPeHqbpPH3+Qred8uwOIeytG2kg9c3CmWY/Cbwp/kXansJXkMxxvQKBgQC6T9UnmySfx5njLrJbGfA6Pc9P/GZb+JSWgp5Db9/FapK2U/KJY9qfc6NJDTXDQ8Jzi4FOmXWeyTWGA6ds9C3dGUm++hL56ck21wlK3xFhR7JVKy8c2JqtcNJ6fAf1ppKyNdeVHGCQIWhHyE2XAjmoXOBJ+EsxIp/Er8a4Ct/WRQKBgQCMKWu5Ndqe8N4zZ+HoZPwLxsdH1YXrfGXAy0AmHmrpLZ1xfKmZri3CPoWt6IOOEIChVOpPQcPp1ksgaRWvrxQccL+9M/UsxnXeIR8szYrGgFncDkJQN1vvMTYmmlh+TuX8KtgyWjRtEVXX5AKcYN7JDtHDCrSVqQU4bXObGr306QKBgGmD5Pg1SRykcmbTf3dQzVhuwQZPr7jOo3hKKU+QAG9R2B0ile1xe9NqLkOlE5muumWt0GGvT4nJ8mIfl6aA86iQNc/O2QhoeuhwCHc6tiEd9cV+W4Q+t/saNlnf/LIG0HXVQG7WT2nRQbnFmwu22uibEPtTf2IodctysVxx7CrxAoGBAJC/UP+B7FziM4DRKTuUr9RC9RS4yU506pYKbxfVfMbmLwdG4S1wtzxLfgW2DqwS2BMSAdIihyHg4ckqqbhG+KIgC6FZ0wOjhsAM8BRaeXgJ4UKVtRaR6FfjsKk8X0I6KnefkBjtBO8tGA2vzMX37JIcAFQFdd9PixIKKUN/7llB",
        // 支付宝公钥
        var ALIPAY_PUBLIC_KEY:String = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgvXp1IQuT+M8hswmHDqf7IROb1WcU72ow/jD3T1erUBEn4m4gVJWiABQEABJJI/HzT1dZggR8Jy/8uRBHC/sU2NahIiVuCqucdT3imJK2YNUo7129S2Xwx2QAKLwG3EPJi9QDedZNeKQzPp1UNyhRbfiJRtSjvNhbOJwlg6IdeQBrE7UMB6D8sBPz2aeR5Dr/BJWo8uvpGLWNUD+R+kT9gkw0SaUShppKu2erNPsB9W32TFPsMdNzqAbVDV/7VwZM/E4a+YJ6NCIt+qihRlN76r7hgOYONUbAkAV2oX+DHIB1cLme9yjWaj1jzTxDmMEAaA7+4CqztPsRWjJ7uzYXQIDAQAB"

)