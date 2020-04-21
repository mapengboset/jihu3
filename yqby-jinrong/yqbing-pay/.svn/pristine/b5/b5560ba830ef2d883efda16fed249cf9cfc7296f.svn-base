package com.yqbing.servicebing.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yqbing.servicebing.repository.database.bean.Customer;
import com.yqbing.servicebing.repository.database.dao.CustomerInfoMapper;
import com.yqbing.servicebing.service.ICustomerService;


@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{

	
	@Resource
	private CustomerInfoMapper customerInfoMapper;
	
	@Override
	public Customer getCustomer(Integer customerId) {
		
		
		return customerInfoMapper.selectByPrimaryKey(customerId);
	}

}
