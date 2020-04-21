package com.yqbing.servicebing.utils.pay;


public enum PaymentErrorCodeEnum implements PaymentErrorCode {

	CUSTOMER_NOT_EXIST(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 101, "合作者不存在"),
	CUSTOMER_DISABLED(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 102, "合作者不可用"),	
	CUSTOMER_SIGN_INVALID(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 103, "订单签名验证失败"),
	CUSTOMER_TYPE_INVALID(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 104, "合作者类型不存在"),
	
	TRADE_CREATE_FAILED(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 201, "创建交易失败"),
	TRADE_NOT_EXIST(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 202, "交易不存在"),
	TRADE_ORDER_EXIST(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 203, "业务订单已存在"),
	TRADE_REDIRECT_SECURITY_CHECK_FAILED(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 204, "交易跳转安全检查异常"),
	TRADE_AMOUNT_INVALID(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 205, "交易金额不正确"),
	TRADE_RETURN_URL_INVALID(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 206, "交易完成返回地址不正确"),
	TRADE_NOTIFY_URL_INVALID(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 207, "交易完成通知地址不正确"),
	TRADE_GOODS_INVALID(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 208, "交易商品信息不正确"),
	TRADE_IS_PAYED(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 209, "交易已支付"),
	TRADE_SIGN_INVALID(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 210, "交易签名验证失败"),
	TRADE_ID_OR_ORDER_INVALID(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 211, "交易号(tradeId)或订单号(orderId)不存在"),
	TRADE_NOT_PAYED(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 212, "交易未支付"),	
	TRADE_PARAMS_GOODS_SUBJECT_INVALID(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 213, "商品名称不能为空，且长度不超过128个字节"),
	TRADE_PARAMS_GOODS_CONTENT_INVALID(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 214, "商品描述长度不超过127个字节"),
	TRADE_PARAMS_GOODS_NOT_EXIST(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 215, "商品信息不能为空"),
	TRADE_ORDER_PAY_AMOUNT_IS_MODIFY(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 216, "订单支付金额被更改，请重新生成订单号"),
	TRADE_ORDER_TOTAL_AMOUNT_IS_MODIFY(PaymentErrorCodeEnum.CUSTOMER_ERROR_CODE, 217, "订单总金额被更改，请重新生成订单号"),
	
	PAY_ALIPAY_CLIENT_NOT_EXIST(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 301, "支付宝配置不存在"),
	PAY_PROVIDER_INVALID(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 302, "支付提供商不正确"),
	PAY_CHANNEL_INVALID(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 303, "支付渠道不正确"),
	PAY_ALIPAY_SIGN_INVALID(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 304, "支付宝签名不正确"),
	PAY_CALLBACK_DOMAIN_INVALID(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 305, "支付回调地址不正确"),	
	PAY_GROUP_NOT_EXIST(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 306, "支付组不存在"),
	PAY_APP_EXIST(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 307, "支付信息已存在"),
	PAY_APP_CONFIG_INVALID(PaymentErrorCodeEnum.TRADE_ERROR_CODE, 308, "支付配置信息不存在"),
	
	APP_CHANNEL_NOT_EXIST(PaymentErrorCodeEnum.APP_CHANNEL_ERROR_CODE, 401, "支付渠道信息不存在"),

	;
	
	private int root;

	private int code;
	
	private String message;

	private PaymentErrorCodeEnum(int root, int code, String message) {
		
		this.root = root;
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return root + code;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public int getRoot() {
		
		return root;
	}
	
}
