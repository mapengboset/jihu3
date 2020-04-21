package com.yqbing.servicebing.repository.redis;

import com.yqbing.servicebing.repository.database.bean.ScreenService;

public interface RScreenServiceData {

	 void set(String id, int n,ScreenService scr);
	 ScreenService get(String id);
	 void del(String id);
	
}
