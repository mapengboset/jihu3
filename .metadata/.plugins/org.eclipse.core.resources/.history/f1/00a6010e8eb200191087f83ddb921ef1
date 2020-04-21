package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.repository.database.bean.UserAddress;


@Repository("rUserAddressData")
public class RUserAddressDataImpl implements RUserAddressData{

	
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jihu_c_address{0}");
	
	@Override
	public void set(String id, UserAddress scr) {
		String key = KEY_FORMAT.format(new Object[] {id});
		redisTemplate.opsForValue().set(key, new Gson().toJson(scr),31,TimeUnit.DAYS);
		
	}
	@Override
	public UserAddress get(String id) {
		// TODO Auto-generated method stub
		UserAddress info = null;
				try {
					String key = KEY_FORMAT.format(new Object[] { id});
					String object = (String) redisTemplate.opsForValue().get(key);
					if(object != null){

		        		JSONObject jsonobject = JSONObject.fromObject(object);

		        		info = (UserAddress)JSONObject.toBean(jsonobject,UserAddress.class);
		        	
		        	
		        	return info;
		        }
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				return info;
		
	}
	@Override
	public void del(String id) {
				String key = KEY_FORMAT.format(new Object[] {id});

				redisTemplate.delete(key);
		
	}
	
}
