package com.yqbing.servicebing.webapp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @Title:     
 * @Description:    权限拦截器   
 * @author: mapb   
 * @date:   2018年11月7日 下午4:55:33   
 * @version V1.0
 */
public class PermissionInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
/*
    @Autowired
    private PermissionsService service;

    private Logger logger = LoggerFactory.getLogger(PermissionInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        模拟账户测试用
//        AccountBean a = new AccountBean();
//        RoleBean ab = new RoleBean();
//        ab.setRoleId(1L);
//        a.setRoleBean(ab);
//        a.setAccountId(58000000000000L);
//        request.getSession().setAttribute("userInfo", a);

        String requestURI = request.getRequestURI();
        AccountBean userInfo = (AccountBean) request.getSession().getAttribute("userInfo");
        //未登陆
        if (null == userInfo) {
            response.sendRedirect(GlobeConstants.LOGIN_URL);
            return false;
        }
        //首页只要登陆了就可以访问
        if (GlobeConstants.INDEX_URL.equals(requestURI)) {
            return true;
        }
        Long roleId = userInfo.getRoleBean().getRoleId();
        RoleModuleRelationBean verification = service.verification(requestURI, roleId);
        //无权限
        if (null == verification) {
            response.sendRedirect(GlobeConstants.NO_PERMISSION_URL);
            return false;
        }
        logger.info("用户：" + userInfo.getAccountId() + "，角色:" + roleId + "，访问：" + requestURI + " 成功");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }*/


}
