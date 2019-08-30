package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.cppmanage.dao.IAdminDAO;
import com.cppmanage.domain.Admin;
import com.cppmanage.domain.MClass;
import com.cppmanage.util.JDBCUtil;

public class AdminDAOImpl implements IAdminDAO {

	
	QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
	
	@Override
	public Admin checkadmin(String id, String password) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from admin where admid=? and admpsw=?";
		Admin admin = null;
		admin = qr.query(sql,new BeanHandler<Admin>(Admin.class),id,password);
		return admin;
	}

	@Override
	public void updateadmin(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update admin set admname=?,admpsw=? where admid=?";
		qr.update(sql,admin.getAdmname(),admin.getAdmpsw(),admin.getAdmid());
	}

	@Override
	public Admin getAdminWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from admin where admid=?";
		return qr.query(sql, new BeanHandler<Admin>(Admin.class),id);
	}
}
