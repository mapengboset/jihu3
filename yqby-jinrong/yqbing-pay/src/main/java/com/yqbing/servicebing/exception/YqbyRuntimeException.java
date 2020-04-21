package com.yqbing.servicebing.exception;

import com.yqbing.servicebing.utils.enums.ErrorCode;





public class YqbyRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private ErrorCode errorCode;
	
	private Object data;
	
	private String[] errorMessageParams;

	public YqbyRuntimeException(ErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public YqbyRuntimeException(ErrorCode errorCode, String message, Object data) {
		super(message);
		this.errorCode = errorCode;
		this.data = data;
	}
	
	public YqbyRuntimeException(ErrorCode errorCode, String message, Object data, String[] errorMessageParams) {
		super(message);
		this.errorCode = errorCode;
		this.data = data;
		this.errorMessageParams = errorMessageParams;
	}


	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String[] getErrorMessageParams() {
		return errorMessageParams;
	}
	
	
	
	
}
