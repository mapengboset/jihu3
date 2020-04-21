package com.yqbing.servicebing.exception;

import com.yqbing.servicebing.utils.enums.ErrorCode;




public class LoginException extends YqbyRuntimeException {
	
	private static final long serialVersionUID = 1L;

	private String loginUrl;
	
	public LoginException(ErrorCode errorCode, String message) {
		super(errorCode, message);
	}
	
	public LoginException(ErrorCode errorCode, String message, String loginUrl) {
		super(errorCode, message);
		this.loginUrl = loginUrl;
	}
	
	public LoginException(ErrorCode errorCode, String message, String loginUrl, Object data) {
		super(errorCode, message, data);
		this.loginUrl = loginUrl;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	

	
	
}
