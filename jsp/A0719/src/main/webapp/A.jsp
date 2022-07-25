<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A</title>
</head>
<body>
<form action="B.jsp" method="get">
id : <input name="id"><br>
color : <select name="color">
	<option value="yellow">yellow
	<option value="blue">blue
	<option value="green">green
	<option value="red">red
</select>
<input type="submit" value="선택완료">
</form>
</body>
</html>