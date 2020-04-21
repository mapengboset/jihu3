package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.Bank360OffBeanExample;
import com.yqbing.servicebing.repository.database.bean.Bank360OffBean;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface Bank360OffBeanMapper {
    int countByExample(Bank360OffBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bank360OffBean record);

    int insertSelective(Bank360OffBean record);

    List<Bank360OffBean> selectByExample(Bank360OffBeanExample example);

    Bank360OffBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bank360OffBean record);

    int updateByPrimaryKey(Bank360OffBean record);
}