package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cppmanage.domain.MClass;
import com.cppmanage.domain.MGroup;
import com.cppmanage.service.ClassService;
import com.cppmanage.service.GroupService;

/**
 * Servlet implementation class ClassUpdateServlet
 */
@WebServlet("/GroupUpdateServlet")
public class GroupUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		String grpid = request.getParameter("grpid");
		String grpname = request.getParameter("grpname");
		String grpleader = request.getParameter("grpleader");
		String proid = request.getParameter("proid");
		//把参数封装成对象
		MGroup mGroup = new MGroup();
		
		mGroup.setGrpid(grpid);
		mGroup.setGrpname(grpname);
		mGroup.setGrpleader(grpleader);
		mGroup.setProid(proid);
		
		GroupService groupService = new GroupService();
		
		try {
			groupService.updateGroup(mGroup);
			request.getRequestDispatcher("/GroupListServlet").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
