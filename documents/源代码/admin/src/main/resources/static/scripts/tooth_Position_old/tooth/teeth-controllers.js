/**
 * 牙位控制器
 */
var ToothController = (function () {
    var instance = {};

    /**
     * define the function for get the specified tooth.
     * @param id - 牙位ID，例如：11表示左上第一颗牙，23表示右上第三颗牙
     * 牙齿的 id 定义如下：
     * ┌┈┈┈┈┈┈┈┈┈┈┈左上┈┈┈┈┈┈┈┈┈┈┬┈┈┈┈┈┈┈┈┈┈右上┈┈┈┈┈┈┈┈┈┈┐
     * |18 17 16 15 14 13 12 11 ┆ 21 22 23 24 25 26 27 28┆
     * ├┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┤
     * ┆48 47 46 45 44 43 42 41 ┆ 31 32 33 34 35 36 37 38┆
     * └┈┈┈┈┈┈┈┈┈┈┈左下┈┈┈┈┈┈┈┈┈┈┴┈┈┈┈┈┈┈┈┈┈右下┈┈┈┈┈┈┈┈┈┈┘
     */
    var teeth = {};

    /**
     * 事件监听器
     * @type {Array}
     */
    var eventListeners = [];

    // init teeth
    $.each(TEETH_SVG.find("#permanent-teeth").children(), function (i, t) {
        var toothDom = $(t);
        var id = Number(toothDom.attr("id").split("_").pop());
        // add custom attribute and function to tooth object
        var tooth = $.extend(new Tooth(id, ToothStatus.deselected), toothDom);

        // bind click event
        tooth.click(function () {
            // 如果牙齿当前为 未选中 状态，则设置为选中状态
            if (tooth.status.value == ToothStatus.deselected.value) {
                ShoppingCart.addToothToTemporaryCart(tooth);
                $(this).find("path").css("stroke", "rgb(240, 130, 0)")
                // tooth.onSelected();
            }
            // 如果牙齿当前为 选中 状态，则设置为未选中状态
            else if (tooth.status.value == ToothStatus.selected.value) {
                ShoppingCart.removeToothFromTemporaryCart(tooth);
                $(this).find("path").css("stroke", "rgb(93, 90, 90)")
                // tooth.onUnselected();
            }
        });
        // put each tooth into view object
        teeth[id] = tooth;
    });

    /**
     * 根据id获取一颗牙
     * @param id - 正确的牙齿id。参考 this.teeth 中的注释。
     * @return 牙位图 SVG 中的对应牙齿的 jQuery 对象。
     */
    instance.get = function (id) {
        return teeth[id];
    };

    /**
     * 从已选购物车移除指定的牙位信息
     * 设置牙位状态为未选 deselected
     */
    instance.removedFromSelectedCart = function (toothId) {
        // 牙齿被加入到购物车
        var _this = this;
        var tooth = _this.get(toothId);

        tooth.onRemovedFromSelectedCart();
    };

    /**
     * 在已选购物车中追加牙位信息
     * 设置牙位状态为完成 finished, 并设置颜色信息
     */
    instance.addedToSelectedCart = function (toothId, color) {
        // 牙齿被加入到购物车
        var _this = this;
        var tooth = _this.get(toothId);
        tooth.onAddedToSelectedCart(color);
    };

    /**
     * 添加事件监听器
     * @param listeners
     */
    instance.addListener = function (listeners) {
        if ($.isArray(listeners)) {
            $.each(listeners, function (index, listener) {
                eventListeners.push(listener);
            });
        } else {
            eventListeners.push(listeners);
        }
    };

    /**
     * 触发被监听对象的事件
     * @param eventCode
     * @param data
     */
    instance.onListenedEventsFired = function (eventCode, data) {
        // 牙齿被加入待选区
        if (eventCode == ShoppingCartEvent.addToothToTemporaryCart.code) {
            var tooth = data["tooth"];
            tooth.onSelected();
        }
        // 牙齿被从待选区移除
        else if (eventCode == ShoppingCartEvent.removeToothFromTemporaryCart.code) {
            var tooth = data["tooth"];
            tooth.onUnselected();
        }
        // 牙齿被加入到购物车
        else if (eventCode == ShoppingCartEvent.addGoodsToSelectedCart.code) {
            var teethIds = data["toothIds"];
            var color = ToothColor.generate(teethIds);
            var _this = this;
            $.each(teethIds, function (index, toothId) {
                var tooth = _this.get(toothId);
                tooth.onAddedToSelectedCart(color);
            });
        }
        // 牙齿被从购物车移除
        else if (eventCode == ShoppingCartEvent.removeGoodsFromSelectedCart.code) {
            var teethIds = data["toothIds"];
            var _this = this;
            $.each(teethIds, function (index, toothId) {
                var tooth = _this.get(toothId);
                tooth.onRemovedFromSelectedCart();
            });
        }
    };

    return instance;
})();