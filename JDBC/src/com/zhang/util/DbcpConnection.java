package com.zhang.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
/*读取配置文件*/
public class DbcpConnection {
	private static DataSource ds = null;
	static {
		try {
			/*读取配置文件 FileInputStream*/
			FileInputStream in = new FileInputStream("dbcp.properties/dbcp.properties");
			Properties p = new Properties();
			p.load(in);
			ds = BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = ds.getConnection();
			return conn;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
}
