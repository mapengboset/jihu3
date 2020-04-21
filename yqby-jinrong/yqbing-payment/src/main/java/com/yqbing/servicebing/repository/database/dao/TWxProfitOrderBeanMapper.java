package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TWxProfitOrderBeanExample;
import com.yqbing.servicebing.repository.database.bean.TWxProfitOrderBean;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TWxProfitOrderBeanMapper {
    int countByExample(TWxProfitOrderBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TWxProfitOrderBean record);

    int insertSelective(TWxProfitOrderBean record);

    List<TWxProfitOrderBean> selectByExample(TWxProfitOrderBeanExample example);

    TWxProfitOrderBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TWxProfitOrderBean record);

    int updateByPrimaryKey(TWxProfitOrderBean record);

	TWxProfitOrderBean getOutOrderNo(@Param("order")String order);
}