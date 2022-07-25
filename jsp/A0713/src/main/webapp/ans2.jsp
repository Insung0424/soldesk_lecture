<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ans2</title>
</head>
<body>
<%
	String u = request.getParameter("s");
	response.sendRedirect(u);
%>

</body>
</html>