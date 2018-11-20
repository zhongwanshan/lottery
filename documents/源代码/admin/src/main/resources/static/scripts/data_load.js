var DataLoadConfig = {
    apis: null,   // 访问后台的Api, 需要为 Api 格式(依赖 api-prototype.js)
    view: "#CLONE_VIEW", // 列表row模板
    model: "data-model", // 从后台获取的数据会保存到这个model
    beansKey: "", // 返回值根据这个key 获取Bean中的数据model，该数据是一个列表或数组
    modelKey: "data-key", // 若dom 中设置了这个属性，就会从model中跟据这个modelKey 获取value
    attrKey: "data",// 若dom 中设置了这个属性，就会从model中根据modelKey获取值，保存到这里
    attachHandle: null,  // 附加回调，常用与数据格式化. 参数 params1: 	DataLoad, params2:  resp.body
    failedHandle: null,  // 错误回调，回调参数 params1: 	DataLoad, params2:  msg
    beforeOneDataSetHandle: null,  // 在设置了modelKey的每个元素设置数据前的回调处理
    afterOneDataSetHandle: null  // 在设置了modelKey的每个元素设置数据后的回调处理
};

// 数据加载方式
var LOAD_WAY = {
    APPEND: 'APPEND',  // 仅往后追加
    APPEND_AND_CLEAN: 'APPEND_AND_CLEAN' // 清空之前的数据，再往后追加
};


function DataLoad(config) {
    this.apis = config['apis'] || ''; // 访问后台的Api, 需要为 Api 格式(依赖 api-prototype.js)
    this.view = config['view'] || ''; // 列表row模板
    this.model = config['model'] || DataLoadConfig.model; // 从后台获取的数据会保存到这个model
    this.modelKey = config['modelKey'] || DataLoadConfig.modelKey;// 若dom 中设置了这个属性，就会从model中获取设置的key填充这个dom
    this.attrKey = config['attrKey'] || DataLoadConfig.attrKey;// 若dom 中设置了这个属性，就会在dom 中保存model的 value 到这个属性
    this.beansKey = config['beansKey'] || '';// 返回值根据这个key 获取Bean中的数据model，该数据是一个列表或数组
    this.attachHandle = config['attachHandle'] || function () {
        };// 附加回调，常用与数据格式化. 参数 params1: 	DataLoad, params2:  model[array]
    this.beforeOneDataSetHandle = config['beforeOneDataSetHandle'] || function (self, view, model) {
            return model;
        };// 在设置了modelKey的每个元素设置数据前的回调处理
    this.afterOneDataSetHandle = config['afterOneDataSetHandle'] || function (self, view, model) {

        };// 在设置了modelKey的每个元素设置数据前的回调处理
    this.failedHandle = config['failedHandle']; // 错误回调，回调参数 params1: 	DataLoad, params2:  msg
    this.self = this;
}


DataLoad.prototype.getConfig = function () {
    return {
        apis: this.apis,
        model: this.model,
        view: this.view,
        modelKey: this.modelKey,
        attrKey: this.attrKey,
        beansKey: this.beansKey
    }
};

// 从后台获取数据，并使用view作为模板来填充
DataLoad.prototype.getDatas = function (forms, way) {
    var self = this;
    var loadWay = way ? way : LOAD_WAY.APPEND;

    if (!self.apis) {
        console.log("config['apis'] not defined! ");
        return;
    }
    if (!self.view) {
        console.log("config['view'] not defined! ");
        return;
    }
    if (!self.modelKey) {
        console.log("config['modelKey'] not defined! ");
        return;
    }
    if (!self.beansKey) {
        console.log("config['beansKey'] not defined! ");
        return;
    }


    self.apis.call({
        data: JSON.stringify(forms || {}),
        success: function (resp) {
            if (status != 0) {
                if (self.failedHandle) {
                    self.failedHandle(self, resp.head.message)
                }
                return;
            }

            var templetViews = self.view.split(",");
            var modelBeasKeys = self.beansKey.split(",");
            if (templetViews.length !== modelBeasKeys.length) {
                console.log(" The count of view not equal to beansKey. ");
                return;
            }

            modelBeasKeys.forEach(function (it, index) {
                var key = it;
                var view = templetViews[index];
                // 根据key 获取数据(数组格式)
                var datas = self.getValueByKey(resp.body, key);
                self.setViewFromModel(datas, view, loadWay)
            });

            if (self.attachHandle) {
                self.attachHandle(self, resp.body)
            }

        },
        error: function (resp) {
            if (self.failedHandle) {
                self.failedHandle(self, resp.head.message)
            }
        }
    });
};


// 私有方法, 填充数据到view中
DataLoad.prototype.setViewFromModel = function (datas, view, loadWay) {
    var self = this;
    if (isArray(datas)) {
        // fill the data to view
        datas.forEach(function (it) {
            var model = it;
            var viewClone = $(view).clone();

            if (loadWay == LOAD_WAY.APPEND_AND_CLEAN) {
                // 保留row模板节点
                var cloneViewKey = view.replace("#", "");
                $(view).parent().children("[id!=" + cloneViewKey + "]").remove();
            }

            $(view).parent().append(viewClone);
            var viewObj = $(view).parent().children().last();
            viewObj.find("*[" + self.modelKey + "]").each(function () {
                var v = $(this);
                var modelKey = $(this).attr(self.modelKey);
                var hasAttrKey = $(this).attr(self.attrKey) !== undefined;
                if (!modelKey) return;

                // 调用钩子函数处理数据
                var lastData = self.beforeOneDataSetHandle(self, v, model[modelKey], modelKey);

                // 对于设置了each-templet的，进行遍历
                if (v.attr('each-templet') !== undefined) {
                    self.eachTempletData(lastData, v);
                }
                // 普通节点，直接填充数据
                else {
                    // 若设置了attrKey, 优先保存到attrKey上，否则保存到val或text上
                    if (hasAttrKey) {
                        v.attr(self.attrKey, lastData);
                        // 根据设置的属性，格式化数据
                        $(this).formatData();
                    }
                    else {
                        if (v.is("input"))
                            v.val(lastData);
                        else if (v.is("a"))
                            v.attr('href', lastData);
                        else
                            v.text(lastData);
                        $(this).formatData();
                    }
                }

                // 调用钩子函数处理数据
                self.afterOneDataSetHandle(self, v, model, modelKey);
            });

            // 绑定model到view的属性上，以便获取
            // viewObj.attr("data-model", JSON.stringify(model));

            viewObj.removeAttr("id");
            viewObj.show();
        });
    }
};


// 对于设置了each-templet的，进行遍历的方法
DataLoad.prototype.eachTempletData = function (eachDatas, eachViewTemplet) {
    var self = this;
    if (!isArray(eachDatas)) {
        console.log(" eachTempletData:" + JSON.stringify(eachDatas) + " is not a array.");
        return;
    }
    // 遍历节点
    var jqObj = eachViewTemplet.clone();
    jqObj.removeAttr('each-templet').removeAttr("id");
    var parentObj = eachViewTemplet.parent();
    eachDatas.forEach(function (it) {
        parentObj.append(jqObj);
        // 填充子循环里的数据
        parentObj.children().last().find("*[" + self.modelKey + "]").each(function () {
            var v = $(this);
            var modelKey = $(this).attr(self.modelKey);
            var hasAttrKey = $(this).attr(self.attrKey) !== undefined;
            if (!modelKey) return;
            // 调用钩子函数处理数据
            var lastData = self.beforeOneDataSetHandle(self, v, it[modelKey]);
            // 若设置了attrKey, 优先保存到attrKey上，否则保存到val或text上
            if (hasAttrKey) {
                v.attr(self.attrKey, lastData);
                // 根据设置的属性，格式化数据
                $(this).formatData();
            }
            else {
                if (v.is("input"))
                    v.val(lastData);
                else if (v.is("a"))
                    v.attr('href', lastData);
                else
                    v.text(lastData);
            }

            self.afterOneDataSetHandle(self, v, lastData);
        });

        parentObj.children().last().show();
    })
};


// 获取Bean里 key = abc.def.ggg 的值
DataLoad.prototype.getValueByKey = function (bean, key) {
    var lastValue = bean;
    key.split('.').filter(function (it) {
        return it != '';
    }).forEach(function (it) {
        if (lastValue[it])
            lastValue = lastValue[it]
    });

    return lastValue;
};



