package com.dongnao.jack.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @ClassName: Intreceptor1
 * @Description: 自定义拦截器一
 * @author: cash
 * @date: 2018年12月17日 下午9:41:48
 */
public class Interceptor1 implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {

		System.out.println(this.getClass().getName() + "<------>自定义拦截器1后置处理");

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {

		System.out.println(this.getClass().getName() + "<------>自定义拦截器1中置处理");
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println(this.getClass().getName() + "<------>自定义拦截器1前置处理");
		return true;
	}

}
