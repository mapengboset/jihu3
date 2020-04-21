package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TUserInfoBeanExample;
import com.yqbing.servicebing.repository.database.bean.TUserInfoBean;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface TUserInfoBeanMapper {
    int countByExample(TUserInfoBeanExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TUserInfoBean record);

    int insertSelective(TUserInfoBean record);

    List<TUserInfoBean> selectByExample(TUserInfoBeanExample example);

    TUserInfoBean selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TUserInfoBean record);

    int updateByPrimaryKey(TUserInfoBean record);
}