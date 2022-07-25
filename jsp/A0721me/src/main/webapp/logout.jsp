<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
<%
	session.invalidate();
%>
<script type="text/javascript">
	alert("로그아웃");
	location.href='loginForm.jsp';
	//스크립에서는 location.href가 바로 동작한다
</script>
</body>
</html>