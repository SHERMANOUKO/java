<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td {
  		border: 1px solid black;
	}
	
	table {
	  width: 50%;
	}
	
</style>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
		if(session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
	%>
	<table>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>author</th>
		</tr>
		<c:forEach var="items" items="${Posts}">
			<tr>
				<td>${items.id}</td>
				<td>${items.title}</td>
				<td>${items.author}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>