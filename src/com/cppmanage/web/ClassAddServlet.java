package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cppmanage.domain.MClass;
import com.cppmanage.service.ClassService;

/**
 * Servlet implementation class ClassAddServlet
 */
@WebServlet("/ClassAddServlet")
public class ClassAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String clsid = request.getParameter("clsid");
		String clsname = request.getParameter("clsname");
		String tchid = request.getParameter("tchid");
		//把参数封装成对象
		MClass mClass = new MClass();
		
		mClass.setClsid(clsid);
		mClass.setClsname(clsname);
		mClass.setTchid(tchid);
		
		ClassService classService = new ClassService();
		
		try {
			classService.addClass(mClass);
			request.getRequestDispatcher("/ClassListServlet").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
}
