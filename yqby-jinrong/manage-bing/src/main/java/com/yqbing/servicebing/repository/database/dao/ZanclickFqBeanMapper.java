package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.ZanclickFqBeanExample;
import com.yqbing.servicebing.repository.database.bean.ZanclickFqBean;

import java.util.List;

public interface ZanclickFqBeanMapper {
    int countByExample(ZanclickFqBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZanclickFqBean record);

    int insertSelective(ZanclickFqBean record);

    List<ZanclickFqBean> selectByExample(ZanclickFqBeanExample example);

    ZanclickFqBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZanclickFqBean record);

    int updateByPrimaryKey(ZanclickFqBean record);
}