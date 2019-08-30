package com.cppmanage.service;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.dao.IMProjectDAO;
import com.cppmanage.daoimpl.MProjectDAOImpl;
import com.cppmanage.domain.MProject;

public class ProjectService {
	
	IMProjectDAO imProjectdao = new MProjectDAOImpl();

	public List<MProject> getAllProject() throws SQLException {
		// TODO Auto-generated method stub
		
		List<MProject> allProject = imProjectdao.getAll();
		return allProject;
	}

	public void delproject(String id) throws SQLException {
		// TODO Auto-generated method stub
		imProjectdao.deleteproject(id);
	}

	public void addProject(MProject project) throws SQLException {
		// TODO Auto-generated method stub
		imProjectdao.addProject(project);
	}

	public MProject getProjectWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		MProject project = imProjectdao.getProjectWithID(id);
		return project;
	}

	public void updateTeacher(MProject project) throws SQLException {
		// TODO Auto-generated method stub
		imProjectdao.updateproject(project);
	}
}
