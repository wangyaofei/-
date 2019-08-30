package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.cppmanage.dao.IMProjectDAO;
import com.cppmanage.domain.MProject;
import com.cppmanage.util.JDBCUtil;

public class MProjectDAOImpl implements IMProjectDAO {

	private QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
	
	@Override
	public void updateproject(MProject project) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update mproject set proname=?,proinfo=?,prodegree=? where proid=?";
		qr.update(sql,project.getProname(),project.getProinfo(),project.getProdegree(),project.getProid());
	}

	@Override
	public void deleteproject(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from mproject where proid=?";
		qr.update(sql,id);
	}

	@Override
	public List<MProject> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from mproject";
		return qr.query(sql, new BeanListHandler<MProject>(MProject.class));
	}

	@Override
	public int addProject(MProject project) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into mproject values(?,?,?,?)";
		qr.update(sql,project.getProid(),project.getProname(),project.getProinfo(),project.getProdegree());
		return 0;
	}

	@Override
	public MProject getProjectWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from mproject where proid=?";
		return qr.query(sql, new BeanHandler<MProject>(MProject.class),id);
	}

}
