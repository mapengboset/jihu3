package com.yqbing.servicebing.utils.enums;

import java.io.Serializable;

public class ErrorBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer code;
	
	private String title;
	
	private String message;
	
	private Object body;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "ErrorBean [code=" + code + ", title=" + title + ", message=" + message + ", body=" + body + "]";
	}
}