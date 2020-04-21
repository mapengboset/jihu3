package com.yqbing.servicebing.repository.redis;

import org.json.JSONArray;
import org.json.JSONObject;

import com.yqbing.servicebing.repository.database.bean.WeBankBean;

public interface RWeBankBean {
  
	
	JSONObject getRaw(Long userId,String name);

	JSONArray getRawList(Long userId);
	
	
	void removeList(Long userId);
	
	
    void set(Long userId,String name, WeBankBean rawJSON);
}
