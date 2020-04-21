package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.StoreMachineNumber;

import java.util.List;

public interface StoreMachineNumberMapper {
    int countByExample(StoreMachineNumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreMachineNumber record);

    int insertSelective(StoreMachineNumber record);

    List<StoreMachineNumber> selectByExample(StoreMachineNumberExample example);

    StoreMachineNumber selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoreMachineNumber record);

    int updateByPrimaryKey(StoreMachineNumber record);

    /**
     * 根据设备号查询门店信息
     * @param device
     * @return
     */
    StoreMachineNumber queryStoreMachineNumberByDevice(String device);
}