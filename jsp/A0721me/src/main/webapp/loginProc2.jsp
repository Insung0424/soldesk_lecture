<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("user")==null){
		response.sendRedirect("loginForm.jsp");
	}else{
		%>
<%=session.getAttribute("user") %>님이 로그인되었습니다<br>
	<form action="logout.jsp" method="post">
		<input type="submit" value="로그아웃">
	</form>
		<%
	}
%>
</body>
</html>