package com.yqbing.servicebing.webapp.controller.wx.pay;

import java.io.InputStream;

import com.github.wxpay.sdk.WXPayConfig;

/**
 * 微信支付所需相关值
 * @ClassName WxPayGymData
 * @Date 2016年11月10日
 */
public class WxPayData implements WXPayConfig{

	@Override
	public String getAppID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMchID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getCertStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHttpConnectTimeoutMs() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHttpReadTimeoutMs() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}