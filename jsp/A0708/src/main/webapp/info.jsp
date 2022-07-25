<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info</title>
</head>
<body>
<form action="select.jsp" method="post">
	이름 : <input type="text" name="name"><br>
	성별 : <input type="radio" value="남자" name="gender">남자
		<input type="radio" value="여자" name="gender">여자
	<br>
	좋아하는 색 : 
	<input type="checkbox" name="color" value="yellow">yellow
	<input type="checkbox" name="color" value="green">green
	<input type="checkbox" name="color" value="blue">blue
	<br>
	<input type="submit" value="전송">
	<input type="reset" value="취소">
</form>
</body>
</html>