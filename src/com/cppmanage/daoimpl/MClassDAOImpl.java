package com.cppmanage.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.cppmanage.dao.IMClassDAO;
import com.cppmanage.domain.MClass;
import com.cppmanage.domain.MClassListDisplay;
import com.cppmanage.util.JDBCUtil;

public class MClassDAOImpl implements IMClassDAO {

	private QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());

	@Override
	public void updateclass(MClass mclass) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update mclass set clsname=?,tchid=? where clsid=?";
		qr.update(sql,mclass.getClsname(),mclass.getTchid(),mclass.getClsid());
	}

	@Override
	public void deleteclass(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from mclass where clsid=?";
		qr.update(sql,id);
	}

	@Override
	public List<MClass> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from mclass";
		return qr.query(sql, new BeanListHandler<MClass>(MClass.class));
	}

	@Override
	public int addClass(MClass mclass) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into mclass values(?,?,?)";
		qr.update(sql,mclass.getClsid(),mclass.getClsname(),mclass.getTchid());
		return 0;
	}

	@Override
	public MClass getClassWithID(String id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from mclass where clsid=?";
		return qr.query(sql, new BeanHandler<MClass>(MClass.class),id);
	}
	
	
	@Override
	public List<MClassListDisplay> getAllDisplay() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select clsid,clsname,mclass.tchid,tchname from mclass,teacher where mclass.tchid=teacher.tchid;";
		return qr.query(sql, new BeanListHandler<MClassListDisplay>(MClassListDisplay.class));
	}
	
}
