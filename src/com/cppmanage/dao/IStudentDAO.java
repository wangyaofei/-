package com.cppmanage.dao;

import java.util.List;

import com.cppmanage.domain.Student;

public interface IStudentDAO {
	
	void save(Student stu);
	
	void update(Student stu);
	
	void delete(String id);
	
	Student get(String id);
	
	List<Student> getAll();
	
}
