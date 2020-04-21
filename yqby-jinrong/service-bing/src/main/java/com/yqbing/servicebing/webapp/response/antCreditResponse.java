package com.yqbing.servicebing.webapp.response;

public class antCreditResponse {
	
    private Integer type;//1已经开户 2.没有开过户
  
    private String url;
  
    private Object obj;

	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
  
}
