/**
 * Main Controller
 */
var MainController = (function () {
    var instance = {};

    // 添加事件监听
    ToothController.addListener([ShoppingCart]);
    LinkLineController.addListener(ShoppingCart);
    ShoppingCart.addListener([ToothController, LinkLineController]);

    /**
     * 移除临时购物车
     */
    instance.cancelGoodsSelect = function () {
        ShoppingCart.removeAllToothFromTemporaryCart();
    };

    /**
     * 完成一个牙位的商品选择
     */
    instance.finishGoodsSelect = function () {
        ShoppingCart.addGoodsToSelectedCart();
    };

    /**
     * 删除已经选好的商品
     * @param batchId 批次ID
     */
    instance.removeFinishedGoods = function (batchId) {
        ShoppingCart.removeGoodsFromSelectedCart(batchId);
    };

    return instance;
})();