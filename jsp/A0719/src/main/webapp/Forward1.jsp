<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forward1</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	int n = Integer.parseInt(request.getParameter("n"));
	for(int i=1;i<=9;i++){
		out.println(n + " * " + i + " = " + (n*i)+"<br>");
	}
%>
<br>
<a href="https://velog.io/@songyouhyun/Get%EA%B3%BC-Post%EC%9D%98-%EC%B0%A8%EC%9D%B4%EB%A5%BC-%EC%95%84%EC%8B%9C%EB%82%98%EC%9A%94">
get과 post의 차이</a>
<input type="button" value="가입하기" onclick="location.href='memberForm.jsp'"/>
</body>
</html>