package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.StoreUser;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StoreUserMapper {
    int countByExample(StoreUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StoreUser record);

    int insertSelective(StoreUser record);

    List<StoreUser> selectByExample(StoreUserExample example);

    StoreUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StoreUser record);

    int updateByPrimaryKey(StoreUser record);

	StoreUser selectByUserId(@Param("uid")Long uid); 

	StoreUser selectByUserIdAndStatus(@Param("uid")Long id, @Param("status")Short status);

	List<StoreUser> selectBystoreIdAndStatus(@Param("storeId")Long storeId, @Param("status")Short status);

}