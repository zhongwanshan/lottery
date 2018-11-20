// dependencies: pcd.js, jquery.js
// pcd.js 中定义的省市区数组，都是预先按照id排序好的，因此可以通过下标的方式访问
// 如 province_id=1，可以通过 pcd[province_id-1]获取到省份
//    city_id=3, 可以通过 pcd[province_id-1].cities[city_id-1] 获取到城市
//    district_id=4, 可以通过 pcd[province_id-1].cities[city_id-1].districts[district_id-1]获取到地区
var pcdutil = {
    //内置模板
    __tpl: {
        citySelect: '<div id="city-select"></div>',
        country: '<div class="country"> ' +
        '<input type="hidden" name="area" value="1"> ' +
        '<input type="hidden" name="foreignCountry" value=""> ' +
        '<input type="hidden" name="province" value=""> ' +
        '<input type="hidden" name="city" value=""> ' +
        '<input type="hidden" name="district" value=""> ' +
        '<input type="hidden" name="street" value=""> ' +
        '<a class="country-title"><span>中国大陆</span><div class="icon-pull-down"></div></a>' +
        '<div class="country-content"><ul> ' +
        '<li><a value="">请选择</a></li> ' +
        '<li><a class="selected" value="1">中国大陆</a></li> ' +
        '<li><a value="2">台湾</a></li> ' +
        '<li><a value="3">海外其他</a></li> ' +
        '</ul></div> ' +
        '</div>',
        ssq_select: '<div class="ssq-select"></div>',
        cityTitle: '<a class="city-title"><span>请选择省市区</span><div class="icon-pull-down"></div></a>',
        citiesOverlay: '<div class="cities-overlay"></div>',
        citySelectTab: '<div class="city-select-tab"> ' +
        '<a class="current" attr-cont="city-province">省份</a> ' +
        '<a attr-cont="city-city">城市</a> ' +
        '<a attr-cont="city-district">县区</a> ' +
        '<a attr-cont="city-street">街道</a> ' +
        '</div>',
        twCitySelectTab: '<div class="city-select-tab"> ' +
        '<a class="tw-dist current" attr-cont="city-city">城市</a> ' +
        '<a class="tw-dist" attr-cont="city-district">县区</a> ' +
        '</div>',
        citySelectContent: '<div class="city-select-content"></div>',
        countrySelectContent: '<div class="city-select-content-2"></div>',
        citySelectProvince: '<dl class="city-select-city city-province"></dl>',
        citySelectCity: '<dl class="city-select-city city-city"></dl>',
        citySelectDistrict: '<dl class="city-select-city city-district"></dl>',
        citySelectStreet: '<dl class="city-select-city city-street"></dl>',
        cityData: '<a value="%value%" href="javascript:;">%text%</a>',
        countryDL: '<dl class="city-select-box"></dl>',
        countryData: '<dd><a value="%value%" href="javascript:;">%text%</a></dd>',
        cityDd: '<dd></dd>'

    },
    /**
     * 判断一个字符串是否为空
     * @param str
     */
    isNullOrEmpty: function (str) {
        if (str == null || str == undefined || str == "undefined" || str.length == 0)
            return false;
        return true
    },
    /**
     * 创建并显示一个省市区选择框
     * @param params JSON对象，可选参数：
     *  - container - 该省市区的父元素id
     *  - country - 国家的值
     *  - province - 省份的值
     *  - city - 城市的值
     *  - street - 街道的值
     *  - district - 地区的值
     *  - area - 地区类型
     */
    show: function (params) {
        $("#distpicker").html("");
        var _tpl = pcdutil.__tpl;
        var citySelect = $(_tpl.citySelect),
            ssq_select = $(_tpl.ssq_select),
            citiesOverlay = $(_tpl.citiesOverlay),
            citySelectContent = $(_tpl.citySelectContent),
            countrySelectContent = $(_tpl.countrySelectContent),
            cityTitle = $(_tpl.cityTitle),
            citySelectProvince = $(_tpl.citySelectProvince),
            citySelectCity = $(_tpl.citySelectCity),
            citySelectDistrict = $(_tpl.citySelectDistrict),
            citySelectStreet = $(_tpl.citySelectStreet),
            cityDdProvince = $(_tpl.cityDd),
            cityDdCity = $(_tpl.cityDd),
            cityDdDistrict = $(_tpl.cityDd),
            cityDdStreet = $(_tpl.cityDd);
        // 添加默认选项
        citySelect.append(_tpl.country);
        ssq_select.append(cityTitle);
        var cityTitleText = cityTitle.find('span');
        /*
         *  初始化中国大陆地区
         * */
        if (params.area == 0 || params.area == 1 || params.area == undefined) {
            citiesOverlay.append(_tpl.citySelectTab);
            // 根据参数中的 province,city,district,street初始化元素
            var idstr;
            if (pcdutil.isNullOrEmpty(params.street)) idstr = params.street;
            else if (pcdutil.isNullOrEmpty(params.district)) idstr = params.district + "_0";
            else if (pcdutil.isNullOrEmpty(params.city)) idstr = params.city + "_0_0";
            else if (pcdutil.isNullOrEmpty(params.province)) idstr = params.province + "_0_0_0";
            else idstr = "0_0_0_0";
            var ids = idstr.split("_");
            var pid = ids[0], cid = ids[1], did = ids[2], sid = ids[3];
            // 初始化省份
            $.each(pcd, function (index, _data) {
                var p = $(_tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                citySelectProvince.append(cityDdProvince.append(p));
                if (index + 1 == pid) {
                    cityTitleText.html(_data.name);
                }
            });
            // 初始化城市
            if (cid != "0") {
                var cities = pcd[pid - 1].cities;
                $.each(cities, function (index, _data) {
                    var p = $(_tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                    citySelectCity.append(cityDdCity.append(p));
                    if (index + 1 == cid) {
                        var f = '<span style="color:#cfcfcf;margin: 0 3px;">/</span>';
                        cityTitleText.html(cityTitleText.html() + f + _data.name);
                    }
                });
                // 初始化地区
                if (did != "0") {
                    var districts = pcd[pid - 1].cities[cid - 1].districts;
                    $.each(districts, function (index, _data) {
                        var p = $(_tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                        citySelectDistrict.append(cityDdDistrict.append(p));
                        if (index + 1 == did) {
                            var f = '<span style="color:#cfcfcf;margin: 0 3px;">/</span>';
                            cityTitleText.html(cityTitleText.html() + f + _data.name);
                        }
                    });
                    // 初始化街道
                    if (sid != "0") {
                        var streets = pcd[pid - 1].cities[cid - 1].districts[did - 1].streets;
                        $.each(streets, function (index, _data) {
                            var p = $(_tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                            citySelectStreet.append(cityDdStreet.append(p));
                            if (index + 1 == sid) {
                                var f = '<span style="color:#cfcfcf;margin: 0 3px;">/</span>';
                                cityTitleText.html(cityTitleText.html() + f + _data.name);
                            }
                        });
                    }
                }
            }
            //添加到容器
            if (params.container != null) {
                var c = $(params.container);
                citySelectContent.append(citySelectProvince).append(citySelectCity).append(citySelectDistrict).append(citySelectStreet);
                citiesOverlay.append(citySelectContent);
                ssq_select.append(citiesOverlay);
                citySelect.append(ssq_select);
                c.append(citySelect);
                if (pid != 0)
                    $("#city-select .city-select-content .city-province a").eq(pid - 1).addClass("current");
                if (cid != 0)
                    $("#city-select .city-select-content .city-city a").eq(cid - 1).addClass("current");
                if (did != 0)
                    $("#city-select .city-select-content .city-district a").eq(did - 1).addClass("current");
                if (sid != 0)
                    $("#city-select .city-select-content .city-street a").eq(sid - 1).addClass("current");
            }
            var inputData = $("#city-select .country");
            if (pcdutil.isNullOrEmpty(params.province)) inputData.find("input[name='province']").attr("value", params.province);
            if (pcdutil.isNullOrEmpty(params.city)) inputData.find("input[name='city']").attr("value", params.city);
            if (pcdutil.isNullOrEmpty(params.district)) inputData.find("input[name='district']").attr("value", params.district);
            if (pcdutil.isNullOrEmpty(params.street)) inputData.find("input[name='street']").attr("value", params.street);
            /*
             * 初始化中国台湾省
             * */
        } else if (params.area == 2) {
            citiesOverlay.append(_tpl.twCitySelectTab);
            var idstr2;
            if (pcdutil.isNullOrEmpty(params.district)) idstr2 = params.district;
            else if (pcdutil.isNullOrEmpty(params.city)) idstr2 = params.city + "_0";
            else idstr2 = "0_0";
            var ids2 = idstr2.split("_");
            var cid2 = ids2[0], did2 = ids2[1];
            var tw1 = $(pcdutil.__tpl.cityDd);
            $.each(twData, function (index, _data) {
                var a = $(pcdutil.__tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                citySelectCity.append(tw1.append(a))
                if (index + 1 == cid2) {
                    cityTitleText.html(_data.name);
                }
            });
            if (did2 != 0) {
                var tw2 = $(pcdutil.__tpl.cityDd);
                $.each(twData[cid2 - 1].districts, function (index, _data) {
                    var a = $(pcdutil.__tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                    citySelectDistrict.append(tw2.append(a));
                    if (index + 1 == did2) {
                        var f = '<span style="color:#cfcfcf;margin: 0 3px;">/</span>';
                        cityTitleText.html(cityTitleText.html() + f + _data.name);
                    }
                })
            }
            //添加到容器
            if (params.container != null) {
                var c = $(params.container);
                citySelectContent.append(citySelectCity).append(citySelectDistrict);
                citiesOverlay.append(citySelectContent);
                ssq_select.append(citiesOverlay);
                citySelect.append(ssq_select);
                c.append(citySelect);
                var ccc = $("#city-select .country-content a[value='2']");
                ccc.addClass("selected").parent().siblings().find("a").removeClass("selected");
                $("#city-select .country-title span").html(ccc.html());
                if (cid2 != 0)
                    $("#city-select .city-select-content .city-city a").eq(cid2 - 1).addClass("current");
                if (did2 != 0)
                    $("#city-select .city-select-content .city-district a").eq(did2 - 1).addClass("current");
            }
            var inputData1 = $("#city-select .country");
            inputData1.find("input[name='area']").attr("value", params.area);
            if (pcdutil.isNullOrEmpty(params.city)) inputData1.find("input[name='city']").attr("value", params.city);
            if (pcdutil.isNullOrEmpty(params.district)) inputData1.find("input[name='district']").attr("value", params.district);
            /*
             * 初始化海外地区
             * */
        } else if (params.area == 3) {
            citiesOverlay.append(countrySelectContent);
            var idstr3;
            if (pcdutil.isNullOrEmpty(params.foreignCountry)) idstr3 = params.foreignCountry;
            else idstr3 = "0";
            var dl = $(pcdutil.__tpl.countryDL);

            $.each(countryData, function (index, _data) {
                var a = $(pcdutil.__tpl.countryData.replace("%value%", _data.id).replace("%text%", _data.name));
                countrySelectContent.append(dl.append(a));
                if (index + 1 == idstr3) {
                    cityTitleText.html(_data.name);
                }
            });
            //添加到容器
            if (params.container != null) {
                var c = $(params.container);
                citiesOverlay.append(countrySelectContent);
                ssq_select.append(citiesOverlay);
                citySelect.append(ssq_select);
                c.append(citySelect);
                var c3 = $("#city-select .country-content a[value='3']");
                c3.addClass("selected").parent().siblings().find("a").removeClass("selected");
                $("#city-select .country-title span").html(c3.html());
                if (idstr3 != 0)
                    $("#city-select .city-select-content-2 .city-select-box a[value='" + idstr3 + "']").addClass("selected");
            }
            var inputData2 = $("#city-select .country");
            inputData2.find("input[name='area']").attr("value", params.area);
            console.log(params.foreignCountry);
            if (pcdutil.isNullOrEmpty(params.foreignCountry)) inputData2.find("input[name='foreignCountry']").attr("value", params.foreignCountry);
        }
        this.init();
    },

    init: function () {
        $("#city-select").on("click", ".country .country-content a", function (e) {
            $(this).addClass("selected").parent().siblings().find("a").removeClass("selected");
            $("#city-select .country-title span").html($(this).html());
            $("#city-select .country-title").siblings("input[name='area']").val($(this).attr("value")).siblings("input[type='hidden']").attr("value", "");
            $("#city-select .country").removeClass("open");
            var v = $(this).attr("value");
            if (v == "" || v == undefined) {
                $("#city-select .ssq-select").hide();
                $("#city-select .country input[type='hidden']").attr("value", "");
            } else if (v == 1) {
                var content1 = $("#city-select .cities-overlay");
                var csc1 = $(pcdutil.__tpl.citySelectContent);
                content1.html("");
                content1.append(pcdutil.__tpl.citySelectTab);
                content1.append(csc1);
                csc1.append(pcdutil.__tpl.citySelectProvince + pcdutil.__tpl.citySelectCity + pcdutil.__tpl.citySelectDistrict + pcdutil.__tpl.citySelectStreet);
                $("#city-select .ssq-select").show();
                $("#city-select .city-province").html("");
                $("#city-select .city-city").html("");
                $("#city-select .city-district").html("");
                $("#city-select .city-street").html("");
                $("#city-select .city-title span").html("请选择省市区");
                var d = $(pcdutil.__tpl.cityDd);
                $.each(pcd, function (index, _data) {
                    var a = $(pcdutil.__tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                    $(".city-province").append(d.append(a))
                })
            } else if (v == 2) {
                var content2 = $("#city-select .cities-overlay");
                var csc2 = $(pcdutil.__tpl.citySelectContent);
                content2.html("");
                content2.append(pcdutil.__tpl.twCitySelectTab);
                content2.append(csc2);
                csc2.append(pcdutil.__tpl.citySelectCity + pcdutil.__tpl.citySelectDistrict);
                $("#city-select .ssq-select").show();
                var tab2 = $("#city-select .city-select-tab");
                tab2.html("");
                tab2.append($(pcdutil.__tpl.twCitySelectTab).html());
                var con2 = $("#city-select .city-select-content");
                con2.html("");
                con2.html(pcdutil.__tpl.citySelectCity + pcdutil.__tpl.citySelectDistrict);
                $(".city-city").html("");
                $(".city-district").html("");
                $(".city-title span").html("请选择城市");
                var tw = $(pcdutil.__tpl.cityDd);
                $.each(twData, function (index, _data) {
                    var a = $(pcdutil.__tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                    $(".city-city").append(tw.append(a))
                })
            } else if (v == 3) {
                var content = $("#city-select .cities-overlay");
                var co = $(pcdutil.__tpl.countrySelectContent);
                var dl = $(pcdutil.__tpl.countryDL);
                content.html("");
                content.append(co.append(dl))
                $("#city-select .ssq-select").show();
                $(".city-title span").html("请选择");
                $.each(countryData, function (index, _data) {
                    var p = $(pcdutil.__tpl.countryData.replace("%value%", _data.id).replace("%text%", _data.name));
                    dl.append(p);
                });
            }
            e.stopPropagation()
        });
        $("#city-select").on("click", ".country-title", function (e) {
            var c = $(this).parent();
            if (c.hasClass("open")) {
                c.removeClass("open")
            } else {
                c.addClass("open")
            }
            var t = $("#city-select .ssq-select .cities-overlay");
            if (t.hasClass("open")) {
                t.removeClass("open")
            }
            e.stopPropagation()
        });

        /*点击选择省市区打开下拉框*/
        $("#city-select").on("click", ".city-title", function (e) {
            var t = $(this).siblings(".cities-overlay");
            if (!t.hasClass("open")) {
                t.addClass("open")
            }
            var p = $("#city-select .country-title").parent();
            if (p.hasClass("open")) {
                p.removeClass("open")
            }
            e.stopPropagation()
        });

        /*点击省市区街道导航栏*/
        $("#city-select").on("click", ".city-select-tab a", function (e) {
            $(this).addClass("current").siblings().removeClass("current")
            var a = $(this).attr("attr-cont");
            var b = $(this).parent().siblings(".city-select-content");
            b.find("." + a).show().siblings().hide();
            e.stopPropagation()
        });
        /*选择省市区街*/
        $("#city-select").on("click", ".city-select-content a", function () {
            var s = $("#city-select .ssq-select .city-select-content .city-select-city");
            var num = s.index($(this).parent().parent());
            var t = $("#city-select .ssq-select .city-title span");
            var text = $(this).html()
            var str = '<span style="color:#cfcfcf;margin: 0 3px;">/</span>';
            var value = $(this).attr("value").split("_");
            var inputValue = $(this).attr("value");
            var type = $(this).parent().parent();
            //清除数据
            for (var i = num + 1; i < s.length; i++) {
                s.eq(i).html("");
            }
            var dd = $(pcdutil.__tpl.cityDd);
            var cc = $("#city-select .country");
            $(this).addClass("current").siblings().removeClass("current");
            /*创建联动*/
            var select = cc.find("input[name='area']").attr("value");
            if (select == 1) {
                if (type.hasClass("city-province")) {
                    var city = pcd[value[0] - 1].cities;
                    $.each(city, function (index, _data) {
                        var p = $(pcdutil.__tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                        s.eq(num + 1).append(dd.append(p));
                    });
                    t.html(text);
                    $(".city-select-tab a[attr-cont='city-city']").addClass("current").siblings().removeClass("current");
                    s.hide().eq(num + 1).show();
                    cc.find("input[name='province']").attr("value", inputValue).siblings("input[name='city']").attr("value", "").siblings("input[name='district']").attr("value", "").siblings("input[name='street']").attr("value", "");
                } else if (type.hasClass("city-city")) {
                    var province1 = s.eq(num - 1).find(".current").attr("value");
                    var provinceName1 = s.eq(num - 1).find(".current").html();
                    var district = pcd[province1 - 1].cities[value[1] - 1].districts;

                    $.each(district, function (index, _data) {
                        var p = $(pcdutil.__tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                        s.eq(num + 1).append(dd.append(p));
                    });
                    t.html("")
                    t.html(provinceName1 + str + text);
                    $(".city-select-tab a[attr-cont='city-district']").addClass("current").siblings().removeClass("current");
                    s.hide().eq(num + 1).show()
                    cc.find("input[name='city']").attr("value", inputValue).siblings("input[name='district']").attr("value", "").siblings("input[name='street']").attr("value", "");
                } else if (type.hasClass("city-district")) {
                    var province2 = s.eq(num - 2).find(".current").attr("value");
                    var city2 = s.eq(num - 1).find(".current").attr("value").split("_");
                    var streets = pcd[province2 - 1].cities[city2[1] - 1].districts[value[2] - 1].streets;
                    $.each(streets, function (index, _data) {
                        var p = $(pcdutil.__tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                        s.eq(num + 1).append(dd.append(p));
                    });
                    var provinceName2 = s.eq(num - 2).find(".current").html();
                    var cityName2 = s.eq(num - 1).find(".current").html();
                    t.html(provinceName2 + str + cityName2 + str + text);
                    $(".city-select-tab a[attr-cont='city-street']").addClass("current").siblings().removeClass("current");
                    s.hide().eq(num + 1).show()
                    cc.find("input[name='district']").attr("value", inputValue).siblings("input[name='street']").attr("value", "");
                } else if (type.hasClass("city-street")) {
                    var provinceName3 = s.eq(num - 3).find(".current").html();
                    var cityName3 = s.eq(num - 2).find(".current").html();
                    var districtName3 = s.eq(num - 1).find(".current").html();
                    t.html(provinceName3 + str + cityName3 + str + districtName3 + str + text);
                    cc.find("input[name='street']").attr("value", inputValue);
                    $("#city-select .ssq-select .cities-overlay").removeClass("open");//选择完毕，收起下拉框
                }
            } else if (select == 2) {
                if (type.hasClass("city-city")) {
                    var twcity = twData[value[0] - 1].districts;
                    $.each(twcity, function (index, _data) {
                        var p = $(pcdutil.__tpl.cityData.replace("%value%", _data.id).replace("%text%", _data.name));
                        s.eq(num + 1).append(dd.append(p));
                    });
                    t.html(text);
                    $(".city-select-tab a[attr-cont='city-district']").addClass("current").siblings().removeClass("current");
                    s.hide().eq(num + 1).show();
                    cc.find("input[name='city']").attr("value", inputValue).siblings("input[name='district']").attr("value", "")
                } else if (type.hasClass("city-district")) {
                    var twcityName3 = s.eq(num - 1).find(".current").html();
                    t.html(twcityName3 + str + text);
                    cc.find("input[name='district']").attr("value", inputValue);
                    $("#city-select .ssq-select .cities-overlay").removeClass("open");//选择完毕，收起下拉框
                }
            }
        });
        /*
         * 海外国家列表
         * */
        $("#city-select").on("click", ".city-select-content-2 a", function () {
            var t = $("#city-select .ssq-select .city-title span");
            var input = $("#city-select .country");
            var v = $(this).html();
            $(this).addClass("selected").parent().siblings().find("a").removeClass("selected");
            t.html(v);
            input.find("input[name='foreignCountry']").attr("value", $(this).attr("value"));
        });
        $("#city-select").on("click", ".city-select-content", function (e) {
            e.stopPropagation()
        });
        $("#city-select").on("click", ".city-select-tab", function (e) {
            e.stopPropagation()
        });
        /*点击下拉框外部时隐藏下拉框*/
        $(document).on("click", function () {
            if ($("#city-select .country").hasClass("open")) {
                $("#city-select .country").removeClass("open")
            }
            if ($("#city-select .ssq-select .cities-overlay").hasClass("open")) {
                $("#city-select .ssq-select .cities-overlay").removeClass("open")
            }
        })
    },

    getName: function (option) {
        var p_index = -1, c_index = -1, d_index = -1, s_index = -1;
        if (option.area == "1") {
            if (option.streets != null) {
                var arr = option.streets.split("_");
                p_index = arr[0];
                c_index = arr[1];
                d_index = arr[2];
                s_index = arr[3];
            } else if (option.district != null) {
                var arr = option.district.split("_");
                p_index = arr[0];
                c_index = arr[1];
                d_index = arr[2];
            } else if (option.city != null) {
                var arr2 = option.city.split("_");
                p_index = arr2[0];
                c_index = arr2[1];
            } else if (option.province != null) {
                p_index = option.province;
            } else {
                return "";
            }

            var sep = option.separator == undefined ? "" : option.separator;

            if (p_index <= 0) return "";

            var p = pcd[p_index - 1];
            if (c_index <= 0) return p.name;
            var c = p.cities[c_index - 1];
            if (d_index <= 0) {
                return p.name + sep + c.name;
            }
            var d = c.districts[d_index - 1];
            if (s_index <= 0) {
                return p.name + sep + c.name + sep + d.name;
            }
            var s = d.streets[s_index - 1];
            return p.name + sep + c.name + sep + d.name + s.name;
        } else if (option.area == "2") {
            if (option.district != null) {
                var arr = option.district.split("_");
                c_index = arr[0];
                d_index = arr[1];
            } else if (option.city != null) {
                c_index = option.city;
            } else {
                return "";
            }
            var c = twData[c_index - 1];

            var sep = option.separator == undefined ? "" : option.separator;

            if (d_index <= 0) {
                return c.name;
            }
            var d = c.districts[d_index - 1];
            return c.name + sep + d.name;
        } else if (option.area == "3") {
            return countryData[option.foreignId - 1].name;
        }

    },


    getNameByID: function (option, id) {
        var _val = ""
        var p_index = -1, c_index = -1, d_index = -1, s_index = -1;
        if (option.area == "1") {
            if (option.streets != null) {
                var arr = option.streets.split("_");
                p_index = arr[0];
                c_index = arr[1];
                d_index = arr[2];
                s_index = arr[3];
            } else if (option.district != null) {
                var arr = option.district.split("_");
                p_index = arr[0];
                c_index = arr[1];
                d_index = arr[2];
            } else if (option.city != null) {
                var arr2 = option.city.split("_");
                p_index = arr2[0];
                c_index = arr2[1];
            } else if (option.province != null) {
                p_index = option.province;
            } else {
                return "";
            }

            var sep = option.separator == undefined ? "" : option.separator;

            if (p_index <= 0) return "";

            var p = pcd[p_index - 1];
            if (c_index <= 0) return p.name;
            var c = p.cities[c_index - 1];
            if (d_index <= 0) {
                return c.name;
            }
            var d = c.districts[d_index - 1];
            if (s_index <= 0) {
                return d.name;
            }
            var s = d.streets[s_index - 1];
            return s.name;
        } else if (option.area == "2") {
            if (option.district != null) {
                var arr = option.district.split("_");
                c_index = arr[0];
                d_index = arr[1];
            } else if (option.city != null) {
                c_index = option.city;
            } else {
                return "";
            }
            var c = twData[c_index - 1];

            var sep = option.separator == undefined ? "" : option.separator;

            if (d_index <= 0) {
                return c.name;
            }
            var d = c.districts[d_index - 1];
            switch (id) {
                case("city"):
                    _val = c.name;
                    break;
                case("district"):
                    _val = d.name;
                    break;
                default:

            }
            return _val
        } else if (option.area == "3") {
            return countryData[option.foreignId - 1].name;
        }

    }
};
