package com.yqbing.servicebing.webapp.response.vo;

import java.io.Serializable;

public class UserAppInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private long userId;
	private String mobile;
	private String platformIds;
	private String relationId;
	private String specialId;

	private Object data;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPlatformIds() {
		return platformIds;
	}

	public void setPlatformIds(String platformIds) {
		this.platformIds = platformIds;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getRelationId() {
		return relationId;
	}

	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}

	public String getSpecialId() {
		return specialId;
	}

	public void setSpecialId(String specialId) {
		this.specialId = specialId;
	}

}
