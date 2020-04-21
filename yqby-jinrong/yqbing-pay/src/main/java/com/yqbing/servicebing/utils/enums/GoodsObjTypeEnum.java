package com.yqbing.servicebing.utils.enums;

/**
 * URL转链
 */
public enum GoodsObjTypeEnum {

	COMMON(0, "普通商品"),
	CASH_GIFT(1, "淘礼金商品");
	
	private int id;
	private String name;
	
	private GoodsObjTypeEnum(int id, String name){
		this.name=name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public static GoodsObjTypeEnum getEnum(int accessType){
		GoodsObjTypeEnum typeEnum = null;
		GoodsObjTypeEnum[] accessTypeEnums = GoodsObjTypeEnum.values();
		for (GoodsObjTypeEnum relation : accessTypeEnums) {
			if(relation.getId() == accessType){
				typeEnum = relation;
				break;
			}
		}
		return typeEnum;
	}
}
