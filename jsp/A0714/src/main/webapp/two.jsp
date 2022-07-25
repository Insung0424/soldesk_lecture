<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLDecoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); 
String name = URLDecoder.decode(request.getParameter("name"),"UTF-8");
String hobby = URLDecoder.decode(request.getParameter("hobby"),"UTF-8");
%>
<%= name%>의 취미는 <%= hobby%>입니다

</body>
</html>