package com.yqbing.servicebing.webapp.request.pay.po;

import java.io.Serializable;

public class PayGroupApp implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static final int STATE_OK = 1;
	
	public static final int STATE_DELETE = 0;
	
	protected Integer id;		
	/**
	 * 支付组id
	 */
	protected Integer payGroupId;
	/**
	 * 支付提供商
	 */
	protected String payProvider;	
	/**
	 * PayApp的id
	 */
	protected Integer payAppId;	
	/**
	 * 状态：1-正常 0-停用
	 */
	protected Integer state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPayGroupId() {
		return payGroupId;
	}

	public void setPayGroupId(Integer payGroupId) {
		this.payGroupId = payGroupId;
	}

	public String getPayProvider() {
		return payProvider;
	}

	public void setPayProvider(String payProvider) {
		this.payProvider = payProvider;
	}

	public Integer getPayAppId() {
		return payAppId;
	}

	public void setPayAppId(Integer payAppId) {
		this.payAppId = payAppId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "PayGroupAccount [id=" + id + ", payGroupId=" + payGroupId + ", payProvider=" + payProvider + ", payAppId=" + payAppId + ", state=" + state + "]";
	}


	
}
