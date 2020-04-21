package com.yqbing.servicebing.webapp.wxpay.pay;

import java.io.Serializable;

/**
 * description: 微信支付回调
 * @author mapb
 * @since 
 * @see
 */
@SuppressWarnings("serial")
public class WxPayResult implements Serializable {
	
	/** 公众号appid**/
	private String appid;
	/** 商户ID**/
	private String mchId;
	/** 设备号 **/
	private String device_info;
	/** 随机数**/
	private String nonceStr;
	/** 签名**/
	private String sign;
	/**  签名类型**/	
	private String sign_type;
	/** 业务结果**/
	private String resultCode;
	/** 错误代码**/
	private String err_code;
	/** 错误代码描述**/
	private String err_code_des;
	/** 用户openid**/
	private String openid;
	/** 是否关注公众账号**/
	private String is_subscribe;
	/** 交易类型**/
	private String trade_type;
	/** 支付银行**/
	private String bankType;
	/**订单金额**/
	private String total_fee;
	/** 货币种类**/
	private String fee_type;
	/** 现金支付金额**/
	private String cash_fee;
	/** 现金支付货币类型**/
	private String cash_fee_type;
	/** 微信支付交易号**/
	private String transaction_id;
	/** 订单号**/
	private String out_trade_no;
	/** 商家数据包**/
	private String attach;
	/** 支付完成时间**/
	private String time_end;
	
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getMchId() {
		return mchId;
	}
	public void setMchId(String mchId) {
		this.mchId = mchId;
	}
	public String getDevice_info() {
		return device_info;
	}
	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}
	public String getNonceStr() {
		return nonceStr;
	}
	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getSign_type() {
		return sign_type;
	}
	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getErr_code() {
		return err_code;
	}
	public void setErr_code(String err_code) {
		this.err_code = err_code;
	}
	public String getErr_code_des() {
		return err_code_des;
	}
	public void setErr_code_des(String err_code_des) {
		this.err_code_des = err_code_des;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getIs_subscribe() {
		return is_subscribe;
	}
	public void setIs_subscribe(String is_subscribe) {
		this.is_subscribe = is_subscribe;
	}
	public String getTrade_type() {
		return trade_type;
	}
	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}
	public String getFee_type() {
		return fee_type;
	}
	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}
	public String getCash_fee() {
		return cash_fee;
	}
	public void setCash_fee(String cash_fee) {
		this.cash_fee = cash_fee;
	}
	public String getCash_fee_type() {
		return cash_fee_type;
	}
	public void setCash_fee_type(String cash_fee_type) {
		this.cash_fee_type = cash_fee_type;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public String getTime_end() {
		return time_end;
	}
	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}
	
}