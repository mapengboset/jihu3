
package com.yqbing.servicebing.webapp.controller;


import org.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;

import com.yqbing.servicebing.common.ErrorCode;
import com.yqbing.servicebing.common.ResultModel;
import com.yqbing.servicebing.exception.BingException;

/**
 * 
 * @Title:     
 * @Description:    controller  公共继续   
 * @author: mapb   
 * @date:   2018年11月7日 下午4:54:49   
 * @version V1.0
 */
public abstract class BaseController{
    /**
       * 获取已初始化的输出JSONObject.
     * @return JSONObject
     */
    public JSONObject getResultJSONObject() {
        JSONObject result = new JSONObject();
        result.put(ErrorCode.ERROR_CODE, ErrorCode.SUCCESS);
        result.put(ErrorCode.ERROR_MESSAGE, ErrorCode.getErrInfo(ErrorCode.SUCCESS));
        return result;
    }
    
   
      /**
     *
     * @param code 错误代码
     * @param message 错误信息
     * @param view ModelAndView
     * @return ModelAndView
     */
    protected ModelAndView error(Integer code, String message, ModelAndView view) {
        if (view == null) {
            view = new ModelAndView();
        }
        view.addObject(ErrorCode.ERROR_CODE, code);
        view.addObject(ErrorCode.ERROR_MESSAGE, message);
        return view;
    }

    /**
     *
     * @param exception Exception
     * @param jsonObject JSONObject
     * @return JSONObject
     */
    public JSONObject processException(Exception exception, JSONObject jsonObject) {
        if (null == jsonObject) {
            jsonObject = new JSONObject();
        }
        jsonObject.put("flag", false);
        if (exception instanceof BingException) {
            BingException BingException = (BingException) exception;
            jsonObject.put(ErrorCode.ERROR_CODE, BingException.getErrorCode());
            jsonObject.put(ErrorCode.ERROR_MESSAGE, BingException.getMessage());
            if (exception.getCause() != null) {
                exception.getCause().printStackTrace();
            }
        } else {
            jsonObject.put(ErrorCode.ERROR_CODE, ErrorCode.OTHERS);
            jsonObject.put(ErrorCode.ERROR_MESSAGE, ErrorCode.getErrInfo(ErrorCode.OTHERS));
            exception.printStackTrace();
        }

        return jsonObject;
    }
    public ResultModel processException(Exception exception, ResultModel resultModel) {
        if (null == resultModel) {
            resultModel = new ResultModel();
        }
        if (exception instanceof BingException) {
            BingException BingException = (BingException) exception;
            resultModel.setErrorCode(BingException.getErrorCode());
            resultModel.setErrorMessage(BingException.getMessage());
            if (exception.getCause() != null) {
                exception.getCause().printStackTrace();
            }
        } else {
            resultModel.setErrorCode(ErrorCode.OTHERS);
            resultModel.setErrorMessage(ErrorCode.getErrInfo(ErrorCode.OTHERS));
            exception.printStackTrace();
        }

        return resultModel;
    }
}
