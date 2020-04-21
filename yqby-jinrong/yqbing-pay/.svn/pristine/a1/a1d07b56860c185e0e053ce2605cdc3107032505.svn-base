package com.yqbing.servicebing.utils.enums;

/**
 * URL转链
 */
public enum ConvertUrlObjTypeEnum {

	COMMON(0, "普通转链"),
	CASH_GIFT(1, "淘礼金"),
	GOODS_PWD(2, "淘口令");
	
	private int id;
	private String name;
	
	private ConvertUrlObjTypeEnum(int id, String name){
		this.name=name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public static ConvertUrlObjTypeEnum getEnum(int accessType){
		ConvertUrlObjTypeEnum typeEnum = null;
		ConvertUrlObjTypeEnum[] accessTypeEnums = ConvertUrlObjTypeEnum.values();
		for (ConvertUrlObjTypeEnum relation : accessTypeEnums) {
			if(relation.getId() == accessType){
				typeEnum = relation;
				break;
			}
		}
		return typeEnum;
	}
}
