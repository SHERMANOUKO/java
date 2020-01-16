<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
		if(session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
	%>
	<h3>Welcome ${username}</h3>
	This is your welcome page<br>
	<br>
	<a href="videos.jsp">Videos</a>
	<a href="aboutus.jsp">About us</a>
	<br>
	<br>
	<form action="Logout">
		<input type="submit" value="log out">
	</form>
</body>
</html>