package com.yqbing.servicebing.webapp.response;

import java.io.Serializable;

public class BoxOrder implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4100882621562716086L;
	
	
	private String orderNo;
	private String storeAddress;//网吧地址
	private String createTime;
	private String description;
	private String status;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
