function $$(id) {
    return $("#" + id);
}
/**
 * 商品列表UI
 */
var GoodsListUI = {
    containerId: "#div-goods-list",
    showType: "BY_GOODS_NAME",

    /**
     *  加工项目-材料-品牌 显示模板
     */
    template: {
        divOfNormalGoods: {
            _content: "<div id='GOODS_LIST_DIV_OF_CATEGORY' class='yg_type'>"
            + "<div class='yg_type_left'><span>CATEGORY_NAME</span></div>"
            // 每个产品的BUTTON会追加到这个DIV里面
            + "<div class='yg_type_right' id='UL_MANU_ITEM_ID'></div>"
            + "</div>"
            + "<div class='clear'></div>"
            ///
            + "<div class='xf_type'>"
            + "<div class='xf_left'><span>材料</span></div>"
            + "<div class='xf_right' id='UL_MATERIAL_ID'></div>"
            + "</div>"
            + "<div class='clear'></div>"
            //
            + "<div class='brand'>"
            + "<div class='brand_left'><span>品牌</span></div>"
            + "<div class='brand_right' id='UL_BRAND_ID'></div>"
            + "</div>"
            + "<div class='clear'></div>"
            + "<div SEPARATOR_CLASS></div>",
            build: function (restorationType, showSeparator) {
                var ul_manu_item = "ul-manu-item-cat" + restorationType;
                var ul_material = "ul-material-cat" + restorationType;
                var ul_brand = "ul-brand-cat" + restorationType;

                var separatorClass = "";
                if (showSeparator) {
                    separatorClass = "class='br_line'";
                }
                var el = this._content
                    .replace("GOODS_LIST_DIV_OF_CATEGORY", "div-goods-list-cat" + restorationType)
                    .replace("CATEGORY_NAME", "加工项目")
                    .replace("UL_MANU_ITEM_ID", ul_manu_item)
                    .replace("UL_MATERIAL_ID", ul_material)
                    .replace("UL_BRAND_ID", ul_brand)
                    .replace("SEPARATOR_CLASS", separatorClass);
                return $(el);
            },
            getManufactureItemContainer: function (restorationType) {
                return $("#ul-manu-item-cat" + restorationType);
            },
            getMaterialContainer: function (restorationType) {
                return $("#ul-material-cat" + restorationType);
            },
            getBrandContainer: function (restorationType) {
                return $("#ul-brand-cat" + restorationType);
            }
        },
        manufactureItem: {
            _content: "<input type='button' id='MANU_ITEM_ID' name='BTN_MANU_ITEM_NAME' data-id='MANU_ID' value='MANU_ITEM_NAME'/>",
            build: function (restorationType, goods) {
                var btnName = this.getButtonName(restorationType);
                var buttonId = this.getButtonId(restorationType, goods.manufactureItemId);
                var el = this._content
                    .replace("BTN_MANU_ITEM_NAME", btnName)
                    .replace("MANU_ID", goods.manufactureItemId)
                    .replace("MANU_ITEM_ID", buttonId)
                    .replace("MANU_ITEM_NAME", goods.manufactureItemName);
                var e = $(el).click(function () {
                    $("input[name|='" + btnName + "']").each(function () {
                        $(this).attr({"class": ""});
                    });
                    $(this).attr({"class": "product_select"});
                    GoodsListUI.selectManufactureItem(restorationType, goods.manufactureItemId);
                });
                return e;
            },
            getButtonById: function (restorationType, manufactureItemId) {
                return $("#manu-item-cat" + restorationType + "-" + manufactureItemId);
            },
            getButtonId: function (restorationType, manufactureId) {
                return "manu-item-cat" + restorationType + "-" + manufactureId;
            },
            getButtonName: function (restorationType) {
                return "btn-manu-item-cat" + restorationType;
            }
        },
        material: {
            _content: "<input type='button' id='MATER_ID' name='BTN_MATER_NAME' data-id='DT_MATER_ID'" +
            " value='MATERIAL_NAME'/>",
            build: function (restorationType, goods) {
                var btnName = this.getButtonName(restorationType);
                var btnId = this.getButtonId(restorationType, goods.materialId);
                var el = this._content
                    .replace("BTN_MATER_NAME", btnName)
                    .replace("MATER_ID", btnId)
                    .replace("DT_MATER_ID", goods.materialId)
                    .replace("MATERIAL_NAME", goods.materialName);
                var e = $(el).click(function () {
                    $("input[name|='" + btnName + "']").each(function () {
                        $(this).attr({"class": ""});
                    });
                    var success = GoodsListUI.selectMaterial(restorationType, goods.manufactureItemId, goods.materialId);
                    if (success) {
                        $(this).attr({"class": "xf_select"});
                    }
                });
                return e;
            },
            getButtonById: function (restorationType, materialId) {
                return $("#material-cat" + restorationType + "-" + materialId);
            },
            getButtonId: function (restorationType, materialId) {
                return "material-cat" + restorationType + "-" + materialId;
            },
            getButtonName: function (restorationType) {
                return "btn-material-cat" + restorationType;
            }
        },
        brand: {
            _content: "<input type='button' id='BRD_ID' name='BTN_BRAND_NAME' data-id='BRND_ID' value='BRAND_NAME'/>",
            build: function (restorationType, goods) {
                var btnName = this.getButtonName(restorationType);
                var btnId = this.getButtonId(restorationType, goods.brandId);
                var el = GoodsListUI.template.brand._content
                    .replace("BTN_BRAND_NAME", btnName)
                    .replace("BRND_ID", goods.brandId)
                    .replace("BRD_ID", btnId)
                    .replace("BRAND_NAME", goods.brandName);
                var e = $(el).click(function () { // 选择事件
                    $("input[name|='" + btnName + "']").each(function () {
                        $(this).attr({"class": ""});
                    });
                    var success = GoodsListUI.selectBrand(restorationType, goods.brandId);
                    if (success) {
                        $(this).attr({"class": "brand_select"})
                    }
                }).dblclick(function () { // 取消事件
                    $("input[name|='" + btnName + "']").each(function () {
                        $(this).attr({"class": ""});
                    });
                    var success = GoodsListUI.cancelSelectedBrand(restorationType, goods.brandId);
                    if (success) {
                        $(this).removeClass("brand_select");
                    }
                });
                return e;
            },
            getButtonById: function (restorationType, brandId) {
                return $("#brand-cat-" + restorationType + "-" + brandId);
            },
            getButtonId: function (restorationType, brandId) {
                return "brand-cat-" + restorationType + "-" + brandId;
            },
            getButtonName: function (restorationType) {
                return "btn-brand-cat" + restorationType;
            }
        },
        noGoods: {
            content: "<div id='div-no-goods' class='div_no_goods'></div>",
            build: function (message) {
                var e = $("#div-no-goods");
                if (e.length == 0) {
                    e = $(this.content);
                }
                return e.html(message);
            }
        }
    },

    /**
     *  加工项目-产品名称 显示模板
     */
    template_goodsName: {
        manufactureItem: {
            _content: "<div id='GOODS_LIST_DIV_OF_ITEM' class='yg_type'>"
            + "<div class='produvt-div'><span class='product_title' >ITEM_NAME</span></div>"
            // 每个产品的BUTTON会追加到这个DIV里面
            + "<div id='UL_GOODS_ID'></div>"
            + "</div>"
            + "<div SEPARATOR_CLASS></div>",
            build: function (_itemId, showSeparator) {
                var itemName = this.getItemName(_itemId);
                var itemId = this.getItemId(_itemId);
                var ul_goods_id = "ul-goods-itemId" + itemId;

                var separatorClass = "";
                if (showSeparator) {
                    separatorClass = "class='br_line'";
                }
                var el = this._content
                    .replace("GOODS_LIST_DIV_OF_ITEM", "div-item-list" + itemId)
                    .replace("ITEM_NAME", itemName)
                    .replace("UL_GOODS_ID", ul_goods_id)
                    .replace("SEPARATOR_CLASS", separatorClass);
                return $(el);
            },
            getGoodsContainer: function (_itemId) {
                var itemId = this.getItemId(_itemId);
                return $("#ul-goods-itemId" + itemId);
            },
            getItemName: function (_itemId) {
                var itemName = "";
                if (_itemId.indexOf("_") != -1) {
                    itemName = _itemId.split("_").pop();
                }
                return itemName;
            },
            getItemId: function (_itemId) {
                var itemId = "";
                if (_itemId.indexOf("_") != -1) {
                    itemId = _itemId.split("_")[0];
                }
                return itemId;
            }
        },
        goods: {
            _content: "<div class='goods-content' data-id='GOODS_ID'>"
            + "<input type='checkbox' name='goodsItems[]' id='GOODS_ID' value='GOODS_ID'/>"
            + "<label class='label-checkbox' for='GOODS_ID'><a>GOODS_NAME</a> </label>"
            + "</div>",
            build: function (goods) {
                var el = this._content
                    .replaceAll("GOODS_ID", goods.id)
                    .replace("GOODS_NAME", goods.name);
                var e = $(el);
                e.find("input[name='goodsItems[]']").click(function () { // 选择事件
                    var goodsId = $(this).val();
                    if ($(this).is(':checked')) {
                        // 将当前选择的产品添加至临时购物车
                        var goodsItems = [];
                        goodsItems.push(goodsId);
                        GoodsListUI.getAllSelectedGoods(goodsItems);

                        // 取消其他相同加工项目产品的选择
                        $(this).parent().parent().find("input[name='goodsItems[]']:checked").click();
                    } else {
                        // 将当前选择的产品添加至移出临时购物车
                        ShoppingCart.removeGoodsFromTemporaryCart(goods);
                    }
                });
                return e;
            },
        },
        noGoods: {
            content: "<div id='div-no-goods' class='div_no_goods'></div>",
            build: function (message) {
                var e = $("#div-no-goods");
                if (e.length == 0) {
                    e = $(this.content);
                }
                return e.html(message);
            }
        }
    },

    /**
     *  产品名称-产品介绍 显示模板
     */
    template_goodsName_intro: {
        goods: {
            _content: "<div>"
            + "<div data-id='GOODS_ID' class='intro-div'>"
            + "<input type='checkbox' name='goodsItems[]' id='GOODS_ID' value='GOODS_ID'/>"
            + "<label class='label-checkbox' for='GOODS_ID'><a>GOODS_NAME</a> </label>"
            + "</div>"
            + "<div class='remark-div'>说明：GOODS_INTRO</div>"
            + "</div>"
            + "<div class='clear'></div>",
            build: function (goods) {
                var el = this._content
                    .replaceAll("GOODS_ID", goods.id)
                    .replace("GOODS_NAME", goods.name)
                    .replace("GOODS_INTRO", goods.remark);
                var e = $(el);
                e.find("input[name='goodsItems[]']").click(function () { // 选择事件
                    var goodsId = $(this).val();
                    if ($(this).is(':checked')) {
                        // 将当前选择的产品添加至临时购物车
                        var goodsItems = [];
                        goodsItems.push(goodsId);
                        GoodsListUI.getAllSelectedGoods(goodsItems);

                        // 取消其他相同加工项目产品的选择
                        $(this).parent().parent().find("input[name='goodsItems[]']:checked").click();
                    } else {
                        // 将当前选择的产品添加至移出临时购物车
                        ShoppingCart.removeGoodsFromTemporaryCart(goods);
                    }
                });
                return e;
            }
        },
        noGoods: {
            content: "<div id='div-no-goods' class='div_no_goods'></div>",
            build: function (message) {
                var e = $("#div-no-goods");
                if (e.length == 0) {
                    e = $(this.content);
                }
                return e.html(message);
            }
        }
    },

    /**
     * 获取选中的产品信息并添加到临时购物车
     */
    getAllSelectedGoods: function (goodsItems) {
        var goodsList = GoodsStore.store;
        if (goodsItems != undefined && goodsItems.length > 0) {
            $.each(goodsItems, function (idx, goodsId) {
                for (var i = 0; i < goodsList.length; i++) {
                    var g = goodsList[i];
                    if (g.id == goodsId) {
                        ShoppingCart.addGoodsToTemporaryCart(g);
                        break;
                    }
                }
            });
        }
    },

    /**
     * 按照 对应的显示方式来显示
     */
    display: function (message) {
        if (GoodsListUI.showType == "BY_GOODS_NAME") {
            this.displayByName(message);
        } else if (GoodsListUI.showType == "BY_GOODS_TYPE") {
            this.displayByType(message);
        } else if (GoodsListUI.showType == "BY_GOODS_NAME_INTRO") {
            this.displayByNameAndIntro(message);
        }
    },

    /**
     * 按照：按照加工项目-产品名称来显示
     */
    displayByName: function (message) {
        var goods = GoodsStore.store;
        var rootContainer = $(GoodsListUI.containerId).html("");

        if (goods.length == 0) {
            GoodsListUI.template.noGoods.build(message).appendTo(rootContainer);
            return;
        }
        // 按照产品的加工项目分组
        var goodsMapByItem = {};
        var mapSize = 0;
        $.each(goods, function (idx, g) {
            var manufactureItemId = g.manufactureItemId + "_" + g.manufactureItemName;

            if (goodsMapByItem[manufactureItemId] == null) {
                goodsMapByItem[manufactureItemId] = [];
                mapSize++;
            }
            goodsMapByItem[manufactureItemId].push(g);
        });

        var t = GoodsListUI.template_goodsName;

        // 將每組中的所有商品，按照 产品名称 显示
        var idx = 0;
        $.each(goodsMapByItem, function (itemId, goodsArray) {
            idx++;
            // 生成容器
            var showSeparator = /*idx != mapSize*/false;
            // 有加工项目 的商品的DIV
            var divOfNormalGoods = t.manufactureItem.build(itemId, showSeparator);

            divOfNormalGoods.appendTo(rootContainer);

            // 将该分组中所有商品添加到 上述 div
            $.each(goodsArray, function (idx, g) {
                // 产品
                var container = t.manufactureItem.getGoodsContainer(itemId);
                t.goods.build(g).appendTo(container);
            });


        });

        var btn_a = '<div class="goods-btn">' +
            '<input type="button" class="goods-btn2" id="btn-finish-selection" value="确定选购"> ' +
            '<input type="button" class="goods-btn1" id="btn-cancel-selection" value="清空"> ' +
            '</div>';
        $(btn_a).appendTo(rootContainer);

        GoodsListUI.shopbtn();
    },

    /**
     * 按照：牙冠类型 - 修复材料 - 材料品牌 的方式显示商品列表
     */
    displayByType: function (message) {
        var goods = GoodsStore.store;
        var rootContainer = $(GoodsListUI.containerId).html("");

        if (goods.length == 0) {
            GoodsListUI.template.noGoods.build(message).appendTo(rootContainer);
            return;
        }

        // 按照商品的目录分组
        var goodsMapByCategory = {};

        // 将每组的商品按照 加工项目 - 修复材料 - 材料品牌 显示
        var mapSize = 0;
        $.each(goods, function (idx, g) {
            var restorationType = g.restorationType;
            if (goodsMapByCategory[restorationType] == null) {
                goodsMapByCategory[restorationType] = [];
                mapSize++;
            }
            goodsMapByCategory[restorationType].push(g);
        });

        var t = GoodsListUI.template;

        // 將每組中的所有商品，按照 加工项目 - 材料 - 品牌 顯示
        var idx = 0;
        $.each(goodsMapByCategory, function (restorationType, goodsArray) {
            idx++;
            // 生成容器
            var showSeparator = idx != mapSize;
            // 加工项目 - 材料 - 品牌 的商品的DIV
            var divOfNormalGoods = t.divOfNormalGoods.build(restorationType, showSeparator);

            // 将该分组中所有商品添加到 上述 div
            $.each(goodsArray, function (idx, g) {
                // 加工项目 - 材料 - 品牌 的商品
                if (g.manufactureItemId != null && g.manufactureItemId != "") {
                    divOfNormalGoods.appendTo(rootContainer);
                    // 加工项目
                    var manufactureItemElmt = t.manufactureItem.getButtonById(restorationType, g.manufactureItemId);
                    if (manufactureItemElmt.length == 0) {
                        var container = t.divOfNormalGoods.getManufactureItemContainer(restorationType);
                        t.manufactureItem.build(restorationType, g).appendTo(container);
                    }

                    // 材料
                    var materialElmt = t.material.getButtonById(restorationType, g.materialId);
                    if (materialElmt.length == 0) {
                        var container = t.divOfNormalGoods.getMaterialContainer(restorationType);
                        t.material.build(restorationType, g).appendTo(container);
                    }

                    // 品牌
                    var brandElmt = t.brand.getButtonById(restorationType, g.brandId);
                    if (brandElmt.length == 0) {
                        var container = t.divOfNormalGoods.getBrandContainer(restorationType);
                        t.brand.build(restorationType, g).appendTo(container);
                    }
                }
            });


            var btn_a = '<div class="goods-btn">' +
                '<input type="button" class="goods-btn2" id="btn-finish-selection" value="确定选购"> ' +
                '<input type="button" class="goods-btn1" id="btn-cancel-selection" value="清空"> ' +
                '</div>';
            $(btn_a).appendTo(rootContainer);

            GoodsListUI.shopbtn();

        });
    },


    /**
     * 按照：按照产品名称-介绍来显示-三维导板
     */
    displayByNameAndIntro: function (message) {
        var goodsList = GoodsStore.store;
        var rootContainer = $(GoodsListUI.containerId).html("");

        if (goodsList.length == 0) {
            GoodsListUI.template.noGoods.build(message).appendTo(rootContainer);
            return;
        }

        var t = GoodsListUI.template_goodsName_intro;

        // 將每組中的所有商品，按照 产品名称 显示
        $.each(goodsList, function (idx, g) {
            // 生成容器
            var divOfNormalGoods = t.goods.build(g);

            divOfNormalGoods.appendTo(rootContainer);
        });

        var btn_a = '<div class="goods-btn">' +
            '<input type="button" class="goods-btn2" id="btn-finish-selection" value="确定选购"> ' +
            '<input type="button" class="goods-btn1" id="btn-cancel-selection" value="清空"> ' +
            '</div>';
        $(btn_a).appendTo(rootContainer);
        GoodsListUI.shopbtn();


    },

    /**
     * 重置所有button的状态
     */
    resetAllButton: function () {
        $.each(GoodsStore.categories, function (idx, cate) {
            var manufactBtnName = GoodsListUI.template.manufactureItem.getButtonName(cate);
            var manufactureBtns = $("input[name|='" + manufactBtnName + "']");
            var yg_type_right = $(".yg_type_right  .product_select")
            manufactureBtns.each(function () {
                $(this).attr({"class": ""});
            });
            yg_type_right.each(function () {
                $(this).attr({"class": ""});
            });

            var materialBtnName = GoodsListUI.template.material.getButtonName(cate);
            var materialBtns = $("input[name|='" + materialBtnName + "']");
            var xf_right = $(".xf_right  .xf_select")
            materialBtns.each(function () {
                $(this).attr({"class": ""});
            });
            xf_right.each(function () {
                $(this).attr({"class": ""});
            });

            var brandBtnName = GoodsListUI.template.brand.getButtonName(cate);
            var brandBtns = $("input[name|='" + brandBtnName + "']");
            var brand_right = $(".brand_right  .brand_select")
            brandBtns.each(function () {
                $(this).attr({"class": ""});
            });
            brand_right.each(function () {
                $(this).attr({"class": ""});
            });
        });
    },

    /*清空 和添加项目 2个 按钮的事件*/
    shopbtn: function () {
        // 点击添加事件 将临时购物车添加至购物车
        $("#btn-finish-selection").click(function () {
            MainController.finishGoodsSelect();
        });

        // 点击取消事件 取消当前临时购物车
        $("#btn-cancel-selection").click(function () {
            MainController.cancelGoodsSelect();
        });
    },

    /**
     * 选择一个"加工项目"，联动的更新界面
     * @param manufactureItemId  String, 被选择的按钮的 manufacture item id
     * @param goodsList array, 生成该 manufacture item 时的 goods list。
     */
    selectManufactureItem: function (restorationType, manufactureItemId) {
        var matBtnName = this.template.material.getButtonName(restorationType);
        var brandBtnName = this.template.brand.getButtonName(restorationType);
        var materialBtnsName = "input[name|='" + matBtnName + "']";
        var brandBtnsName = "input[name|='" + brandBtnName + "']";

        // 每次点 加工项目，都清空之前的选择，避免选的 加工项目-材料-品牌 对不上
        var selected = GoodsStore.getSelection(restorationType);
        if (selected == null) {
            selected = new SelectedGoods(restorationType, manufactureItemId);
        } else {
            selected.manufactureItem = manufactureItemId;
            selected.material = "";
            selected.brand = "";
        }
        GoodsStore.addSelection(selected);

        // 所有 加工材料,材料品牌 按钮
        var btnsMaterial = $(materialBtnsName);
        var btnsBrand = $(brandBtnsName);
        // 将因 "上一次点击 加工项目而隐藏的按钮" 显示,且设置为未选中的样式。
        btnsMaterial.each(function () {
            $(this).css({"display": ""}).attr({"class": ""});
        });
        btnsBrand.each(function () {
            $(this).css({"display": ""}).attr({"class": ""});
        });


        // 过滤出 与选中的 "加工项目" 相关联的制作材料，材料品牌
        var materialShouldDisplay = [], brandShouldDisplay = [];

        $.each(GoodsStore.store, function (idx, goods) {
            var mid = goods.materialId;
            var bid = goods.brandId;
            if (manufactureItemId == goods.manufactureItemId) {
                materialShouldDisplay.push(mid);
                brandShouldDisplay.push(bid);
            }
        });
        // 隐藏不要显示的材料按钮
        btnsMaterial.each(function () {
            var id = $(this).attr("data-id");
            if ($.inArray(id, materialShouldDisplay) == -1) {
                $(this).css({"display": "none"});
            }
        });
        // 隐藏不要显示的品牌按钮
        btnsBrand.each(function () {
            var id = $(this).attr("data-id");
            if ($.inArray(id, brandShouldDisplay) == -1) {
                $(this).css({"display": "none"});
            }
        });
    },

    /**
     * 选择材料
     * @param restorationType
     * @param manufactureItemId
     * @param materialId
     */
    selectMaterial: function (restorationType, manufactureItemId, materialId) {
        var selected = GoodsStore.getSelection(restorationType);
        if (selected == null) {
            $.alert("请先选择加工项目信息");
            return false;
        }
        var mitem = selected.manufactureItem;
        if (mitem == undefined || mitem == null || mitem == "") {
            $.alert("请先选择加工项目信息");
            return false;
        }

        selected.material = materialId;
        var brandBtnName = this.template.brand.getButtonName(restorationType);
        var btnsBrand = $("input[name|='" + brandBtnName + "']");

        // 将因 "上一次点击 加工项目, 修复材料 而隐藏的按钮" 显示 且设置为 未选中的样式。
        btnsBrand.each(function () {
            $(this).css({"display": ""}).attr({"class": ""});
        });

        // 过滤出与选中的 材料 相关的品牌
        var brandShouldDisplay = [];
        $.each(GoodsStore.store, function (idx, goods) {
            var bid = goods.brandId;
            if (manufactureItemId == goods.manufactureItemId && materialId == goods.materialId) {
                brandShouldDisplay.push(bid);
            }
        });
        // 隐藏不要显示的品牌按钮
        btnsBrand.each(function () {
            var id = $(this).attr("data-id");
            if ($.inArray(id, brandShouldDisplay) == -1) {
                $(this).css({"display": "none"});
            }
        });
        return true;
    },

    /**
     * 选择品牌 -选择产品事件
     * @param restorationType
     * @param brandId
     */
    selectBrand: function (restorationType, brandId) {
        var selected = GoodsStore.getSelection(restorationType);
        if (selected == null) {
            $.alert("请先选择加工项目和加工材料");
            return false;
        }

        // 检查加工项目
        var mitem = selected.manufactureItem;
        if (mitem == undefined || mitem == null || mitem == "") {
            $.alert("请先选择加工项目信息");
            return false;
        }

        // 检查材料
        var material = selected.material;
        if (material == undefined || material == null || material == "") {
            $.alert("请先选择加工材料信息");
            return false;
        }

        // 检查品牌
        selected.brand = brandId;
        var goods = GoodsStore.getGoods(selected.manufactureItem, selected.material, selected.brand);
        if (goods == null) {
            $.alert("请选择品牌信息");
            return false;
        }

        // 将选中的产品添加至临时购物车
        var success = ShoppingCart.addGoodsToTemporaryCart(goods);
        if (!success) {
            $.alert("请先选择牙位信息");
            return false;
        }

        return true;
    },

    /**
     * 选择品牌 -取消产品事件
     * @param restorationType
     * @param brandId
     */
    cancelSelectedBrand: function (restorationType, brandId) {
        var selected = GoodsStore.getSelection(restorationType);
        if (selected == null) {
            $.alert("请先刷新页面再试");
            return false;
        }

        selected.brand = brandId;
        var goods = GoodsStore.getGoods(selected.manufactureItem, selected.material, selected.brand);
        if (goods == null) {
            $.alert("请先刷新页面再试");
            return false;
        }

        // 移除临时购物车产品
        ShoppingCart.removeAllToothFromTemporaryCart();

        return true;
    }
};