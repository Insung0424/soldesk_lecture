<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fortoken</title>
</head>
<body>
<c:forTokens var="food" items="빙수.커피,케잌.스콘" delims=",">
	${food }<br>
</c:forTokens>

<c:set var="age" value="20" scope="page"/>
${age }<br>
<c:out value="${ age}"/><br>
<c:remove var="age" scope="page"/>
<c:out value="${ age}"/><br>

<c:catch var="err">
	예외 전
	<%=1/0 %><br>
	예외후	
</c:catch>
<c:out value="${err}"/>
</body>
</html>