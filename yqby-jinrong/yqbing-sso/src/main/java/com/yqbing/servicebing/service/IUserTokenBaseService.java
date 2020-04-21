package com.yqbing.servicebing.service;

import com.yqbing.servicebing.repository.database.bean.UserToken;

public interface IUserTokenBaseService {

	void saveOrUpdateUserToken(UserToken userToken);

	UserToken queryUserByToken(Integer appId, String token);

	UserToken queryPlatformUserByToken(Integer platformId, String token);

}
