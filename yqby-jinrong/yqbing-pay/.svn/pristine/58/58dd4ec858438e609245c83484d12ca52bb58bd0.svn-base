package com.yqbing.servicebing.webapp.request.pay.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayUtil;
import com.yqbing.servicebing.webapp.request.dto.WxpayAppConfig;

public class TradeUtil {

	public static void initWxpaySignKey(WxpayAppConfig config) throws Exception {
        
		if(!config.isUseSandbox()){
			return;
		}
		
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("mch_id", config.getMchID());
        data.put("nonce_str", WXPayUtil.generateNonceStr());
        String sign = WXPayUtil.generateSignature(data, config.getKey());
        data.put("sign", sign);
        WXPay wxPay = new WXPay(config);
        String result = wxPay.requestWithoutCert("https://api.mch.weixin.qq.com/sandboxnew/pay/getsignkey", data, 10000, 10000);
        Map<String, String> resMap = WXPayUtil.xmlToMap(result);
        
        if(StringUtils.equals(resMap.get("return_code"), "SUCCESS")){
        	config.setKey(resMap.get("sandbox_signkey"));
        }
    }
}
