package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.Admin;

public interface IAdminDAO {
	void save(Admin admin);
	void update(Admin admin);
	void delete(String id);
	Admin get(String id);
	List<Admin> getAll();
	Admin checkadmin(String id, String password) throws SQLException;
}
