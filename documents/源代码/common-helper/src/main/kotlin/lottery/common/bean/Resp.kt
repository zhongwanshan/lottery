package lottery.common.bean

import com.fasterxml.jackson.annotation.JsonIgnore
import kotun.common.validation.ValidateResult
import lottery.common.utils.Beans


/**
 * 返回给客户端的Response数据的封装.
 */
class Resp(var head: Head, var body: Any? = emptyMap<String, String>()) {
    init {
        if (body == null) body = emptyMap<String, String>()
    }

    companion object Builder {
        /* 创建一个代表成功的 response。*/
        fun succ(): Resp = Resp(Head.success)

        /* 用指定的data创建response对象。 */
        fun succ(message: String, data: Any? = mutableMapOf<String, Any>()): Resp = Resp(Head.succ(message), data)

        fun succ(data: Any): Resp = Resp(Head.success, data)
        /* 创建一个代表失败的 response。 */
        fun fail(): Resp = Resp(Head.fail)

        /* 用指定的data创建一个response对象 */
        fun fail(message: String, data: Any? = mutableMapOf<String, Any>()): Resp = Resp(Head.fail(message), data)

        fun fail(data: Any): Resp {
            if (data is ValidateResult) {
                val message = StringBuilder()
                data.errorMsg.forEach { err -> message.append(err.value) }
                return fail(message = message.toString())
            }
            return Resp(Head.fail, data)
        }

        /**
         * 将JSON格式的 Resp 转化为对象
         * 因为 Resp 的 data 为未知类型，所以不能直接从 ObjectMapper直接转
         * @param json json字符串
         */
        fun from(json: String, bodyType: Class<*> = Map::class.java): Resp? {
            val map = Beans.bean(json, Map::class.java) ?: return null
            val header = map["head"] ?: return null
            val body = map["body"] ?: return null

            if (header !is Map<*, *>) return null
            if (body !is Map<*, *>) return null

            val status = header["status"] ?: return null
            val message = header["message"] ?: return null
            if (status !is Int) return null
            if (message !is String) return null

            val head = Head(status.toInt(), message)
            if (bodyType == Map::class.java)
                return Resp(head, body)

            val data = Beans.fromMap(bodyType, body)
            return Resp(head, data)
        }
    }

    @JsonIgnore
    val failed = this.head.status == Head.FAIL_CODE
    @JsonIgnore val success = this.head.status == Head.SUCC_CODE
}

/**
 * HTTP响应消息的消息头。
 */
data class Head(
        var status: Int,
        var message: String = "") {
    constructor() : this(status = FAIL_CODE, message = "")

    companion object Builder {
        /* 成功的状态码 */
        const val SUCC_CODE = 0
        /* 失败的状态码 */
        const val FAIL_CODE = 1

        /* 默认的成功 head */
        val success = Head(SUCC_CODE)
        /* 默认的失败的 head */
        val fail = Head(FAIL_CODE)

        fun succ(message: String): Head = Head(SUCC_CODE, message)

        fun fail(message: String): Head = Head(FAIL_CODE, message)
    }
}
