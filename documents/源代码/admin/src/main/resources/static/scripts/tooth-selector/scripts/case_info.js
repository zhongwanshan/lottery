/**
 * Created by Administrator on 2018/4/17.
 */
var alltoothData = JSON.parse($("#orderJson").text())
var toothData = JSON.parse($("#orderJson").text()).orderGoodsList;
var batch = {};     //批次
//直接得出这数据分为几批牙齿
/*console.log("原始全数据：");
console.log(alltoothData);*/
for (var i = 0; i < toothData.length; i++) {
    batch[toothData[i].batchId] = {single: [], connect: [], color: ''}
}
//获取批次对象的长度
var arrBatch = Object.keys(batch);
for (var i = 0; i < toothData.length; i++) {
    for (var j = 0; j < arrBatch.length; j++) {
        if (toothData[i].batchId == arrBatch[j]) {
            if (toothData[i].toothPosition.length > 2) {

                //得将字符串转化为数组 ，方便以后索引判断
                var connectData = toothData[i].toothPosition.split(",");

                batch[arrBatch[j]].connect.push(connectData)
            } else {
                var singleArr = [];
                singleArr.push(toothData[i].toothPosition)
                batch[arrBatch[j]].single.push(singleArr)
            }
        }
    }
}
for (var i = 0; i < arrBatch.length; i++) {
    var batchColor = ToothColor.generate(i);
    batch[arrBatch[i]].color = batchColor;
}
console.log("整合后的数据：");
console.log(batch);
//这个案例数据用来判定连冠 是否有切削点,利用索引值 差距是否相等
var TempleTooth = {
    UPPER: [18, 17, 16, 15, 14, 13, 12, 11, 21, 22, 23, 24, 25, 26, 27, 28],
    LOWER: [48, 47, 46, 45, 44, 43, 42, 41, 31, 32, 33, 34, 35, 36, 37, 38],
}

//牙齿和线的样式处理
for (var i = 0; i < arrBatch.length; i++) {
    //单冠，
    for (var j = 0; j < batch[arrBatch[i]].single.length; j++) {
        var num = batch[arrBatch[i]].single[j];
        $("#tooth" + num + "").find(".cls-4").eq(0).css("fill", batch[arrBatch[i]].color);
        $("#tooth" + num + "").find(".cls-5").eq(0).css("fill", batch[arrBatch[i]].color);
        $("#tooth" + num + "").find("circle").css("visibility", "hidden");
        $("#tooth" + num + "").find("ellipse").css("visibility", "hidden");
    }
    //连冠
    for (var j = 0; j < batch[arrBatch[i]].connect.length; j++) {
        var num = batch[arrBatch[i]].connect[j];
        if (num[0] >= 11 && num[0] <= 28) {
            connectTeeth(TempleTooth.UPPER, batch[arrBatch[i]].color, num)
        } else {
            connectTeeth(TempleTooth.LOWER, batch[arrBatch[i]].color, num)
        }
    }
}

//缺失牙和桥心处理
if (alltoothData.cuttingTeeth.length > 0) {
    var color_black = 'rgb(0, 0, 0)', color_select = 'rgb(251, 251, 251)';
    var arrCuttingTeeth = alltoothData.cuttingTeeth.split(",")
    for (var i = 0; i < arrCuttingTeeth.length; i++) {
        var val = arrCuttingTeeth[i];
        $("#tooth" + val + "").find(".cls-4").eq(0).css({
            "stroke": color_black,
            "stroke-width": 3,
            "fill": color_select
        });
        $("#tooth" + val + "").find(".cls-5").eq(0).css({
            "stroke": color_black,
            "stroke-width": 3,
            "fill": color_select
        });
        $("#tooth" + val + "").find(".cls-6").css("stroke", color_select)
        $("#tooth" + val + "").find("ellipse").css("fill", color_select);
    }
}
if (alltoothData.bridgeTeeth.length > 0) {
    var arrBridgeTeeth = alltoothData.bridgeTeeth.split(",")
    for (var i = 0; i < arrBridgeTeeth.length; i++) {
        var val = arrBridgeTeeth[i];
        $("#tooth" + val + "").find("text").css("fill", "red")
    }
}


//toothPosition:牙齿的位置，上还是下;       toothColor:牙齿颜色  ;      num: 这个连贯的数目
function connectTeeth(toothPosition, toothColor, num) {
    var minIndex = toothPosition.indexOf(parseInt(num[0]));
    var maxIndex = toothPosition.indexOf(parseInt(num[num.length - 1]));
    var difference = Math.abs(parseInt(maxIndex) - parseInt(minIndex));

    if (parseInt(difference) + 1 == num.length) {
        //console.log(num)
        //console.log("这是完整连冠")
        teethStyle(toothPosition, toothColor, num)
    } else {
        //console.log(num)
        //console.log("这是有切削冠")
        var templeContenctData = [];  //原本完整的数据
        if (minIndex < maxIndex) {
            for (var i = minIndex; i < maxIndex + 1; i++) {
                templeContenctData.push(toothPosition[i])
            }
        } else {
            for (var i = maxIndex; i < minIndex + 1; i++) {
                templeContenctData.push(toothPosition[i])
            }
        }
        teethStyle(toothPosition, toothColor, templeContenctData)
    }
}
//填充样式
function teethStyle(toothPosition, toothColor, teethData) {
    for (var i = 0; i < teethData.length; i++) {
        var id = teethData[i];
        $("#tooth" + id + "").find(".cls-4").eq(0).css("fill", toothColor);
        $("#tooth" + id + "").find(".cls-5").eq(0).css("fill", toothColor);
        $("#tooth" + id + "").find("circle").css("visibility", "hidden");
        $("#tooth" + id + "").find("ellipse").css("visibility", "hidden");
    }

    //根据数据组合连接线的数据C1817,删除连接线的样式和状态
    var linedata = [];
    for (var i = 0; i < teethData.length - 1; i++) {
        var num1 = toothPosition.indexOf(parseInt(teethData[i]));
        var num2 = toothPosition.indexOf(parseInt(teethData[i + 1]));
        if (Math.abs(parseInt(num2) - parseInt(num1)) == 1) {
            var linkID = "";
            if (teethData[i + 1] > teethData[i]) {
                linkID = "c" + teethData[i + 1] + teethData[i]
            } else {
                linkID = "c" + teethData[i] + teethData[i + 1]
            }
            $("#connector").each(function () {
                $("#connector").find("#" + linkID + "").css("visibility", "visible");
                $("#connector").find("#" + linkID + "").find("polyline").css("stroke", "rgb(106, 204, 203)")
            })
        }
    }

}


