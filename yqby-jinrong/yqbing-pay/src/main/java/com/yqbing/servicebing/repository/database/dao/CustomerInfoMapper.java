package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.CustomerInfoExample;
import com.yqbing.servicebing.repository.database.bean.Customer;

import java.util.List;

public interface CustomerInfoMapper {
    int countByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerInfoExample example);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}