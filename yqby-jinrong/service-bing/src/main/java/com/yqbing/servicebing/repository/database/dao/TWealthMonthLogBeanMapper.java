package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TWealthMonthLogBeanExample;
import com.yqbing.servicebing.repository.database.bean.TWealthMonthLogBean;

import java.util.List;

public interface TWealthMonthLogBeanMapper {
    int countByExample(TWealthMonthLogBeanExample example);

    int deleteByPrimaryKey(Integer wmlogId);

    int insert(TWealthMonthLogBean record);

    int insertSelective(TWealthMonthLogBean record);

    List<TWealthMonthLogBean> selectByExample(TWealthMonthLogBeanExample example);

    TWealthMonthLogBean selectByPrimaryKey(Integer wmlogId);

    int updateByPrimaryKeySelective(TWealthMonthLogBean record);

    int updateByPrimaryKey(TWealthMonthLogBean record);
}