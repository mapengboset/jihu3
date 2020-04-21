package com.yqbing.servicebing.exception;

import com.yqbing.servicebing.utils.enums.ErrorCode;



public class ParameterInvalidException extends YqbyRuntimeException {

	public ParameterInvalidException(ErrorCode errorCode, String message) {
		super(errorCode, message);
	}
	
	public ParameterInvalidException(ErrorCode errorCode, String message, Object data) {
		super(errorCode, message, data);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
