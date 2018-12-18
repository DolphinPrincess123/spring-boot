package com.dongnao.jack.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @ClassName: SprirngInterceptorRegister
 * @Description: 自定义拦截器注册中心
 * @author: cash
 * @date: 2018年12月17日 下午9:40:03
 */
@Configuration
public class SprirngInterceptorRegister extends WebMvcConfigurerAdapter {

	/**
	 * 注册自定义拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		Interceptor1 interceptor1 = new Interceptor1();
		Interceptor2 interceptor2 = new Interceptor2();
		registry.addInterceptor(interceptor1).addPathPatterns("/**");
		registry.addInterceptor(interceptor2).addPathPatterns("/freemarker/**");
		super.addInterceptors(registry);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/image/**").addResourceLocations("classpath:/image/");
		registry.addResourceHandler("/picture/**").addResourceLocations("file:D:/picture/");
		super.addResourceHandlers(registry);
	}

}
