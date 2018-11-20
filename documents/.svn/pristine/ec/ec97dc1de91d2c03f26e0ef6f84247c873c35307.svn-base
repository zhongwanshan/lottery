/**
 * Created by denghh on 2018/3/1.
 */

/* 从cookie中获取用户信息*/

var userInfo = {};
// $.cookie.raw = true;    //解决cookie拿出来后乱码问题
// var cookie = $.cookie('un32.user');
// var u = Base64.decode(cookie);

$.cookie.raw = true;
eval(" userInfo = " + (!!$.cookie('quickfix.user') ? Base64.decode($.cookie('quickfix.user')) : "{}"));

