<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign_up</title>
</head>
<body>
<form:form action="register" method="post" modelAttribute="member">
<table>
	<tr height="50">
		<td>
			ID : 
		</td>
		<td>
			<form:input path="id" type="text"/>
			<form:errors path="id"/>
		</td>
	</tr>
	<tr height="50">
		<td>
			PW : 
		</td>
		<td>
			<form:input path="pw" type="text"/>
			<form:errors path="pw"/>
		</td>
	</tr>
	<tr height="50">
		<td>
			Phone : 
		</td>
		<td>
			<form:input path="phone" type="text"/>
			<form:errors path="phone"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<form:button type="submit">Sign-up</form:button>
		</td>
	</tr>
</table>
</form:form>
</body>
</html>