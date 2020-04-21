package com.yqbing.servicebing.exception;

import com.yqbing.servicebing.utils.enums.ErrorCode;



public class ObjectNotExistsException extends YqbyRuntimeException {

	public ObjectNotExistsException(ErrorCode errorCode, String message) {
		super(errorCode, message);
	}
	
	public ObjectNotExistsException(ErrorCode errorCode, String message, Object data) {
		super(errorCode, message, data);
	}

	private static final long serialVersionUID = 1L;

	
}
