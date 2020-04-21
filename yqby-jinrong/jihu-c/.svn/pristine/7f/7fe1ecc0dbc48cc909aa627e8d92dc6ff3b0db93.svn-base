package com.yqbing.servicebing.webapp.response.local;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

import com.yqbing.servicebing.repository.database.bean.AppBanner;
import com.yqbing.servicebing.repository.database.bean.LocalBanner;
import com.yqbing.servicebing.repository.database.bean.LocalCity;

public class LocalPageRes implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1389555592960848718L;
	/**
	 * 
	 */
	@ApiModelProperty(value = "首页大图", name = "pic")
	private List<LocalBanner> pic;//首页大图
	@ApiModelProperty(value = "城市集合", name = "citys")
	private List<LocalCity> citys;//首页大图
	@ApiModelProperty(value = "所有模块", name = "apps")
	private List<LocalModel> models;//
	public List<LocalBanner> getPic() {
		return pic;
	}
	public void setPic(List<LocalBanner> pic) {
		this.pic = pic;
	}
	public List<LocalModel> getModels() {
		return models;
	}
	public void setModels(List<LocalModel> models) {
		this.models = models;
	}
	public List<LocalCity> getCitys() {
		return citys;
	}
	public void setCitys(List<LocalCity> citys) {
		this.citys = citys;
	}
	
	
}
