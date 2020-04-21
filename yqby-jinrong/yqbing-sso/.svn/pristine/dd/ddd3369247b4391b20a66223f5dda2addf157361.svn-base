package com.yqbing.servicebing.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.yqbing.servicebing.repository.store.bean.StoreUser;
import com.yqbing.servicebing.repository.store.bean.UserExt;
import com.yqbing.servicebing.repository.store.dao.StoreUserExample;
import com.yqbing.servicebing.repository.store.dao.StoreUserMapper;
import com.yqbing.servicebing.repository.store.dao.UserExtExample;
import com.yqbing.servicebing.repository.store.dao.UserExtMapper;
import com.yqbing.servicebing.service.IStoreService;
import com.yqbing.servicebing.utils.StringUtil;
import com.yqbing.servicebing.utils.enums.ErrorCode;
import com.yqbing.servicebing.utils.web.CommonResult;
import com.yqbing.servicebing.webapp.request.store.StoreUserInfo;


@Service("storeService")
public class StoreServiceImpl implements IStoreService{
    
	@Resource
	UserExtMapper userExtMapper;
	@Resource
	StoreUserMapper storeUserMapper;
	@Override
	public CommonResult recordUserBusinessInfos(UserExt userExt) {
		CommonResult result = null;
		Integer rtn = 0;
		if(userExt != null && userExt.getUserId() > 0) {
			UserExt ext = userExtMapper.queryUserExtByUserId(userExt.getPlatformId(), userExt.getUserId());
			if(ext != null) {
				if(StringUtil.isEmpty(userExt.getRelationId())) {
					userExt.setRelationId(ext.getRelationId());
				}
				if(StringUtil.isEmpty(userExt.getSpecialId())) {
					userExt.setSpecialId(ext.getSpecialId());
				}
				if(StringUtils.isEmpty(userExt.getBusinessValue())) {
					userExt.setBusinessValue(ext.getBusinessValue());
				}
                ext.setUpdateTime(new Date());
				
                rtn = userExtMapper.updateByPrimaryKeySelective(ext);
			}else{
                userExt.setCreateTime(new Date());
				
                rtn = userExtMapper.insertSelective(userExt);
				
			}
			if(rtn > 0) {
				result = new CommonResult(ErrorCode.CODE_SUCCESS, "添加成功");
			}else {
				result = new CommonResult(ErrorCode.CODE_FAIL_ERROR, "添加失败");
			}
		}else {
			result = new CommonResult(ErrorCode.CODE_PARAM_ERROR, "添加失败，参数错误");
		}
		return result;
	}
	@Override
	public void recordUserBusinessInfo(UserExt userExt) {
		if(userExt != null && userExt.getUserId() > 0) {
			UserExt ext = userExtMapper.queryUserExtByUserId(userExt.getPlatformId(), userExt.getUserId());
			if(ext != null) {
				if(StringUtil.isEmpty(userExt.getRelationId())) {
					userExt.setRelationId(ext.getRelationId());
				}
				if(StringUtil.isEmpty(userExt.getSpecialId())) {
					userExt.setSpecialId(ext.getSpecialId());
				}
				if(StringUtil.isEmpty(userExt.getBusinessValue())) {
					userExt.setBusinessValue(ext.getBusinessValue());
				}
				ext.setUpdateTime(new Date());
				
				userExtMapper.updateByPrimaryKeySelective(ext);
			}else{
				userExt.setCreateTime(new Date());
				
				userExtMapper.insertSelective(userExt);
			}
			
			
		
	}
	}

	@Override
	public UserExt queryUserExtInfoByUserId(int i, Long uid) {
	   UserExtExample example = new UserExtExample();
	   example.createCriteria().andPlatformIdEqualTo(0).andUserIdEqualTo(uid);
	   List<UserExt> list = userExtMapper.selectByExample(example);
	   if(null != list && list.size() > 0){
		   
		   return list.get(0);
	   }
	   return null;
	}

	@Override
	public List<StoreUser> queryStoreUserByUserId(Long id) {
		StoreUserExample example = new StoreUserExample();
		example.createCriteria().andUserIdEqualTo(id);
		return storeUserMapper.selectByExample(example);
	}

	@Override
	public CommonResult userToStore(StoreUserInfo storeUserInfo) {
		CommonResult result = null;
		StoreUser storeUser = null;
		int rtn = 0;
		if(storeUserInfo != null && storeUserInfo.getStoreId() > 0 && storeUserInfo.getUserId() > 0) {
			storeUser = storeUserMapper.queryUserIdAndStoreIdAndPlatId(storeUserInfo.getUserId(),storeUserInfo.getStoreId(),storeUserInfo.getPlatformId());
			 if(null ==storeUser){
				 storeUser = new StoreUser();
				 
				 storeUser.setPlatformId(storeUserInfo.getPlatformId());
				 storeUser.setUserId(storeUserInfo.getUserId());
				 storeUser.setStoreId(storeUserInfo.getStoreId());
				 storeUser.setRoleId(storeUserInfo.getRoleId());
				 storeUser.setStatus(Byte.valueOf(storeUserInfo.getStatus()+""));
				 storeUser.setCreateTime(new Date());
				 rtn = storeUserMapper.insertSelective(storeUser);
			 }else{
				 storeUser.setUpdateTime(new Date());
				 rtn = storeUserMapper.updateByPrimaryKeySelective(storeUser);
			 }
		
			if(rtn > 0) {
				result = new CommonResult(ErrorCode.CODE_SUCCESS, "添加成功");
			}else {
				result = new CommonResult(ErrorCode.CODE_FAIL_ERROR, "添加失败");
			}
		}else {
			result = new CommonResult(ErrorCode.CODE_PARAM_ERROR, "添加失败，参数错误");
		}
		return result;
	}

	@Override
	public boolean removeUserFromStore(Integer platformId, Long storeId,
			Long userId) {
		byte s = -1;
		
		StoreUser storeUser = storeUserMapper.queryUserIdAndStoreIdAndPlatId(userId,storeId,platformId);
		if(storeUser != null){
			storeUser.setPlatformId(platformId);
			storeUser.setStoreId(storeId);
			storeUser.setUserId(userId);
			storeUser.setStatus(s);
			storeUser.setUpdateTime(new Date());
		 }
		int rtn = storeUserMapper.updateByPrimaryKey(storeUser);
		return rtn > 0;
	}

	
}
