package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.PayChannelInfoExample;
import com.yqbing.servicebing.repository.database.bean.PayChannelInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PayChannelInfoMapper {
    int countByExample(PayChannelInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelInfo record);

    int insertSelective(PayChannelInfo record);

    List<PayChannelInfo> selectByExample(PayChannelInfoExample example);

    PayChannelInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelInfo record);

    int updateByPrimaryKey(PayChannelInfo record);

	PayChannelInfo queryPayChannel(@Param("payChannel")String payChannel);
}