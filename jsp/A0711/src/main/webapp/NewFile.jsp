<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save name</title>
</head>
<body>
<%
	String name = "노랑";
//세션을 이용해서 데이터를 유지
	session.setAttribute("name1", name);
//세션 유지 시간 (n) 은 '초'단위이다
	session.setMaxInactiveInterval(60*60);//60분
%>
<a href="session.jsp?name=<%= URLEncoder.encode(name,"UTF-8") %>">페이지 이동</a>
</body>
</html>