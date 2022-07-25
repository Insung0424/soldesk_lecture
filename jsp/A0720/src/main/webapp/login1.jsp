<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login1</title>
</head>
<body>
el언어로 출력<br>
id = [${param.id}]<br>
pw = [${param["pwd"]}]<br>

<br>표현식으로 출력<br>
<%
	request.setCharacterEncoding("utf-8");
%>
id = [<%=request.getParameter("id") %>]<br>
pw = [<%=request.getParameter("pwd") %>]<br>

id==q <%=request.getParameter("id") == "q" %><br>
id equals q <%=request.getParameter("id").equals("q") %><br>

el비교<br>
id==q ${param["id"]=="q" } el언어에서는 ==이 자바의 equals와 동일하다<br>

re: <%=request.getParameter("id") == "q" %><br>
el: ${param.id } el에서는 null값을 ""으로 인식한다
</body>
</html>