<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String f ="";
	int c = Integer.parseInt(request.getParameter("color"));
	if( c == 1 ){
		f = "red";
	}else if( c == 2 ){
		f = "green";
	}else{
		f = "blue";
	}
%>
<font color=<%=f %>>color = <%=f %></font><br>

<c:if test="${param.color==1 }">
	<span style="color:red;">red</span><br>
</c:if>
<c:if test="${param.color==2 }">
	<span style="color:green;">green</span><br>
</c:if>
<c:if test="${param.color==3 }">
	<span style="color:blue;">blue</span><br>
</c:if>

<c:choose>
	<c:when test="${param.color==1 }">
		<span style="color:red;">red</span><br>
	</c:when>
	<c:when test="${param.color==2 }">
		<span style="color:green;">green</span><br>
	</c:when>
	<c:otherwise>
		<span style="color:blue;">blue</span><br>
	</c:otherwise>
</c:choose>


</body>
</html>