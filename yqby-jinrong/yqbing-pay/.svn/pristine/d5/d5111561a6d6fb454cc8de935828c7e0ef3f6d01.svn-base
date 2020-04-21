package com.yqbing.servicebing.webapp.request.pay.enums;

import java.util.HashMap;
import java.util.Map;

public enum AlipayTradeStatusEnum {

	TRADE_FINISHED("TRADE_FINISHED", "交易完成", ""),
	TRADE_SUCCESS("TRADE_SUCCESS", "支付成功", ""),
	WAIT_BUYER_PAY("WAIT_BUYER_PAY", "交易创建", ""),
	TRADE_CLOSED("TRADE_CLOSED", "交易关闭", "");

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
	
	
	private static Map<String, AlipayTradeStatusEnum> enumMap = new HashMap<String, AlipayTradeStatusEnum>();
	
	static{
		for (AlipayTradeStatusEnum enumObj : AlipayTradeStatusEnum.values()) {
			enumMap.put(enumObj.getId(), enumObj);
		}
	}

	private AlipayTradeStatusEnum(String id, String name, String table) {
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
		
		AlipayTradeStatusEnum enumObj = enumMap.get(id);
		return enumObj != null ? enumObj.getName() : "";
	}
	
	public static String getTable(String id) {
		
		AlipayTradeStatusEnum enumObj = enumMap.get(id);
		return enumObj != null ? enumObj.getTable() : "";
	}
	


}
