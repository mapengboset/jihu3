package com.yqbing.servicebing.repository.database.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.yqbing.servicebing.repository.database.bean.Region;
@Repository
public interface RegionMapper {
    int countByExample(RegionExample example);

    int insert(Region record);

    int insertSelective(Region record);

    List<Region> selectByExample(RegionExample example);

	List<Region> queryParent(long parentid);
}