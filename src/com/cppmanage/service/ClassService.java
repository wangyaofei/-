package com.cppmanage.service;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.dao.IMClassDAO;
import com.cppmanage.daoimpl.MClassDAOImpl;
import com.cppmanage.domain.MClass;

public class ClassService {

	IMClassDAO imClassDAO = new MClassDAOImpl();
	public List<MClass> getAllClass() throws SQLException {
		// TODO Auto-generated method stub
		
		List<MClass> allClass = imClassDAO.getAll();
		
		return allClass;
	}

	public void delclass(String id) throws SQLException {
		// TODO Auto-generated method stub
		imClassDAO.deleteclass(id);
	}

	public void addClass(MClass mClass) throws SQLException {
		// TODO Auto-generated method stub
		imClassDAO.addClass(mClass);
	}

}
