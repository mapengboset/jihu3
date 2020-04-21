package com.yqbing.servicebing.repository.store.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yqbing.servicebing.repository.store.bean.StoreUser;

public interface StoreUserMapper {
    int countByExample(StoreUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StoreUser record);

    int insertSelective(StoreUser record);

    List<StoreUser> selectByExample(StoreUserExample example);

    StoreUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StoreUser record);

    int updateByPrimaryKey(StoreUser record);

	StoreUser queryUserIdAndStoreIdAndPlatId(@Param("userId")Long userId, @Param("storeId")Long storeId,
			@Param("platformId")Integer platformId);
}