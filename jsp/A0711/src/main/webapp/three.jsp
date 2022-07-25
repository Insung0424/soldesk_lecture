<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Three</title>
<%
	String age = request.getParameter("age");
	String name = (String)request.getAttribute("name");
%>
</head>
<body bgcolor = orange>
	이동페이지
	<%=age %>
	<%=name %>
</body>
</html>