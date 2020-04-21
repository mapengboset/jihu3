package com.yqbing.servicebing.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.bean.AppCoupon;
import com.yqbing.servicebing.repository.database.bean.UserInfoBean;
import com.yqbing.servicebing.repository.database.dao.AppCouponExample;
import com.yqbing.servicebing.repository.database.dao.AppCouponMapper;
import com.yqbing.servicebing.service.CommonService;
import com.yqbing.servicebing.service.InternetCafeService;
import com.yqbing.servicebing.utils.NotifyUtil;



@Service("internetCafeService")
@SuppressWarnings("all")
public class InternetCafeServiceImpl extends CommonService implements InternetCafeService{
    
	
	
   private static final Logger LOGGER = LoggerFactory.getLogger(InternetCafeServiceImpl.class);
   @Resource
   private AppCouponMapper appCouponMapper= null;
	@Override
	public String welfarePage(String token) {
		
		UserInfoBean infoBean = queryTokenByUser(token);
		if(infoBean == null){
			return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
			
		}
				 AppCouponExample example = new AppCouponExample();
				 example.createCriteria().andCategoryIdEqualTo("internet_bar_type");
				 example.setOrderByClause(" sort");
				 List<AppCoupon> list = appCouponMapper.selectByExampleWithBLOBs(example);
				 return NotifyUtil.success(list);
	 }
	}
