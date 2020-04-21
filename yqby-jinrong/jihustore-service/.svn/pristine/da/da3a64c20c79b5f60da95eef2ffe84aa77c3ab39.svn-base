package com.yqbing.servicebing.repository.jihu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yqbing.servicebing.repository.jihu.bean.TUserInfoBean;


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

	TUserInfoBean getValidToken(@Param("token") String token);
}