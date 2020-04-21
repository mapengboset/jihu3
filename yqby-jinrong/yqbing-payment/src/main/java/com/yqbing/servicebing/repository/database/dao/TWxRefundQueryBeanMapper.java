package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TWxRefundQueryBeanExample;
import com.yqbing.servicebing.repository.database.bean.TWxRefundQueryBean;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TWxRefundQueryBeanMapper {
    int countByExample(TWxRefundQueryBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TWxRefundQueryBean record);

    int insertSelective(TWxRefundQueryBean record);

    List<TWxRefundQueryBean> selectByExample(TWxRefundQueryBeanExample example);

    TWxRefundQueryBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TWxRefundQueryBean record);

    int updateByPrimaryKey(TWxRefundQueryBean record);

	TWxRefundQueryBean selectByoutTradeNo(@Param("outRefundNo")String outRefundNo);
}