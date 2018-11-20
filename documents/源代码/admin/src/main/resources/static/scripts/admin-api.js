/*
 * 用JQ封装将会导致一系类的标签内部API 无法执行，尤其call方法不好代替
 * 先用原型方法，优化性能 ，new Api的调用方式保留
 * 主体在common-static/api/api-prototype.js
 */
/**
 * API列表
 * @type {{}}
 */
var adminApis = {

    user_login_submit: new Api("用户登录","login","POST","json")
};



/**
 * 检查表单域
 */
function checkNotNull(value) {
    if (value == undefined || value == null || value.trim() == "") {
        return false;
    }
    return true;
}