package com.assests.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.assets.common.utils.CookieUtils;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.SysUser;
import com.assets.service.LoginService;

public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	private LoginService loginService;

	@Value("${SSO_LOGIN_URL}")
	private String SSO_LOGIN_URL;

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// 1、拦截请求url
		// 2、从cookie中取token
		String token = CookieUtils.getCookieValue(request, "TT_TOKEN");
		// 判断token是否有只
		if (StringUtils.isBlank(token)) {
			//response.sendRedirect(SSO_LOGIN_URL + "?redirectURL="+ request.getRequestURI());
			response.sendRedirect(SSO_LOGIN_URL);
			return false;
		}
		// 3、如果没有token跳转到登录页面。
		// 4、取到token，需要调用sso系统的服务查询用户信息。
		ResponseResult result = loginService.getUserByToken(token);
		//可能json中没有数据，为null，转java对象的话就会出错，所以先转成result对象
		if (result.getStatus()!=200) {
			//response.sendRedirect(SSO_LOGIN_URL + "?redirectURL="+ request.getRequestURI());
			response.sendRedirect(SSO_LOGIN_URL);
			return false;
		}
		//取用户对象 数据不为null，将数据转为java对象		
		SysUser user = (SysUser) result.getData();
		// 5、如果用户session已经过期，跳转到登录页面		
		if (user == null) {
			//response.sendRedirect(SSO_LOGIN_URL + "?redirectURL="+ request.getRequestURI());
			response.sendRedirect(SSO_LOGIN_URL);
			return false;
		}
		// 把用户对象放入request中
		request.setAttribute("user", user);
		// 6、如果没有过期，放行。
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
