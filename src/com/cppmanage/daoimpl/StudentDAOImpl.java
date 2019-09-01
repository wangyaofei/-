package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.cppmanage.dao.IStudentDAO;
import com.cppmanage.domain.Student;
import com.cppmanage.domain.StudentListDisplay;
import com.cppmanage.util.JDBCUtil;

public class StudentDAOImpl implements IStudentDAO {

	QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
	
	@Override
	public List<Student> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from student";
		return qr.query(sql, new BeanListHandler<Student>(Student.class));
	}

	@Override
	public Student checkStudent(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from student where stuid=? and stupsw=?";
		Student student = null;
		student = qr.query(sql,new BeanHandler<Student>(Student.class),id,password);
		return student;
	}

	@Override
	public void updatestudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update student set stuname=?,stupsw=?,stusex=?,stuemail=?,tchid=?,clsid=?,grpid=?,proid=? where stuid=?";
		qr.update(sql,student.getStuname(),student.getStupsw(),student.getStusex(),student.getStuemail(),student.getTchid(),
				student.getClsid(),student.getGrpid(),student.getProid(),student.getStuid());
	}

	@Override
	public void deletestudent(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from student where stuid=?";
		qr.update(sql,id);
	}

	@Override
	public int addStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into student values(?,?,?,?,?,?,?,?,?)";
		qr.update(sql,student.getStuid(),student.getStuname(),student.getStupsw(),student.getStusex(),student.getStuemail(),
				student.getTchid(),student.getClsid(),student.getGrpid(),student.getProid());
		return 0;
	}

	@Override
	public Student getStudentWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from student where stuid=?";
		return qr.query(sql, new BeanHandler<Student>(Student.class),id);
	}

	@Override
	public List<StudentListDisplay> getAllDisplay() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
