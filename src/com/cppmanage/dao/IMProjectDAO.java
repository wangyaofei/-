package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.MProject;

public interface IMProjectDAO {
	void updateproject(MProject project) throws SQLException;
	void deleteproject(String id) throws SQLException;
	List<MProject> getAll() throws SQLException;
	int addProject(MProject project) throws SQLException;
	MProject getProjectWithID(String id) throws SQLException;
}
