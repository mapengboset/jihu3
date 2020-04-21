package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.LocalArticle;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LocalArticleMapper {
    int countByExample(LocalArticleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LocalArticle record);

    int insertSelective(LocalArticle record);

    List<LocalArticle> selectByExampleWithBLOBs(LocalArticleExample example);

    List<LocalArticle> selectByExample(LocalArticleExample example);

    LocalArticle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LocalArticle record);

    int updateByPrimaryKeyWithBLOBs(LocalArticle record);

    int updateByPrimaryKey(LocalArticle record);
    

	List<LocalArticle> queryLocalNear(@Param("minlng")double minlng,@Param("maxlng") double maxlng,
			@Param("minlat")double minlat, @Param("maxlat")double maxlat);
}