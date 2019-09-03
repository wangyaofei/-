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
import com.cppmanage.service.ProjectService;

/**
 * Servlet implementation class TeacherListServlet
 */
@WebServlet("/TeacherListServlet")
public class ProjectListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ProjectService projectService = new ProjectService();
		try {
			
			List<MProject> allProject = projectService.getAllProject();
			request.setAttribute("allProject", allProject);
			//服务器内部转发
			request.getRequestDispatcher("tgls/agent/project_list.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
