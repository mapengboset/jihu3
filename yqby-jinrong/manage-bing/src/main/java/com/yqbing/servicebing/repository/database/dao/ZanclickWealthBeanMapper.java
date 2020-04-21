package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.ZanclickWealthBeanExample;
import com.yqbing.servicebing.repository.database.bean.ZanclickWealthBean;

import java.util.List;

public interface ZanclickWealthBeanMapper {
    int countByExample(ZanclickWealthBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZanclickWealthBean record);

    int insertSelective(ZanclickWealthBean record);

    List<ZanclickWealthBean> selectByExample(ZanclickWealthBeanExample example);

    ZanclickWealthBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZanclickWealthBean record);

    int updateByPrimaryKey(ZanclickWealthBean record);
}