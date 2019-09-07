package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.MClass;
import com.cppmanage.domain.MClassListDisplay;

public interface IMClassDAO {

	void updateclass(MClass mclass) throws SQLException;
	void deleteclass(String id) throws SQLException;
	List<MClass> getAll() throws SQLException;
	int addClass(MClass mclass) throws SQLException;
	MClass getClassWithID(String id) throws SQLException;
	List<MClassListDisplay> getAllDisplay() throws SQLException;
	List<MClass> getAllClassofTeacher(String tchid) throws SQLException;
}
