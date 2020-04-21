package com.yqbing.servicebing.utils.enums;

/**
 * 店铺账号管理类型
 */
public enum CpsChannelEnum {

	TAOBAO(0, "淘宝"),
	JD(1, "京东"),
	PDD(2, "拼多多");
	
	private int id;
	private String name;
	
	private CpsChannelEnum(int id, String name){
		this.name=name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public static CpsChannelEnum getEnum(int accessType){
		CpsChannelEnum typeEnum = null;
		CpsChannelEnum[] accessTypeEnums = CpsChannelEnum.values();
		for (CpsChannelEnum relation : accessTypeEnums) {
			if(relation.getId() == accessType){
				typeEnum = relation;
				break;
			}
		}
		return typeEnum;
	}
}
