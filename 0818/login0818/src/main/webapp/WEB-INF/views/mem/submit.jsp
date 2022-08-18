<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit</title>
</head>
<body>
<form action="submit" method="post">
	<table>
		<tr>
			<td>ID</td>
			<td>Password</td>
			<td>Name</td>		
		</tr>
		<tr>
			<td><input name="mem_id" type="text" /></td>
			<td><input name="mem_pass" type="text" /></td>
			<td><input name="mem_name" type="text" /></td>
		</tr>
		
	</table>
	<button type="submit">sign-in</button>
</form>
</body>
</html>