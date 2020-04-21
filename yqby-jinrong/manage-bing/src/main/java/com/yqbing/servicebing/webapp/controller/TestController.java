package com.yqbing.servicebing.webapp.controller;

import java.util.List;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yqbing.servicebing.common.ResultModel;
import com.yqbing.servicebing.repository.database.bean.TUserInfoBean;
import com.yqbing.servicebing.service.TUserInfoBeanService;

@Controller
@Api(tags = "测试管理")
public class TestController extends BaseController{
	private static final Logger LOGGER = LoggerFactory
            .getLogger(TestController.class);
	
	@Resource(name="userInfoBeanService")
	private TUserInfoBeanService userInfoBeanService = null;;
	
	@RequestMapping(value ={"/test/myname"},method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "测试 查询 用户基本信息表")
	public ResultModel getName(@ApiParam(value="费用户名字")@RequestParam(value = "name", required = false)String name){
		ResultModel resultModel = ResultModel.success();
		try {
			List<TUserInfoBean> users =  userInfoBeanService.queryName(name);
			
			resultModel.setResult(users);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		return resultModel;
	}
	
}
