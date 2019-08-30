package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cppmanage.domain.Teacher;
import com.cppmanage.service.TeacherLoginService;

/**
 * Servlet implementation class TeacherAddServlet
 */
@WebServlet("/TeacherAddServlet")
public class TeacherAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String tchid = request.getParameter("tchid");
		String tchname = request.getParameter("tchname");
		String tchpsw = request.getParameter("tchpsw");
		String tchsex = request.getParameter("tchsex");
		String tchemail = request.getParameter("tchemail");
		String tchdep = request.getParameter("tchdep");
		String tchtitle = request.getParameter("tchtitle");
		//把参数封装成对象
		Teacher teacher = new Teacher();
		
		teacher.setTchid(tchid);
		teacher.setTchname(tchname);
		teacher.setTchpsw(tchpsw);
		teacher.setTchsex(tchsex);
		teacher.setTchemail(tchemail);
		teacher.setTchdep(tchdep);
		teacher.setTchtitle(tchtitle);
		
		TeacherLoginService teacherLoginService = new TeacherLoginService();
		
		try {
			teacherLoginService.addTeacher(teacher);
			request.getRequestDispatcher("/TeacherListServlet").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
