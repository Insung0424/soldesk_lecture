<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>movie</title>
</head>
<body>
<%
	String[] movie = {"판의미로","반지의제왕","나니아연대기","해리포터"};
	pageContext.setAttribute("movie", movie);
	
%>
<c:forEach var="m" items="${movie }" varStatus="status">
	${m }
	${status.index }
	${status.count }<br>
</c:forEach>

<c:forEach var="m" items="${movie }" varStatus="status">
	<c:choose>
		<c:when test="${status.first}">
			<li style="color:red; font-weight:bold;">${m }</li>
		</c:when>
		<c:otherwise>
			<li>${m }</li>
		</c:otherwise>
	</c:choose>
</c:forEach>

<c:forEach var="m" items="${movie }" varStatus="status">
	${m }<!-- 마지막 값이 아니면 or 를 더해서 출력 -->
		<c:if test="${not status.last }">or</c:if>
</c:forEach>

<br>

<c:forEach var="cnt" begin="1" end="10" varStatus="status">
	${cnt }
</c:forEach>
</body>
</html>