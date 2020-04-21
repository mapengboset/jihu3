package com.yqbing.servicebing.webapp.task;

import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.yqbing.servicebing.service.IBaiMeiService;

@Controller
@Lazy(false)
public class BaimeiYunIdcard {

	@Resource
	IBaiMeiService baiMeiService;
	
	@Scheduled(cron = "0 0 2 * * ?")
	public void getIdCard()throws Exception{
		baiMeiService.getIdCard();
	} 
	
}
