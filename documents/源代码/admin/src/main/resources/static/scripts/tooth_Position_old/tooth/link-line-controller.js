/**
 * 连接线控制器，封装连接线的一些操作
 */
var LinkLineController = (function () {
    var instance = {};
    /**
     * 每颗牙的连接点
     * key:牙位ID，value:连接点对象
     * @type {{}}
     */
    var linkPoints = {};
    /**
     * 连接线。
     */
    var linkLines = [];

    /**
     * 事件监听器
     * @type {Array}
     */
    var eventListeners = [];

    // init link points
    $.each(TEETH_SVG.find("#teeth-link-points").children(), function (index, p) {
        var pointDom = $(p);
        var id = Number(pointDom.attr("id").split("_").pop());
        // 增加扩展属性
        var point = $.extend(new LinkPoint(id, LinkLineStatus.unlinked), pointDom);
        // 添加到视图
        linkPoints[id] = point;
    });

    // init link lines
    $.each(TEETH_SVG.find("#teeth-link-lines").children(), function (index, l) {
        var lineDom = $(l);
        var id = lineDom.attr("id");
        var prefix = "link_line_";
        var pointsId = id.substring(id.indexOf(prefix) + prefix.length, id.length).split("_");
        var linkedPoints = [];
        $.each(pointsId, function (index, pid) {
            var p = linkPoints[pid];
            // TODO check null
            linkedPoints.push(p);
        });

        var line = $.extend(new LinkLine(id, LinkLineStatus.hidden, linkedPoints, true), lineDom);
        // 业务类型
        var serviceType = $("#serviceType").val();
        /*if (serviceType == "Dental" || serviceType == "DentalDesign") {*/ // 义齿加工、义齿设计下单页面
        // 绑定鼠标事件
        line.click(function (e) {
            line.toggleLinkStatus(e);
            // 通知监听者
            var teethIds = [];
            $.each(line.linkedPoints, function (index, p) {
                teethIds.push(p.toothId);
            });
            _fireListenerEvents(line.status.eventCode, {
                "teeth": teethIds
            });
        });
        linkLines.push(line);
        /*}*/
    });

    /**
     * 根据牙位获取与该牙位相关的连接线
     * @param toothId
     * @return Array ：连接了该牙位的一条（在边缘的时候）或两条连接线
     */
    var get = function (toothId) {
        var result = [];
        $.each(linkLines, function (index, line) {
            var points = [];
            $.each(line.linkedPoints, function (index, point) {
                points.push(point.toothId);
            });
            if ($.inArray(Number(toothId), points) != -1) {
                result.push(line);
            }
        });
        return result;
    };

    /**
     * 从已选购物车移除指定的连接线信息
     */
    instance.removedFromSelectedCart = function (toothId) {
        var _this = this;
        var data = {"toothIds": [toothId]};

        _this.onListenedEventsFired(ShoppingCartEvent.removeGoodsFromSelectedCart.code, data)
    };

    /**
     * 在已选购物车中追加连接线信息
     */
    instance.addedToSelectedCart = function (toothId) {
        var _this = this;
        var data = {"toothIds": [toothId]};

        _this.onListenedEventsFired(ShoppingCartEvent.addGoodsToSelectedCart.code, data)
    };

    /**
     * 触发监听该对象的listener进行对应的事件处理
     * @param event
     * @param data
     * @private
     */
    var _fireListenerEvents = function (event, data) {
        /*console.debug("LinkLineController._fireListenerEvents:" + event);*/
        // fire the listener
        $.each(eventListeners, function (i, listener) {
            listener.onListenedEventsFired(event, data);
        });
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
     * 响应所监听的事件源触发的事件
     *
     */
    instance.onListenedEventsFired = function (event, data) {
        /* console.debug("LinkLineController.onListenedEventsFired:" + event);*/

        if (event == ShoppingCartEvent.addToothToTemporaryCart.code) {
            var tooth = data["tooth"];
            var toothId = Number(tooth.toothId);
            // 显示该牙位的连接点
            linkPoints[toothId].showPoint();

            // 则检查购物车待选区是否有相邻的牙齿,如果有则显示这些牙齿的链接线
            var adjoinToothIds = ShoppingCart.getAdjoiningTeethFromTemporaryCart(tooth);
            if (adjoinToothIds.length > 0) {
                adjoinToothIds.push(toothId);

                // 显示这些牙位对应的连接线
                $.each(linkLines, function (index, line) {
                    var point1 = Number(line.linkedPoints[0].toothId), point2 = Number(line.linkedPoints[1].toothId);
                    if ($.inArray(point1, adjoinToothIds) >= 0 &&
                        $.inArray(point2, adjoinToothIds) >= 0) {
                        line.onShow();
                    }
                });
            }
        }
        // 如果有牙齿被从购物车待选区移除，则检查是否该取消连冠
        else if (event == ShoppingCartEvent.removeToothFromTemporaryCart.code) {
            var tooth = data["tooth"];
            var toothId = Number(tooth.toothId);
            linkPoints[toothId].hidePoint();

            var lines = get(tooth.toothId);
            $.each(lines, function (index, line) {
                line.onHidden();
            });
        }
        // 如果牙齿被加入到了已选择商品列表，则不让再修改连冠（将连接线的 readonly 设置为true）
        else if (event == ShoppingCartEvent.addGoodsToSelectedCart.code) {
            $.each(data["toothIds"], function (index, toothId) {
                var lines = get(toothId);
                $.each(lines, function (index, line) {
                    line.makeEditable(false);
                    // 如果连接线不是已经enabled的，就把他隐藏
                    if (line.status.value != LinkLineStatus.linked.value) {
                        line.onHidden();
                    }
                });
            });
        }
        // 如果牙齿从已选择商品列表中移除，则允许修改连冠（将连接线的 readonly 设置为 false）
        else if (event == ShoppingCartEvent.removeGoodsFromSelectedCart.code) {
            var toothIds = data["toothIds"];
            $.each(toothIds, function (index, toothId) {
                var lines = get(toothId);
                $.each(lines, function (index, line) {
                    line.onHidden();
                    line.makeEditable(true);
                    // 隐藏每条连接线中，每颗牙对应的那个连接点
                    $.each(line.linkedPoints, function (index, point) {
                        if ($.inArray(point.toothId, toothIds) != -1) {
                            point.hidePoint();
                        }
                    });
                });
            });
        }
    };

    return instance;
})();