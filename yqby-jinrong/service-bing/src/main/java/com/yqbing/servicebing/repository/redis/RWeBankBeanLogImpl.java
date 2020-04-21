package com.yqbing.servicebing.repository.redis;
import java.text.MessageFormat;
import java.util.List;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.repository.database.bean.WeBankBean;
import com.yqbing.servicebing.webapp.response.weBankResponse;



@Repository("rWeBankBean")
public class RWeBankBeanLogImpl implements RWeBankBeanLog{

	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jinrong_webank{0}");
	private static final MessageFormat KEYAPP_FORMAT = new MessageFormat("Object:jinrong_webank_app{0}");
	
	public void set(Long userId,String id, WeBankBean rawJSON) {
		
		String key = KEY_FORMAT.format(new Object[] {userId});
		redisTemplate.opsForHash().put(key, id, rawJSON.toString());
	}
	
	@Override
	public JSONObject getRaw(Long userId,String name) {
		
		String key = KEY_FORMAT.format(new Object[] { userId});
		
		JSONObject json = new JSONObject(redisTemplate.opsForHash().get(key,name ));
		
		return json;
	}
	
	@Override
	public JSONArray getRawList(Long userId) {
		
		String key = KEY_FORMAT.format(new Object[] {userId});
		
		JSONArray objectArray = new JSONArray(redisTemplate.opsForHash().values(key));
		
		return objectArray;
	}
	
	
	
	
	
	
	
	
	
	public void setlist(Long userId,weBankResponse obj){
		String key = KEYAPP_FORMAT.format(new Object[] {userId});
		redisTemplate.opsForList().leftPushAll(key, new Gson().toJson(obj));
	}
	public List<Object>  getlist(Long userId){
		String key = KEYAPP_FORMAT.format(new Object[] {userId});
		
		//Object object = redisTemplate.opsForValue().get(key);
		List<Object> range = redisTemplate.opsForList().range(key, 0, -1);
		return range;
	}
	//判断是否存在
	@Override
	public boolean existapp(Long userId) {
		// 初始化
		String key = KEYAPP_FORMAT.format(new Long[] { userId });

		// 调用接口
		return redisTemplate.hasKey(key);
	}
	@Override
	public void removeList(Long userId) {
		// TODO Auto-generated method stub
		String key = KEYAPP_FORMAT.format(new Object[] {userId});
		redisTemplate.delete(key);
	}

	
	
	/*redisTemplate.opsForValue();//操作字符串

	redisTemplate.opsForHash();//操作hash

	redisTemplate.opsForList();//操作list

	redisTemplate.opsForSet();//操作set

	redisTemplate.opsForZSet();//操作有序set
*/	


}