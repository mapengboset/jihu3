package com.yqbing.servicebing.webapp.response;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

import com.yqbing.servicebing.repository.database.bean.AppBanner;

public class HomeNewRes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4047424457711628802L;
	/**
	 * 
	 */
	@ApiModelProperty(value = "首页大图", name = "pic")
	private List<AppBanner> pic;//首页大图
	@ApiModelProperty(value = "所有模块", name = "apps")
	private List<HomeModel> models;//
	public List<AppBanner> getPic() {
		return pic;
	}
	public void setPic(List<AppBanner> pic) {
		this.pic = pic;
	}
	public List<HomeModel> getModels() {
		return models;
	}
	public void setModels(List<HomeModel> models) {
		this.models = models;
	}
	
	
}
