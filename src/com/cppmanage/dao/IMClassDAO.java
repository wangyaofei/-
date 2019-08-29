package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.MClass;

public interface IMClassDAO {

	void updateclass(MClass mclass) throws SQLException;
	void deleteclass(String id) throws SQLException;
	List<MClass> getAll() throws SQLException;
	int addClass(MClass mclass) throws SQLException;
}
