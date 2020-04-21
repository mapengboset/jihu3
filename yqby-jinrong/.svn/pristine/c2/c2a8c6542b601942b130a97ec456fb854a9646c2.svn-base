package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;



@Repository("rZanclickFq")
public class RZanclickFqImpl implements RZanclickFq{

	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, String> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jinrong_ant_fei{0}");
	private static final MessageFormat KEYAPP_FORMAT = new MessageFormat("Object:jinrong_ant_app_fei{0}");
	
	
	@Override
	public void set(String name, String zf) {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {name});
		redisTemplate.opsForValue().set(key, zf);
		
	}

	@Override
	public String get(String name) {
		JSONObject json = null;
        String key = KEY_FORMAT.format(new Object[] { name});
        String object = redisTemplate.opsForValue().get(key);
        
       /* if(object != null){
        	
        	 json = new JSONObject(object);
        }*/
		
		return object;

	}

	@Override
	public void remove(String name) {
		// TODO Auto-generated method stub
		redisTemplate.delete(name);
	}

}
