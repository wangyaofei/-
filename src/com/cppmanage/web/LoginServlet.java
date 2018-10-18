package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String pwd = request.getParameter("password");
		System.out.println(id + pwd);
		
		LoginService loginService = new LoginService();
		try {
			loginService.login(id,pwd);
			System.out.println("hahahahahahaha");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if(e.getMessage().equals("error")) {
				request.setAttribute("error", e.getMessage());
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				e.printStackTrace();
			}
			
		}
	}

}
