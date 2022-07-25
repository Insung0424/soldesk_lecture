<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scope</title>
</head>
<body>
<%pageContext.setAttribute("name", "page");
	request.setAttribute("name", "req");
	session.setAttribute("name", "sen");
	application.setAttribute("name", "app");
%>
현재페이지에서 우선순위가 가장높은것${name}<br>
${pageScope.name }<br>
${requestScope.name }<br>
${sessionScope.name }<br>
${applicationScope.name }<br>
</body>
</html>