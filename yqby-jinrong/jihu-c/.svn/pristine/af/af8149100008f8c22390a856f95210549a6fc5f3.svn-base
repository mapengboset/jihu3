package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.repository.database.bean.AppAppraise;

@Repository("rAppraiseData")
public class RAppraiseDataImpl implements RAppraiseData{

	
	
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jihu_c_appraise{0}");
	
	@Override
	public void setAppraise(String appPack, AppAppraise info) {
		String key = KEY_FORMAT.format(new Object[] {appPack});
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("app"+info.getId()+"",new Gson().toJson(info));  
		redisTemplate.opsForHash().putAll(key, map);
		//redisTemplate.opsForList().
	}
	/*redisTemplate.opsForValue();//操作字符串

	redisTemplate.opsForHash();//操作hash

	redisTemplate.opsForList();//操作list

	redisTemplate.opsForSet();//操作set

	redisTemplate.opsForZSet();//操作有序set
*/	
	@Override
	public List<AppAppraise> getAppraise(String appPack) {
		List<AppAppraise> apps = new ArrayList<AppAppraise>();
		String key = KEY_FORMAT.format(new Object[] {appPack});
		List<Object> reslutMapList=redisTemplate.opsForHash().values(key);
		for (Object object : reslutMapList) {
			JSONObject jsonobject = JSONObject.fromObject(object);

			AppAppraise app = (AppAppraise)JSONObject.toBean(jsonobject,AppAppraise.class);
			apps.add(app);
    	
		}
		return apps;
	}

	@Override
	public void removeAppraise(String appPack) {
		String key = KEY_FORMAT.format(new Object[] {appPack});
		redisTemplate.delete(key);
	}

	
	
}
