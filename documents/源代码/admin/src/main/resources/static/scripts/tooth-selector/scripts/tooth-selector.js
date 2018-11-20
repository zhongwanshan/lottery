/*
 * 牙位选择器，依赖关系：
 * 1. tooth-datastore.js
 * 2. tooth-selector-config.js
 */

var dataStore = ToothSelectorConfig.DataStore;

// 牙位的FDI配置
var ToothFDI = {
    UPPER: [18, 17, 16, 15, 14, 13, 12, 11, 21, 22, 23, 24, 25, 26, 27, 28],
    LOWER: [48, 47, 46, 45, 44, 43, 42, 41, 31, 32, 33, 34, 35, 36, 37, 38],
    // 获取指定牙位的邻居
    neighbor: function (i) {
        var fdi = Number(i);
        var list = [];
        if (fdi < 30) list = ToothFDI.UPPER; else list = ToothFDI.LOWER;
        var result = [];
        var index = list.indexOf(fdi);
        var lastIndex = 15;

        if (index === 0) {
            result.push(list[1]);
        } else if (index === lastIndex) {
            result.push(list[lastIndex - 1]);
        } else {
            result.push(list[index - 1]);
            result.push(list[index + 1]);
        }
        return result;
    },

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

    /**检查2颗牙齿是否是邻居*/
    isNeighbor: function (toothId1, toothId2) {
        var neighbors = this.getAdjoiningTeeth(toothId1);
        return $.inArray(toothId2, neighbors) != -1;
    },

    // c1615
    connectorId2values: function (id) {
        var values = [];
        id = id.replace('c', '');
        return [
            parseInt(id.substr(0, 2)),
            parseInt(id.substr(2, 2))
        ]
    },

    /**获取连接线*/
    getRelativeConnector: function (teeth, jointTeeth) {
        var connector = [];
        var relativeTeeth = [];
        // 所有相关牙齿
        teeth.forEach(function (tooth) {
            var t = ToothFDI.neighbor(tooth);
            if (t.length == 2) {
                relativeTeeth.push(t[0]);
                relativeTeeth.push(tooth);
                relativeTeeth.push(t[1]);
            }
            else if (t.length == 1) {
                relativeTeeth.push(t[0]);
                relativeTeeth.push(tooth);
            }
        })
        // 连接线, 大的放前，小的放后
        relativeTeeth.forEach(function (it, index, arrs) {
            if (index < relativeTeeth.length - 1) {
                var item = [];
                if (arrs[index] < arrs[index + 1]) {
                    item = [
                        arrs[index + 1],
                        arrs[index]
                    ]
                }
                else {
                    item = [
                        arrs[index],
                        arrs[index + 1]
                    ]
                }

                var res = connector.some(function (it) {
                    return JSON.stringify(it) == JSON.stringify(item)
                });
                if (!res)
                    connector.push(item)
            }
        })

        // 处理连冠的情况
        var lastConnector = [];
        if (jointTeeth && jointTeeth.length > 0) {
            // 连接牙位, 大的放前，小的放后
            jointTeeth.forEach(function (it) {
                if (isArray(it) && it.length == 2) {
                    if (parseInt(it[0]) < parseInt(it[1])) {
                        var tmp = it[0];
                        it[0] = parseInt(it[1]);
                        it[1] = parseInt(tmp);
                    }
                    else {
                        it[0] = parseInt(it[0]);
                        it[1] = parseInt(it[1]);
                    }
                }
            });
            jointTeeth.forEach(function (jointTooth) {
                connector.forEach(function (it) {
                    if (JSON.stringify(it) == JSON.stringify(jointTooth)) {
                        // 去重
                        // var res = lastConnector.some(function (c) {
                        //     return  JSON.stringify(c['teeth']) == JSON.stringify(it)
                        // });
                        // if(!res)
                        //     lastConnector.push({
                        //         status:'joint',
                        //         teeth:it
                        //     })
                        lastConnector.forEach(function (c, index) {
                            if (JSON.stringify(c['teeth']) == JSON.stringify(it))
                                delete lastConnector[index]
                        });

                        lastConnector.push({
                            status: 'joint',
                            teeth: it
                        })
                    }
                    else {
                        // 去重
                        var res = lastConnector.some(function (c) {
                            return JSON.stringify(c['teeth']) == JSON.stringify(it)
                        });
                        if (!res)
                            lastConnector.push({
                                status: 'single',
                                teeth: it
                            })
                    }
                })
            });
        }

        else {
            lastConnector = connector.map(function (it) {
                return {
                    status: 'single',
                    teeth: it
                }
            })
        }

        return lastConnector;
    }
};


// 牙齿选择器中的事件
var ToothSelectorEvent = {
    // 牙齿被选中
    ToothSelected: "ToothSelected",
    // 牙齿被取消选中
    ToothDisSelected: "ToothDisSelected",
    // 牙齿被添加到store
    ToothAddedToStore: "ToothAddedToStore",
    // 牙齿从store移除
    ToothRemovedFromStore: "ToothRemovedFromStore",
    // 产品被选中
    ProductAdded: "ProductAdded",
    // 产品被移除
    ProductRemoved: "ProductRemoved",
    // 更新连接线
    SelectedToothChanged: "SelectedToothChanged",
    // 连接线点击事件
    ConnectorClicked: "ConnectorClicked"
};

// 牙齿状态指示器的状态
var IndicatorState = {
    // 不可见状态
    INVISIBLE: {
        visible: "hidden"
    },
    // 可见状态
    VISIBLE: {
        visible: "visible"
    }
};

// tooth indicator
var ToothIndicatorUI = function (_dom) {
    var self = this;

    var dom = _dom;
    self.state = IndicatorState.INVISIBLE;
    // 初始状态下，牙齿未选中
    dom.style.visibility = self.state.visible;

    self.show = function (visible, color) {
        if (visible === false || visible === null) {
            self.state = IndicatorState.INVISIBLE
        } else {
            self.state = IndicatorState.VISIBLE;
            dom.style.fill = color
        }
        dom.style.visibility = self.state.visible
    }
};


// 牙齿状态
var ToothState = {
    // 选中状态
    SELECTED: "SELECTED",
    // 未选中状态
    UN_SELECTED: "UN_SELECTED",
    //完成
    FINISHED: "FINISHED"
};


// tooth class
var ToothUI = function (_id, _dom) {
    var self = this;
    // 成员变量
    self.id = Number(_id);
    self.state = ToothState.UN_SELECTED;

    // 私有变量
    var dom = _dom;
    // 选中标识
    var indicator = new ToothIndicatorUI(dom.getElementsByTagName('circle')[0]);

    var toggle = function () {
        if (self.state === ToothState.UN_SELECTED) {
            self.state = ToothState.SELECTED;
            indicator.show(true);
        } else if (self.state === ToothState.SELECTED) {
            self.state = ToothState.UN_SELECTED;
            indicator.show(false);
        } else if (self.state === ToothState.FINISHED) {

        }
    };

    // 牙齿点击事件
    dom.addEventListener('click', function () {
        //牙齿状态
        toggle();

        //连接线状态
        dataStore.selectTooth(self);

    });

    dom.addEventListener("mouseover", function () {
        if (self.state == ToothState.SELECTED) {
            $("#the_tooth_svg").find(".tooth_select").remove();
            var tooth_div = "<div class='tooth_select'><div class='tooth_name'>牙位" + self.id + "</div><div><button class='defectooth' onclick='defectooth(this)'>缺失牙</button><button class='heartBridge' onclick='heartBridge(this)'>桥心</button></div></div>"
            $("#the_tooth_svg").append(tooth_div);
        } else {
            $("#the_tooth_svg").find(".tooth_select").remove();
        }

    })
};


/*
 * 牙齿连接器的状态
 */
var ConnectorEnableState = {
    // 连接状态
    ENABLE: {
        value: "enabled",
        color: "#6acccb",

    },
    // 未连接状态
    DISABLE: {
        value: "disabled",
        color: "#c1c1c1",
    },

    /*隐藏*/
    HIDDEN: {
        value: "hidden",
        color: "",
    }

};

var ConnectorVisibleState = {
    // 隐藏状态
    INVISIBLE: {value: "hidden"},
    // 可见状态
    VISIBLE: {value: "visible"},
};
// 牙齿连接器
var ToothConnectorUI = function (_dom) {
    var self = this;
    var dom = _dom;
    // 连接器的线段部分
    var line = dom.getElementsByTagName("polyline")[0];
    // 连接器的端点边框
    var endpointBorder = dom.getElementsByTagName("path");
    // states   隐藏
    var visibleState = ConnectorVisibleState.INVISIBLE;

    self.id = _dom.id;
    self.enabled = ConnectorEnableState.DISABLE;

    // 连接器左边的牙齿ID：连接器的ID = c4847 这种格式，且第一颗牙总是左边的牙，
    // 因此可以用substring来从连接器id中获取牙齿ID
    self.leftToothId = Number(self.id.substring(1, 3));
    self.rightToothId = Number(self.id.substring(3, 5));

    // 重新绘制界面
    var repaint = function () {
        // 可见状态
        dom.style.visibility = visibleState.value;
        // 选中状态
        line.style.stroke = self.enabled.color;
        for (var i = 0; i < endpointBorder.length; i++) {
            endpointBorder[i].style.fill = self.enabled.color;
        }
    };

    var toggleEnable = function () {
        if (self.enabled === ConnectorEnableState.ENABLE) {
            self.enabled = ConnectorEnableState.DISABLE;
        } else {
            self.enabled = ConnectorEnableState.ENABLE;
        }
        //console.log("Connector : " + self.id + " " + self.enabled.value);
        repaint();
    };

    // 切换可见状态
    self.setVisible = function (v) {
        if (v) {
            visibleState = ConnectorVisibleState.VISIBLE     //可见
        } else {
            visibleState = ConnectorVisibleState.INVISIBLE;
            self.enabled = ConnectorEnableState.DISABLE;
        }
        repaint();
    };

    dom.addEventListener("click", function () {
        if (self.enabled !== ConnectorEnableState.HIDDEN) {

            var allTeeth = [];
            var allsingle = [];
            var allconnect = [];

            Object.keys(selectedGoodsCart).forEach(function (it) {
                var cart = selectedGoodsCart[it];
                cart.teeth.single.forEach(function (t) {
                    if (allTeeth.indexOf(parseInt(t) < 0))
                        allTeeth.push(parseInt(t))
                })

                cart.teeth.connect.forEach(function (c) {
                    /* c.forEach(function (teeth) {
                        if (allTeeth.indexOf(parseInt(teeth) < 0))
                            allTeeth.push(parseInt(teeth))
                    })

                    var res = allconnect.some(function (teeth) {
                        return JSON.stringify(teeth) == JSON.stringify(c)
                    })
                    if (!res)
                     allconnect.push(c)*/
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
            })
            var id = self.id;
            var relativeTeeth = ToothFDI.getRelativeConnector(allTeeth, allconnect);
            //console.log('click:' + relativeTeeth);
            //console.log('id:' + id);

            var found = false;
            relativeTeeth.forEach(function (it, index, arrs) {
                if (it.status == 'joint') {
                    var sid = "c" + it.teeth[0] + it.teeth[1];
                    if (sid == id)
                        found = true;
                }
            });

            if (!found) {
                toggleEnable();
                dataStore.setConnector(self);
            }

        }
    });

    repaint();
};

// 牙齿选择器
var ToothSelector = (function () {
    var instance = {};
    // define the members of the ToothSelector
    instance.teeth = {};
    instance.connectors = [];

    // get the svg element
    var svg = document.getElementById(ToothSelectorConfig.TeethSVGDomId);
    if (svg === null || svg === undefined) {
        //console.log('No tooth SVG element found in the page');
        return {}
    }

    var teeth = document.getElementById('teeth').getElementsByTagName('g');
    var connectors = document.getElementById('connector').getElementsByTagName('g');
    if (teeth === null || teeth.length <= 0 ||
        connectors === null || connectors.length <= 0) {
        console.warn('No teeth nor connectors found in the SVG');
        return {}
    }

    // init the teeth, connectors
    for (var n = 0; n < teeth.length; n++) {
        var t = teeth[n];
        if (t.id.indexOf('tooth') === 0) {
            var id = t.id.substr('tooth'.length);
            instance.teeth[id] = new ToothUI(id, t);
        }
    }

    // 初始化牙位连接器
    var cindex = 0;

    for (var i = 0; i < connectors.length; i++) {
        var c = connectors[i];
        var num = $(connectors).eq(i).attr("id");
        if (c.id === null || c.id.indexOf("c") !== 0) continue;

        instance.connectors[cindex] = new ToothConnectorUI(c);
        cindex++;
    }

    // 牙位选择器监听 dataStore 的事件通知，以便在 dataStore 有数据更新的时候可以进行界面的更新
    dataStore.addEventListener(instance);

    // 触发所监听的事件
    instance.fireEvent = function (event, data) {
        //data 就是连接线的id 如c1514 ,通关遍历整个连接线 来判断有没有符合id ,有就显示连接线 ，点击另算
        if (event === ToothSelectorEvent.SelectedToothChanged && data !== null) {
            for (var c = 0; c < instance.connectors.length; c++) {
                var cn = instance.connectors[c];
                if (data.indexOf(cn.id) > -1) {
                    cn.setVisible(true);
                } else {
                    cn.setVisible(false);
                }
            }
        }
    };

    // show the tooth selector instance
    instance.show = function (data) {
        svg.style.visibility = 'visible';
        svg.style.display = 'block'
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
    var TOOTH_COLORS = [
        // 红色系
        "#AFDD22", //柳绿
        "#FFA631", //杏黄
        "#177CB0", //靛青
        "#F47983", //桃红
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
