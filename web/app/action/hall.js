(function () {
    var pageVue = new Vue({
        el: "#js-pageHall",
        data: {
            digitalData: null,
            cmsList: [],
            cmsImgHost: CONFIG.HOST+":9090/cms/uploads/"
        },
        methods: {
            formatDigitalData: function (data) {
                var self = this;
                var time = [];
                var typeObj = {};

                for (var i = 0, len = data.length; i < len; i++) {
                    time = data[i]["offTime"].split(" ")[1].split(":");
                    typeObj["lottoId" + data[i]["lottoId"]] = data[i];

                    // 如果已经过了销售时间
                    if(Date.parse(new Date())>=Date.parse(new Date(data[i]["offTime"]))) {
                        typeObj["lottoId" + data[i]["lottoId"]]["statu"] = "暂停销售";
                    } else {
                        typeObj["lottoId" + data[i]["lottoId"]]["statu"] = "截至" + time[0] + "时" + time[1] + "分";
                    }
                }

                self.digitalData = typeObj;
            },
            // 获取数字彩列表数据
            getDigitalIssueList: function () {
                var self = this;

                utility.getDigitalIssue({
                    appType: 1,
                    lottoId: "6,11,12,13,14,15,16,17",
                    callback: function (data) {
                        self.formatDigitalData(data.data);
                    }
                });
            }
        },
        created: function () {
            var self = this;

            // utility.findByCodeWithContents({
            //     code: "H5_News",
            //     callback: function (data) {
            //         self.cmsList = data.data.contents;
            //         setTimeout(function () {
            //             var swiper = new Swiper('.swiper-container', {
            //                 speed: 2000,
            //                 spaceBetween: 0,
            //                 autoplay: {
            //                     delay: self.cmsList * 3000
            //                 }
            //             });
            //         }, 2000);
            //     }
            // });

            self.getDigitalIssueList();

        }
    });
}())