package com.yqbing.servicebing.webapp.response;

import java.math.BigDecimal;

public class WorkRes {

	public int type;//0.彩票 1,支付宝 2.淘宝 3.ETC
	public BigDecimal mongey;//金额
	public Long date;//日期
	
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public BigDecimal getMongey() {
		return mongey;
	}
	public void setMongey(BigDecimal mongey) {
		this.mongey = mongey;
	}
	
	
	
}
