<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ans6</title>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="cls" class="co.jis.a.A">
		<jsp:setProperty property="*" name="cls"/>
	</jsp:useBean>
	<jsp:getProperty property="name" name="cls"/>
	<jsp:getProperty property="email" name="cls"/>
	<jsp:getProperty property="phone" name="cls"/>
</body>
</html>