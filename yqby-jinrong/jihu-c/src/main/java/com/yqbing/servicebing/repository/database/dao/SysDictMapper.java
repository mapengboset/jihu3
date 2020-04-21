package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.SysDict;

import java.util.List;

import org.springframework.stereotype.Repository;
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
}