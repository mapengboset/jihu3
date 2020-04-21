package com.yqbing.servicebing.utils.json;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSONUtil {
	private static final Logger log = LoggerFactory.getLogger(JSONUtil.class);
	
	public static int getInt(JSONObject jo, String key) {
		int rtn = 0;
		if(jo != null && jo.containsKey(key)) {
			rtn = jo.getInt(key);
		}
		return rtn;
	}
	
	public static String getString(JSONObject jo, String key) {
		String rtn = StringUtils.EMPTY;
		if(jo != null && jo.containsKey(key)) {
			rtn = jo.getString(key);
		}
		return rtn;
	}

	public static long getLong(JSONObject jo, String key) {
		long rtn = 0;
		try {
			if(jo != null && jo.containsKey(key)) {
				rtn = jo.getLong(key);
			}
		} catch (Exception e) {
			log.error("类型转换错误" + key);
		}
		return rtn;
	}
	
	public static double getDouble(JSONObject jo, String key) {
		double rtn = 0;
		try {
			if(jo != null && jo.containsKey(key)) {
				rtn = jo.getDouble(key);
			}
		} catch (Exception e) {
			log.error("类型转换错误" + key);
		}
		return rtn;
	}
	
}
