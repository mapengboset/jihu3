package com.yqbing.servicebing.repository.jihuc.dao;

import java.util.List;

import com.yqbing.servicebing.repository.jihuc.bean.UserTaskLog;

public interface UserTaskLogMapper {
    int countByExample(UserTaskLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTaskLog record);

    int insertSelective(UserTaskLog record);

    List<UserTaskLog> selectByExample(UserTaskLogExample example);

    UserTaskLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTaskLog record);

    int updateByPrimaryKey(UserTaskLog record);
}