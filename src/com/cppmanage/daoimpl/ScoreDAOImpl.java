package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.cppmanage.dao.IScoreDAO;
import com.cppmanage.domain.Score;
import com.cppmanage.util.JDBCUtil;

public class ScoreDAOImpl implements IScoreDAO {

	private QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
	
	
	@Override
	public void updatescore(Score score) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update score set scrvalue=?,tchid=?,stuid=? where scrid=?";
		qr.update(sql,score.getScrvalue(),score.getTchid(),score.getStuid(),score.getScrid());
	}

	@Override
	public void deletescore(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from score where scrid=?";
		qr.update(sql,id);
	}

	@Override
	public List<Score> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from score";
		return qr.query(sql, new BeanListHandler<Score>(Score.class));
	}

	@Override
	public int addScore(Score score) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into score values(?,?,?,?)";
		qr.update(sql,score.getScrid(),score.getScrvalue(),score.getTchid(),score.getStuid());
		return 0;
	}

	@Override
	public Score getScoreWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from score where scrid=?";
		return qr.query(sql, new BeanHandler<Score>(Score.class),id);
	}

}
