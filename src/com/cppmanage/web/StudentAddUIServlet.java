package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cppmanage.domain.MClass;
import com.cppmanage.domain.MGroup;
import com.cppmanage.domain.MProject;
import com.cppmanage.domain.Teacher;
import com.cppmanage.service.ClassService;
import com.cppmanage.service.GroupService;
import com.cppmanage.service.ProjectService;
import com.cppmanage.service.TeacherLoginService;

/**
 * Servlet implementation class StudentAddUIServlet
 */
@WebServlet("/StudentAddUIServlet")
public class StudentAddUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TeacherLoginService teacherService = new TeacherLoginService();
		GroupService groupService = new GroupService();
		ClassService classService = new ClassService();
		ProjectService projectService = new ProjectService();
		try {
			List<Teacher> allTeacher = teacherService.getAllTeacher();
			request.setAttribute("allTeacher", allTeacher);
			List<MGroup> allGroup = groupService.getAllGroup();
			request.setAttribute("allGroup", allGroup);
			List<MClass> allClass = classService.getAllClass();
			request.setAttribute("allClass", allClass);
			List<MProject> allProject = projectService.getAllProject();
			request.setAttribute("allProject", allProject);
			
			request.getRequestDispatcher("tgls/agent/student_add.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
