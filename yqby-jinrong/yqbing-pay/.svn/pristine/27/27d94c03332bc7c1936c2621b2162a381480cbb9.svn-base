package com.yqbing.servicebing.repository.database.bean;

import java.io.Serializable;
import java.util.Date;


/**
 * Title:Trade.java
 * Description:
 * @author alexaz
 * 2019年7月16日
 */
public class Trade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected String id;
	/**
	 * 业务方id
	 */	
	protected Integer customerId;
	/**
	 * 支付组id
	 */
	protected Integer payGroupId;
	/**
	 * 业务方订单号
	 */
	protected String orderId;
	/**
	 * 支付提供方交易号
	 */
	protected String payId;	
	/**
	 * 支付提供商
	 */
	protected String payProvider;
	/**
	 * 支付渠道
	 */
	protected String payChannel;
	/**
	 * 支付金额（分）
	 */
	protected Long payAmount;
	/**
	 * 总金额（分）
	 */
	protected Long totalAmount;
	/**
	 * passport用户id，免登陆支付为0
	 */
	protected Long userId;
	/**
	 * 交易状态
	 * @see TradeStatusEnum
	 */
	protected Integer tradeStatus;
	/**
	 * 支付时间
	 */
	protected Date payTime;
	/**
	 * 订单创建时间
	 */
	protected Date createTime;
	
	protected Integer appChannel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getPayGroupId() {
		return payGroupId;
	}

	public void setPayGroupId(Integer payGroupId) {
		this.payGroupId = payGroupId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getPayProvider() {
		return payProvider;
	}

	public void setPayProvider(String payProvider) {
		this.payProvider = payProvider;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public Long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(Integer tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public Date getPayTime() {
		return payTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getAppChannel() {
		return appChannel;
	}

	public void setAppChannel(Integer appChannel) {
		this.appChannel = appChannel;
	}

	@Override
	public String toString() {
		return "Trade [id=" + id + ", customerId=" + customerId + ", payGroupId=" + payGroupId + ", orderId=" + orderId
				+ ", payId=" + payId + ", payProvider=" + payProvider + ", payChannel=" + payChannel + ", payAmount="
				+ payAmount + ", totalAmount=" + totalAmount + ", userId=" + userId + ", tradeStatus=" + tradeStatus
				+ ", payTime=" + payTime + ", createTime=" + createTime + ", appChannel=" + appChannel + "]";
	}

	
	
	
}
