<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import= "java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="palegreen">

<%= URLDecoder.decode(request.getParameter("username"),"UTF-8") %>님 로그인 되었습니다
<%= request.getParameter("id") %> welcome
</body>
</html>