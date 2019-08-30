package com.cppmanage.service;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.dao.ITeacherDAO;
import com.cppmanage.daoimpl.TeacherDAOImpl;
import com.cppmanage.domain.Teacher;

public class TeacherLoginService {

	
	ITeacherDAO iteacherDao = new TeacherDAOImpl();
	
	public Teacher login(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		
		Teacher teacher = iteacherDao.checkTeacher(id,password);
		
		if(teacher != null) {
			return teacher;
		}else {
			throw new RuntimeException("用户名或密码错误");
		}
	}
	
	public List<Teacher> getAllTeacher() throws SQLException {
		// TODO Auto-generated method stub
		
		List<Teacher> allTeacher = iteacherDao.getAll();
		return allTeacher;
	}

	public void delteacher(String id) throws SQLException {
		// TODO Auto-generated method stub
		iteacherDao.deleteteacher(id);
	}

	public void addTeacher(Teacher teacher) throws SQLException {
		// TODO Auto-generated method stub
		iteacherDao.addTeacher(teacher);
	}

	public Teacher getTeacherWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		Teacher teacher = iteacherDao.getTeacherWithID(id);
		return teacher;
	}

	public void updateTeacher(Teacher teacher) throws SQLException {
		// TODO Auto-generated method stub
		iteacherDao.updateteacher(teacher);
	}
	

}
