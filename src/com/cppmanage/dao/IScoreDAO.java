package com.cppmanage.dao;

import java.sql.SQLException;
import java.util.List;

import com.cppmanage.domain.Score;

public interface IScoreDAO {

	void updatescore(Score score) throws SQLException;
	void deletescore(String id) throws SQLException;
	List<Score> getAll() throws SQLException;
	int addScore(Score score) throws SQLException;
	Score getScoreWithID(String id) throws SQLException;
	//List<MScoreListDisplay> getAllDisplay() throws SQLException;
}
