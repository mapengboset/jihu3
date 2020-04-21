package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.BanK360InfoBeanExample;
import com.yqbing.servicebing.repository.database.bean.BanK360InfoBean;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface BanK360InfoBeanMapper {
    int countByExample(BanK360InfoBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BanK360InfoBean record);

    int insertSelective(BanK360InfoBean record);

    List<BanK360InfoBean> selectByExample(BanK360InfoBeanExample example);

    BanK360InfoBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BanK360InfoBean record);

    int updateByPrimaryKey(BanK360InfoBean record);
}