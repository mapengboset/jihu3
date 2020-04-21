package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.PayAppInfoExample;
import com.yqbing.servicebing.repository.database.bean.PayAppInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PayAppInfoMapper {
    int countByExample(PayAppInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayAppInfo record);

    int insertSelective(PayAppInfo record);

    List<PayAppInfo> selectByExample(PayAppInfoExample example);

    PayAppInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayAppInfo record);

    int updateByPrimaryKey(PayAppInfo record);

	PayAppInfo queryPayApp(@Param("appChannel")Integer appChannel, @Param("customerId")Integer customerId,
			@Param("payGroupId")Integer payGroupId, @Param("payProvider")String payProvider);
}