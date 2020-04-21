package com.yqbing.servicebing.webapp.response;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import com.yqbing.servicebing.repository.jihuc.bean.AppBanner;


public class HomeRes {

	@ApiModelProperty(value = "首页大图", name = "pic")
	private List<AppBanner> pic;//首页大图
	@ApiModelProperty(value = "业务收益", name = "apps")
	private List<WorkRes> works;//
//	@ApiModelProperty(value = "彩票收益", name = "apps")
//	private Map<String,List<TicketRes>> ticket;//
	
	private Integer type;//0.显示 -1,不显示
	public List<AppBanner> getPic() {
		return pic;
	}

	public void setPic(List<AppBanner> pic) {
		this.pic = pic;
	}

	public List<WorkRes> getWorks() {
		return works;
	}

	public void setWorks(List<WorkRes> works) {
		this.works = works;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
}
