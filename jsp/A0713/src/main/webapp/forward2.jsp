<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLDecoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward2</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8"); 
String name = URLDecoder.decode(request.getParameter("name"));
String ho =URLDecoder.decode(request.getParameter("hobby"));
%>
<%=name %>님의 취미는 <%=ho %>입니다

</body>
</html>