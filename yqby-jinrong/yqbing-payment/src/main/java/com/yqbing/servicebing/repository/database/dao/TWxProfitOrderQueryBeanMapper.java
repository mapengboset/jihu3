package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TWxProfitOrderQueryBeanExample;
import com.yqbing.servicebing.repository.database.bean.TWxProfitOrderQueryBean;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TWxProfitOrderQueryBeanMapper {
    int countByExample(TWxProfitOrderQueryBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TWxProfitOrderQueryBean record);

    int insertSelective(TWxProfitOrderQueryBean record);

    List<TWxProfitOrderQueryBean> selectByExampleWithBLOBs(TWxProfitOrderQueryBeanExample example);

    List<TWxProfitOrderQueryBean> selectByExample(TWxProfitOrderQueryBeanExample example);

    TWxProfitOrderQueryBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TWxProfitOrderQueryBean record);

    int updateByPrimaryKeyWithBLOBs(TWxProfitOrderQueryBean record);

    int updateByPrimaryKey(TWxProfitOrderQueryBean record);

	TWxProfitOrderQueryBean selectByOutOrderNo(@Param("outOrderNo")String outOrderNo);
}