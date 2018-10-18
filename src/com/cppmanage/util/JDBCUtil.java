package com.cppmanage.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;
import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


public class JDBCUtil {
	public static DataSource ds = null;
	
	static {
		try {
			Properties p = new Properties();
			String path = JDBCUtil.class.getClassLoader().getResource("db.properties").getPath();
			FileInputStream in = new FileInputStream(path);
			p.load(in);
			ds = DruidDataSourceFactory.createDataSource(p);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() {
		try {
			return ds.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static DataSource getDataSource() {
		// TODO Auto-generated method stub
		return ds;
	}
	
}
