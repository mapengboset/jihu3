package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.AppModule;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AppModuleMapper {
    int countByExample(AppModuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppModule record);

    int insertSelective(AppModule record);

    List<AppModule> selectByExample(AppModuleExample example);

    AppModule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AppModule record);

    int updateByPrimaryKey(AppModule record);

	AppModule selectByCode(@Param("type")String type);
}