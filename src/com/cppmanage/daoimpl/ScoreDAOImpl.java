package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.cppmanage.dao.IScoreDAO;
import com.cppmanage.domain.Score;
import com.cppmanage.util.JDBCUtil;

public class ScoreDAOImpl implements IScoreDAO {

	private QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
	
	
	@Override
	public void updatescore(Score score) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletescore(String id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Score> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addScore(Score score) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Score getScoreWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
