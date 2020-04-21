package com.yqbing.servicebing.service;

import com.yqbing.servicebing.repository.database.bean.UserToken;
import com.yqbing.servicebing.utils.web.CommonResult;
import com.yqbing.servicebing.webapp.request.UserInfo;
import com.yqbing.servicebing.webapp.response.vo.UserAppInfo;


public interface UserService {

	CommonResult createUser(UserInfo user);

	CommonResult userLogin(UserInfo user);

	CommonResult userLogout(UserInfo user);

	UserToken queryUserInfoByToken(Integer appId, String token);

	CommonResult updateUserPassword(UserInfo user);

	CommonResult updateUserMobile(UserInfo user);

	UserAppInfo queryUserInfoByMobile(String mobile);

	UserToken createUserToken(Integer appChannel, Long userId);

	UserToken saveUserToken(Integer appChannel, Long userId, String token);


}
