package com.cppmanage.service;

import java.sql.SQLException;

import com.cppmanage.dao.IAdminDAO;
import com.cppmanage.daoimpl.AdminDAOImpl;
import com.cppmanage.domain.Admin;

public class AdminLoginService {

	public Admin login(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		IAdminDAO iadminDao = new AdminDAOImpl();
		Admin admin = iadminDao.checkadmin(id,password);
		
		if(admin != null) {
			return admin;
		}else {
			throw new RuntimeException("用户名或密码错误");
		}
		
	}

}
