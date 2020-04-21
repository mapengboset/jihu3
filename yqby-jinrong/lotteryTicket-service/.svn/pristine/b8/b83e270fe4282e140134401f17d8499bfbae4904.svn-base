package com.yqbing.servicebing.webapp.request;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "确认订单")
public class GoodsOrderReq {

	    @ApiModelProperty(value = "验签", name = "sign")
	    private String sign;//地址ID
	    @ApiModelProperty(value = "时间戳", name = "sign")
	    private long timeStamp;//
	   @ApiModelProperty(value = "地址 id ", name = "addressId")
	    private Integer addressId;//地址ID
	   @ApiModelProperty(value = "数量 ", name = "googsNum")
	    private Integer googsNum;//数量
	   @ApiModelProperty(value = "商品ID ", name = "goodsId")  
	    private Integer goodsId;//商品ID
	   @ApiModelProperty(value = "商品单价", name = "price")
	    private BigDecimal price;//单价
	   @ApiModelProperty(value = "快递费用", name = "express")
	    private BigDecimal express;//快递费用
	   @ApiModelProperty(value = "商品费用", name = "amount")
	    private BigDecimal amount;//商品费用
	   @ApiModelProperty(value = "规格", name = "standard")
	    private Integer standardId;//
	    private String token;//
	    @ApiModelProperty(value = "支付方式 0 余额 1支付宝  2微信", name = "payType")
	    private short payType;//支付方式 0 余额 1支付宝  2微信
		@ApiModelProperty(value = "订单渠道 ticket 梦想 agent 代理商", name = "channel")
	    private String channel;
		@ApiModelProperty(value = "代理商用户agentUserId", name = "agentUserId")
		private String agentUserId;
        
		
		
		public String getSign() {
			return sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}

		public long getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(long timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getAgentUserId() {
			return agentUserId;
		}

		public void setAgentUserId(String agentUserId) {
			this.agentUserId = agentUserId;
		}

		public String getChannel() {
			return channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}

		public Integer getAddressId() {
			return addressId;
		}

		public void setAddressId(Integer addressId) {
			this.addressId = addressId;
		}

		public Integer getGoogsNum() {
			return googsNum;
		}

		public void setGoogsNum(Integer googsNum) {
			this.googsNum = googsNum;
		}

		public Integer getGoodsId() {
			return goodsId;
		}

		public void setGoodsId(Integer goodsId) {
			this.goodsId = goodsId;
		}

		
		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public BigDecimal getExpress() {
			return express;
		}

		public void setExpress(BigDecimal express) {
			this.express = express;
		}

		public BigDecimal getAmount() {
			return amount;
		}

		public void setAmount(BigDecimal amount) {
			this.amount = amount;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public short getPayType() {
			return payType;
		}

		public void setPayType(short payType) {
			this.payType = payType;
		}
        
		public Integer getStandardId() {
			return standardId;
		}

		public void setStandardId(Integer standardId) {
			this.standardId = standardId;
		}

		@Override
		public String toString() {
			return "GoodsOrderReq [sign=" + sign + ", timeStamp=" + timeStamp
					+ ", addressId=" + addressId + ", googsNum=" + googsNum
					+ ", goodsId=" + goodsId + ", price=" + price
					+ ", express=" + express + ", amount=" + amount
					+ ", standardId=" + standardId + ", token=" + token
					+ ", payType=" + payType + ", channel=" + channel
					+ ", agentUserId=" + agentUserId + "]";
		}
        
}
