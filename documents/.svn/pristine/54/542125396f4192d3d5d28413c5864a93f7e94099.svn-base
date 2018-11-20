// 牙齿布局
var TOOTH_LAYOUT = {
    "UPPER": [18, 17, 16, 15, 14, 13, 12, 11, 21, 22, 23, 24, 25, 26, 27, 28],
    "LOWER": [38, 37, 36, 35, 34, 33, 32, 31, 41, 42, 43, 44, 45, 46, 47, 48],
    /**
     * 获取指定牙齿的相邻牙齿，并返回这些相邻的牙齿id
     * @param toothId
     */
    getAdjoiningTeeth: function (toothId) {
        var _self = this;
        var intId = Number(toothId);
        var teeth;
        if (intId < 30) {
            teeth = _self.UPPER;
        } else {
            teeth = _self.LOWER;
        }
        var index = $.inArray(intId, teeth);
        if (index < 0 || index > teeth.length) return [];
        // 左侧第一个
        if (index == 0) return [teeth[index + 1]];
        // 最后一个
        else if (index == teeth.length - 1) return [teeth[index - 1]];
        // 中间任意一个
        else return [teeth[index - 1], teeth[index + 1]];
    },
    /**
     * 检查2颗牙齿是否是邻居
     * @param toothId1
     * @param toothId2
     */
    isNeighbor: function (toothId1, toothId2) {
        var neighbors = this.getAdjoiningTeeth(toothId1);
        return $.inArray(toothId2, neighbors) != -1;
    }
};

/**
 * 购物车事件
 */
var ShoppingCartEvent = {
    clearCart: {
        value: 0,
        code: "shopping-cart:clearCart"
    },
    addToothToTemporaryCart: {
        value: 1,
        code: "shopping-cart:addToothToTemporaryCart"
    },
    addGoodsToTemporaryCart: {
        value: 1,
        code: "shopping-cart:addGoodsToTemporaryCart"
    },
    removeToothFromTemporaryCart: {
        value: 2,
        code: "shopping-cart:removeToothFromTemporaryCart"
    },
    removeGoodsFromTemporaryCart: {
        value: 2,
        code: "shopping-cart:removeGoodsFromTemporaryCart"
    },
    addGoodsToSelectedCart: {
        value: 3,
        code: "shopping-cart:addGoodsToSelectedCart"
    },
    removeGoodsFromSelectedCart: {
        value: 4,
        code: "shopping-cart:removeGoodsFromSelectedCart"
    }
};

/**
 * 牙齿状态，对应状态的样式和触发状态的事件代码
 */
var ToothStatus = {
    // 牙齿未选中状态(默认状态)
    deselected: {
        // 状态的值
        value: 0,
        // 触发该状态所对应的事件代码
        eventCode: "tooth:deselected",
        // 该状态下牙齿的样式
        style: {"stroke": "#5d5a5a", "stroke-width": 3, "fill": "#ffffff"},

        toString: function () {
            return "deselected(0)";
        }
    },
    // 牙齿选中状态
    selected: {
        value: 1,
        eventCode: "tooth:selected",
        style: {"stroke": "#f08200", "stroke-width": 2, "fill": "#ffffff"},
        toString: function () {
            return "selected(1)";
        }
    },
    // 牙齿选择完成状态(商品选择完成)
    finished: {
        value: 2,
        eventCode: "tooth:finished",
        style: {"stroke": "#f08200", "stroke-width": 2, "fill": "#ffaabb"},
        toString: function () {
            return "finished(2)";
        }
    }
};
/**
 * 连接点状态
 */
var LinkLineStatus = {
    "linked": {
        "value": 1,
        "eventCode": "link-point:link",
        "style": {"stroke": "#f08200", "stroke-width": "17", "fill": "#f08200"}
    },
    "unlinked": {
        "value": 0,
        "eventCode": "link-point:unlink",
        "style": {"stroke": "#e5e5e5", "stroke-width": "17", "fill": "#f0f0f0"}
    },
    // 初始状态：初始显示牙位图的时候，连接线不显示出来，
    // 只有当相邻的两颗牙被加入到购物车之后，才显示这两颗牙所对应的连接线
    "hidden": {
        "value": -1,
        "eventCode": "link-point:hidden",
        "style": {"stroke": "#ffffff", "stroke-width": "17", "fill": "#ffffff"}
    }
};

var LinkPointStatus = {
    "show": {
        "value": 1,
        "style": {"stroke": "#f08200", "stroke-width": "10", "fill": "#ffffff"}
    },
    "hidden": {
        "value": 0,
        "style": {"stroke": "#ffffff", "stroke-width": "0", "fill": "#ffffff"}
    }
};
