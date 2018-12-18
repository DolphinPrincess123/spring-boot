package com.dongnao.jack.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: StartUp1 
 * @Description: 启动加载类加载数据
 * @author: cash
 * @date: 2018年12月17日 下午11:27:08
 */
@Component
// order 表示加载先后顺序
@Order(value = 2)

public class StartUp1 implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(StartUp1.class);

	@Override
	public void run(String... arg0) throws Exception {

		logger.info("StartUp1  加载数据*******");
	}

}
