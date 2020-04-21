package com.yqbing.servicebing.repository.jihuc.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yqbing.servicebing.repository.jihuc.bean.SysDict;
@Repository
public interface SysDictMapper {
    int countByExample(SysDictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    List<SysDict> selectByExample(SysDictExample example);

    SysDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);

	String getShopowner(@Param("type")String type);
}