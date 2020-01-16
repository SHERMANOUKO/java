package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	String url = "jdbc:mysql://localhost:3306/golang";
	String uname = "sherman";
	String pass = "sherman";
	String sql = "SELECT * FROM users WHERE uname=? AND pass=?";
	
	public boolean verifyCredentials(String username, String password) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
	
}
