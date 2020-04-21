package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.yqbing.servicebing.repository.database.bean.TWealthLogBean;


@Repository("rWealthLogBean")
public class RWealthLogBeanImpl implements RWealthLogBean{

	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, String> redisTemplate = null;
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jinrong_wealthLog{0}");
	
	public void set(Long userId,String name, TWealthLogBean rawJSON) {
		
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
	/*redisTemplate.opsForValue();//操作字符串

	redisTemplate.opsForHash();//操作hash

	redisTemplate.opsForList();//操作list

	redisTemplate.opsForSet();//操作set

	redisTemplate.opsForZSet();//操作有序set
*/	
	@Override
	public void remove(Long userId) {
		
		String key = KEY_FORMAT.format(new Long[] { userId });
	
		redisTemplate.delete(key);
	}
}
