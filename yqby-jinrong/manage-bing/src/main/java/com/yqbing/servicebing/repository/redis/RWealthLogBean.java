package com.yqbing.servicebing.repository.redis;

import org.json.JSONArray;
import org.json.JSONObject;

import com.yqbing.servicebing.repository.database.bean.TWealthLogBean;

public interface RWealthLogBean {
    
	   JSONObject getRaw(Long userId,String name);

		JSONArray getRawList(Long userId);
		
		public void remove(Long userId) ;
		
	    void set(Long userId,String name, TWealthLogBean rawJSON);
	
}
