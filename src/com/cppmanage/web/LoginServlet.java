package com.cppmanage.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cppmanage.domain.Admin;
import com.cppmanage.domain.Student;
import com.cppmanage.domain.Teacher;
import com.cppmanage.service.AdminLoginService;
import com.cppmanage.service.StudentLoginService;
import com.cppmanage.service.TeacherLoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		int power = Integer.parseInt( request.getParameter("power") );
		
		if(power == 1)
		{
			StudentLoginService studentloginService = new StudentLoginService();
			try {
				Student student = studentloginService.login(id,password);
				
				HttpSession session = request.getSession();
				
				Cookie cookie = new Cookie("JSESSIONID", session.getId());
				cookie.setPath("/CPPmanage");
				cookie.setMaxAge(60*2);
				response.addCookie(cookie);
				
				session.setAttribute("student", student);
				response.sendRedirect(request.getContextPath()+"/student.jsp");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				if(e.getMessage().equals("用户名或密码错误")) {
					request.setAttribute("err", e.getMessage());
					//服务器内部转发
					request.getRequestDispatcher("login.jsp").forward(request, response);
				} else {
					e.printStackTrace();
				}
			}
			
		}
		else if(power == 2)
		{
			TeacherLoginService teacherloginService = new TeacherLoginService();
			try {
				Teacher teacher = teacherloginService.login(id,password);
				
				HttpSession session = request.getSession();
				
				Cookie cookie = new Cookie("JSESSIONID", session.getId());
				cookie.setPath("/CPPmanage");
				cookie.setMaxAge(60*2);
				response.addCookie(cookie);
				
				session.setAttribute("teacher", teacher);
				
				response.sendRedirect(request.getContextPath()+"/teacher.jsp");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				if(e.getMessage().equals("用户名或密码错误")) {
					request.setAttribute("err", e.getMessage());
					//服务器内部转发
					request.getRequestDispatcher("login.jsp").forward(request, response);
				} else {
					e.printStackTrace();
				}
			}
		}
		else if(power == 3)
		{
			AdminLoginService adminloginService = new AdminLoginService();
			try {
				Admin admin = adminloginService.login(id,password);
				
				HttpSession session = request.getSession();
				
				Cookie cookie = new Cookie("JSESSIONID", session.getId());
				cookie.setPath("/CPPmanage");
				cookie.setMaxAge(60*2);
				response.addCookie(cookie);
				
				session.setAttribute("admin", admin);
				
				response.sendRedirect(request.getContextPath()+"/admin.jsp");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				if(e.getMessage().equals("用户名或密码错误")) {
					request.setAttribute("err", e.getMessage());
					//服务器内部转发
					request.getRequestDispatcher("login.jsp").forward(request, response);
				} else {
					e.printStackTrace();
				}
			}
		}
	}

}
