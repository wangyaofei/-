package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.MClass;
import com.cppmanage.domain.Teacher;

public interface ITeacherDAO {
	void updateteacher(Teacher teacher) throws SQLException;
	void deleteteacher(String id) throws SQLException;
	List<Teacher> getAll() throws SQLException;
	int addTeacher(Teacher teacher) throws SQLException;
	Teacher checkTeacher(String id, String password) throws SQLException;
}
