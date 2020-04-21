package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.ZanaliPaySettle;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface ZanaliPaySettleMapper {
    int countByExample(ZanaliPaySettleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZanaliPaySettle record);

    int insertSelective(ZanaliPaySettle record);

    List<ZanaliPaySettle> selectByExample(ZanaliPaySettleExample example);

    ZanaliPaySettle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZanaliPaySettle record);

    int updateByPrimaryKey(ZanaliPaySettle record);
}