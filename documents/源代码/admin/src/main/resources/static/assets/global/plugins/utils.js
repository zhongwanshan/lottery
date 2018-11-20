/**
 * Fast UUID generator, RFC4122 version 4 compliant.
 * @author Jeff Ward (jcward.com).
 * @license MIT license
 * @link http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/21963136#21963136
 **/
var UUID = (function () {
    var instance = {};
    var lut = [];
    for (var i = 0; i < 256; i++) {
        lut[i] = (i < 16 ? '0' : '') + (i).toString(16);
    }
    instance.generate = function () {
        var d0 = Math.random() * 0xffffffff | 0;
        var d1 = Math.random() * 0xffffffff | 0;
        var d2 = Math.random() * 0xffffffff | 0;
        var d3 = Math.random() * 0xffffffff | 0;
        return lut[d0 & 0xff] + lut[d0 >> 8 & 0xff] + lut[d0 >> 16 & 0xff] + lut[d0 >> 24 & 0xff] + '-' +
            lut[d1 & 0xff] + lut[d1 >> 8 & 0xff] + '-' + lut[d1 >> 16 & 0x0f | 0x40] + lut[d1 >> 24 & 0xff] + '-' +
            lut[d2 & 0x3f | 0x80] + lut[d2 >> 8 & 0xff] + '-' + lut[d2 >> 16 & 0xff] + lut[d2 >> 24 & 0xff] +
            lut[d3 & 0xff] + lut[d3 >> 8 & 0xff] + lut[d3 >> 16 & 0xff] + lut[d3 >> 24 & 0xff];
    };
    return instance;
})();

/**
 * 初始化牙位信息
 * @type {Function}
 */
var InitTeeth = (function () {
    var instance = {};
    /** 初始化牙位信息*/
    instance.init = function (teethBeanList, addedFlag) {
        var allTeethList = [];

        // 根据批次分组
        var map = {};
        for (var i = 0; i < teethBeanList.length; i++) {
            var teeth = teethBeanList[i];
            var dest = map[teeth.batchId];
            if (!dest) {
                dest = [];
                dest.push(teeth.toothPosition);
            } else {
                dest.push(teeth.toothPosition);
            }
            map[teeth.batchId] = dest;
        }

        // 显示处理
        $.each(teethBeanList, function (_, item) {
            var teeth = item.toothPosition;

            if (allTeethList.contains(teeth)) {
                return;
            }
            var teethBatch = map[item.batchId];
            var color = teethBatch ? ToothColor.generate(teethBatch) : ToothColor.generate(teeth);

            var cssStroke = "rgb(240, 130, 0)";
            var cssStrokeWidth = ["2px", "10", "20"];

            // 设置单冠样式
            $("#link_point_" + teeth).css("stroke", cssStroke).css("stroke-width", cssStrokeWidth[1]).css("fill", "#5d5a5a");
            if (addedFlag != undefined && addedFlag) {
                // 下单页面
                ToothController.addedToSelectedCart(teeth, color);
            } else {
                // 订单详情显示
                $("#tooth_" + teeth).css("stroke", "#ffffff").css("stroke-width", cssStrokeWidth[0]).css("fill", color);
                $("#tooth_" + teeth).find("path").attr("fill", color).removeAttr("stroke");
            }

            // 设置连冠样式
            if (item.connectedCrown == 1) {
                // 排序 - 倒序
                var list = item.jointCrowns.sort(function (a, b) {
                    return (a * 1 < b * 1) ? 1 : -1;
                });

                var showList = [];
                // 将牙位两两分组
                for (var i = 0; i < list.length; i++) {
                    // 记录已经处理的牙位
                    allTeethList.push(teeth);
                    var maxTeeth = list[i].trim() * 1;
                    for (var j = 0; j < list.length; j++) {
                        var minTeeth = list[j].trim() * 1;
                        var link_line = maxTeeth + "_" + minTeeth;
                        if (!showList.contains(link_line)) {
                            // 没有就追加到显示列表
                            showList.push(link_line);
                        }
                    }
                }

                // 显示
                $.each(showList, function (idx, link_line) {
                    var link = $("#link_line_" + link_line);
                    link.css("stroke", cssStroke).css("stroke-width", cssStrokeWidth[2]).css("fill", color);
                    $("#link_point_" + teeth).css("stroke", cssStroke).css("stroke-width", cssStrokeWidth[1]).css("fill", color);
                });
            }
        });
    };

    return instance
})();


/**
 * 牙齿颜色生成器(单例)
 */
var ToothColor = (function () {
    var instance = {};
    /**
     * 选中的牙齿颜色
     * @type {[*]}
     */
    /*var TOOTH_COLORS = [
     "#ff0066", "#599699", "#999900", "#ACFF4C",
     "#B94000", "#ff9900", "#cc0066", "#C3228F",
     "#009966", "#747C04", "#D3CD07", "#99ff99",
     "#ccee33", "#00ccff", "#0099ff", "#6633cc",
     "#6666ff", "#006699", "#00ffff", "#333399",
     "#9900cc", "#cc99cc", "#ffccff", "#990066",
     "#ff33cc", "#ff00ff", "#9C64FA", "#ffcc00",
     "#cc6600", "#cccc66", "#ff6666", "#996666",
     "#D19C03", "#66ff00", "#99cc00", "#ff6600",
     "#ff9999", "#CB0A0A", "#ED1C7E", "#F948A1",
     "#336600", "#C452C6", "#44ADFF", "#00C300",
     "#0071E1", "#3FFEA1", "#008E00", "#00CDC1",
     "#54FFF4", "#ff0000", "#4743FE", "#8282F6",
     "#912FF4"
     ];*/

    var TOOTH_COLORS = [
        // 红色系
        "#F47983", //桃红
        "#AFDD22", //柳绿
        "#FFA631", //杏黄
        "#177CB0", //靛青
        "#815476", //酱紫
        "#ED5736", //妃色
        "#FFF143", //鹅黄
        "#827100", //棕绿
        "#0EB83A", //葱青
        "#3EEDE7", //碧蓝
        "#8D4BBB", //紫色
        "#F00056", //品红
        "#FF8936", //橘黄
        "#789262", //竹青
        "#1BD1A5", //碧色,
        "#4B5CC4", //宝蓝
        "#801DAE", //青莲
        "#DC3023", //酡红
        "#2E4E7E", //藏青
        "#FFC773", //姜黄
        "#A29B7C", //苍青
        "#9D2933", //胭脂
        "#00E079", //青翠,
        "#3B2E7E", //藏蓝
        "#C89B40", //昏黄
        "#CA6924", //琥珀
        "#057748", //松花绿
        "#9ED048", //豆绿
        "#44CEF6", //蓝
        "#725E82", //乌色
        "#FF0097", //洋红
        "#F2BE45", //赤金
        "#549688", //铜绿
        "#3B2E7E", //藏蓝
        "#725E82", //乌色
        "#426666" //黛绿
    ];

    instance.generate = function (toothIds) {
        var n = 1;
        var ids = [];
        if ($.isArray(toothIds)) ids = toothIds;
        else ids.push(toothIds);

        $.each(ids, function (index, t) {
            n *= t;
        });
        var str = ids.join(",");
        return TOOTH_COLORS[(Math.abs(n * $.md5(str).hashCode())) % 31];
    };

    return instance;
})();


/**
 * hash code of string
 * @return {number}
 */
String.prototype.hashCode = function () {
    var hash = 0, i, chr;
    if (this.length === 0) return hash;
    for (i = 0; i < this.length; i++) {
        chr = this.charCodeAt(i);
        hash = ((hash << 5) - hash) + chr;
        hash |= 0; // Convert to 32bit integer
    }
    return hash;
};

// 设置调试器是否打开
var DEBUGGER_ENABLED = false;

/**
 * 调试器。多例
 */
Debugger = function (owner) {
    this.owner = owner;
    this.enabled = DEBUGGER_ENABLED && true;

    /**
     * 打印购物车待选区所有的牙位
     */
    this.dumpTemporaryCartTeeth = function (prefix) {
        var _self = this;
        if (_self.enabled) {
            console.info("--------- TEMPORARY CARD TOOTH DUMP -------------");
            console.info("DEBUGGER >>> " + prefix + " >>> ");
            $.each(_self.owner.getTemporaryCartTeeth(), function (index, toothOpt) {
                var msg = toothOpt.toString();
                console.info(msg);
            });
        }
    };
    /**
     * 打印购物车待选区所有的产品
     */
    this.dumpTemporaryCartGoods = function (prefix) {
        var _self = this;
        if (_self.enabled) {
            console.info("--------- TEMPORARY CARD GOODS DUMP -------------");
            console.info("DEBUGGER >>> " + prefix + " >>> ");
            $.each(_self.owner.getTemporaryCartGoods(), function (index, goods) {
                var msg = goods.name;
                console.info(msg);
            });
        }
    };
    /**
     * 打印已选商品
     */
    this.dumpSelectedGoodsCart = function (prefix) {
        var _self = this;
        if (_self.enabled) {
            console.info("--------- SELECTED CARD ITEM DUMP -------------");
            console.info("DEBUGGER >>> " + prefix + " >>> ");
            $.each(_self.owner.getSelectedItems(), function (batchId, batchItems) {
                console.info("Batch ID:" + batchId);
                $.each(batchItems, function (i, item) {
                    console.info("Item " + i + ":" + item.toString());
                });
            });
        }
    };
};