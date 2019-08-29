package com.cppmanage.test;

import java.sql.SQLException;

import org.junit.Test;

import com.cppmanage.dao.IMClassDAO;
import com.cppmanage.daoimpl.MClassDAOImpl;
import com.cppmanage.domain.MClass;

public class MClassDAOTest {

	private MClass mclass;

	@Test
	public void testGetAllMClass() throws SQLException
	{
		IMClassDAO mclassdao = new MClassDAOImpl();
		System.out.println(mclassdao.getAll());
		
	}
	
	@Test
	public void testAddMClass() throws SQLException
	{
		mclass = new MClass();
		mclass.setClsid("1602");
		mclass.setClsname("17jike1");
		mclass.setTchid("3");
		IMClassDAO mclassdao = new MClassDAOImpl();
		mclassdao.addClass(mclass);
		
	}
}
