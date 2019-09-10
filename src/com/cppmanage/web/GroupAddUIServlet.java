package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cppmanage.domain.MProject;
import com.cppmanage.domain.Student;
import com.cppmanage.service.ProjectService;
import com.cppmanage.service.StudentLoginService;

/**
 * Servlet implementation class ClassAddUIServlet
 */
@WebServlet("/GroupAddUIServlet")
public class GroupAddUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ProjectService projectService = new ProjectService();
		StudentLoginService studentLoginService = new StudentLoginService();
		try {
			List<MProject> allProject = projectService.getAllProject();
			request.setAttribute("allProject", allProject);
			
			List<Student> allStudent = studentLoginService.getAllStudent();
			request.setAttribute("allStudent", allStudent);
			
			request.getRequestDispatcher("tgls/agent/group_add.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
