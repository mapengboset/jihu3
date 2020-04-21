package com.yqbing.servicebing.webapp.response;

public class AntResponse {


  public String out_trade_no;//	String	是	64	外部订单号	6823789339978248
  public String trade_no;//	String	是	64	点赞交易号	153663098602677101801
  public String ali_trade_no;//	String	是	64	支付宝交易号	2018091122001484291004183978
  public String buyer_logon_id;//	String	是	100	用户的登录id	1771971
  public String fund_change	;//String	是	1	本次退款是否发生了资金变化	Y
  public Object refund_fee	;//Price	是	11	退款总金额	88.88
  public String refund_currency;//	String	是	8	退款币种信息	USD
  public Object gmt_refund_pay;//	Date	是	32	退款支付时间	2019-09-11 11:45:57
  public String refund_detail_item_list;//	TradeFundBill	否		退款使用的资金渠道	
  public TradeFundBill  tfb;
  public String store_name;//	String	否	512	交易在支付时候的门店名称	望湘园联洋店
  public String buyer_user_id	;//String	是	28	买家在支付宝的用户id	2088101117955611
  public String present_refund_buyer_amount;//buyer_amount	String	否	11	本次退款金额中买家退款金额	88.88
  public String present_refund_discount_amount;//discount_amount	String	否	11	本次退款金额中平台优惠退款金额	88.88
  public String present_refund_mdiscount_amount;//mdiscount_amount
	
  
  public TradeFundBill getTfb() {
	return tfb;
  }
  public void setTfb(TradeFundBill tfb) {
	this.tfb = tfb;
 }
  public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	public String getTrade_no() {
		return trade_no;
	}
	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}
	public String getAli_trade_no() {
		return ali_trade_no;
	}
	public void setAli_trade_no(String ali_trade_no) {
		this.ali_trade_no = ali_trade_no;
	}
	public String getBuyer_logon_id() {
		return buyer_logon_id;
	}
	public void setBuyer_logon_id(String buyer_logon_id) {
		this.buyer_logon_id = buyer_logon_id;
	}
	public String getFund_change() {
		return fund_change;
	}
	public void setFund_change(String fund_change) {
		this.fund_change = fund_change;
	}
	public Object getRefund_fee() {
		return refund_fee;
	}
	public void setRefund_fee(Object refund_fee) {
		this.refund_fee = refund_fee;
	}
	public String getRefund_currency() {
		return refund_currency;
	}
	public void setRefund_currency(String refund_currency) {
		this.refund_currency = refund_currency;
	}
	public Object getGmt_refund_pay() {
		return gmt_refund_pay;
	}
	public void setGmt_refund_pay(Object gmt_refund_pay) {
		this.gmt_refund_pay = gmt_refund_pay;
	}
	public String getRefund_detail_item_list() {
		return refund_detail_item_list;
	}
	public void setRefund_detail_item_list(String refund_detail_item_list) {
		this.refund_detail_item_list = refund_detail_item_list;
	}
	
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getBuyer_user_id() {
		return buyer_user_id;
	}
	public void setBuyer_user_id(String buyer_user_id) {
		this.buyer_user_id = buyer_user_id;
	}
	public String getPresent_refund_buyer_amount() {
		return present_refund_buyer_amount;
	}
	public void setPresent_refund_buyer_amount(String present_refund_buyer_amount) {
		this.present_refund_buyer_amount = present_refund_buyer_amount;
	}
	public String getPresent_refund_discount_amount() {
		return present_refund_discount_amount;
	}
	public void setPresent_refund_discount_amount(
			String present_refund_discount_amount) {
		this.present_refund_discount_amount = present_refund_discount_amount;
	}
	public String getPresent_refund_mdiscount_amount() {
		return present_refund_mdiscount_amount;
	}
	public void setPresent_refund_mdiscount_amount(
			String present_refund_mdiscount_amount) {
		this.present_refund_mdiscount_amount = present_refund_mdiscount_amount;
	}
  
  

}
