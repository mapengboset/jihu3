package com.yqbing.servicebing.constants.store;

import java.util.HashMap;
import java.util.Map;

public class ParamConstant {
	
	public static final String PARAM_NAME = "data";
	public static final String TOKEN = "token";
	public static final String LOGIN_USER = "loginUser";
	public static final String LOGIN_PASSWORD = "loginPassword";
	public static final String MOBILE = "mobile";
	public static final String APP_ID = "appChannel";
	public static final String USER_TOKEN = "token";
	public static final String USER_ID = "userId";
	public static final String PLATFORM_ID = "platformId";
	public static final String STORE_ID = "storeId";
	public static final String ROLE_ID = "roleId";
	public static final String RELATION_ID = "relationId";
	public static final String SPECIAL_ID = "specialId";
	public static final String BUSINESS_VALUE = "businessValue";
	public static final String STATUS = "status";
	
	public static final Map<Integer, String> APP_KEY_MAP = new HashMap<Integer, String>();
	static {
		APP_KEY_MAP.put(11, "79b51bb96dd1103f861cb039ed6d326f");
		APP_KEY_MAP.put(21, "924e8ef75ae0f852716e61690108a1c1");
		APP_KEY_MAP.put(22, "2180b1669ff433c0c2fc0d6bda68aaf6");
		APP_KEY_MAP.put(31, "95dc3315491d66339cd175949e975b56");
		APP_KEY_MAP.put(32, "9cfefc36f2d57858a215a111a1806890");
		APP_KEY_MAP.put(41, "0a68e4bf1b22131e8616754f777f117f");
		APP_KEY_MAP.put(42, "f2893a0d1a9142fa6cf8111e64861568");
	}
}
