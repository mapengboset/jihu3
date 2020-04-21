package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.yqbing.servicebing.repository.database.bean.TWealthLogBean;
import com.yqbing.servicebing.repository.database.bean.WeBankBean;


@Repository("rWeBankBean")
public class RWeBankBeanImpl implements RWeBankBean{

	
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, String> redisTemplate = null;

	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jinrong_webank{0}");
	private static final MessageFormat KEYAPP_FORMAT = new MessageFormat("Object:jinrong_webank_app{0}");
     public void set(Long userId,String name, WeBankBean rawJSON) {
		
		String key = KEY_FORMAT.format(new Object[] {userId});
		redisTemplate.opsForHash().put(key, name, rawJSON.toString());
	}
	
	@Override
	public JSONObject getRaw(Long userId,String name) {
		
		String key = KEY_FORMAT.format(new Object[] { userId});
		
		JSONObject json = new JSONObject(redisTemplate.opsForHash().get(key,name));
		
		return json;
	}
	
	@Override
	public JSONArray getRawList(Long userId) {
		
		String key = KEY_FORMAT.format(new Object[] {userId});
		
		JSONArray objectArray = new JSONArray(redisTemplate.opsForHash().values(key));
		
		return objectArray;
	}

	
	@Override
	public void removeList(Long userId) {
		// TODO Auto-generated method stub
		String key = KEYAPP_FORMAT.format(new Object[] {userId});
		redisTemplate.delete(key);
	}

	
}
