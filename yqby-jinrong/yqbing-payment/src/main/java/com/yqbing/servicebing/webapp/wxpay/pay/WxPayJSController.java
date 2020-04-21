package com.yqbing.servicebing.webapp.wxpay.pay;

import java.util.Map;

import com.yqbing.servicebing.webapp.wxpay.util.Signature;


//微信内 js 调起支付 
public class WxPayJSController {

	//统一下订单
	public void getSign(Map<String,Object> packageParams){
		
		String sign = Signature.getSign(packageParams);
	}
	
	//订单查询
	
	//成功回调
	
	//申请退款
	
	//退款成功查询
	
}
