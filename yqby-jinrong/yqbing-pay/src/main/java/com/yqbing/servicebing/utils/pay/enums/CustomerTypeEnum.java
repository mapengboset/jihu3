package com.yqbing.servicebing.utils.pay.enums;

import java.util.HashMap;
import java.util.Map;

/**  
 * 业务方类型
 */
public enum CustomerTypeEnum {
	
	INNER_CUSTOMER(1,"内部客户"),
	OUTER_CUSTOMER(2,"外部客户")
	;
	
	private int id;
	
	private String name;
	
	private static Map<Integer, CustomerTypeEnum> enumMap;
	
	static {
		enumMap = new HashMap<Integer, CustomerTypeEnum>();
		
		for(CustomerTypeEnum enumObj : CustomerTypeEnum.values()){
			enumMap.put(enumObj.getId(), enumObj);
		}
	}
	
	private CustomerTypeEnum(Integer id, String name){
		this.id = id;
		this.name = name;
	}
	
	public static boolean exist(Integer id){
		return enumMap.get(id) != null;
	}
	
	public static String getName(Integer id){
		CustomerTypeEnum enumObj = enumMap.get(id);
		return enumObj!=null ? enumObj.getName() : "";
	}
	
	public static CustomerTypeEnum getObject(String name){
		for(CustomerTypeEnum enumObj : enumMap.values()){
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
