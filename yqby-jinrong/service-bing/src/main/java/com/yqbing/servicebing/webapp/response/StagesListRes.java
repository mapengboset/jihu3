package com.yqbing.servicebing.webapp.response;

import java.util.List;

public class StagesListRes {

	 private String totalAmount;//金额
	 private String out_trade_no;//订单号
	 private String trade_no_content;//订单内容
	 private List<StagesRes> stages ;
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	public String getTrade_no_content() {
		return trade_no_content;
	}
	public void setTrade_no_content(String trade_no_content) {
		this.trade_no_content = trade_no_content;
	}
	public List<StagesRes> getStages() {
		return stages;
	}
	public void setStages(List<StagesRes> stages) {
		this.stages = stages;
	}
	 
	 
	 
	
}
