package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TradeExtExample;
import com.yqbing.servicebing.repository.database.bean.TradeExt;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TradeExtMapper {
    int countByExample(TradeExtExample example);

    int deleteByPrimaryKey(String tradeId);

    int insert(TradeExt record);

    int insertSelective(TradeExt record);

    List<TradeExt> selectByExampleWithBLOBs(TradeExtExample example);

    List<TradeExt> selectByExample(TradeExtExample example);

    TradeExt selectByPrimaryKey(String tradeId);

    int updateByPrimaryKeySelective(TradeExt record);

    int updateByPrimaryKeyWithBLOBs(TradeExt record);

    int updateByPrimaryKey(TradeExt record);

}