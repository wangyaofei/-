package com.cppmanage.service;

import java.sql.SQLException;

import com.cppmanage.dao.IUserDAO;
import com.cppmanage.daoimpl.UserDAOImpl;
import com.cppmanage.domain.User;

public class LoginService {

	public User login(String id, String pwd, String power) throws SQLException {
		// TODO Auto-generated method stub
		IUserDAO iloginDao = new UserDAOImpl();
		User user = iloginDao.checkUser(id,pwd,power);
		
		if(user != null) {
			return user;
		}else {
			throw new RuntimeException("用户名或密码错误");
		}
	}

}