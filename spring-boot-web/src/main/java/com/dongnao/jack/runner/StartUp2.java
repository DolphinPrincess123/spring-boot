package com.dongnao.jack.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: StartUp2 
 * @Description: 自定义启动类加载数据
 * @author: cash
 * @date: 2018年12月18日 上午10:30:24
 */
@Component
@Order(value =1)
public class StartUp2 implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(StartUp2.class);

	@Override
	public void run(String... arg0) throws Exception {

		logger.info("StartUp2  加载数据*******");
	}
}
