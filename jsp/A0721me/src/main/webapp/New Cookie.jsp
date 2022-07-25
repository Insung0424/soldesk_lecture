<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie</title>
</head>
<body>
<%
	//쿠키생성
	Cookie c = new Cookie("id","in");

	//유효기간설정
	c.setMaxAge(60*2);
	
	//클라이언트에 쿠키 전송
	response.addCookie(c);
	
	Cookie coo = new Cookie("id2","is");
	coo.setMaxAge(0);
	response.addCookie(coo);
	
	
%>
<a href="getCookie.jsp">쿠키확인</a>
</body>
</html>