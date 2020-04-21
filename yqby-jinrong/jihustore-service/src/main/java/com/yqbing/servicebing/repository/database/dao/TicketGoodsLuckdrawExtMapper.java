package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.TicketGoodsLuckdrawExt;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TicketGoodsLuckdrawExtMapper {
    int countByExample(TicketGoodsLuckdrawExtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketGoodsLuckdrawExt record);

    int insertSelective(TicketGoodsLuckdrawExt record);

    List<TicketGoodsLuckdrawExt> selectByExample(TicketGoodsLuckdrawExtExample example);

    TicketGoodsLuckdrawExt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TicketGoodsLuckdrawExt record);

    int updateByPrimaryKey(TicketGoodsLuckdrawExt record);

	TicketGoodsLuckdrawExt selectByGoodsId(@Param("goodsId")Integer goodsId);

	List<TicketGoodsLuckdrawExt> selectandluckdraw(@Param("goodsType")String goodsType);
}