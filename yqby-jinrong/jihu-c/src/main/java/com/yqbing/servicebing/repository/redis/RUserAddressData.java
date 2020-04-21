package com.yqbing.servicebing.repository.redis;

import com.yqbing.servicebing.repository.database.bean.UserAddress;

public interface RUserAddressData {

	 void set(String id, UserAddress add);
	 UserAddress get(String id);
	 void del(String id);
	
}
