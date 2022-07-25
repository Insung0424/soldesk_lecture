<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>

<%
	String name1 = request.getParameter("name");
	String name2 = (String)session.getAttribute("name1");
	
%>
<%= name1 %>
<%= name2 %>

</body>
</html>