<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ans3</title>
</head>
<body>
<%!
	String a;
%>
<%
	a = request.getParameter("q3");
	if(a.equals("gildong")){
	%>
	<%= a %>
		<%
	}else{
		%>
		<script>
			alert("다시입력");
			history.go(-1);
		</script>
		<%
	}
%>

</body>
</html>