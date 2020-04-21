package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.UserTaskLog;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserTaskLogMapper {
    int countByExample(UserTaskLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTaskLog record);

    int insertSelective(UserTaskLog record);

    List<UserTaskLog> selectByExample(UserTaskLogExample example);

    UserTaskLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTaskLog record);

    int updateByPrimaryKey(UserTaskLog record);

	UserTaskLog queryReg(@Param("userId")Long userId, byte t);

	UserTaskLog queryCPD(@Param("userId")Long userId, @Param("appPack")String appPack);
}