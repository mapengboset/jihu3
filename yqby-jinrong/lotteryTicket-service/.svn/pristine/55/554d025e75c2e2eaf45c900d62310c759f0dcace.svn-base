package com.yqbing.servicebing.webapp.controller;

import com.yqbing.servicebing.service.MachineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Api(tags = "彩票设备")
@SuppressWarnings("all")
@CrossOrigin
public class MachineController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MachineController.class);

    @Resource
    private MachineService machineService;

    //彩票设备列表
    @RequestMapping(value = "/machine/queryAllMachineList",
            method = {RequestMethod.GET,RequestMethod.POST})
    @ApiOperation(value = "彩票设备列表")
    public String queryAllMachineList(@RequestParam("token") String token){

        String result = StringUtils.EMPTY;

        try {

            result = machineService.queryAllMachineList(token);
            LOGGER.info("/machine/queryAllMachineList--------------------------------------返回参数集合:"+result);
        } catch (Exception e) {

            e.printStackTrace();
        }

        return result;
    }





}
