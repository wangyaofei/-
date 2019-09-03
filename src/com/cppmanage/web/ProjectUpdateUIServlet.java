package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cppmanage.domain.MProject;
import com.cppmanage.service.ProjectService;

/**
 * Servlet implementation class TeacherUpdateUIServlet
 */
@WebServlet("/TeacherUpdateUIServlet")
public class ProjectUpdateUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		ProjectService projectService = new ProjectService();

		try {
			MProject mProject = projectService.getProjectWithID(id);
			request.setAttribute("mProject", mProject);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		request.getRequestDispatcher("tgls/agent/project_update.jsp").forward(request, response);
	}

}
