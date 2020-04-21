package com.yqbing.servicebing.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
12. *@Title:  
13. *@Description:  过滤全局所有的url请求
14. *@Author:mapb 
15. *@Since:2018年9月13日  
16. *@Version:1.1.0  
17.
 */
public class TokenVerifyFilter implements Filter {

	private final static Logger logger = LoggerFactory
			.getLogger(TokenVerifyFilter.class);
	private String excludedUrls;
	private String[] excludedUrlArray;

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		excludedUrls = filterConfig.getInitParameter("excludedUrls");
		if (StringUtils.isNotEmpty(excludedUrls)) {
			excludedUrlArray = excludedUrls.split(",");
		}
		return;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		if (request instanceof HttpServletRequest) {
			boolean isExcludedUrl = false;
			String reqUrl = ((HttpServletRequest) request).getServletPath();
			if(reqUrl.indexOf(".do") != -1){
				reqUrl = reqUrl.substring(0, reqUrl.indexOf(".do"));
			} else if(reqUrl.indexOf(".jsp") != -1){
				reqUrl = reqUrl.substring(0, reqUrl.indexOf(".jsp"));
			}
			for (String url : excludedUrlArray) {// 判断是否在过滤url之外
				if (reqUrl.equals(url)) {
					isExcludedUrl = true;
					break;
				}
			}

			if (isExcludedUrl) {// 在过滤url之外
				chain.doFilter(request, response);
			} else {
				Object obj = ((HttpServletRequest) request).getSession().getAttribute("userBean");
				if (obj == null) {
					logger.debug("session is null");
					request.getRequestDispatcher("nologin.jsp").forward(request,
							response);
					return;
				} else {
					chain.doFilter(request, response);
				}
			}
		} else {
			chain.doFilter(request, response);
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}
}
