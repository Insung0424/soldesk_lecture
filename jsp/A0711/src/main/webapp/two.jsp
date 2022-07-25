<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Two</title>
</head>
<body>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	for(int i=1;i<=num;i++){
		out.print(i+" ");
	}
%>
	

</body>
</html>