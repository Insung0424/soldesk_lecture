<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>action1</title>
</head>
<body>
<% 
String gen = request.getParameter("gender");
if(gen.equals("man")){
%>
<jsp:forward page="man.jsp">
	<jsp:param value="man" name="gen"/>
</jsp:forward><% 
}else{
%>
<jsp:forward page="woman.jsp">
	<jsp:param value="woman" name="gen"/>
</jsp:forward>
<% 
}
%>

</body>
</html>