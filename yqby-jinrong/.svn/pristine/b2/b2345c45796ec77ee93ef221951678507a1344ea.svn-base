package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.StoreUserBeanExample;
import com.yqbing.servicebing.repository.database.bean.StoreUserBean;
import com.yqbing.servicebing.repository.database.bean.StoreUserBeanKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreUserBeanMapper {
    int countByExample(StoreUserBeanExample example);

    int deleteByPrimaryKey(StoreUserBeanKey key);

    int insert(StoreUserBean record);

    int insertSelective(StoreUserBean record);

    List<StoreUserBean> selectByExample(StoreUserBeanExample example);

    StoreUserBean selectByPrimaryKey(StoreUserBeanKey key);

    int updateByPrimaryKeySelective(StoreUserBean record);

    int updateByPrimaryKey(StoreUserBean record);

	StoreUserBean selectByUSER3(@Param("storeId")Integer storeId, @Param("i")int i);
}