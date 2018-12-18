package com.dongnao.jack.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @ClassName: AnnocationServlet
 * @Description: spring boot中使用servlet方式二,使用注解
 * @author: cash
 * @date: 2018年12月17日 下午4:59:59
 */
@WebServlet(urlPatterns = "/annocation/*")
public class AnnocationServlet extends HttpServlet {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("注解方式使用servlet");
		PrintWriter pw = resp.getWriter();
		pw.write("hello annocation servlet");
		pw.flush();
		pw.close();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
