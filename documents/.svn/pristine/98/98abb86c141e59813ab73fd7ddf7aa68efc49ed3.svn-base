/**
 * Created by DaiZQ on 2017/11/1.
 */


function getTimeZoneUtc(utc, timeZoneKey) {
    var utcStr = "";
    for (var ctz in timeZone) {
        // if (timeZoneKey == timeZone[ctz]['tz']) {
        //     utcStr = timeZone[ctz]['ot'];
        //     break;
        // }
        timeZone[ctz].forEach(function (it) {
            if (it['id'] == timeZoneKey) {
                utcStr = it['offset'];
            }
        });

        if (utcStr)break;
    }

    if (!utcStr || utcStr.toUpperCase() == 'UTC')return utc;

    var minus = utcStr.startsWith('-') ? -1 : 1;
    var hour = minus * Math.abs(parseInt(utcStr.split(':')[0]));
    var minute = minus * Math.abs(parseInt(utcStr.split(':')[1]));

    return utc + (hour * 60 * 60 * 1000 + minute * 60 * 1000)
}

// 将utc值转成用户当前的时区时间
function utc2Time(utc) {
    // 从 userInfo 获取用户的时区
    var timeZone = (userInfo && userInfo.timezone) ? userInfo.timezone : 'Asia/Shanghai';
    var utcCurrent = getTimeZoneUtc(utc, timeZone);
    // 因为new Date 方法默认会加上本地时区，所以要减去本地时区偏移。
    var utcOffset = new Date().getTimezoneOffset() * 60 * 1000;

    return new Date(utcCurrent + utcOffset).Format("yyyy-MM-dd hh:mm");
}

// 将日期转为UTC+0000 的utc值
function timeToUtc(date) {
    // 从 userInfo 获取用户的时区
    var timeZone = (userInfo && userInfo.timezone) ? userInfo.timezone : 'Asia/Shanghai';
    var timeZoneUtc = 'Antarctica/Troll'; // UTC +0000

    var y = date.getUTCFullYear();
    var m = date.getUTCMonth();
    var d = date.getUTCDate();
    var h = date.getUTCHours();
    var M = date.getUTCMinutes();
    var s = date.getUTCSeconds();

    var utc = Date.UTC(y, m, d, h, M, s);

    return utc + (getTimeZoneUtc(utc, timeZoneUtc) - getTimeZoneUtc(utc, timeZone));
}

//获取所有国家
function getAllCountry() {
    var counts = [];
    for (var i in country) {
        if (i < country.length) {
            var item = country[i];
            var id = item["id"];
            var name = item["name"];
            var abbr1 = item["abbr1"];
            var abbr2 = item["abbr2"];
            counts.push(item);
        }
    }
    return counts;
}

//通过国家id获取其下的时区
function getTimeZoneByCountryId(countryId) {
    if (countryId == "" || countryId == undefined)return "";
    var timezones = timeZone[countryId];
    return timezones;
}

//显示国家 时区 并且联动
/**
 *
 * @param country_      name选择器国家
 * @param timezone_     name选择器时区
 * @param isOnlyShowCountry 是否只显示国家
 */
function showCountryAndTimeZone(country_, timezone_, isOnlyShowCountry) {
    //显示国家
    var countrys = getAllCountry();
    for (var item in countrys) {
        if (item < countrys.length) {
            $("select[name='" + country_ + "']").append("<option value='" + countrys[item]["id"] + "' cid=" + countrys[item]["id"] + " abbr1=" + countrys[item]["abbr1"] + " abbr2=" + countrys[item]["abbr2"] + "'>" + countrys[item]["name"] + "</option>");
        }
    }
    if (!isOnlyShowCountry) {
        //选择国家后触发出二级 时区
        $("select[name='" + country_ + "']").change(function () {
            var countryId = $(this).find("option:selected").attr("cid");

            var op = $("select[name='" + timezone_ + "'] option")
            for (var i = 0; i < op.length; i++) {
                if (i != 0)
                    op.eq(i).remove()
            }

            if (countryId == undefined) {
                //  $("select[name='" + timezone_ + "']").append("<option>选择时区</option>");
            } else {
                var timezones = getTimeZoneByCountryId(countryId);
                for (var item in timezones) {
                    if (item < timezones.length) {
                        $("select[name='" + timezone_ + "']").append("<option value='" + timezones[item]["id"] + "' id='" + timezones[item]["id"] + "'>(" + timezones[item]["offset"] + ")+" + timezones[item]["id"] + "</option>");
                    }
                }
            }


            /*针对bootstrap-select 做的动态添加， 上面只针对原生*/
            var optionString = "";
            for (var item in timezones) {
                if (item < timezones.length) {
                    optionString += "<option value=\'" + timezones[item]["id"] + "\'>" + timezones[item]["id"] + "</option>";
                }
            }

            $(".Account_select select[name='" + timezone_ + "']").html(optionString);
            $(".Account_select  select[name='" + timezone_ + "']").selectpicker('refresh');
        });
    }

}
