package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TWealthLogBeanExample;
import com.yqbing.servicebing.repository.database.bean.TWealthLogBean;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface TWealthLogBeanMapper {
    int countByExample(TWealthLogBeanExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(TWealthLogBean record);

    int insertSelective(TWealthLogBean record);

    List<TWealthLogBean> selectByExample(TWealthLogBeanExample example);

    TWealthLogBean selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(TWealthLogBean record);

    int updateByPrimaryKey(TWealthLogBean record);
}