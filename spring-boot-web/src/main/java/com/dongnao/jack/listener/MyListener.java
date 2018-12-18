package com.dongnao.jack.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 
 * @ClassName: MyListener
 * @Description: 自定义监听器
 * @author: cash
 * @date: 2018年12月18日 上午10:29:23
 */
@WebListener
public class MyListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

		System.out.println("自定义监听器被销毁************");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		System.out.println("自定义监听器被创建**********");
	}

}
