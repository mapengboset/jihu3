package com.yqbing.servicebing.repository.redis;

import java.util.List;





public interface RAntCredit {

	    public List<Object> getlist(Integer storeId);
	    
	    void setlist(Integer storeId, Object rawJSON);

		//public void set(Integer storeId, String str);
	
}
