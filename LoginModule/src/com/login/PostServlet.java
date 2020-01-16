package com.login;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.Post;
import com.login.dao.PostsDao;


@WebServlet("/Post")
public class PostServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			List<Post> posts = PostsDao.getPostsList();
			request.setAttribute("Posts", posts);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("post.jsp");
		rd.forward(request, response);
	}

}
