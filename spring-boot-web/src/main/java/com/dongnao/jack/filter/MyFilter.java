package com.dongnao.jack.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @ClassName: MyFilter 
 * @Description: 自定义过滤器
 * @author: cash
 * @date: 2018年12月17日 下午9:37:55
 */
@WebFilter(filterName = "MyFilter", urlPatterns = "/*")
public class MyFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter) throws IOException, ServletException {

		System.out.println(((HttpServletRequest) request).getRequestURL() + "******自定义过滤器***");
		filter.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
