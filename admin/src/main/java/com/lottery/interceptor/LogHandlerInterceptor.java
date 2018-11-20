package com.lottery.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogHandlerInterceptor implements HandlerInterceptor {

	/**
	 * controller 执行之前调用
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	    HttpSession session = request.getSession();
		String user = (String) session.getAttribute("user"); // 获取登录的session信息
        System.out.println(request.getRequestURI());
		if (user != null) {
			return true;
			
		}else if(request.getRequestURI().contains("/login/loginHome")) {
			return true;
			
		} else if(request.getRequestURI().contains("/lottery/jquery-1.8.2.js")) {
			return true;
		} else if(request.getRequestURI().contains("/lottery/login/login")) {
			return true;
		} 
		
		else {
			request.getRequestDispatcher("/login/loginHome").forward(request,response);
			return false;
		}
	}

	/**
	 * controller 执行之后，且页面渲染之前调用
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	/**
	 * 页面渲染之后调用，一般用于资源清理操作
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
