<%@page import="member.memDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inmem</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="m" class="member.memBean">
	<jsp:setProperty property="*" name="m"/>
</jsp:useBean>
<%
	memDAO mdao = new memDAO();
	mdao.insertM(m);
	response.sendRedirect("Forward.jsp");
%>
</body>
</html>