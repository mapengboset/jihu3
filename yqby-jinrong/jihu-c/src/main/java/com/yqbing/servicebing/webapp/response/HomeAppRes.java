package com.yqbing.servicebing.webapp.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel(value = "首页")
public class HomeAppRes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4797450879808361006L;
	private Integer id;//id
	@ApiModelProperty(value = "app名称", name = "appName")
	private String appName;//名称
	@ApiModelProperty(value = "app包名", name = "appPake")
	private String appPake;//包名
	@ApiModelProperty(value = "app大小", name = "appSize")
	private String appSize;//
	@ApiModelProperty(value = "appType类型", name = "appType")
	private String appType;//包名
	@ApiModelProperty(value = "applog图片", name = "img")
	private String img;//头像
	@ApiModelProperty(value = "app下载地址", name = "url")
	private String url;//下载地址
	@ApiModelProperty(value = "列表排序规则", name = "sort")
	private Integer sort;//排序
	@ApiModelProperty(value = "首页分类", name = "TAGID")
	private String TAGID;//首页分类
	@ApiModelProperty(value = "首页分类名称", name = "TngIDName")
	private String TngIDName;//首页分类
	
	private Integer localstatus;//1.打开
	
	private Integer type;//1.普通 2.任务
	private Integer isHot;//  0:非hot 1: hot
	
	
	
	
	
	public String getAppSize() {
		return appSize;
	}
	public void setAppSize(String appSize) {
		this.appSize = appSize;
	}
	public Integer getIsHot() {
		return isHot;
	}
	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getLocalstatus() {
		return localstatus;
	}
	public void setLocalstatus(Integer localstatus) {
		this.localstatus = localstatus;
	}
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	public String getTngIDName() {
		return TngIDName;
	}
	public void setTngIDName(String tngIDName) {
		TngIDName = tngIDName;
	}
	public String getTAGID() {
		return TAGID;
	}
	public void setTAGID(String tAGID) {
		TAGID = tAGID;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppPake() {
		return appPake;
	}
	public void setAppPake(String appPake) {
		this.appPake = appPake;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	

}
