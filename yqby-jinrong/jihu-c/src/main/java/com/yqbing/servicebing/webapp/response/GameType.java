package com.yqbing.servicebing.webapp.response;

import io.swagger.annotations.ApiModelProperty;

public class GameType {
	@ApiModelProperty(value = "类型名称", name = "name")
	private String name;
	@ApiModelProperty(value = "类型值", name = "fidkey")
    private String fidkey;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFidkey() {
		return fidkey;
	}
	public void setFidkey(String fidkey) {
		this.fidkey = fidkey;
	}
	
}
