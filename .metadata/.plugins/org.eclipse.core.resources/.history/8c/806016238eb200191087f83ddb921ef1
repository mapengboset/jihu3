package com.yqbing.servicebing.webapp.task;

import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.yqbing.servicebing.repository.database.dao.StoreHouseMapper;
import com.yqbing.servicebing.repository.redis.RStoreHouseData;
import com.yqbing.servicebing.service.WebmagicService;
import com.yqbing.servicebing.service.WebmagicgameService;

@Controller
@Lazy(false)
public class WebmagicrSoftware {

	@Resource(name = "webmagicService")
	private WebmagicService webmagicService = null;

	@Resource(name = "storeHouseMapper")
	private StoreHouseMapper storeHouseMapper= null;
	
	@Resource(name = "rStoreHouseData")
	private RStoreHouseData rStoreHouseData = null;
	@Resource(name = "webmagicgameService")
	private WebmagicgameService webmagicgameService = null;
	
	@Scheduled(cron = "0 0 2 * * ?")
	public void downUrl()throws Exception{
		webmagicService.downUrl(storeHouseMapper,rStoreHouseData);
		webmagicgameService.downgomeUrl(storeHouseMapper,rStoreHouseData);
	} 
	 

	
	
	
}
