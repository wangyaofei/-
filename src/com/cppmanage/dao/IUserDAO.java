package com.cppmanage.dao;

import java.util.List;

import com.cppmanage.domain.User;

public interface IUserDAO {
	
	void save(User stu);
	
	void update(User stu);
	
	void delete(String id);
	
	User get(String id);
	
	List<User> getAll();

	void checkLogin(String name, String pwd);
	
}
