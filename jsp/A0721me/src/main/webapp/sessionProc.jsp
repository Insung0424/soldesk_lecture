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
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pw =	request.getParameter("pw");
	session.setAttribute("id", id);
	session.setAttribute("pw", pw);
	//세션 유지 시간 설정
	session.setMaxInactiveInterval(60*2);
%>
<%=id %>
<%=pw %>
<a href="sessionProc2.jsp">req</a>
</body>
</html>