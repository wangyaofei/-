package com.cppmanage.service;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.dao.IStudentDAO;
import com.cppmanage.daoimpl.StudentDAOImpl;
import com.cppmanage.domain.Student;
import com.cppmanage.domain.StudentListDisplay;

public class StudentLoginService {

	IStudentDAO istudentDao = new StudentDAOImpl();
	
	public Student login(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = istudentDao.checkStudent(id,password);
		
		if(student != null) {
			return student;
		}else {
			throw new RuntimeException("用户名或密码错误");
		}
	}

	public List<Student> getAllStudent() throws SQLException {
		// TODO Auto-generated method stub
		
		List<Student> student = istudentDao.getAll();
		return student;
	}
	
	public List<StudentListDisplay> getAllStudentDisplay() throws SQLException {
		// TODO Auto-generated method stub
		
		List<StudentListDisplay> allStudent = istudentDao.getAllDisplay();
		return allStudent;
	}

	public void delstudent(String id) throws SQLException {
		// TODO Auto-generated method stub
		istudentDao.deletestudent(id);
	}

	public void addStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		istudentDao.addStudent(student);
	}

	public Student getStudentWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		Student student = istudentDao.getStudentWithID(id);
		return student;
	}

	public void updateStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		istudentDao.updatestudent(student);
	}
	
}
