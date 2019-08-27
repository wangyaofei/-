package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.cppmanage.dao.ITeacherDAO;
import com.cppmanage.domain.Teacher;
import com.cppmanage.util.JDBCUtil;

public class TeacherDAOImpl implements ITeacherDAO {

	@Override
	public void save(Teacher stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Teacher stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Teacher get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher checkTeacher(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		
		String sql = "select * from teacher where tchid=? and tchpsw=?";
		Teacher teacher = null;
		teacher = qr.query(sql,new BeanHandler<Teacher>(Teacher.class),id,password);
		return teacher;
	}

}
