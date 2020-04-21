package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.WeBankBeanExample;
import com.yqbing.servicebing.repository.database.bean.WeBankBean;
import com.yqbing.servicebing.utils.excel.ExcelWeBankModel;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface WeBankBeanMapper {
    int countByExample(WeBankBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeBankBean record);

    int insertSelective(WeBankBean record);

    List<WeBankBean> selectByExample(WeBankBeanExample example);

    WeBankBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WeBankBean record);

    int updateByPrimaryKey(WeBankBean record);

	List<WeBankBean> queryWelth(HashMap<String, Object> map);

	WeBankBean queryBeInvited(@Param("name")String name);

	void updateBatch(List<WeBankBean> list);

	List<WeBankBean> queryTime(String stime);
    /**
     * 
    
     * @Title: queryWelth
    
     * @Description: TODO
    
     * @param company
     * @param store
     * @param stime
     * @param etime
     * @return
    
     * @return: List<WeBankBean>
     */
	List<WeBankBean> queryWelth(@Param("company")String company, @Param("store")String store, @Param("stime")Date stime,
			@Param("etime")Date etime);

}