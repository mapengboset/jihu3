package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.repository.database.abstracts.UserInfoBeanAbs;
import com.yqbing.servicebing.repository.database.bean.UserInfoBean;


@Repository("rUserLogBean")
public class RUserLogBeanImpl implements RUserLogBean{

	
	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jihu_c_user{0}");
	
	private static final MessageFormat KEY_FORMAT_CODE = new MessageFormat("Object:jihu_c_user_code{0}");
	
	private static final MessageFormat KEY_FORMAT_SETUT = new MessageFormat("Object:jihu_c_user_SETUT{0}");
	
	@Override
	public void set(String token, UserInfoBean rawJSON) {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {token});
		redisTemplate.opsForValue().set(key, new Gson().toJson(rawJSON),5,TimeUnit.MINUTES);
	}

	@Override
	public UserInfoBean getRaw(String token) {
		// TODO Auto-generated method stub
		UserInfoBean infoBean = null;
		try {
			String key = KEY_FORMAT.format(new Object[] { token});
			String object = (String) redisTemplate.opsForValue().get(key);
			if(object != null){

        		JSONObject jsonobject = JSONObject.fromObject(object);

        		infoBean = (UserInfoBean)JSONObject.toBean(jsonobject,UserInfoBean.class);
        	
        	
        	return infoBean;
        }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return infoBean;
	}

	@Override
	public boolean existapp(String token) {
		// TODO Auto-generated method stub
		// 初始化
		String key = KEY_FORMAT.format(new Object[]{ token } );

		// 调用接口
		return redisTemplate.hasKey(key);
	}

	@Override
	public void remove(String token) {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {token});

		redisTemplate.delete(key);
	
	}

	@Override
	public void setCode(String phone, Integer code) {
	
		String key = KEY_FORMAT_CODE.format(new Object[] {phone});
		
		redisTemplate.opsForValue().set(key, code+"",65,TimeUnit.SECONDS);
	}

	@Override
	public Integer getCode(String phone) {
		
		String key = KEY_FORMAT_CODE.format(new Object[] { phone});
		Integer object = null;
		try {
			
			 Object object2 = redisTemplate.opsForValue().get(key);
			 object = Integer.valueOf(object2.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return object;
	}

	@Override
	public void sePhone(String phone, UserInfoBean user) {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {phone});
		
		redisTemplate.opsForValue().set(key, new Gson().toJson(user),5,TimeUnit.MINUTES);
	}

	@Override
	public UserInfoBean getPhone(String phone) {
		
        String key = KEY_FORMAT.format(new Object[] { phone});
		
		Object object = redisTemplate.opsForValue().get(key);
		UserInfoBean infoBean = null;
		try {
			
			
			 if(object != null){

	        		JSONObject jsonobject = JSONObject.fromObject(object);

	        		infoBean = (UserInfoBean)JSONObject.toBean(jsonobject,UserInfoBean.class);
	        	
	        	
	        	return infoBean;
	        }
			
			/*JSONObject u = new JSONObject(object);
			String name = (String) u.get("name");
			String phone1 = (String) u.get("phone");
			long id = u.getLong("id");
			String image = (String) u.get("image");
			String token = (String) u.get("token");
			String pushKey = (String) u.get("pushKey");
			infoBean = new UserInfoBean();
			infoBean.setName(name);
			infoBean.setPhone(phone1);
			infoBean.setId(id);
			infoBean.setToken(token);
			infoBean.setImage(image);
			infoBean.setPushKey(pushKey);*/
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return infoBean;
	}

	@Override
	public boolean existPhone(String phone) {
		         // 初始化
				String key = KEY_FORMAT.format(new Object[]{ phone } );

				// 调用接口
				return redisTemplate.hasKey(key);
	}

	@Override
	public void setPhonePass(String phone, String password, UserInfoBean user) {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {phone});
		
		redisTemplate.opsForHash().put(key, password, new Gson().toJson(user));
	}

	@Override
	public UserInfoBean getPhonePass(String phone, String password) {
		// TODO Auto-generated method stub
        String key = KEY_FORMAT.format(new Object[] { phone});
		
		Object object = redisTemplate.opsForHash().get(key,password);
		UserInfoBean infoBean = null;
		try {
			
			if(object != null){

        		JSONObject jsonobject = JSONObject.fromObject(object);

        		infoBean = (UserInfoBean)JSONObject.toBean(jsonobject,UserInfoBean.class);
        	
        	
        	return infoBean;
        }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return infoBean;
	}

	@Override
	public void setSetsut(Long id, String content) {
		String key = KEY_FORMAT_SETUT.format(new Object[] {id});
		Map<String,Object> map = new HashMap<String,Object>();
		map.put(id+"",content);  
		redisTemplate.opsForHash().putAll(key, map);
		
	}

	@Override
	public List<Object> getSetsut(Long id) {
		String key = KEY_FORMAT_SETUT.format(new Object[] {id});
		List<Object> reslutMapList=redisTemplate.opsForHash().values(key);
		return reslutMapList;
	}

	

}
