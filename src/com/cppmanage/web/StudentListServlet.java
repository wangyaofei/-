package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cppmanage.domain.StudentListDisplay;
import com.cppmanage.service.StudentLoginService;

/**
 * Servlet implementation class StudentListServlet
 */
@WebServlet("/StudentListServlet")
public class StudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentLoginService studentLoginService = new StudentLoginService();
		try {
			List<StudentListDisplay> allStudentDisplay = studentLoginService.getAllStudentDisplay();
			request.setAttribute("allStudentDisplay", allStudentDisplay);
			//服务器内部转发
			request.getRequestDispatcher("tgls/agent/student_list.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
