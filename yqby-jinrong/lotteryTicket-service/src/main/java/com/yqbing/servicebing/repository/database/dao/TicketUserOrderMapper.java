package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.TicketUserOrder;
import com.yqbing.servicebing.repository.database.dao.TicketUserOrderExample;

import java.util.List;

public interface TicketUserOrderMapper {
    int countByExample(TicketUserOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketUserOrder record);

    int insertSelective(TicketUserOrder record);

    List<TicketUserOrder> selectByExample(TicketUserOrderExample example);

    TicketUserOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TicketUserOrder record);

    int updateByPrimaryKey(TicketUserOrder record);

    /**
     * 根据订单编号查询订单详情
     * @param orderNo
     * @return
     */
    TicketUserOrder getTicketUserOrderByOrderON(String orderNo);
}