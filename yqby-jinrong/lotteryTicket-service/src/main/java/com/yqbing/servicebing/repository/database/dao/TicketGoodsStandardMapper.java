package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.TicketGoodsStandard;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TicketGoodsStandardMapper {
    int countByExample(TicketGoodsStandardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketGoodsStandard record);

    int insertSelective(TicketGoodsStandard record);

    List<TicketGoodsStandard> selectByExample(TicketGoodsStandardExample example);

    TicketGoodsStandard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TicketGoodsStandard record);

    int updateByPrimaryKey(TicketGoodsStandard record);

	List<TicketGoodsStandard> selectByGoodsId(@Param("goodsId")Integer goodsId);
}