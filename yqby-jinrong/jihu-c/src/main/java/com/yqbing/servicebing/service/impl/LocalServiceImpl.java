package com.yqbing.servicebing.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;










import javax.annotation.Resource;










import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;










import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.bean.AppBanner;
import com.yqbing.servicebing.repository.database.bean.AppModule;
import com.yqbing.servicebing.repository.database.bean.LocalArticle;
import com.yqbing.servicebing.repository.database.bean.LocalBanner;
import com.yqbing.servicebing.repository.database.bean.LocalFineFood;
import com.yqbing.servicebing.repository.database.bean.LocalLabel;
import com.yqbing.servicebing.repository.database.bean.LocalTour;
import com.yqbing.servicebing.repository.database.bean.LocalTourWithBLOBs;
import com.yqbing.servicebing.repository.database.bean.SysDict;
import com.yqbing.servicebing.repository.database.bean.UserInfoBean;
import com.yqbing.servicebing.repository.database.dao.AppBannerExample;
import com.yqbing.servicebing.repository.database.dao.AppBannerMapper;
import com.yqbing.servicebing.repository.database.dao.AppModuleExample;
import com.yqbing.servicebing.repository.database.dao.AppModuleMapper;
import com.yqbing.servicebing.repository.database.dao.AppBannerExample.Criteria;
import com.yqbing.servicebing.repository.database.dao.LocalArticleExample;
import com.yqbing.servicebing.repository.database.dao.LocalArticleMapper;
import com.yqbing.servicebing.repository.database.dao.LocalBannerExample;
import com.yqbing.servicebing.repository.database.dao.LocalBannerMapper;
import com.yqbing.servicebing.repository.database.dao.LocalCityExample;
import com.yqbing.servicebing.repository.database.dao.LocalCityMapper;
import com.yqbing.servicebing.repository.database.dao.LocalFineFoodExample;
import com.yqbing.servicebing.repository.database.dao.LocalFineFoodMapper;
import com.yqbing.servicebing.repository.database.dao.LocalLabelExample;
import com.yqbing.servicebing.repository.database.dao.LocalLabelMapper;
import com.yqbing.servicebing.repository.database.dao.LocalTourExample;
import com.yqbing.servicebing.repository.database.dao.LocalTourMapper;
import com.yqbing.servicebing.repository.database.dao.SysDictExample;
import com.yqbing.servicebing.repository.database.dao.SysDictMapper;
import com.yqbing.servicebing.service.CommonService;
import com.yqbing.servicebing.service.HomePageService;
import com.yqbing.servicebing.service.LocalService;
import com.yqbing.servicebing.utils.NotifyUtil;
import com.yqbing.servicebing.webapp.response.HomeModel;
import com.yqbing.servicebing.webapp.response.local.LocalListRes;
import com.yqbing.servicebing.webapp.response.local.LocalModel;
import com.yqbing.servicebing.webapp.response.local.LocalPageRes;
import com.yqbing.servicebing.webapp.response.local.LocalSearchRes;

@Service("localService")
@SuppressWarnings("all")
public class LocalServiceImpl extends CommonService implements LocalService {

	
	 private static final Logger LOGGER = LoggerFactory.getLogger(LocalServiceImpl.class);
	 @Resource
	 private AppBannerMapper appBannerMapper= null;
	 @Resource
	 private LocalBannerMapper localBannerMapper= null;
	 @Resource
     private AppModuleMapper appModuleMapper = null;
	 @Resource
	 private LocalArticleMapper localArticleMapper = null;
	 @Resource
	 private LocalFineFoodMapper localFineFoodMapper = null;
	 @Resource
	 private LocalTourMapper localTourMapper = null;
	 @Resource
	 private LocalLabelMapper localLabelMapper = null;
	 @Resource
	 private LocalCityMapper localCityMapper = null;
	 @Resource
     private SysDictMapper sysDictMapper= null;
	 
	 @Override
	 public String localPage(String token, String device, String code) {
		 
		 UserInfoBean infoBean = queryTokenByUser(token);
			if(infoBean == null){
				return NotifyUtil.error(ErrorCodeEnum.NOLOGIN, "用户不存在");
				
			}
		if(StringUtils.isBlank(code)){
			code = "110000";
		}
		//首页大图list
		Byte s = 0;
	/*	AppBannerExample picex = new AppBannerExample();
  		Criteria criteria = picex.createCriteria();
  		criteria.andAppCategoryIdEqualTo("local_life_banner").andStatusEqualTo(s);
  		picex.setOrderByClause(" sort");
  		List<AppBanner> pic = appBannerMapper.selectByExample(picex);*/
  		LocalBannerExample example2 = new LocalBannerExample();
  		example2.createCriteria().andStatusEqualTo(s).andCityCodeEqualTo(code);
  		example2.setOrderByClause(" sort");
  		List<LocalBanner> banners = localBannerMapper.selectByExample(example2);
		
  		LocalPageRes res = new LocalPageRes();
  		LocalCityExample localCityExample = new LocalCityExample();
  		localCityExample.createCriteria().andTypeEqualTo(0);
  		localCityExample.setOrderByClause(" create_time desc");
  		res.setCitys(localCityMapper.selectByExample(localCityExample));
  		res.setPic(banners);
		//分类组合list
		 AppModuleExample example = new AppModuleExample();
		 
		 AppModule am =  appModuleMapper.selectByCode("localLifeRoot");
    	 
		 example.createCriteria().andParentIdEqualTo(am.getId()).andStatusEqualTo(0);
    	 
    	 example.setOrderByClause(" sort");
    	 
    	 List<AppModule> list = appModuleMapper.selectByExample(example);
    	 
    	 List<LocalModel> models = new ArrayList<LocalModel>();
    	 
    	 for (AppModule ad : list) {
    		 
    		 LocalModel model = new LocalModel();
    		 
    		 model.setName(ad.getName());
    		 model.setPid(ad.getId());
    		 model.setStyle(ad.getStyle());
    		 model.setIsMore(ad.getIsMore());
    		 model.setIsMark(ad.getIsMark());
    		 model.setModuleType(ad.getModuleType());
    		 List<LocalListRes> locas = new ArrayList<LocalListRes>();
    		 if(ad.getModuleType().equals("article")){//文章
    			// new 
    			 LocalArticleExample articleExample = new LocalArticleExample();
    			 articleExample.createCriteria().andStatusEqualTo(0).andCityCodeEqualTo(code);
    			 articleExample.setOrderByClause(" rand()");
    			 List<LocalArticle> list2 = localArticleMapper.selectByExample(articleExample);
    			 list2.stream().forEach(localArticle ->{
    				 LocalLabelExample labelExample = new LocalLabelExample();
    				 labelExample.createCriteria().andTypeIdEqualTo(localArticle.getId()).andTypeEqualTo("article");
    				 
    				 List<LocalLabel> byExample = localLabelMapper.selectByExample(labelExample);
    				 LocalListRes localListRes = new LocalListRes();
    				 localListRes.setImg(localArticle.getHeadimg());
    				 localListRes.setTitle(localArticle.getTitle()); 
    				 localListRes.setId(localArticle.getId());
    				 localListRes.setLabel(byExample);
    				 locas.add(localListRes);
    		        });
    			 model.setList(locas);
    		 }
    		 
    		 if(ad.getModuleType().equals("tour")){//tour 景区
    			 LocalTourExample tourExample = new LocalTourExample();
    			 tourExample.createCriteria().andStatusEqualTo(0).andCityCodeEqualTo(code);
    			 List<LocalTour> list2 = localTourMapper.selectByExample(tourExample);
    			 list2.stream().forEach(localTour ->{
    				 LocalLabelExample labelExample = new LocalLabelExample();
    				 labelExample.createCriteria().andTypeIdEqualTo(localTour.getId()).andTypeEqualTo("tour");
    				 List<LocalLabel> byExample = localLabelMapper.selectByExample(labelExample);
    				 LocalListRes localListRes = new LocalListRes();
    				 localListRes.setImg(localTour.getHeadimg()); 
    				 localListRes.setTitle(localTour.getName());
    				 localListRes.setId(localTour.getId());
    				 localListRes.setAddress(localTour.getBelongCity());
    				 localListRes.setLabel(byExample);
    				 localListRes.setName(localTour.getName());
    				 locas.add(localListRes);
    		        });
    			 model.setList(locas);
    		 }
    		 
    		 if(ad.getModuleType().equals("food")){//实物
    			 LocalFineFoodExample foodExample = new LocalFineFoodExample();
    			 foodExample.createCriteria().andStatusEqualTo(0).andCityCodeEqualTo(code);
    			 List<LocalFineFood> list2 = localFineFoodMapper.selectByExample(foodExample);
    			 list2.stream().forEach(localFineFood ->{
    				 LocalLabelExample labelExample = new LocalLabelExample();
    				 labelExample.createCriteria().andTypeIdEqualTo(localFineFood.getId()).andTypeEqualTo("food");
    				 List<LocalLabel> byExample = localLabelMapper.selectByExample(labelExample);
    				 LocalListRes localListRes = new LocalListRes();
    				 localListRes.setImg(localFineFood.getHeadimg()); 
    				 localListRes.setId(localFineFood.getId());
    				 localListRes.setTitle(localFineFood.getSpecialDishes()); 
    				 localListRes.setLabel(byExample);
    				 
    				 localListRes.setAddress(localFineFood.getAdress());
    				 localListRes.setFoodType(getFoodType(localFineFood.getFoodType()));
    				 localListRes.setName(localFineFood.getName());
    				 locas.add(localListRes);
    		        });
    			 model.setList(locas);
    		 }
    		 models.add(model);
    	 }
    	 res.setModels(models);
    	 
		 return NotifyUtil.success(res);
	}
	 
	 
	 public String getFoodType(String foodtype){
		 
		    SysDictExample example2 = new SysDictExample();
		    
			example2.createCriteria().andParentKeyEqualTo("food_type").andBaseValueEqualTo(foodtype);
			
			List<SysDict> list = sysDictMapper.selectByExample(example2);
		  
			
			
		    return list.get(0).getName();
	 }
	    @Override
		public String localSearch(String keywords, String code) {
		 
		 List<LocalSearchRes> list3 = new ArrayList<LocalSearchRes>();
		 
		 LocalFineFoodExample foodExample = new LocalFineFoodExample();
		 foodExample.createCriteria().andStatusEqualTo(0).andNameLike(keywords);
		 List<LocalFineFood> list2 = localFineFoodMapper.selectByExample(foodExample);
		 for (LocalFineFood localFineFood : list2) {
			 
			LocalSearchRes localSearchRes = new LocalSearchRes();
			localSearchRes.setId(localFineFood.getId());
			localSearchRes.setAddress(localFineFood.getAdress());
			localSearchRes.setName(localFineFood.getName());
			localSearchRes.setTital(localFineFood.getSpecialDishes());
			localSearchRes.setModuleType("food");
			list3.add(localSearchRes);
			
		  }
		 
		 LocalTourExample tourExample = new LocalTourExample();
		 tourExample.createCriteria().andStatusEqualTo(0).andNameLike(keywords);
		 List<LocalTour> list = localTourMapper.selectByExample(tourExample);
		 for (LocalTour localTour : list) {
			 
			 LocalSearchRes localSearchRes = new LocalSearchRes();
			 localSearchRes.setId(localTour.getId());
			 localSearchRes.setAddress(localTour.getBelongCity());
			 localSearchRes.setName(localTour.getName());
			 localSearchRes.setTital(localTour.getTicketPrice());
			 localSearchRes.setModuleType("tour");
			 list3.add(localSearchRes);
		}
		     return NotifyUtil.success(list3);
		}         
	 
	@Override
	public String localNear(String type,String longitude1, String latitude1,String cityCode,Long id) {
		
		try {
			Double longitude = Double.valueOf(longitude1);
			Double latitude = Double.valueOf(latitude1);
			 //先计算查询点的经纬度范围 
	        double r = 6371;//地球半径千米  
	        double dis = 0.5;//0.5千米距离  
	        double dlng =  2*Math.asin(Math.sin(dis/(2*r))/Math.cos(latitude*Math.PI/180));  
	        dlng = dlng*180/Math.PI;//角度转为弧度  
	        double dlat = dis/r;
	        dlat = dlat*180/Math.PI;
	        double minlat =latitude-dlat; 
	        double maxlat = latitude+dlat;
	        double minlng = longitude-dlng;
	        double maxlng = longitude+dlng;
	        if(type.equals("food")){
	        	
	      //      List<LocalFineFood> fineFood = 	localFineFoodMapper.queryLocalNear(minlng,maxlng,minlat,maxlat,id);
	              List<LocalFineFood> fineFood = 	localFineFoodMapper.queryLocalNearCity(cityCode,id);
	            
	            for (LocalFineFood localFineFood : fineFood) {
	            	
	            	LocalLabelExample labelExample = new LocalLabelExample();
	            	
   				    labelExample.createCriteria().andTypeIdEqualTo(localFineFood.getId()).andTypeEqualTo("food");
   				    
   				    List<LocalLabel> byExample = localLabelMapper.selectByExample(labelExample);
   				    
   				    localFineFood.setFoodType(getFoodType(localFineFood.getFoodType()));
   				    
   				    localFineFood.setLabel(byExample);
				}
	            
	            return NotifyUtil.success(fineFood);
	        }  
	        if(type.equals("tour")){
	        	
	        	List<LocalTour>  localTour =	localTourMapper.queryLocalNearCity(cityCode,id);
		        for (LocalTour localTour2 : localTour) {
		        	LocalLabelExample labelExample = new LocalLabelExample();
   				    labelExample.createCriteria().andTypeIdEqualTo(localTour2.getId()).andTypeEqualTo("tour");
   				    List<LocalLabel> byExample = localLabelMapper.selectByExample(labelExample);
   				    localTour2.setLabel(byExample);
				}	
		        return NotifyUtil.success(localTour);
	        } 
	       /* if(type.equals("article")){
	        	
	        	List<LocalArticle>  article =	localArticleMapper.queryLocalNear(minlng,maxlng,minlat,maxlat);
	        	return NotifyUtil.success(article);
	        }  */
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return NotifyUtil.success();
	}


	@Override
	public String localDatail(String moduleType,Long id, String token,String code) {
		
		 String success = StringUtils.EMPTY;
		 AppModuleExample example = new AppModuleExample();
		 AppModule am =  appModuleMapper.selectByCode("localLifeRoot");
    	 example.createCriteria().andParentIdEqualTo(am.getId()).andStatusEqualTo(0);
    	 example.setOrderByClause(" sort");
    	 List<AppModule> list = appModuleMapper.selectByExample(example);
    	
    	 Map<String, Object> map = new HashMap<String, Object>();
		 if(moduleType.equals("article")){// article 文章
 			 //new 
 			 LocalArticleExample articleExample = new LocalArticleExample();
 			 
 			 articleExample.createCriteria().andIdEqualTo(id).andStatusEqualTo(0);
 			 
 			 List<LocalArticle> list2 = localArticleMapper.selectByExampleWithBLOBs(articleExample);
 		     
 			 if(null != list2 && list2.size() >0){
 		    	 
 		    	   success = NotifyUtil.success(list2.get(0));
 		    	   List<LocalListRes> locas = new ArrayList<LocalListRes>(); 
 		    	   if(!StringUtils.isBlank(list2.get(0).getModuleType()) && list2.get(0).getLocalId() != null){
 		    	   
 		    	   if(list2.get(0).getModuleType().equals("tour")){//景点
 		    		   
 		    		  LocalTour localTour = localTourMapper.selectByPrimaryKey(list2.get(0).getLocalId());
                     if(localTour != null){
                    	 LocalLabelExample labelExample = new LocalLabelExample();
                    	 
                    	 labelExample.createCriteria().andTypeIdEqualTo(localTour.getId()).andTypeEqualTo("tour");
                    	 
                    	 List<LocalLabel> byExample = localLabelMapper.selectByExample(labelExample);
                    	 
                    	 localTour.setModuleType("tour");
                    	 localTour.setLabel(byExample);
                    	 map.put("txtRec", localTour);
                     }
 		    	   }
 		    	  if(list2.get(0).getModuleType().equals("food")){//食物
 		    		  
 		    		 LocalFineFood fineFood = localFineFoodMapper.selectByPrimaryKey(list2.get(0).getLocalId());
 		    		 if(fineFood != null){
 		    		 LocalLabelExample labelExample = new LocalLabelExample();
 	            	
   				     labelExample.createCriteria().andTypeIdEqualTo(fineFood.getId()).andTypeEqualTo("food");
   				    
   				     List<LocalLabel> byExample = localLabelMapper.selectByExample(labelExample);
   				    
   				     fineFood.setFoodType(getFoodType(fineFood.getFoodType()));
   				    
   				     fineFood.setLabel(byExample);
   				     
   				     fineFood.setModuleType("food");
   				     
   				     map.put("txtRec", fineFood);
 		    		}
		    	   }
 		    	    
 		    	  }
 		    	   map.put("data", list2.get(0));
 		    	  
 		     }
 		 }
 		 
 		 if(moduleType.equals("tour")){//tour 景区
 			 
 			 LocalTourExample tourExample = new LocalTourExample();
 			 tourExample.createCriteria().andIdEqualTo(id).andStatusEqualTo(0);
 			 List<LocalTourWithBLOBs> list2 = localTourMapper.selectByExampleWithBLOBs(tourExample);
 			 if(null != list2 && list2.size() >0){
 				 
 				  success =  NotifyUtil.success(list2.get(0));
 				 
 				  map.put("data", list2.get(0));
		     }
 		 }
 		 
 		 if(moduleType.equals("food")){//food 美食
 			 
 			 LocalFineFoodExample foodExample = new LocalFineFoodExample();
 			 foodExample.createCriteria().andIdEqualTo(id).andStatusEqualTo(0);
 			 List<LocalFineFood> list2 = localFineFoodMapper.selectByExampleWithBLOBs(foodExample);
 			 if(null != list2 && list2.size() >0){
 				 
 				  success =  NotifyUtil.success(list2.get(0));
 				  
 				  map.put("data", list2.get(0));
		     }
 			map.put("recommend", recommend(moduleType,code,list2.get(0).getId()));
 		 }
		
 		map.put("near", list);
 		
 	
 		
		return NotifyUtil.success(map);
	}
	
	
    public List<LocalListRes> recommend(String moduleType,String code,Long id) {
		
    	
       List<LocalListRes> locas = new ArrayList<LocalListRes>();
       
   	   if(moduleType.equals("article")){//文章
			 // new 
			 LocalArticleExample articleExample = new LocalArticleExample();
			 articleExample.setOrderByClause(" rand()");
			 articleExample.createCriteria().andStatusEqualTo(0).andCityCodeEqualTo(code);
			 List<LocalArticle> list2 = localArticleMapper.selectByExample(articleExample);
			 list2.stream().forEach(localArticle ->{
				 LocalListRes localListRes = new LocalListRes();
				 localListRes.setId(localArticle.getId());
				 localListRes.setImg(localArticle.getHeadimg()); 
				 localListRes.setTitle(localArticle.getTitle()); 
				
				 localListRes.setModuleType("article");
				 locas.add(localListRes);
		        });
		 }
		 if(moduleType.equals("tour")){//tour 景区
			 LocalTourExample tourExample = new LocalTourExample();
			 tourExample.createCriteria().andStatusEqualTo(0).andCityCodeEqualTo(code).andIdNotEqualTo(id);
			 
			 List<LocalTour> list2 = localTourMapper.selectByExample(tourExample);
			 list2.stream().forEach(localTour ->{
				 LocalListRes localListRes = new LocalListRes();
				 localListRes.setId(localTour.getId());
				 localListRes.setImg(localTour.getHeadimg()); 
				 localListRes.setTitle(localTour.getName()); 
				 localListRes.setName(localTour.getName()); 
				 localListRes.setModuleType("tour");
				 locas.add(localListRes);
		        });
		 }
		 
		 if(moduleType.equals("food")){//
			 
			 LocalFineFoodExample foodExample = new LocalFineFoodExample();
			 foodExample.createCriteria().andStatusEqualTo(0).andCityCodeEqualTo(code).andIdNotEqualTo(id);
			 List<LocalFineFood> list2 = localFineFoodMapper.selectByExample(foodExample);
			 list2.stream().forEach(localFineFood ->{
				 LocalListRes localListRes = new LocalListRes();
				 localListRes.setId(localFineFood.getId());
				 localListRes.setImg(localFineFood.getHeadimg()); 
				 localListRes.setTitle(localFineFood.getSpecialDishes()); 
				 
				 localListRes.setFoodType(getFoodType(localFineFood.getFoodType()));
				 localListRes.setAddress(localFineFood.getAdress()); 
				 localListRes.setName(localFineFood.getName());
				 localListRes.setModuleType("food"); 
				 locas.add(localListRes);
		        });
		 }
		
		return locas;
	}
	
}
