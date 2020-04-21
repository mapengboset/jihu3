function getUrl(isDebug){
	var url="";
	if(isDebug=='new'){
        url="http://jihustoreapi.yqbing.com/";
    }else{
        if(isDebug){
            // url="http://webt.yqbing.com/";
            url="http://webjsb.yqbing.com/";

        }else{
            url="http://webt.yqbing.com/";
            // url="http://webjsb.yqbing.com/";
        }
	}
	return url;
}

// 服务接口路径
// window.ctx = 'http://webt.yqbing.com/';
window.ctx = 'http://webjsb.yqbing.com/';
// 网站根路径
// window.path = 'http://webt.yqbing.com/h5';
 window.path = 'http://webjsb.yqbing.com/h5';