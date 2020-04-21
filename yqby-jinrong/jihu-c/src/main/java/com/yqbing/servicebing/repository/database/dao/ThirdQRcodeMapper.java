package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.ThirdQRcode;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ThirdQRcodeMapper {
    int countByExample(ThirdQRcodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThirdQRcode record);

    int insertSelective(ThirdQRcode record);

    List<ThirdQRcode> selectByExample(ThirdQRcodeExample example);

    ThirdQRcode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ThirdQRcode record);

    int updateByPrimaryKey(ThirdQRcode record);

	ThirdQRcode queryByType(@Param("userId")Long userId, @Param("type")Integer type);
}