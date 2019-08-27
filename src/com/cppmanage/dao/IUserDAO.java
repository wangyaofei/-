package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.User;

public interface IUserDAO {
	
	void save(User stu);
	void update(User stu);
	void delete(String id);
	User get(String id);
	List<User> getAll();
	User checkUser(String id, String pwd, String power) throws SQLException;
	
}
