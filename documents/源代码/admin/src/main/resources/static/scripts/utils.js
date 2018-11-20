/**
 * Created by DaiZQ on 2017/10/31.
 */
/**
 * Created by DaiZQ on 2017/2/20.
 */

// 數組方法

if (typeof Array.prototype.contains !== 'function') {
    Array.prototype.contains = function (needle) {
        for (i in this) {
            if (this[i] === needle) return true;
        }
        return false;
    };
}

if (typeof Array.prototype.indexOf !== 'function') {
    Array.prototype.indexOf = function (val) {
        for (var i = 0; i < this.length; i++) {
            if (this[i] == val) return i;
        }
        return -1;
    };
}

if (typeof Array.prototype.remove !== 'function') {
    Array.prototype.remove = function (val) {
        var index = this.indexOf(val);
        if (index > -1) {
            this.splice(index, 1);
        }
    };
}


if (typeof Array.prototype.arrayToJson !== 'function') {
    Array.prototype.arrayToJson = function () {
        return arrayToJson(this)
    };
}

// 关联数组 ->  JSON
function arrayToJson(array) {
    var obj = {};
    if (isArray(array)) {
        array.forEach(function (it) {
            for (var v in it) {
                obj[v] = it[v];
            }
        })
    }

    return obj;
}


if (typeof Date.prototype.Format !== 'function') {
    Date.prototype.Format = function (fmt) { //author: meizz
        var o = {
            "M+": this.getMonth() + 1, //月份
            "d+": this.getDate(), //日
            "h+": this.getHours(), //小时
            "m+": this.getMinutes(), //分
            "s+": this.getSeconds(), //秒
            "q+": Math.floor((this.getMonth() + 3) / 3), //季度
            "S": this.getMilliseconds() //毫秒
        };
        if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
        for (var k in o)
            if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
        return fmt;
    }
}


//  字符串方法
if (typeof String.prototype.startsWith !== 'function') {
    String.prototype.startsWith = function (prefix) {
        return this.slice(0, prefix.length) === prefix;
    };
}

if (typeof String.prototype.strlen !== 'function') {
    String.prototype.strlen = function () {
        var len = 0;
        for (var i = 0; i < this.length; i++) {
            if (this.charCodeAt(i) > 127 || this.charCodeAt(i) == 94) {
                len += 2;
            } else {
                len++;
            }
        }
        return len;
    }
}


if (typeof String.prototype.endsWith !== 'function') {
    String.prototype.endsWith = function (suffix) {
        return this.indexOf(suffix, this.length - suffix.length) !== -1;
    };
}

if (typeof String.prototype.replaceAll !== 'function') {
    String.prototype.replaceAll = function (s1, s2) {
        return this.replace(new RegExp(s1, "gm"), s2);
    }
}

if (typeof String.prototype.getParameter !== 'function') {
    String.prototype.getParameter = function (key) {
        var re = new RegExp(key + '=([^&]*)(?:&)?');
        return this.match(re) && this.match(re)[1];
    };
}


if (typeof String.prototype.isNullOrEmpty !== 'function') {
    String.prototype.isNullOrEmpty = function () {
        return this == null || this == '';
    };
}


if (typeof String.prototype.isNotNullOrEmpty !== 'function') {
    String.prototype.isNotNullOrEmpty = function () {
        return !this.isNullOrEmpty()
    };
}


if (typeof String.prototype.trim !== 'function') {
    String.prototype.trim = function () {
        return this.replace(/(^\s*)|(\s*$)/g, "");
    }
}


if (typeof String.prototype.isNullOrBlank !== 'function') {
    String.prototype.isNullOrBlank = function () {
        return this == null || this.trim().length == 0
    };
}

if (typeof String.prototype.toInt !== 'function') {
    String.prototype.toInt = function () {
        return intValue(this)
    };
}

if (typeof String.prototype.toFloat !== 'function') {
    String.prototype.toFloat = function () {
        return floatValue(this)
    };
}


function isArray(obj) {
    return Object.prototype.toString.call(obj) === '[object Array]';
}


function isJson(obj) {
    var isjson = typeof(obj) == "object" && Object.prototype.toString.call(obj).toLowerCase() == "[object object]" && !obj.length;
    return isjson;
}

// 将url 参数转为json 对象
function urlToJson(search) {
    return search ? JSON.parse('{"' + search.replace(/&/g, '","').replace(/=/g, '":"') + '"}', function (key, value) {
        return key === "" ? value : decodeURIComponent(value)
    }) : {}
}

// json to url String
function jsonToUrl(data) {

    if (!data) return "";

    return Object.keys(data).map(function (k) {
        return encodeURIComponent(k) + '=' + encodeURIComponent(data[k])
    }).join('&')
}

// 获取 request 变量
function getRequestString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return r[2];
    return null;
}


function getUrlParams() {
    var params = window.location.href.split('?').length > 0 ? window.location.href.split('?')[1] : "";
    return urlToJson(params);
}


// 根据条件获取订单
function replaceUrlParams(condition) {
    var origin = urlToJson(window.location.href.split('?')[1]);

    // 替换 原始url 内的参数
    if (isJson(condition))
        for (var v in condition) {
            origin[v] = condition[v]
        }

    return jsonToUrl(origin);
}


// JSON 成员任意一个为空即为 False
function anyNull(data) {
    if (!data) return true;

    for (var v in data) {
        if (!data[v]) return true;
    }

    return false;
}

//某个值是否为空
function isNotNull(val) {
    if (val == "" || val == undefined) {
        return true;
    } else {
        return false;
    }
}

//用户名检验
function isUserName(userName) {
    var userNameRegex = /^[a-zA-Z0-9@\-_\.]+$/;

    if (userName.length < 4) {
        return false
    }
    if (userNameRegex.test(userName)) {
        return true
    }
}

// art对话框调用
function artShow(msg, stopMills) {
    var localArt = art.dialog({title: "提示", content: msg});
    setTimeout(function () {
        localArt.close();
    }, stopMills ? stopMills : 3000);
}


// 通用校验方法

//验证邮箱
function isEmail(str) {
    var reg = /^[a-zA-Z0-9_-]+@([a-zA-Z0-9]+\.)+(com|cn|net|org)$/;
    return reg.test(str);
}

//验证手机号码
function isPhone(str) {
    var reg = /^1[3578][0-9]{9}$/;
    return reg.test(str);
}

//验证密码
function isPassword(str) {
    var reg = /^[a-zA-Z0-9_]{6,20}$/;
    //var reg = /^[a-zA-Z0-9_@#]{6,20}$/;
    return reg.test(str);
}

//身份证号码验证。
function isIdcard(str) {
    var reg = /^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$/;
    return reg.test(str);
}

//验证姓名格式。
function isName(str) {
    var reg = /^[\u4e00-\u9fa5]{2,}$/;
    return reg.test(str)
}

function isAge(str) {
    var reg = /^([0-9]|[0-9]{2}|100)$/;
    return reg.test(str)
}


// 固定电话
function isCall(str) {
    var reg = /^[0-9]{7,8}$/;
    return reg.test(str)
}

//数字
function isNumber(str) {
    var reg = /^[1-9]\d{2,}$/;
    return reg.test(str)
}

function isInt(str) {
    return !isNaN(str) ? (parseInt(str) < 2147483647) : false
}

function isPositiveInt(str) {
    return !isNaN(str) ? (parseInt(str) < 2147483647 && parseInt(str) >= 0) : false
}

function isPostCode(str) {
    var reg = /^[1-9][0-9]{5}$/;
    return reg.test(str)
}

// str -> int
function intValue(str) {
    return !isNaN(str) ? (parseInt(str) >= 2147483647 ? 0 : parseInt(str)) : 0
}

// str - > float
function floatValue(str) {
    return !isNaN(str) ? (parseFloat(str) >= 3.4028235E38 ? 0 : parseFloat(str)) : 0
}
