package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.PayConfigDataExample;
import com.yqbing.servicebing.repository.database.bean.PayConfigData;
import com.yqbing.servicebing.repository.database.bean.PayQrAccountBean;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PayConfigDataMapper {
    int countByExample(PayConfigDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayConfigData record);

    int insertSelective(PayConfigData record);

    List<PayConfigData> selectByExample(PayConfigDataExample example);

    PayConfigData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayConfigData record);

    int updateByPrimaryKey(PayConfigData record);

	PayConfigData selectByType(@Param("type")int type);

}