/**
 * tooth data store
 */
var udocadDataStore = (function () {
    var instance = {};
    // 事件监听器
    instance.listeners = [];
    // 牙齿队列
    instance.teethQueue = {};
    // 选中的产品
    instance.productionQueue = [];
    //切削牙
    instance.cuttingTeeth = [];
    //桥心
    instance.bridgeTeeth = [];

    // 牙齿ID queue
    instance.teethIdQueue = [];
    // 连接器
    instance.connectors = [];



    // 获取一个对象的size
    var size = function (obj) {
        var size = 0,
            key;
        for (key in obj) {
            if (obj.hasOwnProperty(key)) size++;
        }
        return size;
    };

    var remove = function (array, elementToRemove) {
        var index = array.indexOf(elementToRemove);
        if (index > -1) array.splice(index, 1);
    };


    // 更新连冠界面
    var updateConnectors = function (relativeTeeth) {
        var connectorIds = [];

        // 从当前选中的牙齿ID列表里面，逐一检查每颗牙，看看他的邻居是否也在该列表
        // 如果有邻居在，则该牙和其邻居之间的连接器需要显示
        for (var i = 0; i < instance.teethIdQueue.length; i++) {
            // 牙齿ID队列里面的每颗牙的ID
            var id = instance.teethIdQueue[i];
            // 获取该牙的邻居
            var neighbors = ToothFDI.neighbor(id);

            // 检查每个邻居是否有在队列里面存在
            for (var n = 0; n < neighbors.length; n++) {
                var nid = neighbors[n];
                // 如果邻居在队列里面存在，则该牙和其邻居之间的连接线要显示
                if (instance.teethIdQueue.indexOf(nid) > -1) {
                    var connectorId = "";
                    if (nid > id) {
                        connectorId = "c" + nid + id;
                    } else {
                        connectorId = "c" + id + nid;
                    }
                    connectorIds.push(connectorId);
                }
            }
        }

        // 取消单冠的连接线显示
        relativeTeeth.forEach(function (it, index, arrs) {
            if (it.status == 'single') {
                var sid = "c" + it.teeth[0] + it.teeth[1];
                connectorIds.forEach(function (id, index) {
                    if (id == sid) {
                        // console.log("delete :" + id + " at:" + index);
                        delete connectorIds[index];
                    }

                })
            }
        });

        // 通知监听器更新连接线的状态
        for (var l = 0; l < instance.listeners.length; l++) {
            instance.listeners[l].fireEvent(ToothSelectorEvent.SelectedToothChanged, connectorIds);
        }
    };

    instance.fireEvent = function (event, obj) {
    };

    instance.addEventListener = function (listener) {
        instance.listeners.push(listener);
    };

    // 将选中的牙加入到牙齿队列
    instance.selectTooth = function (tooth) {
        if (tooth.state === ToothState.UN_SELECTED) {
            delete instance.teethQueue[tooth.id];
            remove(instance.teethIdQueue, tooth.id);

            //console.log("dataStore teeth queue length after remove tooth:" + size(instance.teethQueue));
        } else if (tooth.state === ToothState.SELECTED) {
            instance.teethQueue[tooth.id] = tooth;
            instance.teethIdQueue.push(tooth.id);

            //console.log("dataStore teeth queue length after add tooth:" + size(instance.teethQueue));
        } else if (tooth.state === ToothState.FINISHED) {
            //$.alert("已经选过了")
        }

        var allTeeth = [];
        var allsingle = [];
        var allconnect = [];

        //从下单的购物车 获取已经选好的牙齿
        for (var k in selectedGoodsCart) {
            cart = selectedGoodsCart[k];
            cart.teeth.single.forEach(function (t) {
                if (allTeeth.indexOf(parseInt(t) < 0))
                    allTeeth.push(parseInt(t))
            })
            //需要格式[24,25][25,26] ,
            cart.teeth.connect.forEach(function (c) {
                //判断是否完整连贯
                var min = c[0]
                var max = c[c.length - 1]
                if (min >= 11 && min <= 28) {
                    var minIndex = ToothFDI.UPPER.indexOf(parseInt(min))
                    var maxIndex = ToothFDI.UPPER.indexOf(parseInt(max))

                    if (parseInt(maxIndex) - parseInt(minIndex) == c.length - 1) {
                        //完整连冠不做处理
                    } else {
                        //不完整连冠要得出原始的连线数据 ，才能让线连接
                        var allC = [];  //原本完整数据
                        for (var i = minIndex; i < maxIndex + 1; i++) {
                            allC.push(ToothFDI.UPPER[i])
                        }
                        c = allC
                    }
                }
                if (min >= 31 && min <= 48) {
                    var minIndex = ToothFDI.LOWER.indexOf(parseInt(min))
                    var maxIndex = ToothFDI.LOWER.indexOf(parseInt(max))

                    if (parseInt(maxIndex) - parseInt(minIndex) == c.length - 1) {
                        //完整连冠不做处理
                    } else {
                        //不完整连冠要得出原始的连线数据 ，才能让线连接
                        var allC = [];  //原本完整数据
                        for (var i = minIndex; i < maxIndex + 1; i++) {
                            allC.push(ToothFDI.LOWER[i])
                        }
                        c = allC
                    }
                }

                c.forEach(function (teeth) {
                    if (allTeeth.indexOf(parseInt(teeth) < 0)) {
                        allTeeth.push(parseInt(teeth))
                    }
                })

                // to arrs
                var allconnect_arrs = [];
                for (var i = 0; i < c.length - 1; i++) {
                    allconnect_arrs.push([c[i], c[i + 1]]);
                }

                allconnect_arrs.forEach(function (c) {
                    var res = allconnect.some(function (teeth) {
                        return JSON.stringify(teeth) == JSON.stringify(c)
                    })
                    if (!res)
                        allconnect.push(c)
                })

            })
        }
        // Object.keys(selectedGoodsCart).forEach(function (it) {
        //     var cart = selectedGoodsCart[it];
        //
        // })

        var relativeTeeth = ToothFDI.getRelativeConnector(allTeeth, allconnect);
        //console.log(relativeTeeth)


        // 被选择的牙位变化之后，更新连冠界面
        if (ToothSelectorConfig.ConnectorEnabled) {
            updateConnectors(relativeTeeth);
        }
    };

    // 设置连冠
    instance.setConnector = function (connector) {
        if (connector.enabled === ConnectorEnableState.ENABLE) {
            if (instance.connectors.indexOf(connector) === -1) {
                instance.connectors.push(connector);
            }
        } else if (connector.enabled === ConnectorEnableState.DISABLE) {
            remove(instance.connectors, connector);
        }
    };

    return instance;
})();
