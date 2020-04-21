package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TUserLogBeanExample;
import com.yqbing.servicebing.repository.database.bean.TUserLogBean;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface TUserLogBeanMapper {
    int countByExample(TUserLogBeanExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(TUserLogBean record);

    int insertSelective(TUserLogBean record);

    List<TUserLogBean> selectByExample(TUserLogBeanExample example);

    TUserLogBean selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(TUserLogBean record);

    int updateByPrimaryKey(TUserLogBean record);
}