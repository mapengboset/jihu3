package com.yqbing.servicebing.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.yqbing.servicebing.common.Constant;
import com.yqbing.servicebing.utils.enums.ErrorCodeEnum;
import com.yqbing.servicebing.utils.web.CommonResult;


public class MVCExceptionResolver implements HandlerExceptionResolver {

	private static final Logger LOG = LoggerFactory.getLogger(MVCExceptionResolver.class);
	
	private View jsonView;
	
	private String errorViewName;
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		HandlerMethod hm = (HandlerMethod) handler;
		ResponseBody responseBodyAnnotation = hm.getMethodAnnotation(ResponseBody.class);
		String format = request.getParameter("format");
		String debug = request.getParameter("debug");
		
		CommonResult result = new CommonResult(ErrorCodeEnum.CODE_ERROR, ex.getMessage());
		
		//原始controller方法是页面非json
		boolean isView = false;
		boolean isViewJson = false;
		if(responseBodyAnnotation == null && !StringUtils.containsIgnoreCase(format, "json")){
			//视图
			modelAndView.setViewName(errorViewName);
			isView = true;
		}else{	
			//json
			modelAndView.setView(jsonView);
		}
		
		if(StringUtils.equals(request.getHeader(Constant.REQ_HEADER_ACTION_TYPE), Constant.RESPONSE_BODY_TYPE_JSON)){
			modelAndView.setView(jsonView);			
			isViewJson = true;
		}
		
		if(StringUtils.isNotBlank(debug)){
			modelAndView.addObject("exception", getErrorInfoFromException(ex));
		}
		
		/**
		 * 登录用户异常直接返回登录页
		 */
		if(ex instanceof LoginException && isView){
			LoginException exception = (LoginException) ex;
			result = new CommonResult(exception.getErrorCode().getRoot(), ex.getMessage());
			result.setError(exception.getErrorCode(), exception.getData(), exception.getErrorMessageParams());
			result.setErrorTitleIfNone(ex.getMessage());
			
			if(StringUtils.isNotBlank(exception.getLoginUrl())){
				ModelAndView model = new ModelAndView(new RedirectView(exception.getLoginUrl(), true));
				return model;
			}
		}else if(ex instanceof YqbyException){
			YqbyException exception = (YqbyException) ex;
			result = new CommonResult(exception.getErrorCode().getRoot(), ex.getMessage());
			result.setError(exception.getErrorCode(), exception.getData(), exception.getErrorMessageParams());
			result.setErrorTitleIfNone(ex.getMessage());
		}else if(ex instanceof YqbyRuntimeException){
			YqbyRuntimeException exception = (YqbyRuntimeException) ex;
			result = new CommonResult(exception.getErrorCode().getRoot(), ex.getMessage());
			result.setError(exception.getErrorCode(), exception.getData(), exception.getErrorMessageParams());
			result.setErrorTitleIfNone(ex.getMessage());
		}else{
			result = new CommonResult(ErrorCodeEnum.CODE_ERROR, ex.getMessage());
			result.setErrorTitleIfNone(ex.getMessage());
		}
		
		//视图返回
		if(isView){
//			Map<String, Object> currentUser = new HashMap<String, Object>();
//			currentUser.put("userInfo", userInfo);
//			result.setCurrentUser(currentUser);
//			modelAndView.addObject(Constant.RETURN_DATA_NAME, result);
		}else{
//			if(isViewJson){	//视图转json
//				Map<String, Object> currentUser = new HashMap<String, Object>();
//				currentUser.put("userInfo", userInfo);
//				result.setCurrentUser(currentUser);
//			}
			modelAndView.addObject("code", result.getCode());
			modelAndView.addObject("message", result.getMsg());
			modelAndView.addObject("body", result.getBody());
			modelAndView.addObject("error", result.getError());
		}
	
		LOG.error("MVCExceptionResolver: " + result,ex);
		return modelAndView;

	}
	
	private String getErrorInfoFromException(Exception e) {  
        try {  
            StringWriter sw = new StringWriter();  
            PrintWriter pw = new PrintWriter(sw);  
            e.printStackTrace(pw);  
            return sw.toString();  
        } catch (Exception ex) {  
            return "bad getErrorInfoFromException";  
        }  
    }  

	public void setJsonView(View jsonView) {
		this.jsonView = jsonView;
	}

	public void setErrorViewName(String errorViewName) {
		this.errorViewName = errorViewName;
	}

	
	
}
