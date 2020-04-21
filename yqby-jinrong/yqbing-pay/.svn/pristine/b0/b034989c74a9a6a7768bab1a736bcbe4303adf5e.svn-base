package com.yqbing.servicebing.webapp.request.pay.enums;

import java.util.HashMap;
import java.util.Map;

public enum WxpayTradeStatusEnum {

	SUCCESS("SUCCESS", "支付成功", "");

	/**
	 * 活动项类型id
	 */
	private String id;
	/**
	 * 活动项类型名称
	 */
	private String name;
	/**
	 * 活动项数据库表名
	 */
	private String table;
	
	
	private static Map<String, WxpayTradeStatusEnum> enumMap = new HashMap<String, WxpayTradeStatusEnum>();
	
	static{
		for (WxpayTradeStatusEnum enumObj : WxpayTradeStatusEnum.values()) {
			enumMap.put(enumObj.getId(), enumObj);
		}
	}

	private WxpayTradeStatusEnum(String id, String name, String table) {
		this.id = id;
		this.name = name;
		this.table = table;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getTable() {
		return table;
	}

	public static boolean exist(String id) {
		
		return enumMap.get(id) != null;
	}
	
	public static String getName(String id) {
		
		WxpayTradeStatusEnum enumObj = enumMap.get(id);
		return enumObj != null ? enumObj.getName() : "";
	}
	
	public static String getTable(String id) {
		
		WxpayTradeStatusEnum enumObj = enumMap.get(id);
		return enumObj != null ? enumObj.getTable() : "";
	}
	


}
