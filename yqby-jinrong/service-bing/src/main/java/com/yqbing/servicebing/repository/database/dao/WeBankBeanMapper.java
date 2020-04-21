package com.yqbing.servicebing.repository.database.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yqbing.servicebing.repository.database.abstracts.WeBankBeanExample;
import com.yqbing.servicebing.repository.database.bean.WeBankBean;

public interface WeBankBeanMapper {
	int countByExample(WeBankBeanExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(WeBankBean record);

	int insertSelective(WeBankBean record);

	List<WeBankBean> selectByExample(WeBankBeanExample example);

	WeBankBean selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(WeBankBean record);

	int updateByPrimaryKey(WeBankBean record);

	int querysucccount(HashMap<String, Object> map);

	int queryfailcount(HashMap<String, Object> map);

	List<WeBankBean> query(HashMap<String, Object> map);

}