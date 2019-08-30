package com.cppmanage.dao;

import java.sql.SQLException;
import com.cppmanage.domain.Admin;

public interface IAdminDAO {
	void updateadmin(Admin admin) throws SQLException;
	Admin getAdminWithID(String id) throws SQLException;
	Admin checkadmin(String id, String password) throws SQLException;
}
