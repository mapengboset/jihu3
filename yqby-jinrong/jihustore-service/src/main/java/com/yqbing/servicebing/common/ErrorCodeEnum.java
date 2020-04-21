package com.yqbing.servicebing.common;

public enum ErrorCodeEnum {
	/** 成功 */
	SUCCESS("0", "success"),
	/** 数据为空成功 */
	NULLSUCCESS("-1", "success"),
	/** 数据不一致 */
	DISACCORD("-2", "对象不能为空"),
	/** 用户不存在 */
	NULLUSER("-3", "用户不存在，请重新登录"),
	/** 加入黑名单 */
	BLACKLIST("-5", "您已被拉入黑名单。"),
	/** 空对象 */
	NULLOBJECT("100000", "对象为空"),
	/** 非空对象 */
	OBJECT("100001", "对象已经存在"),
	/** 空对象 */
	SYSTEMERROR("110000", "系统异常"),
	/** 空参数 */
	NULLPARAM("200000", "参数不能为空"),
	/** 版本不正确 */
	VERSIONRROR("200001", "版本不正确"),
	/** JSON转换错误 */
	PARAMFORMATERROE("201000", "JSON格式错误"),
	/** 参数错误 */
	PARAMERROE("202000", "参数错误"),
	/** 操作失败 */
	OPERATERROE("300000", "操作失败"),
	NOLOGIN("400000","用户未登录"),
	AUTHERROE("430000","请先授权"),
	/** 短信验证码有误 */
	SIGNED("610000","已签到"),
	NUMBERSIGN("630000","积分不足"),
	AWARDNOTGOODS("640000","奖品不存在"),
	AWARDEXCHANGE("650000","奖品已经兑换"),
	USERCODEERROR("410000", "短信验证码有误");



	
	private String code;
	private String msg;

	private ErrorCodeEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
     
}
