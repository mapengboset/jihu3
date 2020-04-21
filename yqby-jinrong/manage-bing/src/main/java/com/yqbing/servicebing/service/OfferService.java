package com.yqbing.servicebing.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yqbing.servicebing.repository.database.bean.HotCityBean;
import com.yqbing.servicebing.repository.database.bean.OfferInfoBean;
import com.yqbing.servicebing.repository.database.bean.OfferOpenBean;
import com.yqbing.servicebing.repository.database.bean.WeBankBean;

public interface OfferService {

	/**
	 * 
	
	 * @Title: addoffer
	
	 * @Description: 单价报价系统接口
	
	 * @param offerInfoBean
	 * @return
	
	 * @return: int
	 */
	int addoffer(OfferInfoBean offerInfoBean);
    /**
     * 
    
     * @Title: editffer
    
     * @Description: 单价报价系统接口(修改)
    
     * @param offerInfoBean
     * @return
    
     * @return: int
     */
	int editffer(OfferInfoBean offerInfoBean);
	/**
	 * 
	
	 * @Title: queryoffer
	
	 * @Description: 查找报价系统信息
	
	 * @param shopname
	 * @param hotid
	 * @param offertype
	 * @return
	
	 * @return: PageInfo<OfferInfoBean>
	 */
	PageInfo<OfferInfoBean> queryoffer(String shopname, Long hotid, Byte offertype);
	
	/**
	 * 
	
	 * @Title: queryHotcity
	
	 * @Description: 查找热门城市
	
	 * @return
	
	 * @return: PageInfo<HotCityBean>
	 */
	List<HotCityBean> queryHotcity();
	/**
	 * 
	
	 * @Title: queryhotcity
	
	 * @Description: TODO
	
	 * @param city
	 * @return
	
	 * @return: PageInfo<HotCityBean>
	 */
	PageInfo<HotCityBean> queryhotcity(String city);
	/**
	 * 
	
	 * @Title: addhotcity
	
	 * @Description: TODO
	
	 * @param hotCityBean
	 * @return
	
	 * @return: int
	 */
	int addhotcity(HotCityBean hotCityBean);
	/**
	 * 
	
	 * @Title: edithotcity
	
	 * @Description: TODO
	
	 * @param hotCityBean
	 * @return
	
	 * @return: int
	 */
	int edithotcity(HotCityBean hotCityBean);
	/**
	 * 
	
	 * @Title: offerisopen
	
	 * @Description: TODO
	
	 * @param off
	 * @return
	
	 * @return: int
	 */
	int offerisopen(String off);
	/**
	 * 
	
	 * @Title: queryWeBankopen
	
	 * @Description: TODO
	
	 * @return
	
	 * @return: OfferOpenBean
	 */
	OfferOpenBean queryWeBankopen();

}
