<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P2</title>
</head>
<body>
<jsp:forward page="test1.jsp">
	<jsp:param value="violet" name="color"/>
</jsp:forward>
</body>
</html>