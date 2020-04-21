package com.yqbing.servicebing.webapp.request.trade.dto;

import java.io.Serializable;

/**
 * Title:TradeInit.java
 * Description:
 * @author alexaz
 * 2019年7月16日
 */
public class TradeInit implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 交易临时id
	 */
	protected String tradeNo;
	/**
	 * 业务方id
	 */
	protected Integer customerId;
	/**
	 * 业务方订单号
	 */
	protected String orderId;
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
	 * 页面跳转回业务方地址
	 */
	protected String returnUrl;
	/**
	 * 通知业务方地址
	 */
	protected String notifyUrl;
	/**
	 * 商品信息
	 */
	protected Goods goodsItem;
	/**
	 * 业务方回调自定义参数
	 */
	protected String callbackParams;
	/**
	 * passport用户id，免登陆支付为0
	 */
	protected Long userId;
	
	private Integer appChannel;
	
	

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public Goods getGoodsItem() {
		return goodsItem;
	}

	public void setGoodsItem(Goods goodsItem) {
		this.goodsItem = goodsItem;
	}

	public String getCallbackParams() {
		return callbackParams;
	}

	public void setCallbackParams(String callbackParams) {
		this.callbackParams = callbackParams;
	}

	public Integer getAppChannel() {
		return appChannel;
	}

	public void setAppChannel(Integer appChannel) {
		this.appChannel = appChannel;
	}

	@Override
	public String toString() {
		return "TradeInit [tradeNo=" + tradeNo + ", customerId=" + customerId + ", orderId=" + orderId + ", payChannel="
				+ payChannel + ", payAmount=" + payAmount + ", totalAmount=" + totalAmount + ", returnUrl=" + returnUrl
				+ ", notifyUrl=" + notifyUrl + ", goodsItem=" + goodsItem + ", callbackParams=" + callbackParams
				+ ", userId=" + userId + ", appChannel=" + appChannel + "]";
	}

}
