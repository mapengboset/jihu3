package com.yqbing.servicebing.service;

import java.util.List;

import com.yqbing.servicebing.repository.store.bean.StoreUser;
import com.yqbing.servicebing.repository.store.bean.UserExt;
import com.yqbing.servicebing.utils.web.CommonResult;
import com.yqbing.servicebing.webapp.request.store.StoreUserInfo;

public interface IStoreService {

	void recordUserBusinessInfo(UserExt userExt);

	UserExt queryUserExtInfoByUserId(int i, Long id);

	List<StoreUser> queryStoreUserByUserId(Long id);

	CommonResult userToStore(StoreUserInfo storeUserInfo);

	boolean removeUserFromStore(Integer platformId, Long storeId, Long userId);

	CommonResult recordUserBusinessInfos(UserExt userExt);

}
