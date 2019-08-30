package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.cppmanage.dao.ITeacherDAO;
import com.cppmanage.domain.MClass;
import com.cppmanage.domain.Teacher;
import com.cppmanage.util.JDBCUtil;

public class TeacherDAOImpl implements ITeacherDAO {

	private QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());

	@Override
	public Teacher checkTeacher(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "select * from teacher where tchid=? and tchpsw=?";
		Teacher teacher = null;
		teacher = qr.query(sql,new BeanHandler<Teacher>(Teacher.class),id,password);
		return teacher;
	}

	@Override
	public void updateteacher(Teacher teacher) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update teacher set tchname=?,tchpsw=?,tchsex=?,tchemail=?,tchdep=?,tchtitle=? where tchid=?";
		qr.update(sql,teacher.getTchname(),teacher.getTchpsw(),teacher.getTchsex(),teacher.getTchemail(),teacher.getTchdep(),teacher.getTchtitle(),teacher.getTchid());
	}

	@Override
	public void deleteteacher(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from teacher where tchid=?";
		qr.update(sql,id);
	}

	@Override
	public List<Teacher> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from teacher";
		return qr.query(sql, new BeanListHandler<Teacher>(Teacher.class));
	}

	@Override
	public int addTeacher(Teacher teacher) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into teacher values(?,?,?,?,?,?,?)";
		qr.update(sql,teacher.getTchid(),teacher.getTchname(),teacher.getTchpsw(),teacher.getTchsex(),teacher.getTchemail(),teacher.getTchdep(),teacher.getTchtitle());
		return 0;
	}

	@Override
	public Teacher getTeacherWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from teacher where tchid=?";
		return qr.query(sql, new BeanHandler<Teacher>(Teacher.class),id);
	}

}
