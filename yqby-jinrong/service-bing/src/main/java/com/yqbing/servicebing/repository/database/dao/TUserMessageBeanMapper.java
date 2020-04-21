package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TUserMessageBeanExample;
import com.yqbing.servicebing.repository.database.bean.TUserMessageBean;

import java.util.List;

public interface TUserMessageBeanMapper {
    int countByExample(TUserMessageBeanExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(TUserMessageBean record);

    int insertSelective(TUserMessageBean record);

    List<TUserMessageBean> selectByExample(TUserMessageBeanExample example);

    TUserMessageBean selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(TUserMessageBean record);

    int updateByPrimaryKey(TUserMessageBean record);
}