package com.cppmanage.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cppmanage.domain.ScoreListDisplay;
import com.cppmanage.domain.Teacher;
import com.cppmanage.service.ScoreService;

/**
 * Servlet implementation class ScoreListServlet
 */
@WebServlet("/ScoreListServlet")
public class ScoreListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//获取clsid
		String clsid = request.getParameter("clsid");
		HttpSession session = request.getSession();
		
		//获取tchid
		Teacher teacher = new Teacher();
		teacher = (Teacher) session.getAttribute("teacher");
		String tchid = teacher.getTchid();
		
		ScoreService scoreService = new ScoreService();
		try {
			List<ScoreListDisplay> allScore = scoreService.getAllScoreDisplay(clsid,tchid);
			request.setAttribute("allScore", allScore);
			//服务器内部转发
			request.getRequestDispatcher("tgls/agent/score_list.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
