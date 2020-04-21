package com.yqbing.servicebing.utils.enums;

public enum GoodsTypeEnum {

	TAOBAO_GOODS(0, "淘宝普通商品"),
	JD_GOODS(1, "京东普通商品"),
	JD_SECKILL_GOODS(2, "京东秒杀商品"),
	JD_STUPRICE_GOODS(3, "京东学生价商品"),
	JD_JINGFEN_GOODS(4, "京粉精选"),
	PDD_GOODS(5, "拼多多商品分类"),
	PDD_OPT_GOODS(6, "拼多多商品标签"),
	TAOBAO_GOODS_XH(7, "校嗨淘宝商品标签");
	
	private int code;
	private String name;
	
	private GoodsTypeEnum(int code, String name){
		this.name=name;
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
	public static GoodsTypeEnum getEnum(int code){
		GoodsTypeEnum codeEnum = null;
		GoodsTypeEnum[] codeEnums = GoodsTypeEnum.values();
		for (GoodsTypeEnum relation : codeEnums) {
			if(relation.getCode() == code){
				codeEnum = relation;
				break;
			}
		}
		return codeEnum;
	}

}
