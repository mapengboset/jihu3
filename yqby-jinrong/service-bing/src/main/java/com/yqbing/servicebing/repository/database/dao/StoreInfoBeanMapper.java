package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.StoreInfoBeanExample;
import com.yqbing.servicebing.repository.database.bean.StoreInfoBean;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface StoreInfoBeanMapper {
    int countByExample(StoreInfoBeanExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(StoreInfoBean record);

    int insertSelective(StoreInfoBean record);

    List<StoreInfoBean> selectByExample(StoreInfoBeanExample example);

    StoreInfoBean selectByPrimaryKey(Integer storeId);

    int updateByPrimaryKeySelective(StoreInfoBean record);

    int updateByPrimaryKey(StoreInfoBean record);
}