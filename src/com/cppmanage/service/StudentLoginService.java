package com.cppmanage.service;

import java.sql.SQLException;

import com.cppmanage.dao.IStudentDAO;
import com.cppmanage.daoimpl.StudentDAOImpl;
import com.cppmanage.domain.Student;

public class StudentLoginService {

	public Student login(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		IStudentDAO istudentDao = new StudentDAOImpl();
		Student student = istudentDao.checkStudent(id,password);
		
		if(student != null) {
			return student;
		}else {
			throw new RuntimeException("用户名或密码错误");
		}

	}

}
