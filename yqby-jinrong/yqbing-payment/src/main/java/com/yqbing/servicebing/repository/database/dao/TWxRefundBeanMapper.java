package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TWxRefundBeanExample;
import com.yqbing.servicebing.repository.database.bean.TWxRefundBean;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TWxRefundBeanMapper {
    int countByExample(TWxRefundBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TWxRefundBean record);

    int insertSelective(TWxRefundBean record);

    List<TWxRefundBean> selectByExample(TWxRefundBeanExample example);

    TWxRefundBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TWxRefundBean record);

    int updateByPrimaryKey(TWxRefundBean record);

	TWxRefundBean selectByout(@Param("outTradeNo")String outTradeNo);
}