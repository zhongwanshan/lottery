(function () {
    var pageVue = new Vue({
        el: "#js-orderList",
        data: {
            mescroll: null,
            orderList: [],
            statu: CONFIG.ORDERSTATU,
            orderParam: {
                action: CONFIG.ACTION.getOrderList,
                pageSize: 10,
                pageNum: 1,
                beginDay: "",
                endDay: "",
                orderStatus: "",
            },
            orderStatus: ""
        },
        watch: {
            "orderStatus": function (value) {
                var self = this;

                self.orderParam.pageNum = 1;
                self.orderList = [];

                if(value.length == 0) {
                    delete self.orderParam.orderStatus;
                } else {
                    self.orderParam.orderStatus = value;
                }
                self.getOrderList();
            },
            "orderParam.beginDay": function() {
                var self = this;
                self.orderParam.pageNum = 1;
                self.orderList = [];
                self.getOrderList();
            },
            "orderParam.endDay": function() {
                var self = this;
                self.orderParam.pageNum = 1;
                self.orderList = [];
                self.getOrderList();
            }
        },
        methods: {
            getOrderList: function () {
                var self = this;
                utility.interactWithServer({
                    headerInfo: {
                        userId: !!USERINFO ? USERINFO["userId"] : "",
                        userToken: !!USERINFO ? USERINFO["userToken"] : "",
                        actionUrl: utility.formatActionUrl(CONFIG.SERVICE.commonOrderService, CONFIG.ACTION.getOrderList, self.orderParam),
                    },
                    url: CONFIG.HOST + CONFIG.SERVICE.commonOrderService,
                    dataObj: self.orderParam,
                    successCallback: function (data) {
                        if (data.code == 200) {

                            if (data.data.length > 0) {
                                // 如果不是最后一页
                                if (self.orderParam.pageNum <= Math.ceil(data.count / self.orderParam.pageSize)) {
                                    self.orderParam.pageNum = self.orderParam.pageNum + 1;
                                    self.orderList = self.orderList.concat(data.data);
                                }
                            }
                            self.mescroll.endBySize(self.orderList.length, data.count);
                            self.mescroll.endSuccess(); //无参
                        }
                    },
                    errorCallback: function () {
                        self.mescroll.endErr();
                    }
                });
            }
        },
        created: function () {
            var self = this;
            var monthNames = ["一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"];
            var dayNamesShort = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];

            setTimeout(function() {
                var startTime = app.calendar({
                    input: "#startTime",
                    monthNames: monthNames,
                    dayNamesShort: dayNamesShort,
                    onDayClick: function(p, dayContainer, year, month, day) {
                        self.orderParam.beginDay = year + "-" + (parseInt(month,10)+1) + "-" + day;
                    }
                }); 
                var endTime = app.calendar({
                    input: "#endTime",
                    monthNames: monthNames,
                    dayNamesShort: dayNamesShort,
                    onDayClick: function(p, dayContainer, year, month, day) {
                        self.orderParam.endDay = year + "-" + (parseInt(month,10)+1) + "-" + day;
                    }
                }); 
            },1000);
        },
        mounted: function () {
            //创建MeScroll对象,down可以不用配置,因为内部已默认开启下拉刷新,重置列表数据为第一页
            //解析: 下拉回调默认调用mescroll.resetUpScroll(); 而resetUpScroll会将page.num=1,再执行up.callback,从而实现刷新列表数据为第一页;
            var self = this;
            self.mescroll = new MeScroll("mescroll", { //请至少在vue的mounted生命周期初始化mescroll,以确保您配置的id能够被找到
                down: {
                    // auto: false, //是否在初始化完毕之后自动执行下拉回调callback; 默认true
                    callback: function () {
                        self.getOrderList();
                    } //下拉刷新的回调
                },
                up: {
                    auto: false, //是否在初始化完毕之后自动执行下拉回调callback; 默认true
                    callback: function () {
                        self.getOrderList();
                    } //下拉刷新的回调
                },
            });
        }
    });
}())