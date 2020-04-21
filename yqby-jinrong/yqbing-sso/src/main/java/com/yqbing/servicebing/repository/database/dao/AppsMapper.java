package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.AppsExample;
import com.yqbing.servicebing.repository.database.bean.Apps;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AppsMapper {
    int countByExample(AppsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Apps record);

    int insertSelective(Apps record);

    List<Apps> selectByExample(AppsExample example);

    Apps selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Apps record);

    int updateByPrimaryKey(Apps record);

	Apps queryAppsByAppId(@Param("appId")Integer appId);
}