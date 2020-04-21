package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.bean.GoodsOrder;
import com.yqbing.servicebing.repository.database.bean.GoodsOrderRes;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodsOrderMapper {
    int countByExample(GoodsOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsOrder record);

    int insertSelective(GoodsOrder record);

    List<GoodsOrder> selectByExample(GoodsOrderExample example);

    GoodsOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsOrder record);

    int updateByPrimaryKey(GoodsOrder record);

	List<GoodsOrderRes> queryList(@Param("userId")Long userId, @Param("type")short type,@Param("page") Integer page, @Param("size")Integer size);

	GoodsOrder selectByOrderId(@Param("orderId")String orderId);

	GoodsOrder selectByuserIdAndtime(@Param("userId")String agentUserId,@Param("reason") String reason);
}