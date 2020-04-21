//提示框
function $toast() {
    this.show=function (str,time,callback) {
        var body=document.getElementsByTagName('body');
        var newNode = document.createElement("div");
        newNode.id="zhezhao";
        newNode.innerHTML='<div style="width: 100%;height: 100%;position: absolute;top: 0;left: 0;z-index: 1000;text-align: center;font-size:14px;">'+
            '<span style="display: inline-block; min-width: 100px;padding: 10px;border-radius: 5px; background: rgba(0,0,0,0.81);color: #fff;position: absolute;left: 50%;top: 50%; transform: translate(-50%,-50%);">'+str+'</span>'+
            '</div>';
        body[0].appendChild(newNode);
        var timer=setTimeout(function () {
            var child=document.getElementById("zhezhao");
            body[0].removeChild(child);
            if(callback){
                callback()
            }
            clearTimeout(timer);
        // },time);
        }, 1500);

    }
}
window.$toast=new $toast();

//获取url参数
function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = decodeURIComponent(window.location.search).substr(1).match(reg);
    if(r != null) return unescape(r[2]);
    return null;
}