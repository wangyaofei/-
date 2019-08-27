package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cppmanage.domain.User;
import com.cppmanage.service.LoginService;

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
		String power = request.getParameter("power");
		//System.out.println(id + password);
		
		LoginService loginService = new LoginService();
		try {
			User user = loginService.login(id,password,power);
			
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
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

}
