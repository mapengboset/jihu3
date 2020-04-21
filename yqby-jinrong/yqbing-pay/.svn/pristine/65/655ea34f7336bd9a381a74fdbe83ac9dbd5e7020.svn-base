package com.yqbing.servicebing.webapp.request.pay.enums;

import java.util.HashMap;
import java.util.Map;

public enum PayChannelEnum {
	
	ALIPAY_APP(1, "ALIPAY-APP", "支付宝手机支付"), WXPAY_APP(2, "WXPAY-APP", "微信APP支付"), BALANCE_APP(3, "BALANCE-APP", "余额支付");

	private int id;
	private String channel;
	private String name;

	private PayChannelEnum(int id, String channel, String name) {
		this.name = name;
		this.channel = channel;
		this.id = id;
	}

	private static Map<Integer, PayChannelEnum> enumMap;

	static {
		enumMap = new HashMap<Integer, PayChannelEnum>();

		for (PayChannelEnum enumObj : PayChannelEnum.values()) {
			enumMap.put(enumObj.getId(), enumObj);
		}
	}
	
	public static PayChannelEnum getEnum(int id){
		PayChannelEnum enumObj = enumMap.get(id);
		return enumObj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

}
