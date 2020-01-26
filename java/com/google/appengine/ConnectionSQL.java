package com.google.appengine;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSQL {
	Connection con = null;
	
	public Connection checkConneciton() {
		try {
			Class.forName("com.mysql.jdbc.GoogleDriver");
			String jdbcURL = "jdbc:mysql://google/cloudassign2?cloudSqlInstance=ethereal-zodiac-257014:us-central1:cloud-assign2&socketFactory=com.google.cloud.sql.mysql.SocketFactory&useSSL=false&user=root&password=root";
			con = DriverManager.getConnection(jdbcURL);
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
//			return con.
		}
		return con;
		
	}
}