package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TradeExample;
import com.yqbing.servicebing.repository.database.bean.Trade;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TradeMapper {
    int countByExample(TradeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Trade record);

    int insertSelective(Trade record);

    List<Trade> selectByExample(TradeExample example);

    Trade selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);

	Trade queryTradeInfo(@Param("customerId")Integer customerId, @Param("orderId")String orderId);
}