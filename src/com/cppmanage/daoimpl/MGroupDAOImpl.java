package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.cppmanage.dao.IMGroupDAO;
import com.cppmanage.domain.MGroup;
import com.cppmanage.util.JDBCUtil;

public class MGroupDAOImpl implements IMGroupDAO {

	private QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
	
	@Override
	public void updategroup(MGroup group) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update mgroup set grpname=?,grpleader=?,proid=? where grpid=?";
		qr.update(sql,group.getGrpname(),group.getGrpleader(),group.getProid(),group.getGrpid());
	}

	@Override
	public void deletegroup(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from mgroup where grpid=?";
		qr.update(sql,id);
	}

	@Override
	public List<MGroup> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from mgroup";
		return qr.query(sql, new BeanListHandler<MGroup>(MGroup.class));
	}

	@Override
	public int addGroup(MGroup group) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into mgroup values(?,?,?,?)";
		qr.update(sql,group.getGrpid(),group.getGrpname(),group.getGrpleader(),group.getProid());
		return 0;
	}

	@Override
	public MGroup getGroupWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from mgroup where grpid=?";
		return qr.query(sql, new BeanHandler<MGroup>(MGroup.class),id);
	}

}
