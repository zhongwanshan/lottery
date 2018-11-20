/**
 * Created by Odds on 2017/12/4.
 */

var multiLanguage = function (fun) {
    var lang = un32_vars.lang;
    if (lang != 'zh' && lang != 'en' && lang != 'ja' && lang != 'ko')
        lang = 'en';
    jQuery.i18n.properties({
        name: 'messages', // 资源文件名称
        path: '/scripts/i18n/', // 资源文件路径
        language: lang,// 对应的语言
        mode: 'map', // 用 Map 的方式使用资源文件中的值
        callback: function () {
            return fun() //加载成功后设置显示内容
        }
    });
}
