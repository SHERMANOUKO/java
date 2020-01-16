package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostsDao {
	
	public static List<Post> getPostsList() throws ClassNotFoundException, SQLException{ 
		
		String url = "jdbc:mysql://localhost:3306/golang";
		String uname = "sherman";
		String pass = "sherman";
		String sql = "SELECT * FROM posts";
		
		ArrayList<Post> posts = new ArrayList<>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);

		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String title = rs.getString(2);
			String author = rs.getString(3);
			
			Post p = new Post(id, title, author);
			posts.add(p);
			
		}
		return posts;
	}
}
