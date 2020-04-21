package com.yqbing.servicebing.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.bean.KxReplace;
import com.yqbing.servicebing.repository.database.bean.UserInfoBean;
import com.yqbing.servicebing.repository.database.dao.KxReplaceMapper;
import com.yqbing.servicebing.repository.database.dao.UserInfoBeanMapper;
import com.yqbing.servicebing.service.CommonService;
import com.yqbing.servicebing.service.ReplaceKxService;
import com.yqbing.servicebing.utils.NotifyUtil;


@Service("replaceKxService")
@SuppressWarnings("all")
public class ReplaceKxServiceImpl extends CommonService implements ReplaceKxService{

	 @Resource
	 private KxReplaceMapper kxReplaceMapper = null;
	
	 @Override
	 public String replaceKX(String token, String version) {
		 
		 Map<String,Object> map = new HashMap<String,Object>();
		 UserInfoBean userInfo = queryTokenByUser(token);
		 if(userInfo == null){
			 return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
		 }
		
		 KxReplace replace = kxReplaceMapper.selectByPrimaryKey(1);
		 if(!replace.getVersion().equals(version)){//不相等需要更新
			 map.put("url", replace.getUrl());
			 map.put("content", replace.getContent());
			 map.put("version", replace.getVersion());
			 map.put("type", replace.getType());
		 
		 }
		 
		return NotifyUtil.success(map);
	}

}
