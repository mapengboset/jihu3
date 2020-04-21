package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.ZanclickOffBeanExample;
import com.yqbing.servicebing.repository.database.bean.ZanclickOffBean;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface ZanclickOffBeanMapper {
    int countByExample(ZanclickOffBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZanclickOffBean record);

    int insertSelective(ZanclickOffBean record);

    List<ZanclickOffBean> selectByExample(ZanclickOffBeanExample example);

    ZanclickOffBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZanclickOffBean record);

    int updateByPrimaryKey(ZanclickOffBean record);
}