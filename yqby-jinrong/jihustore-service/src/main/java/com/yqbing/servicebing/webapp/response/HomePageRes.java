package com.yqbing.servicebing.webapp.response;

import java.util.List;

import com.yqbing.servicebing.webapp.request.Days;
import com.yqbing.servicebing.webapp.request.Discount;

public class HomePageRes {

	//全部商品
	private List<Goods> goods;
	//是否签到
	private Integer sign;//0未签到 1已经签到
	private Integer ral;//当前积分
	private Integer signDay;//连续签到天数
	private List<Days> days;//日期列表
	private List<Discount> discount;
	
	//中奖记录
	
	private List<AwardRes> Award;
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	public Integer getSign() {
		return sign;
	}
	public void setSign(Integer sign) {
		this.sign = sign;
	}
	public List<AwardRes> getAward() {
		return Award;
	}
	public void setAward(List<AwardRes> award) {
		Award = award;
	}
	public Integer getRal() {
		return ral;
	}
	public void setRal(Integer ral) {
		this.ral = ral;
	}
	public Integer getSignDay() {
		return signDay;
	}
	public void setSignDay(Integer signDay) {
		this.signDay = signDay;
	}
	public List<Days> getDays() {
		return days;
	}
	public void setDays(List<Days> days) {
		this.days = days;
	}
	public List<Discount> getDiscount() {
		return discount;
	}
	public void setDiscount(List<Discount> discount) {
		this.discount = discount;
	}
	
	
}
