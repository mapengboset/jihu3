package com.yqbing.servicebing.webapp.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yqbing.servicebing.constants.store.ParamConstant;
import com.yqbing.servicebing.repository.store.bean.UserExt;
import com.yqbing.servicebing.service.IStoreService;
import com.yqbing.servicebing.utils.enums.ErrorCode;
import com.yqbing.servicebing.utils.json.JSONObject;
import com.yqbing.servicebing.utils.json.JSONUtil;
import com.yqbing.servicebing.utils.web.CommonResult;
import com.yqbing.servicebing.webapp.request.store.StoreUserInfo;


@RestController
@Api(tags = "店铺中心")
@RequestMapping(value="/app/store/api")
public class StoreApiController {

	
	@Resource
	IStoreService storeService;

	@RequestMapping(value="/userToStore")
    public CommonResult userToStore(HttpServletRequest request, String data) throws IOException {
		CommonResult result = null;
		if(StringUtils.isNotEmpty(data)) {
			JSONObject dataJo = JSONObject.fromObject(data);
			long userId = JSONUtil.getLong(dataJo, ParamConstant.USER_ID);
			int platformId = JSONUtil.getInt(dataJo, ParamConstant.PLATFORM_ID);
			long storeId = JSONUtil.getLong(dataJo, ParamConstant.STORE_ID);
			int roleId = JSONUtil.getInt(dataJo, ParamConstant.ROLE_ID);
			int status = JSONUtil.getInt(dataJo, ParamConstant.STATUS);
			if(status == 0) {
				status = 1;
			}
			
			StoreUserInfo storeUserInfo = new StoreUserInfo();
			storeUserInfo.setPlatformId(platformId);
			storeUserInfo.setUserId(userId);
			storeUserInfo.setStoreId(storeId);
			storeUserInfo.setRoleId(roleId);
			storeUserInfo.setStatus(status);
			result = storeService.userToStore(storeUserInfo);
		}else {
			result = new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误");
		}
		return result;
    }
	
	@RequestMapping(value="/recordUserBusinessInfo")
    public CommonResult recordUserBusinessInfo(HttpServletRequest request, String data) throws IOException {
		CommonResult result = null;
		if(StringUtils.isNotEmpty(data)) {
			JSONObject dataJo = JSONObject.fromObject(data);
			long userId = JSONUtil.getLong(dataJo, ParamConstant.USER_ID);
			int platformId = JSONUtil.getInt(dataJo, ParamConstant.PLATFORM_ID);
			String relationId = JSONUtil.getString(dataJo, ParamConstant.RELATION_ID);
			String specialId = JSONUtil.getString(dataJo, ParamConstant.SPECIAL_ID);
			String businessValue = JSONUtil.getString(dataJo, ParamConstant.BUSINESS_VALUE);
			UserExt userExt = new UserExt();
			userExt.setPlatformId(platformId);
			userExt.setUserId(userId);
			userExt.setRelationId(relationId);
			userExt.setSpecialId(specialId);
			userExt.setBusinessValue(businessValue);
			result = storeService.recordUserBusinessInfos(userExt);
		}else {
			result = new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误");
		}
		return result;
    }
	
	@RequestMapping(value="/removeUserFromStore")
    public CommonResult removeUserFromStore(HttpServletRequest request, String data) throws IOException {
		CommonResult result = null;
		if(StringUtils.isNotEmpty(data)) {
			JSONObject dataJo = JSONObject.fromObject(data);
			long userId = JSONUtil.getLong(dataJo, ParamConstant.USER_ID);
			int platformId = JSONUtil.getInt(dataJo, ParamConstant.PLATFORM_ID);
			long storeId = JSONUtil.getLong(dataJo, ParamConstant.STORE_ID);
			
			boolean isSuccess = storeService.removeUserFromStore(platformId, storeId, userId);
			if(isSuccess) {
				result = new CommonResult(ErrorCode.CODE_SUCCESS, "OK");
			}else {
				result = new CommonResult(ErrorCode.CODE_FAIL_ERROR, "删除失败，请确认用户是否存在");
			}
		}else {
			result = new CommonResult(ErrorCode.CODE_PARAM_ERROR, "参数错误");
		}
		return result;
    }
	
}
