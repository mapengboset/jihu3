package com.yqbing.servicebing.exception;


/**
 * 接口异常类
 *@Title:  
 *@Description:  
 *@Author:mapb 
 *@Since:2018年9月14日  
 *@Version:1.1.0  
 */
public class BingException extends RuntimeException {

	/**
	 * 错误代码.
	 */
	private int errorCode;

	/**
	 *
	 */
	private static final long serialVersionUID = -3125512702043451878L;

	/**
	 * 根据错误代码初始化.
	 * @param errorCode 错误代码.
	 */
	public BingException(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 根据错误代码和错误信息初始化.
	 * @param errorCode int
	 * @param message String
	 */
	public BingException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	/**
	 * 获取错误代码.
	 * @return int
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * 设置错误代码.
	 * @param errorCode int
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * 构造函数
	 * 
	 * @param message 异常消息
	 * @param cause 异常原因
	 */
	public BingException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * 构造函数
	 * 
	 * @param message 异常消息
	 */
	public BingException(String message) {
		super(message);
	}
}
