<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberForm</title>
</head>
<body>
<form action="inmem.jsp" method="post">
<table border="1">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id" required></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="passwd"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>나이</td>
		<td><input type="number" name="age"></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="submit" value="회원가입">
		<input type="reset" value="초기화">	
		</td>
	</tr>
</table>
</form>
</body>
</html>