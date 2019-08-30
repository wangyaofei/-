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
 * Servlet implementation class TeacherUpdateUIServlet
 */
@WebServlet("/TeacherUpdateUIServlet")
public class TeacherUpdateUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		TeacherLoginService teacherLoginService = new TeacherLoginService();

		try {
			Teacher teacher = teacherLoginService.getTeacherWithID(id);
			request.setAttribute("teacher", teacher);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		request.getRequestDispatcher("tgls/agent/teacher_update.jsp").forward(request, response);
	}

}
