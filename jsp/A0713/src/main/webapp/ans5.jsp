<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLDecoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ans5</title>
</head>
<body>
여기는 ans5.jsp 이지만 url은 q5.jsp그대로 유지됩니다
<% 
request.setCharacterEncoding("UTF-8");
String book = URLDecoder.decode(request.getParameter("book"),"UTF-8");
%>
q5.jsp 에서 가져온 param은 <%=book%> 입니다
</body>
</html>