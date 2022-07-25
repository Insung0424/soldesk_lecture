<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>B</title>
</head>
<body>
<%
	String str1[] = {"simba","rorod","tina","poli"};
	String str2 = "java, jsp, spring, android";
%>
${param.id} 님이 좋아하는 색상은
<font color="${param.color}">${param.color}</font>입니다
<br>

<c:set var="arr" value="<%=str1 %>"/>
<c:forEach var="i" items="${arr}" begin="0" step="1" end="3">
	${i}<br>
</c:forEach>

</body>
</html>