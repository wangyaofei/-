package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cppmanage.domain.MGroup;
import com.cppmanage.domain.MProject;
import com.cppmanage.domain.Student;
import com.cppmanage.service.GroupService;
import com.cppmanage.service.ProjectService;
import com.cppmanage.service.StudentLoginService;

/**
 * Servlet implementation class ClassUpdateUIServlet
 */
@WebServlet("/GroupUpdateUIServlet")
public class GroupUpdateUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取当前信息
		String id = request.getParameter("id");
		
		GroupService groupService = new GroupService();
		ProjectService projectService = new ProjectService();
		StudentLoginService studentLoginService = new StudentLoginService();
		
		try {
			
			MGroup mGroup = groupService.getGroupWithID(id);
			request.setAttribute("mGroup", mGroup);
			
			List<MProject> allProject = projectService.getAllProject();
			request.setAttribute("allProject", allProject);
			
			List<Student> allStudent = studentLoginService.getAllStudent();
			request.setAttribute("allStudent", allStudent);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("tgls/agent/group_update.jsp").forward(request, response);
	}

}
