package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.UserExt;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserExtMapper {
    int countByExample(UserExtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserExt record);

    int insertSelective(UserExt record);

    List<UserExt> selectByExample(UserExtExample example);

    UserExt selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserExt record);

    int updateByPrimaryKey(UserExt record);

	UserExt selectByUserId(@Param("uid")Long id);
}