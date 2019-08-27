package com.cppmanage.service;

import java.sql.SQLException;

import com.cppmanage.dao.ITeacherDAO;
import com.cppmanage.daoimpl.TeacherDAOImpl;
import com.cppmanage.domain.Teacher;

public class TeacherLoginService {

	public Teacher login(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		ITeacherDAO iteacherDao = new TeacherDAOImpl();
		Teacher teacher = iteacherDao.checkTeacher(id,password);
		
		if(teacher != null) {
			return teacher;
		}else {
			throw new RuntimeException("用户名或密码错误");
		}
	}

}
