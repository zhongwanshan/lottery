/**
 * 购物车
 */
var ShoppingCart = (function () {
    var instance = {};

    var logger = new Debugger(instance);
    /**
     * 事件监听
     * @type {Array}
     * @private
     */
    var eventListeners = [];
    /**
     * 购物车的临时存放区域,存放的是正在选购的商品信息。
     * 内容数据格式：{"teeth":[OrderToothOption],"goods":[GoodsBean]}
     */
    var temporaryGoodsCart = {
        "teeth": [],
        "goods": []
    };

    /**
     * 购物车的已选商品存放区域。
     * 内容数据格式：{batchId:[OrderItem]}
     * 其中： batchId 为批次ID。同一次选择的所有牙齿，算同一批次
     */
    var selectedGoodsCart = {};

    /**
     * 将给定的2颗牙齿取消连冠（当直接点击两颗牙的连接线的时候调用）。
     * @param toothIds : Array or Int
     */
    var disconnectTeeth = function (toothId1, toothId2) {
        var toothIds = [toothId1, toothId2];
        // 获取要取消的两颗牙的 toothOption 对象
        var toothOpts = getToothOptionFromTemporaryCart(toothIds);
        // 处理意外
        if (toothOpts.length == 0) {
            return;
        }
        // 获取先前设置的连冠牙位
        var previousConnectedToothIds = toothOpts[0].connectedTeeth.sort();
        // 将连冠的牙位根据传入的需要被断开的牙位进行分组
        var leftTooth = Math.min.apply(null, toothIds), rightTooth = Math.max.apply(null, toothIds);
        var leftConnectedToothIds = [], rightConnectedToothIds = [];
        $.each(previousConnectedToothIds, function (index, toothId) {
            if (toothId <= leftTooth) {
                leftConnectedToothIds.push(toothId);
            }
            if (toothId >= rightTooth) {
                rightConnectedToothIds.push(toothId);
            }
        });
        // 分别对被分割的左右两边的连冠牙位的属性进行更新
        var leftToothOpts = getToothOptionFromTemporaryCart(leftConnectedToothIds);
        var rightToothOpts = getToothOptionFromTemporaryCart(rightConnectedToothIds);
        // 如果左右的牙齿只有1颗，则他不再是连冠
        if (leftToothOpts.length == 1) {
            leftToothOpts[0].isConnectedCrown = false;
            leftToothOpts[0].connectedTeeth = [];
        } else {
            $.each(leftToothOpts, function (index, toothOpt) {
                toothOpt.connectedTeeth = leftConnectedToothIds;
            });
        }
        if (rightToothOpts.length == 1) {
            rightToothOpts[0].isConnectedCrown = false;
            rightToothOpts[0].connectedTeeth = [];
        } else {
            $.each(rightToothOpts, function (index, toothOpt) {
                toothOpt.connectedTeeth = rightConnectedToothIds;
            });
        }

        if (checkLinkStatus()) {
            //console.log("有连冠")
            $("#teeth-list").find("div[class=form-inline]:last").find("select[name=bridgeType]").each(function () {
                $(this).find("option:first").removeAttr("selected");
                $(this).removeAttr('disabled');
                $(this).selectpicker('refresh')
            });
            return
        }
        //console.log("无")
        $("#teeth-list").find("div[class=form-inline]:last").find("select[name=bridgeType]").each(function () {
            $(this).find("option:first").attr("selected", "selected")
            $(this).attr('disabled', 'disabled');
            $(this).selectpicker('refresh')
        });


        logger.dumpTemporaryCartTeeth("disconnectTeeth(" + toothIds.join(",") + ")");
    };

    /**
     * 判断有没有连冠牙位存在 有返回true,否则返回false
     */
    var checkLinkStatus = function () {
        //console.log(temporaryGoodsCart);
        var flag = false;
        $.each(temporaryGoodsCart, function (idx, itemList) {
            $.each(itemList, function (_, item) {
                //console.log(item);
                if (item != undefined && item != null && item.isConnectedCrown) {
                    flag = true;
                }
            });
        });
        return flag;
    };

    /**
     * 链接两颗牙齿（当直接点击两颗牙的连接线的时候调用）。
     */
    var connectTeeth = function (toothIdA, toothIdB) {
        // 检查这两颗牙是否是邻居
        if (!TOOTH_LAYOUT.isNeighbor(toothIdA, toothIdB)) return;

        // 设置连冠
        var toothIds = [toothIdA, toothIdB];
        // 从待选区获取连接线所对应的2个牙
        var toothOpts = getToothOptionFromTemporaryCart(toothIds);
        // 逐一检查待选区的这些牙是否设置过连冠。
        // 如果设置过连冠，则需要把新加入的牙也加入到连冠队伍里面
        var previousConnectedToothIds = [];
        $.each(toothOpts, function (index, toothOpt) {
            // 如果有牙之前已经是连冠了，则获取之前设置的链接的牙位
            if (toothOpt.isConnectedCrown) {
                $.merge(previousConnectedToothIds, toothOpt.connectedTeeth);
            }
        });
        // 将新的牙加入到连冠中
        $.merge(previousConnectedToothIds, toothIds);
        // 去重
        var newConnectedToothIds = [];
        $.each(previousConnectedToothIds, function (index, toothId) {
            if ($.inArray(toothId, newConnectedToothIds) == -1) {
                newConnectedToothIds.push(toothId);
            }
        });
        // 排序
        newConnectedToothIds.sort();
        // 再将之前连接在一起的牙的 connectedTeeth 更新为新的值
        var to = getToothOptionFromTemporaryCart(newConnectedToothIds);
        $.each(to, function (index, toothOpt) {
            toothOpt.isConnectedCrown = true;
            toothOpt.connectedTeeth = newConnectedToothIds;
        });

        if (checkLinkStatus()) {
            //console.log("有连冠")
            $("#teeth-list").find("div[class=form-inline]:last").find("select[name=bridgeType]").each(function () {
                $(this).find("option:first").removeAttr("selected");
                $(this).removeAttr('disabled');
                $(this).selectpicker('refresh')
            });

            return
        }
        //console.log("无");
        $("#teeth-list").find("div[class=form-inline]:last").find("select[name=bridgeType]").each(function () {
            $(this).find("option:first").attr("selected", "selected")
            $(this).attr('disabled', 'disabled');
            $(this).selectpicker('refresh')

        });

        logger.dumpTemporaryCartTeeth("connectTeeth(" + toothIds.join(",") + ")");
    };

    /**
     * 清除待选区
     */
    instance.cleanTemporaryCart = function () {
        temporaryGoodsCart.teeth = [];
        temporaryGoodsCart.goods = [];
    };

    /**
     * 获取待选区的一颗牙
     * @param toothIds : Array or int
     */
    var getToothOptionFromTemporaryCart = function (toothIds) {
        var result = [];
        if ($.isArray(toothIds)) {
            $.each(temporaryGoodsCart.teeth, function (index, toothOpt) {
                if ($.inArray(toothOpt.tooth.toothId, toothIds) != -1)
                    result.push(toothOpt);
            });
        } else {
            $.each(temporaryGoodsCart.teeth, function (index, toothOpt) {
                if (toothOpt.tooth.toothId == toothIds)
                    result.push(toothOpt);
            });
        }
        return result;
    };

    /**
     * 将商品存入购物车的临时存放区域。-选择牙齿事件
     * @param tooth OrderToothOption
     */
    instance.addToothToTemporaryCart = function (tooth) {
        var item = new OrderToothOption(tooth);
        // add order item to temporary cart
        var duplicated = false;
        $.each(temporaryGoodsCart.teeth, function (index, toothOpt) {
            if (toothOpt.tooth.toothId == tooth.toothId) duplicated = true;
        });

        if (!duplicated) {
            temporaryGoodsCart.teeth.push(item);

            // fire listener's event
            _fireListenerEvents(ShoppingCartEvent.addToothToTemporaryCart.code,
                {
                    "temporaryCartGoodsNum": temporaryGoodsCart.teeth.length,
                    "tooth": tooth
                }
            );
            logger.dumpTemporaryCartTeeth("addToothToTemporaryCart(" + tooth.toothId + ")");
        }
    };

    /**
     * 将商品存入购物车的临时存放区域。- 选择产品事件
     * @param goods GoodsBean
     * @return true: 添加成功 false: 添加失败
     */
    instance.addGoodsToTemporaryCart = function (goods) {
        if (temporaryGoodsCart.teeth.length == 0) {

            $.alert(i18n_data["page.select.tooth.position"]/*"请先选择牙位信息"*/);
            return false;
        }
        $.each(temporaryGoodsCart.teeth, function () {
            // 不能简单的push，要判断 item.goods 中是否有同类的产品，如果有，则替换，否则则加入
            var goodsReplaced = false;

            $.each(temporaryGoodsCart.goods, function (idx, g) {
                // 可以选择多个加工项目，一颗牙不可以存在 2个相同的加工项目
                if (goods.id == g.id || (goods.manufactureItemId != "" && goods.manufactureItemId == g.manufactureItemId)) {
                    // 如果有选同类型（加工项目）的产品，则替换为新的产品
                    temporaryGoodsCart.goods[idx] = goods;
                    goodsReplaced = true;
                }
            });
            if (!goodsReplaced) {
                temporaryGoodsCart.goods.push(goods);

                logger.dumpTemporaryCartGoods("addGoodsToTemporaryCart(" + goods.id + ")");
            }
        });
        return true;
    };

    /**
     * 将商品移出购物车的临时存放区域。- 取消选择产品事件
     * @param goods GoodsBean
     * @return true: 添加成功 false: 添加失败
     */
    instance.removeGoodsFromTemporaryCart = function (goods) {
        var goodsList = [];
        $.each(temporaryGoodsCart.goods, function (idx, g) {
            if (goods.id != g.id) {
                goodsList.push(g);
            }
        });
        temporaryGoodsCart.goods = goodsList;
    };

    /**
     * 从待选区移除某个牙位和该牙位上的产品
     * @param tooth: Tooth 对象
     */
    instance.removeToothFromTemporaryCart = function (tooth) {
        var toothId = tooth.toothId;
        // 更新该牙位的连冠属性
        var sourceToothOpts = getToothOptionFromTemporaryCart(toothId);
        if (sourceToothOpts.length == 0) return;
        var sourceToothOpt = sourceToothOpts[0];

        // 如果是连冠，则更新该牙位的连冠以及相连的牙齿的连冠属性。
        if (sourceToothOpt.isConnectedCrown == true) {
            // 如果是连冠，则将与该牙连接在一起的其他牙的 connectedTeeth 中删除
            // 获取先前设置的连冠牙位
            var previousConnectedToothIds = sourceToothOpt.connectedTeeth.sort();
            var leftConnectedToothIds = [], rightConnectedToothIds = [];
            $.each(previousConnectedToothIds, function (index, tid) {
                if (tid < toothId) leftConnectedToothIds.push(tid);
                if (tid > toothId) rightConnectedToothIds.push(tid);
            });

            // 分别对被分割的左右两边的连冠牙位的属性进行更新
            var leftToothOpts = getToothOptionFromTemporaryCart(leftConnectedToothIds);
            var rightToothOpts = getToothOptionFromTemporaryCart(rightConnectedToothIds);
            // 如果左右的牙齿只有1颗，则他不再是连冠
            if (leftToothOpts.length == 1) {
                leftToothOpts[0].isConnectedCrown = false;
                leftToothOpts[0].connectedTeeth = [];
            } else {
                $.each(leftToothOpts, function (index, toothOpt) {
                    toothOpt.connectedTeeth = leftConnectedToothIds;
                });
            }
            if (rightToothOpts.length == 1) {
                rightToothOpts[0].isConnectedCrown = false;
                rightToothOpts[0].connectedTeeth = [];
            } else {
                $.each(rightToothOpts, function (index, toothOpt) {
                    toothOpt.connectedTeeth = rightConnectedToothIds;
                });
            }
        }

        // 从待选区移除该牙齿
        var indexToBeRemoved = 0;
        $.each(temporaryGoodsCart.teeth, function (index, item) {
            if (item.tooth.toothId == tooth.toothId) indexToBeRemoved = index;
        });
        temporaryGoodsCart.teeth.splice(indexToBeRemoved, 1);

        // fire listener's event
        _fireListenerEvents(ShoppingCartEvent.removeToothFromTemporaryCart.code,
            {
                "temporaryCartGoodsNum": temporaryGoodsCart.teeth.length,
                "tooth": tooth
            }
        );

        logger.dumpTemporaryCartTeeth("removeToothFromTemporaryCart(" + toothId + ")");
    };

    /**
     * 从待选区移除所有牙位和所有的产品
     */
    instance.removeAllToothFromTemporaryCart = function () {
        /*var _this = this;
         $.each(temporaryGoodsCart.teeth, function (_, toothOpt) {
         if (toothOpt != undefined && toothOpt.tooth != undefined) {
         _this.removeToothFromTemporaryCart(toothOpt.tooth);
         }
         });*/
        temporaryGoodsCart.goods = [];
    };

    /**
     * 触发监听该对象的listener进行对应的事件处理
     * @param event
     * @param data
     * @private
     */
    var _fireListenerEvents = function (event, data) {
        /*  console.debug("ShoppingCart._fireListenerEvents:" + event);*/
        // fire the listener
        $.each(eventListeners, function (i, listener) {
            listener.onListenedEventsFired(event, data);
        });
    };

    // 对外暴露的方法
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
     * 触发监听的事件源的事件
     * @param event
     * @param data
     */
    instance.onListenedEventsFired = function (event, data) {
        /*console.debug("ShoppingCart.onListenedEventsFired:" + event);*/
        if (event == LinkLineStatus.unlinked.eventCode) {
            var toothIds = data.teeth;
            disconnectTeeth(toothIds[0], toothIds[1]);
        }
        // 连接线被激活
        else if (event == LinkLineStatus.linked.eventCode) {
            var toothIds = data.teeth;
            if (toothIds.length == 2) {
                connectTeeth(toothIds[0], toothIds[1]);
            }
        }
    };

    /**
     * 将待选区对应牙位和产品存入已选产品区
     */
    instance.addGoodsToSelectedCart = function () {
        var _this = this;
        var teethId = [], items = [];
        // 如果没选牙位，则直接返回
        if (temporaryGoodsCart.teeth.length == 0) {
            $.alert(i18n_data["page.select.tooth.position"]);
            return;
        }
        // 如果没选商品，则直接返回
        if (temporaryGoodsCart.goods.length == 0) {
            $.alert(i18n_data["page.select.good"]);
            return;
        }

        // 文件信息 - 义齿设计订单使用
        var files = [];
        var urls = $("#dataFiles").val();
        if (urls != undefined && urls != "") {
            $.each(urls.split(","), function (_, url) {
                if (url != "") {
                    files.push(url);
                }
            });
        }

        var remark = $("textarea[name=remark]").val();
        var toothList = [];
        $.each(temporaryGoodsCart.teeth, function (index, toothOpt) {
            //TODO 检查其他的东西
            var item = new OrderItem(toothOpt);
            item.goods = temporaryGoodsCart.goods;
            item.files = files;
            item.remark = remark;
            items.push(item);
            teethId.push(toothOpt.tooth.toothId);
            toothList.push(toothOpt.tooth.toothId);
        });

        // 更新购物车视图

        /* 给div 绑定批次ID 和颜色*/
        var batchId = UUID.generate();
        selectedGoodsCart[batchId] = items;
        var color = ToothColor.generate(toothList);

        $("#teeth-list").find("div[class=form-inline]:last").attr("id", batchId);
        $("#" + batchId).find('.tooth-color').css("background-color", color);


        var serviceType = $("#serviceType").val();// 业务类型
        if (serviceType == "DentalDesign") {
            // if (files.length <= 0) {
            //     $.alert("请先上传数据文件");
            //     return;
            // }
            // cartView.addOrderItem4DentalDesign(batchId, items);
        } else {
            selectedGoodsCart[batchId] = items;

            //cartView.addOrderItem(batchId, items);
        }

        // 清空暂存区
        _this.cleanTemporaryCart();

        // 触发监听者事件
        _fireListenerEvents(ShoppingCartEvent.addGoodsToSelectedCart.code, {
            "toothIds": teethId
        });

        logger.dumpSelectedGoodsCart("addGoodsToSelectedCart");
    };

    /**
     * 从已选商品中移除指定的牙位和其产品
     * @param batchId : String 添加产品到购物车时的批次ID。一个批次对应多个牙位的产品。
     */
    instance.removeGoodsFromSelectedCart = function (batchId) {
        var orderItems = selectedGoodsCart[batchId];
        if (!orderItems || orderItems.length == 0) return;
        var toothIds = [];
        $.each(orderItems, function (index, item) {
            toothIds.push(item.toothOption.tooth.toothId);
        });
        // 从购物车删除该批次所选择的商品
        delete selectedGoodsCart[batchId];
        //cartView.removeOrderItem(batchId);
        // 触发监听者事件
        _fireListenerEvents(ShoppingCartEvent.removeGoodsFromSelectedCart.code, {
            "toothIds": toothIds
        });
        logger.dumpSelectedGoodsCart("removeGoodsFromSelectedCart");
    };

    /**
     * 从待选区获取所有相邻的牙齿
     */
    instance.getAdjoiningTeethFromTemporaryCart = function (tooth) {
        var toothId = Number(tooth.toothId);
        var adjoinToothIds = TOOTH_LAYOUT.getAdjoiningTeeth(toothId);
        // 看看购物车的待选区有无选中这些牙齿
        var result = [];
        $.each(temporaryGoodsCart.teeth, function (index, item) {
            var tid = Number(item.tooth.toothId);
            if ($.inArray(tid, adjoinToothIds) >= 0) {
                result.push(tid);
            }
        });

        return result;
    };

    /**
     * 获取待选区的牙位。
     * 给Debugger用。
     */
    instance.getTemporaryCartTeeth = function () {
        var result = [];
        $.each(temporaryGoodsCart.teeth, function (index, tooth) {
            result.push(tooth);
        });
        return result;
    };

    /**
     * 获取待选区的产品。
     * 给Debugger用。
     */
    instance.getTemporaryCartGoods = function () {
        var result = [];
        $.each(temporaryGoodsCart.goods, function (index, goods) {
            result.push(goods);
        });
        return result;
    };

    /**
     * 获取已选商品列表。给Debugger用。
     */
    instance.getSelectedItems = function () {
        var result = {};
        $.each(selectedGoodsCart, function (key, item) {
            result[key] = item;
        });
        return result;
    };

    /**
     * 重设已选购物车列表
     */
    instance.resetSelectedItems = function (initSelectedGoodsCart) {
        selectedGoodsCart = {};
        $.each(initSelectedGoodsCart, function (key, item) {
            selectedGoodsCart[key] = item;
        });
    };

    return instance;
})();


