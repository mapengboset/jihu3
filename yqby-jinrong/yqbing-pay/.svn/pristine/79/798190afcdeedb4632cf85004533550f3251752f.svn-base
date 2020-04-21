package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.OrderPaySuccessExample;
import com.yqbing.servicebing.repository.database.bean.OrderPaySuccess;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderPaySuccessMapper {
    int countByExample(OrderPaySuccessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderPaySuccess record);

    int insertSelective(OrderPaySuccess record);

    List<OrderPaySuccess> selectByExample(OrderPaySuccessExample example);

    OrderPaySuccess selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderPaySuccess record);

    int updateByPrimaryKey(OrderPaySuccess record);

	List<OrderPaySuccess> queryOrderPayList(@Param("customerId")Integer customerId, @Param("orderId")String orderId);
}