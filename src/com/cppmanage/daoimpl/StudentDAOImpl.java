package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.cppmanage.dao.IStudentDAO;
import com.cppmanage.domain.Student;
import com.cppmanage.util.JDBCUtil;

public class StudentDAOImpl implements IStudentDAO {

	@Override
	public void save(Student stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student checkStudent(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
        QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		
		String sql = "select * from student where stuid=? and stupsw=?";
		Student student = null;
		student = qr.query(sql,new BeanHandler<Student>(Student.class),id,password);
		return student;
	}

}
