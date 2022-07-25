<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ans4</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("na");
	String color = request.getParameter("color");
%>
<body bgcolor=<%=color %>>
<%=name %>님은 <%=color %>색을 좋아합니다

<%
	int i=1,sum=0;
	while(i<11){
		sum+=i;
		i++;
	}
%>
1~10까지의 합은 <%=sum %>
<br>

<script>
	int i=1,sum=0;
	while(i<11){
		sum+=i;
		i++;
	}
	document.write("1~10까지의 합은 "+sum);
</script>



</body>
</html>