package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.LocalFineFood;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LocalFineFoodMapper {
    int countByExample(LocalFineFoodExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LocalFineFood record);

    int insertSelective(LocalFineFood record);

    List<LocalFineFood> selectByExampleWithBLOBs(LocalFineFoodExample example);

    List<LocalFineFood> selectByExample(LocalFineFoodExample example);

    LocalFineFood selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LocalFineFood record);

    int updateByPrimaryKeyWithBLOBs(LocalFineFood record);

    int updateByPrimaryKey(LocalFineFood record);
    
    List<LocalFineFood> queryLocalNear(@Param("minlng")double minlng,@Param("maxlng") double maxlng,
			@Param("minlat")double minlat, @Param("maxlat")double maxlat, @Param("id")Long id);
    /**
     * 
    
     * @Title: queryLocalNearCity
    
     * @Description: TODO
    
     * @param cityCode
     * @param id 
     * @return
    
     * @return: List<LocalFineFood>
     */
	List<LocalFineFood> queryLocalNearCity(@Param("cityCode")String cityCode, @Param("id")Long id);
}