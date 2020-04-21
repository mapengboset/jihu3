package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.UserAppExample;
import com.yqbing.servicebing.repository.database.bean.UserApp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserAppMapper {
    int countByExample(UserAppExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserApp record);

    int insertSelective(UserApp record);

    List<UserApp> selectByExample(UserAppExample example);

    UserApp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserApp record);

    int updateByPrimaryKey(UserApp record);

	UserApp queryPlatformByUserId(@Param("platformId")int platformId, @Param("userId")Long userId);
}