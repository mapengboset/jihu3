package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.ZanclickRefundBeanExample;
import com.yqbing.servicebing.repository.database.bean.ZanclickRefundBean;
import com.yqbing.servicebing.repository.database.bean.ZanclickRefundBeanWithBLOBs;

import java.util.List;

public interface ZanclickRefundBeanMapper {
    int countByExample(ZanclickRefundBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZanclickRefundBeanWithBLOBs record);

    int insertSelective(ZanclickRefundBeanWithBLOBs record);

    List<ZanclickRefundBeanWithBLOBs> selectByExampleWithBLOBs(ZanclickRefundBeanExample example);

    List<ZanclickRefundBean> selectByExample(ZanclickRefundBeanExample example);

    ZanclickRefundBeanWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZanclickRefundBeanWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ZanclickRefundBeanWithBLOBs record);

    int updateByPrimaryKey(ZanclickRefundBean record);
}