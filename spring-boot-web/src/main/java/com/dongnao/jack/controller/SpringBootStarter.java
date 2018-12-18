package com.dongnao.jack.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import com.dongnao.jack.servlet.RegistryServlet;

//@SpringBootApplication 相当于@Configuration,@EnableAutoConfiguration,@ComponentScan
@SpringBootApplication(scanBasePackages = { "com.dongnao.jack" }, exclude = {})

// 扫描工程中的Servlet、Filter、Listener
@ServletComponentScan(basePackages = { "com.dongnao.jack" })
public class SpringBootStarter {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootStarter.class, args);
	}

/*	@Bean
	public ServletRegistrationBean servletRegistrationBean() {

		return new ServletRegistrationBean(new RegistryServlet(), "/jack/*");
	}*/
}
