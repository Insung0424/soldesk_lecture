<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
표현식으로 출력<br>
<%
	request.setCharacterEncoding("utf-8");
%>
id = [<%=request.getParameter("id") %>]<br>
pw = [<%=request.getParameter("pw") %>]<br>

<br>el로 출력<br>
id = [${param.id }]<br>
pw = [${param["pw"] }]<br>
</body>
</html>