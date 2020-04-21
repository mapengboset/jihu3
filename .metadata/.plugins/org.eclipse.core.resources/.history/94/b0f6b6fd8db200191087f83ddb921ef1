package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.AppCoupon;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AppCouponMapper {
    int countByExample(AppCouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppCoupon record);

    int insertSelective(AppCoupon record);

    List<AppCoupon> selectByExampleWithBLOBs(AppCouponExample example);

    List<AppCoupon> selectByExample(AppCouponExample example);

    AppCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppCoupon record);

    int updateByPrimaryKeyWithBLOBs(AppCoupon record);

    int updateByPrimaryKey(AppCoupon record);
    
 	List<AppCoupon> queryByGame();
    /**
     * 
    
     * @Title: selectByAppPack
    
     * @Description: TODO
    
     * @param appPack
     * @return
    
     * @return: AppCoupon
     */
	AppCoupon selectByAppPack(@Param("appPack")String appPack);
}