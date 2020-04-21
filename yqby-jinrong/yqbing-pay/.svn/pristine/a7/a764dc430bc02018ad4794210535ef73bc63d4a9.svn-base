package com.yqbing.servicebing.webapp.request.trade.dto;

import com.yqbing.servicebing.repository.database.bean.Trade;



/**
 * Title:TradeInfo.java
 * Description:
 * @author alexaz
 * 2019年7月16日
 */
public class TradeInfo extends Trade {

	private static final long serialVersionUID = 1L;
	/**
	 * 商品信息（json）
	 */
	protected String goods;
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
	
	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
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

	@Override
	public String toString() {
		return "TradeInfo [goods=" + goods + ", returnUrl=" + returnUrl + ", notifyUrl=" + notifyUrl + ", goodsItem=" + goodsItem + ", id=" + id + ", customerId=" + customerId
				+ ", payGroupId=" + payGroupId + ", orderId=" + orderId + ", payId=" + payId + ", payProvider=" + payProvider + ", payChannel=" + payChannel + ", payAmount="
				+ payAmount + ", totalAmount=" + totalAmount + ", USER=" + userId + ", tradeStatus=" + tradeStatus + ", payTime=" + payTime + ", createTime="
				+ createTime + "]";
	}

}
