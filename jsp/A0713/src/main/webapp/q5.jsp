<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLEncoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>q5</title>
</head>
<body>
<jsp:forward page="ans5.jsp">
	<jsp:param value='<%=URLEncoder.encode("책","UTF-8") %>' name="book"/>
</jsp:forward>
</body>
</html>