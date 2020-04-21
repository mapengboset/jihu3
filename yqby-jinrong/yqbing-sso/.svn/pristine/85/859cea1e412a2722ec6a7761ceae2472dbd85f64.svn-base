package com.yqbing.servicebing.utils.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @title JsonUtils.java
 * @date 2013-5-3
 * @version V1.0
 */
public class JSONUtils {
	private static final Logger LOG = LoggerFactory.getLogger(JSONUtils.class);
	
	private static final ObjectMapper objectMapper;
	static {
		objectMapper = new ObjectMapper();
		// 去掉默认的时间戳格式
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		// 设置为中国北京时区
		objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));
		objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
		// 空值不序列化
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		// 反序列化时，属性不存在的兼容处理
		objectMapper.getDeserializationConfig().withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		// 序列化时，日期的统一格式
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		// 驼峰转下划线
		//objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);


		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		// 单引号处理
		objectMapper.configure(Feature.ALLOW_SINGLE_QUOTES, true);
	}

	public static <T> T toObject(String json, Class<T> clazz) {
		try {
			return objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

	public static <T> String toJson(T entity) {
		try {
			return objectMapper.writeValueAsString(entity);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return null;
	}
	
	public static <T> T toCollection(String json, TypeReference<T> typeReference) {
		
		try {
			return objectMapper.readValue(json, typeReference);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return null;
	}
	
	public static JSONArray fromObjectArray(String json) {
		try {
			return objectMapper.readValue(json, new TypeReference<JSONArray>() {
			});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @param souceInfo
	 * @return
	 */
	public static JSONObject fromObject(Object json) {
		try {
			if (json instanceof String) {
				return (JSONObject) objectMapper.readValue(json.toString(), JSONObject.class);
			} else if (json instanceof Map) {
				Map map = (Map) json;
				JSONObject jsonObject = new JSONObject();
				jsonObject.putAll(map);
				// for(Object k : map.keySet()){
				// jsonObject.put(k, map.get(k));
				// }
				return jsonObject;
			} else {
				return (JSONObject) objectMapper.readValue(toJson(json), JSONObject.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Object json2Object(String jsonString, Class<?> c) {

		if (jsonString == null || "".equals(jsonString)) {
			return null;
		} else {
			try {
				return objectMapper.readValue(jsonString, c);
			} catch (Exception e) {
				LOG.warn("json error:" + e.getMessage());
			}

		}
		return null;
	}
}