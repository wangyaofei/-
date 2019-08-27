package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.cppmanage.dao.IUserDAO;
import com.cppmanage.domain.User;
import com.cppmanage.util.JDBCUtil;

public class UserDAOImpl implements IUserDAO {

	@Override
	public void save(User stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User checkUser(String id, String pwd, String power) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		
		String sql = "select * from user where id=? and password=? and power=?";
		User user = null;
		user = qr.query(sql,new BeanHandler<User>(User.class),id,pwd,power);
		return user;
	}

}
