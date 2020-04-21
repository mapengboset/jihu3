package com.yqbing.servicebing.repository.store.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yqbing.servicebing.repository.store.bean.UserExt;

public interface UserExtMapper {
    int countByExample(UserExtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserExt record);

    int insertSelective(UserExt record);

    List<UserExt> selectByExample(UserExtExample example);

    UserExt selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserExt record);

    int updateByPrimaryKey(UserExt record);

	UserExt queryUserExtByUserId(@Param("platformId")Integer platformId, @Param("userId")Long userId);

}