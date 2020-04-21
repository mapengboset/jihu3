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
// addTimes();
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
function headerShow() {
    var header ='<div class="layui-container">\n' +
        '        <div class="logo1 toIndex fl">\n' +
        '            <img class="" src="'+logo+'" alt="机呼 - 买卖手机，上机呼。" title="机呼 - 买卖手机，上机呼。">\n' +
        '        </div>\n' +
        '        <ul class="menu fl">\n' +
        '            <li>\n' +
        '                <a class="menuIndex">首页</a>\n' +
        '                <a class="menuPrice">报价</a>\n' +
        '                <a class="menuDaili">代理商</a>\n' +
        // '                <a class="menuZs">招商</a>\n' +
        '                <a class="menuJoin">加入我们</a>\n' +
        '                <a class="menuAbout">关于我们</a>\n' +
        '                <a class="menuMoney">我的财富</a>\n' +
        '<label class="menuBtn"><span class="loginMenu">登录</span><span class="registerMenu">注册</span></label>'+
        '<label class="logout"><div class="iconAndTel"><p><i class="iconfont colorBlue">&#xe651;</i></p><p class="userTel"></p></div><span class="logoutBtn">退出</span></label>'+
        // '                <a><i class="icon iconFind"></i></a>\n' +
        // '                <a class="showUser">\n' +
        // '                    <i class="iconfont">&#xe651;</i>\n' +
        // '                    <div class="userBox">\n' +
        // '                        <span><img src="images/trangle_03.png" alt=""></span>\n' +
        // '                        <div class="userBoxBg">\n' +
        // '                            <h4>欢迎来到及时宝</h4>\n' +
        // '                            <ul>\n' +
        // '                                <li class="iconUserSmallHover">\n' +
        // '                                    <i class="icon iconUserSmall"></i>\n' +
        // '                                    <span>个人中心</span>\n' +
        // '                                </li>\n' +
        // '                                <li class="iconUserLoginHover">\n' +
        // '                                    <i class="icon iconUserLogin"></i>\n' +
        // '                                    <span><em class="toLogin">登录</em>/<em class="toRegister">注册</em></span>\n' +
        // '                                </li>\n' +
        // '                                <li class="iconLogoutHover">\n' +
        // '                                    <i class="icon iconLogout"></i>\n' +
        // '                                    <span>退出</span>\n' +
        // '                                </li>\n' +
        // '                            </ul>\n' +
        // '                        </div>\n' +
        // '\n' +
        // '                    </div>\n' +
        // '                </a>\n' +
        '            </li>\n' +
        '        </ul>\n' +
        '<div class="clear"></div>'+
        '        <ul class="mobileUl">\n' +
        '        </ul>\n' +
        '    </div>';
    $('.header').html(header);
}

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


var jiHuB='http://p2a60yqmm.bkt.clouddn.com/jihustore-app-v242-150845.apk';
var jiHuZ='http://p2a60yqmm.bkt.clouddn.com/app-release_112_jiagu_sign.apk';
var jiHuC='http://pbzxefl02.bkt.clouddn.com/com_jihu_jihu_v2.0.2_20180911_self_202_jiagu_sign.apk';


var url=location.href;
var turl=url.indexOf('jhtest');
var burl=url.indexOf('http://localhost:63342');
if(turl>-1){
    var ONLINEURL='http://webtest.yqbing.com/';
    var WZURL='https://jinrongt.jihustore.com/'
}else{
    if(burl>-1){
        var use=-2;
        use>0?ONLINEURL=getUrl('new'):ONLINEURL='http://webtest.yqbing.com/';
        use>0?WZURL='https://jinrong.jihustore.com/':WZURL='https://jinrongt.jihustore.com/';
    }else{
        var ONLINEURL=getUrl('new');
        var WZURL='https://jinrong.jihustore.com/'
    }
}


var u = navigator.userAgent, app = navigator.appVersion;
var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Linux') > -1; //g
if(isAndroid){
    $('body').css('background','#fff');
}

