package com.yqbing.servicebing.webapp.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.github.pagehelper.PageInfo;
import com.yqbing.servicebing.repository.database.bean.WeBankBean;

@ApiModel(value = "拉新主页")
public class weBankResponse {
	@ApiModelProperty(value = "成功数据", name = "successCount")
	public int successCount;
	@ApiModelProperty(value = "失败数据", name = "failCount")
	public int failCount;
	@ApiModelProperty(value = "月详细数据", name = "data")
	public PageInfo<WeBankBean> data;

	public int getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(int successCount) {
		this.successCount = successCount;
	}

	public int getFailCount() {
		return failCount;
	}

	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}

	public PageInfo<WeBankBean> getData() {
		return data;
	}

	public void setData(PageInfo<WeBankBean> data) {
		this.data = data;
	}

}
