package com.yqbing.servicebing.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
















import org.springframework.stereotype.Service;

import com.yqbing.servicebing.repository.database.bean.Apps;
import com.yqbing.servicebing.repository.database.bean.User;
import com.yqbing.servicebing.repository.database.bean.UserApp;
import com.yqbing.servicebing.repository.database.bean.UserToken;
import com.yqbing.servicebing.repository.store.bean.StoreUser;
import com.yqbing.servicebing.repository.store.bean.UserExt;
import com.yqbing.servicebing.service.IAppsBaseService;
import com.yqbing.servicebing.service.IStoreService;
import com.yqbing.servicebing.service.IUserAppBaseService;
import com.yqbing.servicebing.service.IUserBaseService;
import com.yqbing.servicebing.service.IUserTokenBaseService;
import com.yqbing.servicebing.service.UserService;
import com.yqbing.servicebing.utils.PlatformDic;
import com.yqbing.servicebing.utils.StringUtil;
import com.yqbing.servicebing.utils.enums.ErrorCode;
import com.yqbing.servicebing.utils.enums.UserStatusEnum;
import com.yqbing.servicebing.utils.json.JSONArray;
import com.yqbing.servicebing.utils.json.JSONObject;
import com.yqbing.servicebing.utils.md5.MD5;
import com.yqbing.servicebing.utils.web.CommonResult;
import com.yqbing.servicebing.webapp.request.UserInfo;
import com.yqbing.servicebing.webapp.response.vo.UserAppInfo;
import com.yqbing.servicebing.webapp.response.vo.UserTokenInfo;


@Service("userService")
public class UserServiceImpl implements UserService{

	
	@Resource
	private IUserBaseService userBaseService;
	
	@Resource
	private IUserAppBaseService userAppBaseService;
	
	@Resource
	private IUserTokenBaseService userTokenBaseService;

	@Resource
	private IAppsBaseService appsBaseService;
	@Resource
	private IStoreService storeService;
	
	
	@Override
	public CommonResult createUser(UserInfo userInfo) {
		
		if(StringUtils.isEmpty(userInfo.getLoginUser()) && StringUtils.isEmpty(userInfo.getMobile())) {
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "登录账号不能为空");
		}
		if(StringUtils.isEmpty(userInfo.getLoginUser())) {
			userInfo.setLoginUser(userInfo.getMobile());
		}
		User loginUser = null;
		if(StringUtils.isNotEmpty(userInfo.getLoginUser())) {
			loginUser = userBaseService.queryUserByLoginUser(userInfo.getLoginUser());
		}
		User mobileUser = null;
		if(StringUtils.isNotEmpty(userInfo.getMobile())) {
			mobileUser = userBaseService.queryUserByMobile(userInfo.getMobile());
		}
		Long userId = 0L;
		if(loginUser != null && mobileUser != null) {
			if(loginUser.getId().longValue() != mobileUser.getId().longValue()) {
				return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "账号、手机号被占用");
			}else {
				userId = loginUser.getId();
			}
		}else if(mobileUser != null) {
			userId = mobileUser.getId();
		}else if(loginUser != null) {
			userId = loginUser.getId(); 
		}
		
		Apps apps = appsBaseService.queryAppsByAppId(userInfo.getAppId());
		if(apps == null) {
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误，渠道不存在");
		}
		
		int platformId = apps.getPlatformId();
		
		Date currDate = new Date();
		if(userId != null && userId.longValue() > 0) {
			UserApp userApp = userAppBaseService.queryPlatformByUserId(platformId, userId);
			if(userApp != null && userApp.getId() > 0) {
				return new CommonResult(ErrorCode.CODE_EXIST_ERROR, "账号已存在，请直接登录");
			}
		}else {
			User user = new User();
			user.setLoginUser(userInfo.getLoginUser());
			user.setLoginPassword(userInfo.getLoginPassword());
			user.setMobile(userInfo.getMobile());
			user.setRegTime(currDate);
			userBaseService.createUser(user);
			userId = user.getId();
		}
		
		if(null == userId || userId <= 0) {
			return new CommonResult(ErrorCode.CODE_FAIL_ERROR, "用户注册失败，请稍后重试");
		}
		
		UserApp userApp = new UserApp();
		userApp.setPlatformId(platformId);
		userApp.setAppId(userInfo.getAppId());
		userApp.setUserId(userId);
		userApp.setStatus(UserStatusEnum.CODE_AUDITED.getCode());
		userApp.setJoinTime(currDate);
		userAppBaseService.createUserApp(userApp);
		
		//生成用户token
		String token = generalToken(userInfo.getAppId(), userId);
		
		UserToken userToken = new UserToken();
		userToken.setPlatformId(platformId);
		userToken.setAppId(userInfo.getAppId());
		userToken.setUserId(userId);
		userToken.setToken(token);
		userToken.setStatus(0);
		userToken.setCreateTime(new Date());
		userTokenBaseService.saveOrUpdateUserToken(userToken);
		
		//记录用户扩展信息
		UserExt userExt = new UserExt();
		userExt.setPlatformId(platformId);
		userExt.setUserId(userId);
		userExt.setRelationId("");
		userExt.setSpecialId("");
		userExt.setBusinessValue(String.valueOf(userId));
		storeService.recordUserBusinessInfo(userExt);
		
		UserTokenInfo tokenInfo = new UserTokenInfo(userToken);
		
		return new CommonResult(ErrorCode.CODE_SUCCESS, "注册成功", tokenInfo);
	}
	
	
	
	
	
	


	@Override
	public CommonResult userLogin(UserInfo userInfo) {
		
		if(userInfo != null && userInfo.getAppId() != null) {
			User loginUser = null;
			if(StringUtils.isNotEmpty(userInfo.getLoginUser())) {
				loginUser = userBaseService.queryUserByLoginUser(userInfo.getLoginUser());
				if(loginUser == null || loginUser.getId() == null || loginUser.getId().longValue() <= 0) {
					loginUser = userBaseService.queryUserByMobile(userInfo.getLoginUser());
				}
				if(loginUser != null && loginUser.getId() != null && loginUser.getId() > 0) {
					if(userInfo.getIsCheckPassword() == 1) {
						//验证密码
						if(StringUtils.isEmpty(userInfo.getLoginPassword()) || !userInfo.getLoginPassword().equals(loginUser.getLoginPassword())) {
							return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "密码错误");
						}
					}
					int platformId = getPlatformId(userInfo.getAppId());
					UserApp userApp = userAppBaseService.queryPlatformByUserId(platformId, loginUser.getId());
					if(userApp != null && userApp.getId() != null && userApp.getId().longValue() > 0) {
						//生成用户token
						String token = generalToken(userInfo.getAppId(), loginUser.getId());
						
						UserToken userToken = new UserToken();
						userToken.setPlatformId(platformId);
						userToken.setAppId(userInfo.getAppId());
						userToken.setUserId(loginUser.getId());
						userToken.setToken(token);
						userToken.setStatus(0);
						userToken.setCreateTime(new Date());
						userTokenBaseService.saveOrUpdateUserToken(userToken);
						
						UserTokenInfo tokenInfo = new UserTokenInfo(userToken);
						return new CommonResult(ErrorCode.CODE_SUCCESS, "登录成功", tokenInfo);
					}else {
						return new CommonResult(ErrorCode.CODE_NOT_EXIST_ERROR, "登录失败，用户未注册");
					}
				}else {
					return new CommonResult(ErrorCode.CODE_NOT_EXIST_ERROR, "登录失败，用户不存在");
				}
			}else {
				return new CommonResult(ErrorCode.CODE_NOT_EXIST_ERROR, "登录失败，请输入用户名或手机号");
			}
		}else {
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "登录失败，参数错误");
		}
	}
	
	@Override
	public CommonResult userLogout(UserInfo userInfo) {
		if(userInfo != null && userInfo.getAppId() != null && StringUtils.isNotEmpty(userInfo.getToken())) {
			UserToken userToken = userTokenBaseService.queryUserByToken(userInfo.getAppId(), userInfo.getToken());
			if(userToken != null && userToken.getUserId() != null) {
				userToken.setStatus(-1);
				userTokenBaseService.saveOrUpdateUserToken(userToken);
			}
			return new CommonResult(ErrorCode.CODE_SUCCESS, "退出成功");
		}else {
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误");
		}
	}

	@Override
	public UserToken queryUserInfoByToken(Integer appId, String token) {
		
		if(appId != null && StringUtils.isNotEmpty(token)) {
			int platformId = getPlatformId(appId);
			UserToken userToken = userTokenBaseService.queryPlatformUserByToken(platformId, token);
			return userToken;
		}
		
		return null;
	}
	
	@Override
	public CommonResult updateUserPassword(UserInfo userInfo) {
		if(userInfo != null && userInfo.getAppId() != null && StringUtils.isNotEmpty(userInfo.getLoginPassword())) {
			if(userInfo.getId() > 0 || StringUtils.isNotEmpty(userInfo.getToken())) {
				User user = null;
				if(userInfo.getId() > 0) {
					user = userBaseService.getById(userInfo.getId());
				}else {
					UserToken userToken = userTokenBaseService.queryUserByToken(userInfo.getAppId(), userInfo.getToken());
					if(userToken != null && userToken.getUserId() != null) {
						user = userBaseService.getById(userToken.getUserId());
					}
				}
				if(user != null) {
					userBaseService.updateUserPassword(user.getId(), userInfo.getLoginPassword());
					return new CommonResult(ErrorCode.CODE_SUCCESS, "密码修改成功");
				}else {
					return new CommonResult(ErrorCode.CODE_NOT_EXIST_ERROR, "用户不存在");
				}
			}else {
				return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "未登录，请选择");
			}
		}else {
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误");
		}
	}
	
	@Override
	public CommonResult updateUserMobile(UserInfo userInfo) {
		if(userInfo != null && userInfo.getAppId() != null && StringUtils.isNotEmpty(userInfo.getMobile())) {
			if(userInfo.getId() > 0 || StringUtils.isNotEmpty(userInfo.getToken())) {
				User user = null;
				if(userInfo.getId() > 0) {
					user = userBaseService.getById(userInfo.getId());
				}else {
					UserToken userToken = userTokenBaseService.queryUserByToken(userInfo.getAppId(), userInfo.getToken());
					if(userToken != null && userToken.getUserId() != null) {
						user = userBaseService.getById(userToken.getUserId());
					}
				}
				if(user != null) {
					userBaseService.updateUserMobile(user.getId(), userInfo.getMobile());
					return new CommonResult(ErrorCode.CODE_SUCCESS, "手机号修改成功");
				}else {
					return new CommonResult(ErrorCode.CODE_NOT_EXIST_ERROR, "用户不存在");
				}
			}else {
				return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "未登录，请选择");
			}
		}else {
			return new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误");
		}
	}







	@Override
	public UserAppInfo queryUserInfoByMobile(String mobile) {
		UserAppInfo userInfo = null;
		if(StringUtil.isNotEmpty(mobile)) {
			User user = userBaseService.queryUserByLoginUser(mobile);
			if(user == null || user.getId() == null || user.getId().longValue() <= 0) {
				user = userBaseService.queryUserByMobile(mobile);
			}
			if(user != null && user.getId() != null) {
				List<UserApp> userApps = userAppBaseService.queryPlatformByUserId(user.getId());
				UserExt userExt = storeService.queryUserExtInfoByUserId(0, user.getId());
				List<StoreUser> storeUserList = storeService.queryStoreUserByUserId(user.getId());
				userInfo = new UserAppInfo();
				userInfo.setMobile(mobile);
				userInfo.setUserId(user.getId());
				StringBuilder sb = new StringBuilder();
				if(userApps != null && userApps.size() > 0) {
					for(UserApp app : userApps) {
						sb.append(app.getPlatformId()).append(",");
					}
					sb.deleteCharAt(sb.length() - 1);
				}
				userInfo.setPlatformIds(sb.toString());
				if(userExt != null) {
					userInfo.setRelationId(userExt.getRelationId());
					userInfo.setSpecialId(userExt.getSpecialId());
				}
				JSONArray ja = new JSONArray();
				if(storeUserList != null && storeUserList.size() > 0) {
					for(StoreUser storeUser : storeUserList) {
						JSONObject jo = new JSONObject();
						jo.put("storeId", storeUser.getStoreId());
						jo.put("roleId", storeUser.getRoleId());
						jo.put("status", storeUser.getStatus());
						jo.put("platformId", storeUser.getPlatformId());
						ja.add(jo);
					}
				}
				userInfo.setData(ja);
			}
		}
		return userInfo;
	}






	@Override
	public UserToken createUserToken(Integer appChannel, Long userId) {
     
		
		int platformId = getPlatformId(appChannel);
		
		Date currDate = new Date();
		if(userId > 0) {
			UserApp userApp = userAppBaseService.queryPlatformByUserId(platformId, userId);
			if(userApp != null && userApp.getId() > 0) {
				//生成用户token
				String token = generalToken(appChannel, userId);
				UserToken userToken = new UserToken();
				userToken.setPlatformId(platformId);
				userToken.setAppId(appChannel);
				userToken.setUserId(userId);
				userToken.setToken(token);
				userToken.setStatus(0);
				userToken.setCreateTime(currDate);
				userTokenBaseService.saveOrUpdateUserToken(userToken);
				return userToken;
			}
		}
		return null;
	}


	@Override
	public UserToken saveUserToken(Integer appChannel, Long userId, String token) {
		if(userId > 0 && StringUtil.isNotEmpty(token)) {
			int platformId = getPlatformId(appChannel);
			UserToken userToken = new UserToken();
			userToken.setPlatformId(platformId);
			userToken.setAppId(appChannel);
			userToken.setUserId(userId);
			userToken.setToken(token);
			userToken.setStatus(0);
			userToken.setCreateTime(new Date());
			userTokenBaseService.saveOrUpdateUserToken(userToken);
			return userToken;
		}
		return null;
	}


	
	private String generalToken(int appId, long userId) {
		return MD5.md5UTF8(appId + "-" + userId + "-" + UUID.randomUUID().toString());
	}

	private int getPlatformId(int appChannel) {
		int platformId = 0;
		if(PlatformDic.appChannelMap.containsKey(appChannel)) {
			platformId = PlatformDic.appChannelMap.get(appChannel);
		}
		return platformId;
	}



	
}
