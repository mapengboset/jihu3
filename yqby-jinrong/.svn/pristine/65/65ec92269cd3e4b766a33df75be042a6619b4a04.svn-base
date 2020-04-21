package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.HotCityBeanExample;
import com.yqbing.servicebing.repository.database.bean.HotCityBean;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface HotCityBeanMapper {
    int countByExample(HotCityBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HotCityBean record);

    int insertSelective(HotCityBean record);

    List<HotCityBean> selectByExample(HotCityBeanExample example);

    HotCityBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HotCityBean record);

    int updateByPrimaryKey(HotCityBean record);
}