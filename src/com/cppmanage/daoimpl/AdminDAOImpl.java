package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.cppmanage.dao.IAdminDAO;
import com.cppmanage.domain.Admin;
import com.cppmanage.util.JDBCUtil;

public class AdminDAOImpl implements IAdminDAO {

	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Admin get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin checkadmin(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		 QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
			
		String sql = "select * from admin where admid=? and admpsw=?";
		Admin admin = null;
		admin = qr.query(sql,new BeanHandler<Admin>(Admin.class),id,password);
		return admin;
	}

}
