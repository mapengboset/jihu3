package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.OfferOpenBeanExample;
import com.yqbing.servicebing.repository.database.bean.OfferOpenBean;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface OfferOpenBeanMapper {
    int countByExample(OfferOpenBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OfferOpenBean record);

    int insertSelective(OfferOpenBean record);

    List<OfferOpenBean> selectByExample(OfferOpenBeanExample example);

    OfferOpenBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OfferOpenBean record);

    int updateByPrimaryKey(OfferOpenBean record);
}