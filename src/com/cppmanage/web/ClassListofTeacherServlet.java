package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cppmanage.domain.MClass;
import com.cppmanage.domain.Teacher;
import com.cppmanage.service.ClassService;

/**
 * Servlet implementation class ClassListofTeacherServlet
 */
@WebServlet("/ClassListofTeacherServlet")
public class ClassListofTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClassService classService = new ClassService();

		try {
			HttpSession session = request.getSession();
			Teacher teacher = new Teacher();
			teacher = (Teacher) session.getAttribute("teacher");
			List<MClass> allClassofTeacher = classService.getAllClassofTeacher(teacher.getTchid());
			request.setAttribute("allClassofTeacher", allClassofTeacher);
			//服务器内部转发
			request.getRequestDispatcher("tgls/agent/classofteacher_list.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
