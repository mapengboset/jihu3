package com.yqbing.servicebing.repository.database.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Title:OrderPaySuccess.java
 * Description:记录bussiness的orderId的支付结果，是否有重复支付的情况
 * @author alexaz
 * 2019年7月16日
 */
public class OrderPaySuccess implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static final int STATE_PAY_SUCCESS = 1;

	private Long id;
	
	/**
	 * 业务方id
	 */
	protected Integer customerId;
	/**
	 * 业务方订单号
	 */
	protected String orderId;
	/**
	 * 支付平台交易号
	 */
	private String tradeId;
	/**
	 * 支付提供商
	 */
	private String payProvider;
	/**
	 * 支付提供方交易号
	 */
	private String payId;
	/**
	 * 支付时间
	 */
	private Date payTime;
	/**
	 * 状态:1-支付成功  大于100-重复支付
	 */
	private Integer state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getPayProvider() {
		return payProvider;
	}

	public void setPayProvider(String payProvider) {
		this.payProvider = payProvider;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	
	
	
}
