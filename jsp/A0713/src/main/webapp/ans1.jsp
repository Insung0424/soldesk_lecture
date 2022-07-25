<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ans</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	int a = Integer.parseInt(request.getParameter("a1"));
	int sum = 0;
	for(int i=1;i<=a;i++){
		sum += i;
	}
%>
총합은 <%= sum %>
</body>
</html>