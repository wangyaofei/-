package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.Teacher;

public interface ITeacherDAO {
	void save(Teacher stu);
	void update(Teacher stu);
	void delete(String id);
	Teacher get(String id);
	List<Teacher> getAll();
	Teacher checkTeacher(String id, String password) throws SQLException;
}
