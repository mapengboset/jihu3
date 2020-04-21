package com.yqbing.servicebing.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author lizhen
 * @version v1.0.0
 * @project energy
 * @date 2016-11-17
 */
@SuppressWarnings("serial")
@ApiModel(value = "返回结果类")
public class ResultModel<T> implements Serializable {

    @ApiModelProperty(value = "code 0-正常",name="errorCode")
    public Integer errorCode;
    @ApiModelProperty(value = "操作信息",name="errorMessage")
    public String errorMessage;
    @ApiModelProperty(value = "结果集",name="result")
    public T result;

    public ResultModel() {
    }

    public ResultModel(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * 成功：无数据
     *
     * @return
     */
    @SuppressWarnings("rawtypes")
	public static ResultModel success() {
        return new ResultModel(ErrorCode.SUCCESS,ErrorCode.getErrInfo(ErrorCode.SUCCESS));
    }
    @SuppressWarnings("rawtypes")
	public static ResultModel error(Integer errorCode,String errorMessage) {
        return new ResultModel(errorCode,errorMessage);
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
