package com.cppmanage.service;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.dao.IScoreDAO;
import com.cppmanage.daoimpl.ScoreDAOImpl;
import com.cppmanage.domain.Score;
import com.cppmanage.domain.ScoreListDisplay;


public class ScoreService {
	IScoreDAO iScoreDAO = new ScoreDAOImpl();
	public List<Score> getAllScore() throws SQLException {
		// TODO Auto-generated method stub
		
		List<Score> allScore = iScoreDAO.getAll();
		return allScore;
	}
	
	public List<ScoreListDisplay> getAllScoreDisplay(String clsid, String tchid) throws SQLException {
		// TODO Auto-generated method stub
		
		List<ScoreListDisplay> allScore = iScoreDAO.getAllDisplay(clsid,tchid);
		return allScore;
	}

	public void delscore(String id) throws SQLException {
		// TODO Auto-generated method stub
		iScoreDAO.deletescore(id);
	}

	public void addScore(Score score) throws SQLException {
		// TODO Auto-generated method stub
		iScoreDAO.addScore(score);
	}

	public Score getScoreWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		Score score = iScoreDAO.getScoreWithID(id);
		return score;
	}

	public void updateScore(Score score) throws SQLException {
		// TODO Auto-generated method stub
		iScoreDAO.updatescore(score);
	}
}
