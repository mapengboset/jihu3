package com.yqbing.servicebing.webapp.request.dto;

import java.io.InputStream;
import java.io.Serializable;

import com.github.wxpay.sdk.WXPayConfig;


/**
 * 开发者id(AppID)
 * 开发者密码(AppSecret)	
 * 商户号
 * 签名秘钥	在商户平台（pay.weixin.qq.com）中
 */
public class WxpayAppConfig implements WXPayConfig, Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * appid
	 */
	private String appID;
	/**
	 * 商户号
	 */
	private String mchID;
	/**
	 * 签名秘钥
	 */
	private String key;
	/**
	 * 连接超时时间
	 */
	private int httpConnectTimeoutMs;
	/**
	 * 读数据超时
	 */
	private int httpReadTimeoutMs;
	/**
	 * 是否使用沙箱环境
	 */
	private boolean useSandbox;

	@Override
	public String getAppID() {
		
		return appID;
	}

	@Override
	public String getMchID() {
		
		return mchID;
	}

	@Override
	public String getKey() {
		
		return key;
	}

	@Override
	public InputStream getCertStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHttpConnectTimeoutMs() {
		
		return httpConnectTimeoutMs;
	}

	@Override
	public int getHttpReadTimeoutMs() {
		
		return httpReadTimeoutMs;
	}

	public void setAppID(String appID) {
		this.appID = appID;
	}

	public void setMchID(String mchID) {
		this.mchID = mchID;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setHttpConnectTimeoutMs(int httpConnectTimeoutMs) {
		this.httpConnectTimeoutMs = httpConnectTimeoutMs;
	}

	public void setHttpReadTimeoutMs(int httpReadTimeoutMs) {
		this.httpReadTimeoutMs = httpReadTimeoutMs;
	}

	public boolean isUseSandbox() {
		return useSandbox;
	}

	public void setUseSandbox(boolean useSandbox) {
		this.useSandbox = useSandbox;
	}
	
	
	
	
}
