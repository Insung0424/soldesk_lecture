<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import= "java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Two Form</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pwd");
		String nn = request.getParameter("aa");
		if(nn.equals("user")){
	%>
			<jsp:forward page = "main.jsp">
				<jsp:param value='<%=URLEncoder.encode("고객","UTF-8") %>'
				name="username"/>
			</jsp:forward>
	<%
		}else{
	%>
			<jsp:forward page = "manage.jsp">
				<jsp:param value='<%=URLEncoder.encode("관리","UTF-8") %>'
				name="username"/>
			</jsp:forward>
	<%
		}
	%>
</body>
</html>