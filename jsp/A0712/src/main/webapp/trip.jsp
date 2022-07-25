<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tirp</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String t = request.getParameter("trip");
%>
<a href = "javascript:history.go(-1)">다시조회</a>
<br>
여행지 : <%=t %>

</body>
</html>