package com.cppmanage.service;

import com.cppmanage.dao.IUserDAO;
import com.cppmanage.daoimpl.UserDAOImpl;

public class LoginService {

	public void login(String name, String pwd) {
		// TODO Auto-generated method stub
		IUserDAO iloginDao = new UserDAOImpl();
		iloginDao.checkLogin(name,pwd);
	}

}