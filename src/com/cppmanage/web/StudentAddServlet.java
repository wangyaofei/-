package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cppmanage.domain.Student;
import com.cppmanage.service.StudentLoginService;

/**
 * Servlet implementation class StudentAddServlet
 */
@WebServlet("/StudentAddServlet")
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String stuid = request.getParameter("stuid");
		String stuname = request.getParameter("stuname");
		String stupsw = request.getParameter("stupsw");
		String stusex = request.getParameter("stusex");
		String stuemail = request.getParameter("stuemail");
		
		String tchid = request.getParameter("tchid");
		String clsid = request.getParameter("clsid");
		String grpid = request.getParameter("grpid");
		String proid = request.getParameter("proid");

		
		//把参数封装成对象
		Student student = new Student();
		
		student.setStuid(stuid);
		student.setStuname(stuname);
		student.setStupsw(stupsw);
		student.setStusex(stusex);
		student.setStuemail(stuemail);
		if(!tchid.equals("null"))
			student.setTchid(tchid);
		if(!clsid.equals("null"))
			student.setClsid(clsid);
		if(!grpid.equals("null"))
			student.setGrpid(grpid);
		if(!proid.equals("null"))
			student.setProid(proid);
		
		
		StudentLoginService studentLoginService = new StudentLoginService();
		
		try {
			studentLoginService.addStudent(student);
			request.getRequestDispatcher("/StudentListServlet").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
