<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employee</title>
</head>
<body>
<form action="emp.jsp">
<table border="1">
	<tr>
		<td>name</td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>address</td>
		<td><input type="text" name="address"></td>
	</tr>
	<tr>
		<td>ssn</td>
		<td><input type="text" name="ssn"></td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit" value="완료">
		<input type="reset" value="취소">		</td>
	</tr>
</table>
</form>

</body>
</html>