<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign-in</title>
</head>
<body>
<form:form action="confirm" method="post" modelAttribute="member">
<table>
	<tr height="50">
		<td>
			ID : 
		</td>
		<td>
			<form:input path="id" type="text"/>
		</td>
	</tr>
	<tr height="50">
		<td>
			PW : 
		</td>
		<td>
			<form:input path="pw" type="text"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<form:button type="submit">Sign-in</form:button>
		</td>
	</tr>
</table>
</form:form>
</body>
</html>