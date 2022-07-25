<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="p" class="Bean.Person">
	<jsp:setProperty property="*" name="p"/>
</jsp:useBean>
<%=p.getName()%><br>
<%=p.getNick()%><br>
<%=p.getJob()%><br>
<%=p.getEmail()%><br>
</body>
</html>