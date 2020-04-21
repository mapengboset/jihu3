package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.ETCInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ETCInfoMapper {
    int countByExample(ETCInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ETCInfo record);

    int insertSelective(ETCInfo record);

    List<ETCInfo> selectByExample(ETCInfoExample example);

    ETCInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ETCInfo record);

    int updateByPrimaryKey(ETCInfo record);

	List<ETCInfo> queryByUserId(@Param("page")int page, @Param("size")int size, @Param("userId")Long id);
}