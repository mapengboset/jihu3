package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.repository.database.bean.Region;
import com.yqbing.servicebing.webapp.response.ProvinceRes;


@Repository("regionData")
public class RregionDataImpl implements RregionData{

	
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jihu_c_region_ss{0}");
	@Override
	public void setProvinceRes(String pro,List<ProvinceRes> ps) {
		
		String key = KEY_FORMAT.format(new Object[] {pro});
	
	
		redisTemplate.opsForValue().set(key, new Gson().toJson(ps));
		
	}

	@Override
	public Object  getProvinceRes(String pro) {
		String key = KEY_FORMAT.format(new Object[] {pro});
		Object object = redisTemplate.opsForValue().get(key);
		return object;
	}

	@Override
	public void removeProvinceRes() {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {"region"});
		redisTemplate.delete(key);
	}

	

}