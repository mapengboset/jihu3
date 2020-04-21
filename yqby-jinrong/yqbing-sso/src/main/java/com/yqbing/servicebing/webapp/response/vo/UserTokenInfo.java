package com.yqbing.servicebing.webapp.response.vo;

import java.io.Serializable;

import com.yqbing.servicebing.repository.database.bean.UserToken;



public class UserTokenInfo implements Serializable {

	private static final long serialVersionUID = 9008359734270073337L;
	private Long userId;
	private Integer appId;
	private String token;
	
	public UserTokenInfo() {
		
	}
	
	public UserTokenInfo(UserToken userToken) {
		this.userId = userToken.getUserId();
		this.appId = userToken.getAppId();
		this.token = userToken.getToken();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
