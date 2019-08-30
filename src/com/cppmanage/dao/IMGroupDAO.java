package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.MGroup;
import com.cppmanage.domain.MGroupListDisplay;

public interface IMGroupDAO {
	void updategroup(MGroup group) throws SQLException;
	void deletegroup(String id) throws SQLException;
	List<MGroup> getAll() throws SQLException;
	int addGroup(MGroup group) throws SQLException;
	MGroup getGroupWithID(String id) throws SQLException;
	//List<MGroupListDisplay> getAllDisplay() throws SQLException;
	List<MGroupListDisplay> getAllDisplay();
}
