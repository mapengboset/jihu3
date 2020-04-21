package com.yqbing.servicebing.repository.redis;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.yqbing.servicebing.repository.database.bean.WeBankBean;
import com.yqbing.servicebing.webapp.response.weBankResponse;



public interface RWeBankBeanLog {

    JSONObject getRaw(Long userId,String name);

	JSONArray getRawList(Long gymnasiumNum);
	
	
    void set(Long userId,String id, WeBankBean rawJSON);
    
    public List<Object> getlist(Long userId);
    
    void setlist(Long userId, weBankResponse rawJSON);
    
    public boolean existapp(Long userId);
    
    void removeList(Long userId);
			

}
