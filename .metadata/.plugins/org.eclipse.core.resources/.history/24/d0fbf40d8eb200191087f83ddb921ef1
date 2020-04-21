package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.repository.database.bean.ScreenService;


@Repository("rScreenServiceData")
public class RScreenServiceDataImpl implements RScreenServiceData{
    
	
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jihu_c_screen{0}");
	
	@Override
	public void set(String id, int n,ScreenService scr) {
		String key = KEY_FORMAT.format(new Object[] {id});
		int d = n*31;
		redisTemplate.opsForValue().set(key, new Gson().toJson(scr),d,TimeUnit.DAYS);
		
	}

	@Override
	public ScreenService get(String id) {
		// TODO Auto-generated method stub
		ScreenService info = null;
				try {
					String key = KEY_FORMAT.format(new Object[] { id});
					String object = (String) redisTemplate.opsForValue().get(key);
					if(object != null){

		        		JSONObject jsonobject = JSONObject.fromObject(object);

		        		info = (ScreenService)JSONObject.toBean(jsonobject,ScreenService.class);
		        	
		        	
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
