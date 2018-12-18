package com.dongnao.jack.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @ClassName: MyServlet
 * @Description: spring boot中使用servlet,方式一:启动类中注册servlet
 * @author: cash
 * @date: 2018年12月17日 下午4:48:43
 */
public class RegistryServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("启动类中注册servlet测试");
		PrintWriter pw = resp.getWriter();
		pw.write("hello spring boot register ");
		pw.flush();
		pw.close();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
