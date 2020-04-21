package com.yqbing.servicebing.webapp.request.pay.po;

import java.io.Serializable;
import java.util.Date;

/**
 * Title:PayApp.java
 * Description:支付提供商平台配置信息
 * @author alexaz
 * 2019年7月16日
 */
public class PayApp implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected Integer id;
	/**
	 * appid
	 */
	protected String appId;
	/**
	 * 支付配置信息（json）
	 */
	protected String config;
	/**
	 * 有效期
	 */
	protected Date validTime;
	/**
	 * 支付提供商
	 */
	protected String payProvider;
	/**
	 * 账号id
	 */
	protected String accountId;
	/**
	 * 账号
	 */
	protected String account;
	/**
	 * 外部业务方id（支付账户是外部客户的，与唯一一个customerId对应）， 0-内部客户
	 */
	protected Integer outCustomerId;
	/**
	 * 状态：1-正常 0-停用
	 */
	protected Integer state;
	
	protected Integer customerId;
	
	protected Integer appChannel;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public Date getValidTime() {
		return validTime;
	}

	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}

	public String getPayProvider() {
		return payProvider;
	}

	public void setPayProvider(String payProvider) {
		this.payProvider = payProvider;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getOutCustomerId() {
		return outCustomerId;
	}

	public void setOutCustomerId(Integer outCustomerId) {
		this.outCustomerId = outCustomerId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getAppChannel() {
		return appChannel;
	}

	public void setAppChannel(Integer appChannel) {
		this.appChannel = appChannel;
	}

	@Override
	public String toString() {
		return "PayApp [id=" + id + ", appId=" + appId + ", config=" + config + ", validTime=" + validTime
				+ ", payProvider=" + payProvider + ", accountId=" + accountId + ", account=" + account
				+ ", outCustomerId=" + outCustomerId + ", state=" + state + ", customerId=" + customerId
				+ ", appChannel=" + appChannel + "]";
	}

	
}
