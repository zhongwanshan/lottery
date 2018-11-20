var MediaTypes = {
    "json": "application/json;charset=UTF-8",
    "multipart": "multipart/form-data",
    "form": "application/x-www-form-urlencoded; charset=UTF-8",
    "html": "text/html;charset=UTF-8"
};
/**
 * API的基础URL
 * @type {string}
 */
API_BASE_URL = "/service/";

/*
 * 用JQ封装将会导致一系类的标签内部API 无法执行，尤其call方法不好代替
 * 先用原型方法，优化性能 ，new Api的调用方式保留
 */
/**
 * API列表
 * @type {{}}
 */
var Apis = {
    uploader_signature: new Api("获取文件上传签名", "uploader/signature", "GET"),
    uploader_signatureurl: new Api("获取文件URL签名", "uploader/signatureurl", "GET"),
    upload_token: new Api("获取文件URL签名", "uploader/uploadtoken", "GET"),

    message_list: new Api("获取用户消息", "messages/all", "POST", "json"),

    message_del: new Api("获取用户消息", "messages/del", "POST", "json"),

    message_read: new Api("获取用户消息", "messages/read", "POST", "json")
}

/**
 * API定义
 * @param name - API的名字
 * @param uri - API的相对路径
 * @param method - API所支持的方法
 * @param contentType - 媒体类型
 * @constructor
 */
function Api(name, uri, method, contentType) {
    this.name = name;
    this.uri = uri;
    this.method = method ? method : "GET";
    this.contentType = MediaTypes[contentType] || MediaTypes["form"];
}

/**
 * 服务器返回的response的状态码
 * @type {{success: number, fail: number}}
 */
Api.prototype.respCode = {
    success: 0,
    fail: 1
};
/**
 * 获取完整的URL
 * @param values 该接口需要的参数，格式：{name:value}
 * @returns {string} 完整的URL
 */
Api.prototype.url = function (values) {
    var _url = API_BASE_URL + this.uri;
    if (values == null) return _url;
    var params = [];
    $.each(values, function (key, val) {
        params.push(key + "=" + val)
    });
    params.push("ran=" + Math.random());
    return _url + "?" + params.join("&")
};

/**
 * 默认的失败处理函数
 * @param resp
 * @private
 */
Api.prototype._fail = function (resp) {
    var msg = resp.head.message
    console.log(msg);
};


/**
 * 默认的成功处理函数
 * @param resp
 * @private
 */
Api.prototype._success = function (resp) {
    var msg = resp.head.message
    console.log(msg);
};


/**
 * 调用API
 * @param options 调用接口时的参数，javascript对象。格式：
 * {
     *  data: 传递给API的参数,字符串或者对象
     *  success: func - 调用接口成功之后的回调
     *  error: func - 处所之后的回调
     * }
 *
 */
Api.prototype.call = function (options) {
    var data = options.data;
    var method = this.method;
    var self = this;

    if (method == "GET") {
        $.ajax({
            url: this.url(data),
            type: method,
            cache: false,
            success: function (resp, status, xhr) {
                if (options.success)
                    options.success(resp, status, xhr);
            },
            error: function (xhr, status, error) {
                if (options.error)
                    options.error(xhr, status, error);
            }
        });
    } else if (method == "POST") {
        $.ajax({
            url: this.url(),
            data: data,
            cache: false,
            type: method,
            processData: this.contentType != "multipart/form-data",
            contentType: this.contentType == "multipart/form-data" ? false : this.contentType,
            success: function (resp, status, xhr) {
                if (options.success)
                    options.success(resp, status, xhr);
            },
            error: function (xhr, status, error) {

                if (xhr.status === 401) {
                    $.alert("没有相应的权限");
                }

                if (options.error)
                    options.error(xhr, status, error);
            }
        });
    } else {
        /* alert("Unsupported method type:" + method);*/
        $.alert("Unsupported method type:" + method);
    }
}

/**
 * HashCode
 * @param s
 * @return {*}
 */
hashCode = function (s) {
    return s.split("").reduce(function (a, b) {
        a = ((a << 5) - a) + b.charCodeAt(0);
        return a & a
    }, 0);
};