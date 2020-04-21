package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.NotifyExample;
import com.yqbing.servicebing.repository.database.bean.Notify;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NotifyMapper {
    int countByExample(NotifyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Notify record);

    int insertSelective(Notify record);

    List<Notify> selectByExample(NotifyExample example);

    Notify selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Notify record);

    int updateByPrimaryKey(Notify record);

	Notify queryNotify(@Param("customerId")Integer customerId, @Param("orderId")String orderId);
}