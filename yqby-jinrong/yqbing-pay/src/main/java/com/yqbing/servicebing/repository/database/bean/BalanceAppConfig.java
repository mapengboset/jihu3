package com.yqbing.servicebing.repository.database.bean;

import java.io.Serializable;

/**
 * Title:BalanceAppConfig.java
 * Description:余额支付配置
 * @author alexaz
 * 2019年7月16日
 */
public class BalanceAppConfig implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 支付宝支付请求url
	 */
	private String url;
	/**
	 * appid
	 */
	private String appId;
	/**
	 * 密钥
	 */
	private String secretKey;
	/**
	 * 签名类型
	 */
	private String signType;


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	@Override
	public String toString() {
		return "BalanceAppConfig [url=" + url + ", appId=" + appId + ", secretKey=" + secretKey + ", signType="
				+ signType + "]";
	}

	
	
	
}
