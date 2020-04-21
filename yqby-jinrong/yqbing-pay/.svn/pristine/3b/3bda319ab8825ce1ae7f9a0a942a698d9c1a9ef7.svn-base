package com.yqbing.servicebing.webapp.request.pay.enums;

import java.util.HashMap;
import java.util.Map;

public enum PayProviderEnum {
	
	ALIPAY("ALIPAY", "支付宝"),
	WXPAY("WXPAY", "微信"),
	BALANCE("BALANCEPAY", "余额")
	;
	
	private String id;
	
	private String name;
	
	private static Map<String, PayProviderEnum> enumMap;
	
	static {
		enumMap = new HashMap<String, PayProviderEnum>();
		
		for(PayProviderEnum enumObj : PayProviderEnum.values()){
			enumMap.put(enumObj.getId(), enumObj);
		}
	}
	
	private PayProviderEnum(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public static boolean exist(String id){
		return enumMap.get(id) != null;
	}
	
	public static String getPath(String id){
		PayProviderEnum enumObj = getObject(id);
		return enumObj!=null ? enumObj.getName() : "";
	}
	
	public static PayProviderEnum getObject(String id){
		
		return enumMap.get(id);
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
}
