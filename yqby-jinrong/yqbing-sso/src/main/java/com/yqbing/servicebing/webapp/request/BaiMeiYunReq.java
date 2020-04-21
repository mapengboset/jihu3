package com.yqbing.servicebing.webapp.request;

public class BaiMeiYunReq {
   private String url;
   private String phone;
   private int  type;//0 没有认证 1.已经签署
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
   
}
