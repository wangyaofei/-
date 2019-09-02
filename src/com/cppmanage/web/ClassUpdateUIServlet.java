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
import com.cppmanage.domain.Teacher;
import com.cppmanage.service.ClassService;
import com.cppmanage.service.TeacherLoginService;

/**
 * Servlet implementation class ClassUpdateUIServlet
 */
@WebServlet("/ClassUpdateUIServlet")
public class ClassUpdateUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取当前班级信息
		String id = request.getParameter("id");
		ClassService classService = new ClassService();

		try {
			MClass mClass = classService.getClassWithID(id);
			request.setAttribute("mClass", mClass);

			// 获取教师数据
			TeacherLoginService teacherLoginService = new TeacherLoginService();
			List<Teacher> allTeacher = teacherLoginService.getAllTeacher();
			request.setAttribute("allTeacher", allTeacher);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		request.getRequestDispatcher("tgls/agent/class_update.jsp").forward(request, response);
	}

}
