<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLEncoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward1</title>
</head>
<body>
<jsp:forward page="forward2.jsp">
<jsp:param value='<%=URLEncoder.encode("수영","UTF-8")%>'  name="hobby"/>
<jsp:param value='<%=URLEncoder.encode("홍길동","UTF-8")%>' name="name"/>
</jsp:forward>
</body>
</html>