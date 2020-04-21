$(function () {
    var token=localStorage.getItem('token');
    if(!isEmpty(token)){
        $('.iconUserLoginHover').hide();
    }
    if(isEmpty(token)){
        $('.iconLogoutHover').hide();
    }

    $('.toLogin').click(function () {
        window.location.href='../pcPages/login/login.html'
    });
    $('.toRegister').click(function () {
        window.location.href='../login/register.html'
    });
    $('.showUser').hover(function () {
        $('.userBox').fadeIn();
    },function () {
        $('.userBox').fadeOut();
    })
    $('.logo').click(function () {
        // $(this)
        window.location.href='../../index.html';
    })
});
//判断为空
    function isEmpty(src){
        if(("undefined" === typeof src)  || (src === null) || ($.trim(src) === "") ){
            return true;
        }
        return false;
    }

//判断不为空
    function notEmpty(src){
        return !isEmpty(src);
    }
var version='202060';

function urlParameter(paras){
    var url = location.href;
    var paraString = url.substring(url.indexOf("?")+1,url.length).split("&");
    var paraObj = {};
    for (var i=0; j=paraString[i]; i++){
        paraObj[j.substring(0,j.indexOf("=")).toLowerCase()] = j.substring(j.indexOf("=")+1,j.length);
    }
    var returnValue = paraObj[paras.toLowerCase()];
    if(typeof(returnValue)=="undefined"){
        return "";
    }else{
        return returnValue;
    }
}
addTimes();
function addTimes(){
    var date=new Date();
    var time=date.getTime();
    $('html').find('script').each(function () {
        var c=$(this).attr('src');
        var nh=c+'?times='+time;
        $(this).attr('src',nh);
    });
    $('html').find('link').each(function () {
        var c=$(this).attr('href');
        var nh=c+'?times='+time;
        $(this).attr('href',nh);
    })
}
var logo='http://pbzxefl02.bkt.clouddn.com/jihuLogo.png';
//公共头部显示

function  getPath(){
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    var result = pathName.substr(0,index+1);
    return result;
}
footer();
function footer(){
    $('.footer').html('Copyright © 2017 - 2018  机呼yqbing.com 版权所有|消费者客服热线：010-53359005经营证照\n')
}
// var
//去除+
function replaceStr(str){
    str=str.replace(/\+/g,"%2B");
    return str;
}
//显示更多菜单
function clickAgain() {
    var isTrue = true;
    $('.more').click(function () {
        if (isTrue) {
            $('.shopMoreBox').show('1000');
            isTrue = false;
        } else {
            $('.shopMoreBox').hide('1000');
            isTrue = true;
        }
    })
}

// 图片放大自写
function bigImg() {
    for(var i=0;i<100;i++){
        $("[data-big="+i+"]").click(function () {
            $('.bgOverBig').show();
            $('body').css({'overflow':'hidden'});
            $('.bgOverBig').after('<div style="width: 100%;text-align: center;position: fixed;top: 5%;z-index:999;"><img class="bigImg" src="'+$(this).attr('src')+'"></div>');
            $('.bigImg').animate({
                'width':'70%',
                'height':'80%'
            });
            $('.bigImg').click(function () {
                $(this).remove();
                $('body').css({'overflow':'auto'});
                $('.bgOverBig').hide();
            });
            $('.bgOverBig').click(function () {
                $('body').css({'overflow':'auto'});
                $('.bgOverBig').hide();
                $('.bigImg').remove();
            })


        })
    }
}
function goBack(){
    history.go(-1);
}


var kuaixia='http://p2a60yqmm.bkt.clouddn.com/kuaixia-release-20191010.apk';






