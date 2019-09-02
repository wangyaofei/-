package com.cppmanage.service;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.dao.IMGroupDAO;
import com.cppmanage.daoimpl.MGroupDAOImpl;
import com.cppmanage.domain.MGroup;
import com.cppmanage.domain.MGroupListDisplay;

public class GroupService {
	
	IMGroupDAO imGroupDAO = new MGroupDAOImpl();
	
	public List<MGroup> getAllGroup() throws SQLException {
		// TODO Auto-generated method stub
		List<MGroup> allGroup = imGroupDAO.getAll();
		return allGroup;
	}
	
	public List<MGroupListDisplay> getAllGroupDisplay() throws SQLException {
		// TODO Auto-generated method stub
		
		List<MGroupListDisplay> allGroup = imGroupDAO.getAllDisplay();
		
		return allGroup;
	}

	public void delgroup(String id) throws SQLException {
		// TODO Auto-generated method stub
		imGroupDAO.deletegroup(id);
	}

	public void addGroup(MGroup group) throws SQLException {
		// TODO Auto-generated method stub
		imGroupDAO.addGroup(group);
	}

	public MGroup getGroupWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		MGroup mGroup = imGroupDAO.getGroupWithID(id);
		return mGroup;
	}

	public void updateGroup(MGroup group) throws SQLException {
		// TODO Auto-generated method stub
		imGroupDAO.updategroup(group);
	}
}
