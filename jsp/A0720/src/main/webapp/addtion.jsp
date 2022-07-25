<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addtion</title>
</head>
<body>
<%
	int n1 = (Integer)request.getAttribute("num1");
	int n2 = (Integer)request.getAttribute("num2");
	int a = (Integer)request.getAttribute("a");
%>
표현식으로 출력
<%=n1%>+<%=n2%>=<%=a%><br>
el언어로 출력
${num1} + ${num2} = ${a} <br>
</body>
</html>