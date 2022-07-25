<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Second</title>
</head>
<body>
	<%=pageContext.getAttribute("name")%>
	<!-- 다음페이지로 이동해서 유지 안됨 null 출력 -->
	<br>
	<%=request.getAttribute("name")%>
	<br>
	<%=session.getAttribute("name")%>
	<br>
	<%=application.getAttribute("name")%>
	<br>
	<a href="third.jsp">다른 페이지</a>
</body>
</html>