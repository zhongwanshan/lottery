/**
 * 下载阿里云下载方法
 * 依赖：jquery 1.8.0+ , plupload
 */


var downloader = {

    _down: function (key, cb) {
        Apis.uploader_signatureurl.call({
            data: {"key": key},
            success: function (resp) {
                eval("var ret=" + resp);
                if (ret['url'] && cb) {
                    cb(ret['url'])
                }

            },
            error: function (resp) {
                //console.log("获取签名URL出错");
            }
        });
    },

    downfile: function (key) {
        if (key.startsWith(AliOss.urls['public'])) {
            var imgList = ".jpg,.gif,.png,.bmp".split(',');
            var isImg = imgList.some(function (it) {
                return key.endsWith(it)
            });

            if (isImg)
                window.open(key);
            else
                window.location.href = key;
        }
        else {
            if (key.startsWith(AliOss.urls['protected'])) {
                key = key.substring(AliOss.urls['protected'].strlen() + 1, key.length);
            }
            downloader._down(key, function (url) {
                var imgList = ".jpg,.gif,.png,.bmp".split(',');
                var isImg = imgList.some(function (it) {
                    return key.endsWith(it)
                });
                if (isImg)
                    window.open(url);
                else
                    window.location.href = url;
            })
        }
    },

    downpic: function (key, success_cb) {
        downloader._down(key, function (url) {
            success_cb(url)
        })
    },

    downToImg: function (key, imgDom) {
        downloader._down(key, function (url) {
            imgDom.attr('src', url)
        })
    }
};