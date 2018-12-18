package com.dongnao.jack.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName: Interceptor2
 * @Description: 自定义拦截器二
 * @author: cash
 * @date: 2018年12月18日 上午10:29:00
 */
public class Interceptor2 implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {

		System.out.println(this.getClass().getName() + "<------>自定义拦截器2后置处理");

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {

		System.out.println(this.getClass().getName() + "<------>自定义拦截器2中置处理");
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println(this.getClass().getName() + "<------>自定义拦截器2前置处理");
		return true;
	}
}
