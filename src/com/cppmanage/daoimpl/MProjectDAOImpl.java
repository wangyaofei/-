package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.cppmanage.dao.IMProjectDAO;
import com.cppmanage.domain.MProject;
import com.cppmanage.util.JDBCUtil;

public class MProjectDAOImpl implements IMProjectDAO {

	private QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
	
	@Override
	public void updateproject(MProject project) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteproject(String id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MProject> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addProject(MProject project) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MProject getProjectWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
