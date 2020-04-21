package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.LocalLabel;
import java.util.List;

public interface LocalLabelMapper {
    int countByExample(LocalLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LocalLabel record);

    int insertSelective(LocalLabel record);

    List<LocalLabel> selectByExample(LocalLabelExample example);

    LocalLabel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LocalLabel record);

    int updateByPrimaryKey(LocalLabel record);
}