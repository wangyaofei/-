package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.Student;
import com.cppmanage.domain.StudentListDisplay;

public interface IStudentDAO {
	
	void updatestudent(Student student) throws SQLException;
	void deletestudent(String id) throws SQLException;
	List<Student> getAll() throws SQLException;
	int addStudent(Student student) throws SQLException;
	Student getStudentWithID(String id) throws SQLException;
	List<StudentListDisplay> getAllDisplay() throws SQLException;
	
	Student checkStudent(String id, String password) throws SQLException;
}
