package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.GameCpsDataDayDetail;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GameCpsDataDayDetailMapper {
    int countByExample(GameCpsDataDayDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GameCpsDataDayDetail record);

    int insertSelective(GameCpsDataDayDetail record);

    List<GameCpsDataDayDetail> selectByExample(GameCpsDataDayDetailExample example);

    GameCpsDataDayDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GameCpsDataDayDetail record);

    int updateByPrimaryKey(GameCpsDataDayDetail record);

    GameCpsDataDayDetail predict(@Param("stime")String stime, @Param("etime")String etime, @Param("code")String[] code);

	List<GameCpsDataDayDetail> predictList(@Param("stime")String stime, @Param("etime")String etime, @Param("code")String[] code);

	List<GameCpsDataDayDetail> predictDatail(@Param("stime")String stime, @Param("etime")String etime, @Param("code")String[] code);
}