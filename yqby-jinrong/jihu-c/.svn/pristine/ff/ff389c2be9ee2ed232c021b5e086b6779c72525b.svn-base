package com.yqbing.servicebing.webapp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import com.yqbing.servicebing.repository.database.bean.StoreHouse;
import com.yqbing.servicebing.repository.database.dao.StoreHouseMapper;
import com.yqbing.servicebing.service.WebmagicService;
import com.yqbing.servicebing.service.impl.WebmagicServiceImpl;

public class testsss implements PageProcessor{

    private static String REGEX_PAGE_URL = "https://shouji\\.baidu\\.com/software/50\\w+/list_\\w+.html";
    //    private static String REGEX_PAGE_URL = "http://zhushou.360.cn/list/index/cid/\\w+/";
  
  //爬取的页数
  public static int PAGE_SIZE = 10;
  //下载张数
  public static int INDEX_PHOTO =0;

  //配置s
  @Override
  public Site getSite() {
      return Site.me().setRetryTimes(3).setSleepTime(3000);
  }

  @Override
  public void process(Page page) {
      List<String> targetURL = new ArrayList<String>();
      String appName = null;//app名字
	    String appSize = null;//大小
	    String appVersion = null;//版本
	    String downTimes = null;//下载次数
	    String appDesc = null;//应用介绍
	    String appUrlImg = null;//微信头像
	    Short appType = null;//分类
	    String appUrl = null;//
	    String Type = null;//
	    	/*for (int i = 1; i < PAGE_SIZE; i++){
	    		//添加到目标url中
	    		for (int j = 1; j < 9; j++) {
	    			
	    			targetURL.add("https://shouji.baidu.com/software/50"+i+"/list_"+j+".html");
	    		//	targetURL.add("https://shouji.baidu.com/game/40"+i+"/list_"+j+".html");
	    		}
	    	}*/
	    targetURL.add("https://shouji.baidu.com/software/50"+1+"/list_"+3+".html");
      //添加url到请求中
      page.addTargetRequests(targetURL);

      //是图片列表页面
      Selectable url = page.getUrl();
   //   LOGGER.info(url);
      if (page.getUrl().regex(REGEX_PAGE_URL).match()) {
          //获得所有详情页的连接
          List<String> detailURL = page.getHtml().xpath("//a[@class=\"app-box\"]").links().all();
       /*   for (String str:detailURL){
              //输出所有连接
              LOGGER.info(str);
          }*/
          page.addTargetRequests(detailURL);
          //如果是详情页
      } else {
               //要按条件筛选//*[@id="doc"]/div[2]/div/div[1]/div/div[2]/h1/span
               appName = page.getHtml().xpath("//h1[@class='app-name']/span/text()").toString();//app名字
      	     appSize = page.getHtml().xpath("//span[@class='size']/text()").toString();//大小
      	     appVersion = page.getHtml().xpath("//span[@class='version']/text()").toString();//版本
      	     downTimes = page.getHtml().xpath("//span[@class='download-num']/text()").toString();//下载次数
      	     appDesc = page.getHtml().xpath("//p[@class='content']/text()").toString();//应用介绍
      	     appUrlImg = page.getHtml().xpath("//div[@class='app-pic']").css("img", "src").toString();//微信头像
      	     appUrl = page.getHtml().xpath("//div[@class='area-download']/a").css("a", "href").toString();//下载链接
      	     Type = page.getHtml().xpath("//div[@class=\"nav\"]/span[5]/a/text()").toString();//分类
      	     List<String> all = page.getHtml().xpath("//div[@class=\"section-body\"]/div/ul/li").css("img", "src").all();//详情照片
      	     System.out.println(all);
      	     StoreHouse storeHouse = new StoreHouse();//*[@id="doc"]/div[1]/div/span[5]/a //*[@id="doc"]/div[2]/div/div[2]/div[2]/div/div/ul/li[1]/img
      	     storeHouse.setAppName(appName);
      	     storeHouse.setAppSize(appSize);
      	    //storeHouse.setAppType(appType);
      	     storeHouse.setAppUrl(appUrl);
      	     storeHouse.setAppDesc(appDesc);
      	     storeHouse.setAppUrlImg(appUrlImg);
      	     storeHouse.setAppVersion(appVersion);
      	     storeHouse.setDownTimes(downTimes);
      	     storeHouse.setCreateTime(new Date());
      	     if(StringUtils.isNotBlank(Type)){
      	    	 //1系统工具 2主题壁纸 3社交通讯 4拍摄美化 5影音播放  6生活实用 7理财购物 8办公学习 9资讯阅读   10旅游出行
      	     switch (Type) {
					case "系统工具":
						appType =  1;
						break;
					case "主题壁纸":
						appType =  2;
						break;
					case "社交通讯":
						appType =  3;
						break;
					case "拍摄美化":
						appType =  4;
						break;
					case "影音播放":
						appType =  5;
						break;
					case "生活实用":
						appType =  6;
						break;
					case "理财购物":
						appType =  7;
						break;
					case "办公学习":
						appType =  8;
						break;
					case "资讯阅读":
						appType =  9;
						break;
					case "旅游出行":
						appType =  10;
						break;

					default:
						appType =  1;
						break;
					}
      	    	 
      	    	 storeHouse.setAppType(appType);	 
      	     }
      	   try {
				   if(StringUtils.isNotBlank(appName)){
					   
					
				}
			   } catch (Exception e) {
				new RuntimeException();
			  }
      	 
      }
      }
//  }
  

  
/*public static void main(String[] args) {
	   
	   Spider.create(new testsss()).addUrl("https://shouji.baidu.com/software/501/list_3.html").thread(10).run();
			
 }*/
  public static void main(String[] args) {
	   
	   String saf = StringUtils.substringAfterLast("78MB", "MB");
	   
	   System.out.println(saf);
	   
  }

}
