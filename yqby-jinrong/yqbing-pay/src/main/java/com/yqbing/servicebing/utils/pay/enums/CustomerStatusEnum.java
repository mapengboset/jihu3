package com.yqbing.servicebing.utils.pay.enums;

import java.util.HashMap;
import java.util.Map;

/** 
 * 业务方状态
 */
public enum CustomerStatusEnum {
	
	ENABLED(1,"启用"),
	APPLY(0,"申请中"),
	DISABLED(-1,"禁用")
	;
	
	private int id;
	
	private String name;
	
	private static Map<Integer, CustomerStatusEnum> enumMap;
	
	static {
		enumMap = new HashMap<Integer, CustomerStatusEnum>();
		
		for(CustomerStatusEnum enumObj : CustomerStatusEnum.values()){
			enumMap.put(enumObj.getId(), enumObj);
		}
	}
	
	private CustomerStatusEnum(Integer id, String name){
		this.id = id;
		this.name = name;
	}
	
	public static boolean exist(Integer id){
		return enumMap.get(id) != null;
	}
	
	public static String getName(Integer id){
		CustomerStatusEnum enumObj = enumMap.get(id);
		return enumObj!=null ? enumObj.getName() : "";
	}
	
	public static CustomerStatusEnum getObject(String name){
		for(CustomerStatusEnum enumObj : enumMap.values()){
			if(enumObj.getName().equals(name))
				return enumObj;
		}
		return null;
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
	
	
}
