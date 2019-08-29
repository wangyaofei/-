package com.cppmanage.test;

import java.sql.SQLException;
import org.junit.Test;

import com.cppmanage.dao.ITeacherDAO;
import com.cppmanage.daoimpl.TeacherDAOImpl;



public class TeacherDAOTest {
	@Test
	public void testGetAllMClass() throws SQLException
	{
		ITeacherDAO teacherdao = new TeacherDAOImpl();
		System.out.println(teacherdao.getAll());
		
	}
}
