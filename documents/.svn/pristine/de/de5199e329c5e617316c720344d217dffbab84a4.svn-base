/**
 * !!重要：给html元素增加的操作属性，为了避免同原有的冲突，请尽量带上前缀。如：data-xxx
 */

var userInfo = userInfo || {};
var un32_vars = un32_vars || {};

var dictStatus = false;

/**
 * 处理数据字典的内容
 */
function handleDictName(jqObj) {
    $(jqObj || "[dictName]").each(function (i, _this) {
        var dictName = getDictName(_this);
        if ($(_this).is("input")) {
            $(_this).val(dictName);
        } else {
            $(_this).html(dictName);
        }
    });
}

/**
 *处理表格td 处理ajax显示价格的情况
 */
function decimal_ajax(jqObj) {
    $(jqObj || "[decimal_ajax]").each(function (i, _this) {
        var points = $(_this).attr("decimal_ajax") * 1;
        var value = "";
        if ($(_this).is("input")) {
            value = $(_this).val();
        } else {
            value = $(_this).text();
        }
        if (value == "" || value == 0) {
            return;
        }
        var content = ((value * 1) / 100).toFixed(points);
        if ($(_this).is("input")) {
            $(_this).val(content);
        } else {
            $(_this).text(content);
        }
    });
}

function handleDecimal(jqObj) {
    //处理表格td,span显示的价格
    $(jqObj || "[decimal]").each(function (i, _this) {
        var points = $(_this).attr("decimal") * 1;
        var value = "";
        if ($(_this).is("input")) {
            value = $(_this).val();
        } else {
            value = $(_this).html();
        }
        if (value == "" || value == 0) {
            return;
        }
        var content = ((value * 1) / 100).toFixed(points);
        if ($(_this).is("input")) {
            $(_this).val(content);
        } else {
            $(_this).html(content);
        }
    });
}

/**
 *处理表格td 处理ajax显示价格的情况
 */
function handle_money(jqObj) {
    $(jqObj || "input[money]").keyup(function () {
        var value = $(this).val().replace(/[^\d.]/g, "")
            .replace(/^\./g, "") //验证第一个字符是数字
            .replace(/\.{2,}/g, ".") //只保留第一个, 清除多余的
            .replace(".", "$#$").replace(/\./g, "").replace("$#$", ".")
            .replace(/^(\-)*(\d+)\.(\d\d).*$/, '$1$2.$3'); //只能输入两个小数

        var max = $(this).attr("money");
        if (max != undefined && max != "" && value * 1 > max) {
            value = value.substring(0, value.length - 1);
        }
        $(this).val(value);
    });
}

/**
 * 处理时区时间
 */
function handleTimezone(jqObj) {
    $(jqObj || '*[timeZone]').each(function () {
        var utc = !!$(this).attr('data') ? parseInt($(this).attr('data')) : 0;
        var timeFormat = !!$(this).attr('timeZone') ? $(this).attr('timeZone') : "yyyy-MM-dd hh:mm";
        // 从 userInfo 获取用户的时区
        var timeZone = (userInfo != undefined && userInfo.timezone) ? userInfo.timezone : 'Asia/Shanghai';
        var utcCurrent = getTimeZoneUtc(utc, timeZone);
        // 因为new Date 方法默认会加上本地时区，所以要减去本地时区偏移。
        var utcOffset = new Date().getTimezoneOffset() * 60 * 1000;
        if ($(this).is("input")) {
            if (utc == 0 || utc == "0") {
                $(this).val("");
            } else {
                $(this).val(new Date(utcCurrent + utcOffset).Format(timeFormat));
            }
        }
        else {
            if (utc == 0 || utc == "0") {
                $(this).text("");
            } else {
                $(this).text(new Date(utcCurrent + utcOffset).Format(timeFormat));
            }
        }
    });

    // TODO 统一timeZone, timeFormat
    // $(jqObj || '*[timeFormat]').each(function () {
    //     var utc = !!$(this).attr('data') ? parseInt($(this).attr('data')) : 0;
    //     var timeFormat = !!$(this).attr('timeFormat') ? $(this).attr('timeFormat') : "yyyy-MM-dd hh:mm";
    //     if ($(this).is("input")) {
    //         $(this).val(new Date(utc).Format(timeFormat));
    //     }
    //     else {
    //         $(this).text(new Date(utc).Format(timeFormat));
    //     }
    // })
}

/**
 *处理显示数据字典的情况
 */
function getDictName(_this) {
    var dictName = $(_this).attr("dictName");
    var id = $(_this).attr("data");
    var value = id;
    var lang = "";
    if (undefined == un32_vars || un32_vars == null) {
        lang = 'zh';
    } else {
        lang = un32_vars['lang'];
    }

    // 多语言支持
    var dict = {};
    if (lang == 'en')
        dict = Dicts_en;
    else if (lang == 'ja')
        dict = Dicts_ja;
    else if (lang == 'ko')
        dict = Dicts_ko;
    else
        dict = Dicts;

    // 多语言支持
    if (dict[dictName] != undefined && dict[dictName][id] != undefined) {
        value = dict[dictName][id];
    }


    return value;
}


jQuery.fn.extend({
    formatData: function () {
        var jqObj = this;
        if (!jqObj) return;
        if (jqObj.attr('dictName') !== undefined)
            handleDictName(jqObj);
        if (jqObj.attr('decimal_ajax') !== undefined)
            decimal_ajax(jqObj);
        if (jqObj.attr('money') !== undefined)
            handle_money(jqObj);
        if (jqObj.attr('timeZone') !== undefined)
            handleTimezone(jqObj);
        if (jqObj.attr('decimal') !== undefined)
            handleDecimal(jqObj);
    }
});


$(function () {
    // 检查金额的输入框
    handle_money();

    //表格行文字加粗
    $("tr[bold]").each(function (i, _this) {
        var cssStyle = {'font-weight': 'bold'};
        $(_this).css(cssStyle);
    });

    if (dictStatus === false) {
        //过长，显示省略号，并设置title
        $("[ellipsis]").each(function (i, _this) {
            var length = $(_this).attr("ellipsis");
            var content = $(_this).html();
            if (content.indexOf("..") >= 0) {
                return;
            }
            if (content == undefined) content = "";
            if (length == undefined || $.trim(length) == "" || isNaN(length) || parseInt(length) < 0) {
                length = 10;
            }
            content = $.trim(content);
            $(_this).attr("title", content);
            var remainLen = parseInt(length);

            $(_this).html(content.getShortForm(remainLen * 2));
        });

        //处理表格td,span显示的价格
        $("[decimal]").each(function (i, _this) {
            var points = $(_this).attr("decimal") * 1;
            var value = "";
            if ($(_this).is("input")) {
                value = $(_this).val();
            } else {
                value = $(_this).html();
            }
            if (value == "" || value == 0) {
                return;
            }
            var content = ((value * 1) / 100).toFixed(points);
            if ($(_this).is("input")) {
                $(_this).val(content);
            } else {
                $(_this).html(content);
            }
        });

        handleDictName();

        handleTimezone();
    }

    dictStatus = true;
});

/**
 * 牙位回显
 * @param toothArr    选中的牙齿
 * @param crownArr    连冠的牙齿
 * @constructor
 */
function ToothShow(toothArr, crownArr) {
    //所有牙位
    var tooth_all = ["18", "17", "16", "15", "14", "13", "12", "11", "21", "22", "23", "24", "25", "26", "27", "28", "48", "47", "46", "45", "44", "43", "42", "41", "31", "32", "33", "34", "35", "36", "37", "38"];
    //把其他的都变成hidden   [回填牙位]
    for (var i = 0; i < tooth_all.length; i++) {
        if (toothArr.indexOf(tooth_all[i]) < 0) {
            $("#tooth" + tooth_all[i]).find(".cls-7").css("visibility", "hidden");
        }
        //把其他的都变成hidden   [回填是否连冠]
        if (i < tooth_all.length - 1) {
            if (crownArr.indexOf(tooth_all[i + 1]) < 0 || crownArr.indexOf(tooth_all[i]) < 0) {
                $("#div-teeth-container").find("g[id='c" + generateId(tooth_all[i], tooth_all[i + 1]) + "']").css("visibility", "hidden");
                $("#div-teeth-container").find("g[id='c" + generateId(tooth_all[i], tooth_all[i + 1]) + "']").find(".cls-22").css("stroke", "rgb(193, 193, 193)");
            }
        }
    }

}

function generateId(num1, num2) {
    if (num1 < num2) {
        return (num2 + "") + (num1 + "");
    }
    return (num1 + "") + (num2 + "");
}


