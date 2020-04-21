package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.NotifyLogExample;
import com.yqbing.servicebing.repository.database.bean.NotifyLog;
import com.yqbing.servicebing.repository.database.bean.NotifyLogWithBLOBs;

import java.util.List;

public interface NotifyLogMapper {
    int countByExample(NotifyLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NotifyLogWithBLOBs record);

    int insertSelective(NotifyLogWithBLOBs record);

    List<NotifyLogWithBLOBs> selectByExampleWithBLOBs(NotifyLogExample example);

    List<NotifyLog> selectByExample(NotifyLogExample example);

    NotifyLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NotifyLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NotifyLogWithBLOBs record);

    int updateByPrimaryKey(NotifyLog record);
}