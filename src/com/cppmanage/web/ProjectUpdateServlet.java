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
 * Servlet implementation class TeacherUpdateServlet
 */
@WebServlet("/TeacherUpdateServlet")
public class ProjectUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String proid = request.getParameter("proid");
		String proname = request.getParameter("proname");
		String proinfo = request.getParameter("proinfo");
		String prodegree = request.getParameter("prodegree");
		//把参数封装成对象
		MProject mProject = new MProject();
		mProject.setProid(proid);
		mProject.setProname(proname);
		mProject.setProinfo(proinfo);
		mProject.setProdegree(prodegree);
		ProjectService projectService = new ProjectService();

		try {
			projectService.updateTeacher(mProject);
			request.getRequestDispatcher("/ProjectListServlet").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
