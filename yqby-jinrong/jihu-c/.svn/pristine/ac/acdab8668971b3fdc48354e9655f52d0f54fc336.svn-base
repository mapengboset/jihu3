$(function () {
    addTimes();
    function addTimes(){
        var date=new Date();
        var time=date.getTime();
        $('html').find('script').each(function () {
            var c=$(this).attr('src');
            var h=c.indexOf('.js');
            var nh=c+'?times='+time;
            console.info();
            $(this).attr('src',nh);
        })
    }
    var u = navigator.userAgent, app = navigator.appVersion;
    var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Linux') > -1; //g
    var isIOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
    var ua = window.navigator.userAgent.toLowerCase();
    $('.downBtn').click(function () {
        if(ua.match(/MicroMessenger/i) == 'micromessenger'){
            $('.bgOverShare1').show();
            $('.openInter1').show();
        }else{
            $('.bgOverShare1').hide();
            $('.openInter1').hide();
            if(isAndroid){
                location.href=kuaixia;
            }
        }
        $('.bgOverShare1').click(function () {
            $('.bgOverShare1').hide();
            $('.openInter1').hide();
        });
        $('.openInter1').click(function () {
            $('.bgOverShare1').hide();
            $('.openInter1').hide();
        });
        if(isIOS) {
            location.href='https://itunes.apple.com/cn/app/id1356014666?mt=8';
        }
    })
})
