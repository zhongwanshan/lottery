/**
 * 义齿加工订单子项.
 * @param tooth : OrderToothOption
 */
OrderItem = function (toothOption) {
    // 项目所对应的牙齿
    this.toothOption = toothOption;
    this.goods = [];
    this.files = [];
    this.remark = "";
    // 所选商品的数量
    this.num = 1;
    this.toString = function () {
        var goods = "";
        return "OrderItem:{'toothOption':{" + this.toothOption.toString() + "}," +
            "'goods':[" + this.goods.join(",") + "]," +
            "'remark':" + this.remark + "," +
            "'num':" + this.num + "}";
    }
};


/**
 * 订单牙位
 */
OrderToothOption = function (tooth) {
    // 项目所对应的牙齿
    this.tooth = tooth;
    // 是否是连冠
    this.isConnectedCrown = false;
    // 所连接的牙位，保存的是牙齿ID
    this.connectedTeeth = [];

    this.toString = function () {
        var t = this.tooth.toString();
        var ct = this.connectedTeeth.join(",");
        return "'OrderToothOption':{" + t + "," +
            "'isConnectedCrown':'" + this.isConnectedCrown + "'," +
            "'connectedTeeth':[" + ct + "]}";
    }
};

/**
 * 牙齿类
 */
Tooth = function (id, status) {
    this.toothId = id;
    this.status = status;
    this.fillColor = "#ffffff";

    this.onSelected = function () {
        var _self = this;
        _self.status = ToothStatus.selected;
        _self.css(_self.status.style);
    };
    this.onUnselected = function () {
        var _self = this;
        _self.status = ToothStatus.deselected;
        _self.css(_self.status.style);
    };
    this.onRemovedFromSelectedCart = function () {
        var _self = this;
        _self.status = ToothStatus.deselected;
        _self.css(_self.status.style);
        _self.css({"stroke": "#5d5a5a"});
        $(this).find('path').css({"fill": _self.fillColor, "stroke": "#5d5a5a"});
        $(this).find('text').css({"fill": "black", "stroke": "black"})
    };
    this.onAddedToSelectedCart = function (fillColor) {
        var _self = this;
        _self.status = ToothStatus.finished;
        _self.css(_self.status.style);
        _self.css({"fill": fillColor, "fill-opacity": "1", "stroke": "#ffffff", "stroke-width": "3"});
        $(this).find('path').css({"fill": fillColor, "stroke": "white"});
        $(this).find('text').css({"fill": "white", "stroke": "white"})
    };
    this.toString = function () {
        var template = "'Tooth':{'toothId':'#TOOTH_ID#','status':'#STATUS#'}";
        return template.replace("#TOOTH_ID#", this.toothId)
            .replace("#STATUS#", this.status.toString());
    };
};

/**
 * 连接线。
 * @param id 连接线的ID
 * @param status 状态
 * @param linkedPoints 该线连接到的两个连接点，LinkPoint 对象
 * @param editable 是否可点击
 * @constructor
 */
LinkLine = function (id, status, linkedPoints, editable) {
    this.id = id;
    this.linkedPoints = linkedPoints;
    this.status = status;
    this.editable = editable;

    //连接状态
    this.onLinked = function () {
        var _self = this;
        _self.status = LinkLineStatus.linked;
        _self.css(_self.status.style);
    };
    this.onUnlinked = function () {
        var _self = this;
        _self.status = LinkLineStatus.unlinked;
        _self.css(_self.status.style);
    };
    this.onShow = function () {
        var _self = this;
        _self.status = LinkLineStatus.unlinked;
        _self.css(_self.status.style);
    };
    this.onHidden = function () {
        var _self = this;
        _self.status = LinkLineStatus.hidden;
        _self.css(_self.status.style);
    };
    this.makeEditable = function (editable) {
        this.editable = editable;
    };
    /**
     * 切换牙齿的连接状态。
     * 将购物车待选区中与当前被点击的牙齿相邻的牙齿链接起来/或断开链接
     * 如果购物车的待选区中没有与被点击连接点相邻的牙齿，则不做操作
     */
    this.toggleLinkStatus = function (e) {
        var _self = this;
        if (_self.editable == false) return;
        var sv = _self.status.value;
        // 如果是未连接，则点击之后变为连接的
        if (sv == LinkLineStatus.unlinked.value) {
            _self.onLinked();
        } else if (sv == LinkLineStatus.linked.value) {
            _self.onUnlinked();
        }
    };
};

/**
 * 连接点
 * @param toothId 牙位ID
 * @param status 状态
 * @constructor
 */
LinkPoint = function (toothId, status) {
    this.toothId = toothId;
    this.status = status;

    this.showPoint = function () {
        this.status = LinkPointStatus.show;
        this.css(this.status.style);
    };
    this.hidePoint = function () {
        this.status = LinkPointStatus.hidden;
        this.css(this.status.style);
    };
};

/**
 * 已选中的商品
 * @param restorationType
 * @param manufactureItem
 * @param material
 * @param brand
 * @constructor
 */
function SelectedGoods(restorationType, manufactureItem, material, brand) {
    this.restorationType = restorationType;
    this.manufactureItem = manufactureItem;
    this.material = material;
    this.brand = brand;
}

/**
 * 商品store
 * @type {{}}
 */
var GoodsStore = {
    // 保存用AJAX从服务器 load 的 Goods
    store: [],
    // 将 store 中的goods存入到map中，以便快速查找。
    // key = manufacture-material-brand, value=Goods
    _goodsMap: {},
    // 用户选择的项目
    selectionStore: [],
    // 商品分类
    categories: [],
    /**
     * 按照给定的restorationType获取用户选中的商品。
     * @param restorationType
     * @return {*}
     */
    getSelection: function (restorationType) {
        var ret = null;
        $.each(GoodsStore.selectionStore, function (idx, g) {
            if (g.restorationType == restorationType) ret = g;
        });
        return ret;
    },
    /**
     * 将用户选择的商品放入到 selectionStore
     * 只有当用户点击了：加工项目 的时候才会调用这个方法。
     * 每次当用户点击一个加工项目时，需要刷新该加工项目对应的 材料，品牌
     * 因此每次点加工项目时，都需要把 selected goods 中的内容重置
     * 参考：GoodsListUI.selectManufactureItem方法的逻辑
     * @param goods SelectedGoods
     */
    addSelection: function (goods) {
        var added = false;
        $.each(GoodsStore.selectionStore, function (idx, g) {
            // 如果已经在之前选择过这个加工项目，则重置他
            if (goods.restorationType == g.restorationType) {
                GoodsStore.selectionStore[idx] = g;
                added = true;
            }
        });
        if (!added) {
            GoodsStore.selectionStore.push(goods);
        }
    },

    /**
     * 从 _goodsMap 中根据 key 获取一个 GoodsBean 对象
     * @param manufactureItem 加工项目
     * @param material 制作材料
     * @param brand 材料品牌
     * @return GoodsBean
     */
    getGoods: function (manufactureItem, material, brand) {
        var key = manufactureItem + "-" + material + "-" + brand;
        var goods = GoodsStore._goodsMap[key];
        if (goods == null || goods == undefined) return null;
        return goods;
    },

    /**
     * 通过AJAX从后台加载商品 - 义齿加工
     * @param shopId String 商家店铺ID
     * @param restorationType String 修复类型
     * @param goodsName String 产品名称 支持搜索
     * @param showType String 显示方式
     */
    load: function (shopId, restorationType, goodsName, showType, currency) {
        var param = {
            "shop": shopId,
            "restorationType": restorationType,
            "goodsName": goodsName,
            "serviceType": "Dental",
            "currency": currency
        };
        // 调用API获取商品
        Apis.list_goods.call({
            data: param,
            success: function (resp) {
                // 设置显示方式
                GoodsListUI.showType = showType;

                var status = resp.head.status;
                if (status == 1) {
                    GoodsListUI.display(resp.head.message);
                    return;
                }
                var goodsList = resp.body;
                if (goodsList.length == 0) {
                    GoodsStore.store = [];
                    GoodsListUI.display("商家没有该类型的商品");
                } else {
                    GoodsStore.store = goodsList;
                    $.each(goodsList, function (idx, goods) {
                        var key = goods.manufactureItemId + "-" + goods.materialId + "-" + goods.brandId;
                        GoodsStore._goodsMap[key] = goods;
                    });
                    GoodsListUI.display();
                }
            },
            error: function (resp) {
                GoodsStore.store = [];
                GoodsListUI.display("获取商品列表失败:" + resp.head.message);
            }
        });
    },

    /**
     * 通过AJAX从后台加载商品 -三维导板
     * @param shopId String 商家店铺ID
     * @param supportMethod String 支撑方式
     * @param toothMissingCondition String 牙缺失情况
     * @param goodsName String 产品名称 支持搜索
     */
    loadBySupportMethod: function (shopId, supportMethod, toothMissingCondition, goodsName, currency) {
        var param = {
            "shop": shopId, "supportMethod": supportMethod, "toothMissingCondition": toothMissingCondition
            , "goodsName": goodsName, "serviceType": "ThreeDimensionalGuide", "currency": currency
        };
        // 调用API获取商品
        Apis.list_goods.call({
            data: param,
            success: function (resp) {
                // 设置显示方式
                GoodsListUI.showType = "BY_GOODS_NAME_INTRO";

                var status = resp.head.status;
                if (status == 1) {
                    GoodsListUI.display(resp.head.message);
                    return;
                }
                var goodsList = resp.body;
                if (goodsList.length == 0) {
                    GoodsStore.store = [];
                    GoodsListUI.display("商家没有该类型的商品");
                } else {
                    GoodsStore.store = goodsList;
                    $.each(goodsList, function (idx, goods) {
                        var key = goods.id;
                        GoodsStore._goodsMap[key] = goods;
                    });
                    GoodsListUI.display();
                }
            },
            error: function (resp) {
                GoodsStore.store = [];
                GoodsListUI.display("获取商品列表失败:" + resp.head.message);
            }
        });
    }
};
