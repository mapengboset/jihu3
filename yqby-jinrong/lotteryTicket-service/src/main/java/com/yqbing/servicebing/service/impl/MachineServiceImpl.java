package com.yqbing.servicebing.service.impl;

import com.yqbing.servicebing.common.ErrorCodeEnum;
import com.yqbing.servicebing.repository.database.bean.MachineBean;
import com.yqbing.servicebing.repository.database.bean.StoreUser;
import com.yqbing.servicebing.repository.database.bean.UserInfoBean;
import com.yqbing.servicebing.repository.database.dao.MachineMapper;
import com.yqbing.servicebing.repository.database.dao.StoreUserMapper;
import com.yqbing.servicebing.repository.database.dao.UserInfoBeanMapper;
import com.yqbing.servicebing.service.CommonService;
import com.yqbing.servicebing.service.MachineService;
import com.yqbing.servicebing.utils.NotifyUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("machineService")
public class MachineServiceImpl extends CommonService implements MachineService{

    @Resource
    private UserInfoBeanMapper userInfoBeanMapper;

    @Resource
    private MachineMapper machineMapper;

    @Resource
    private StoreUserMapper storeUserMapper;


    @Override
    public String queryAllMachineList(String token) {
        if(StringUtils.isBlank(token)){
            return NotifyUtil.error(ErrorCodeEnum.PARAMERROE);
        }
        UserInfoBean userInfoBean = userInfoBeanMapper.queryToken(token);
        if(null == userInfoBean){
            return NotifyUtil.error(ErrorCodeEnum.PARAMERROE,"无此用户");
        }
        StoreUser storeUser = storeUserMapper.selectByUserId(userInfoBean.getId());
        if(null == storeUser){
            return NotifyUtil.error(ErrorCodeEnum.PARAMERROE,"无次门店信息");
        }
        List<MachineBean> machineBeanList = machineMapper.selectAllMachine(storeUser.getStoreId());
        if(null == machineBeanList || machineBeanList.size() <= 0){
            return NotifyUtil.success();
        }
        return NotifyUtil.success(machineBeanList);
    }
}
