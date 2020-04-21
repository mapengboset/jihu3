package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.TWxApayOrderBeanExample;
import com.yqbing.servicebing.repository.database.bean.TWxApayOrderBean;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface TWxApayOrderBeanMapper {
    int countByExample(TWxApayOrderBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TWxApayOrderBean record);

    int insertSelective(TWxApayOrderBean record);

    List<TWxApayOrderBean> selectByExample(TWxApayOrderBeanExample example);

    TWxApayOrderBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TWxApayOrderBean record);

    int updateByPrimaryKey(TWxApayOrderBean record);

	TWxApayOrderBean selectOuttrade(@Param("out")String out);
}