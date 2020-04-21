package com.yqbing.servicebing.utils.qr;

import javax.servlet.http.HttpServletRequest;


public class PayWayUtils {

	
	public static int getPayWay(HttpServletRequest request){
		 String userAgent = request.getHeader("User-Agent");
            int payWay = 0;
            String agent = userAgent.toLowerCase();
            if (agent.indexOf("micromessenger")>0) {
                //用户使用微信访问页面
                payWay = 1;
            }else if(agent.indexOf("alipayclient")>0){
                //用户使用支付宝访问页面
                payWay = 2;
            }
            return payWay;
	}
	
}
