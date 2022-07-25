<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>White</title>
</head>
<body bgcolor = "lightgray">
이 파일은 white.jsp 지만 lightgray배경이다
<jsp:forward page="orange.jsp"></jsp:forward>

<jsp:param value="lg" name="usercolor">
</body>
</html>