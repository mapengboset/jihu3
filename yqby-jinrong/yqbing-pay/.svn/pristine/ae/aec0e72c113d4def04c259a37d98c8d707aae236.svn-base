package com.yqbing.servicebing.exception;

import com.yqbing.servicebing.utils.enums.ErrorCode;



public class YqbyException extends Exception {

	private static final long serialVersionUID = 1L;

	private ErrorCode errorCode;
	
	private Object body;
	
	private String[] errorMessageParams;

	public YqbyException(ErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public YqbyException(ErrorCode errorCode, String message, Object data) {
		super(message);
		this.errorCode = errorCode;
		this.body = data;
	}
	
	public YqbyException(ErrorCode errorCode, String message, Object data, String[] errorMessageParams) {
		super(message);
		this.errorCode = errorCode;
		this.body = data;
		this.errorMessageParams = errorMessageParams;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	public Object getData() {
		return body;
	}

	public void setData(Object data) {
		this.body = data;
	}

	public String[] getErrorMessageParams() {
		return errorMessageParams;
	}
	
	
}
