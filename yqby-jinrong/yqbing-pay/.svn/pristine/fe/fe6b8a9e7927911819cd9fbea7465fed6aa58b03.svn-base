package com.yqbing.servicebing.webapp.request.trade.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Title:TradeStatusEnum.java
 * Description:交易状态
 * @author alexaz
 * 2019年7月16日
 */
public enum TradeStatusEnum {
	
	WAIT_PAY(0, "交易创建", "WAIT_PAY"),
	TRADE_SUCCESS(1, "支付成功", "TRADE_SUCCESS"),
	TRADE_FINISHED(3, "交易完成", "TRADE_FINISHED"),	
	TRADE_DUPLICATE(7, "重复支付", "TRADE_DUPLICATE"),
	//TRADE_CLOSED(10, "交易关闭", "TRADE_CLOSED"),
	;
	

	
	private int id;
	
	private String name;
	
	private String value;
	
	
	private static Map<Integer, TradeStatusEnum> enumMap = new HashMap<Integer, TradeStatusEnum>();
	
	static{
		for (TradeStatusEnum enumObj : TradeStatusEnum.values()) {
			enumMap.put(enumObj.getId(), enumObj);
		}
	}

	private TradeStatusEnum(Integer id, String name, String value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}

	public static boolean exist(Integer id) {
		
		return enumMap.get(id) != null;
	}
	
	public static String getName(Integer id) {
		
		TradeStatusEnum enumObj = enumMap.get(id);
		return enumObj != null ? enumObj.getName() : "";
	}
	
	public static String getValue(Integer id) {
		
		TradeStatusEnum enumObj = enumMap.get(id);
		return enumObj != null ? enumObj.getValue() : "";
	}
	
	public static boolean isTradeSuccess(Integer id) {
		
		boolean tradeSuccess = id == TradeStatusEnum.TRADE_SUCCESS.getId() || id == TradeStatusEnum.TRADE_FINISHED.getId() || id == TradeStatusEnum.TRADE_DUPLICATE.getId();
		return tradeSuccess;
	}
	
	

}
