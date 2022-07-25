<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>idCheck</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="main.js">
</script>
</head>
<body>
<jsp:useBean id="M" class="DB.MemberMgr"/>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	if(M.checkId(id)){
%>
<p class="p1">해당 ID는 이미 사용 중 입니다</p>
<%
	}else{
%>
<p class="p1">해당 ID는 사용할 수 있습니다</p>
<%
	}
%>
<br>
<button class="idcheck" onclick="win_close()">닫기</button>
</body>
</html>