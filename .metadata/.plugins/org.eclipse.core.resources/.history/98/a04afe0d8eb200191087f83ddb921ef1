package com.yqbing.servicebing.repository.redis;

import java.text.MessageFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;





import net.sf.json.JSONObject;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.yqbing.servicebing.repository.database.bean.AppAppraise;
import com.yqbing.servicebing.webapp.response.CpdApps;


@Repository("rCpdAppsData")
public class RCpdAppsDataImpl implements RCpdAppsData{

	/** Redis模板 */
	@Resource(name = "redisTemplate")
	private RedisTemplate<String, Object> redisTemplate = null;
	
	
	/** 键值格式 */
	private static final MessageFormat KEY_FORMAT = new MessageFormat("Object:jihu_c_cpdApp{0}");
	private static final String appPack = "cpd";
	
	@Override
	public void setCpdApps(List<CpdApps> info) {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {appPack});
		redisTemplate.opsForValue().set(key, new Gson().toJson(info), 5, TimeUnit.MINUTES);
	}

	@Override
	public Object getCpdApps() {
		String key = KEY_FORMAT.format(new Object[] {appPack});
		Object object = redisTemplate.opsForValue().get(key);
		
		return object;
	}

	@Override
	public void removeCpdApps() {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {appPack});
		redisTemplate.delete(key);
	}

	@Override
	public void setCpd(String Pack, CpdApps info) {
		// TODO Auto-generated method stub
		String key = KEY_FORMAT.format(new Object[] {Pack});
		redisTemplate.opsForValue().set(key, new Gson().toJson(info), 5, TimeUnit.MINUTES);
	}

	@Override
	public CpdApps getCpd(String Pack) {
		String key = KEY_FORMAT.format(new Object[] {Pack});
		Object object = redisTemplate.opsForValue().get(key);
		
		JSONObject jsonobject = JSONObject.fromObject(object);

		CpdApps app = (CpdApps)JSONObject.toBean(jsonobject,CpdApps.class);
		
		return app;
	}
  
}
