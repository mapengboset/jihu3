package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.StoreInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StoreInfoMapper {
    int countByExample(StoreInfoExample example);

    int deleteByPrimaryKey(Long storeId);

    int insert(StoreInfo record);

    int insertSelective(StoreInfo record);

    List<StoreInfo> selectByExample(StoreInfoExample example);

    StoreInfo selectByPrimaryKey(Long storeId);

    int updateByPrimaryKeySelective(StoreInfo record);

    int updateByPrimaryKey(StoreInfo record);

	StoreInfo selectByCode(@Param("code")String code);
}