<%@page import="member.BoardBeanDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DeleteProc</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String pass = request.getParameter("password");
	int num = Integer.parseInt(request.getParameter("num"));

	BoardBeanDAO bdao = new BoardBeanDAO();
	String password = bdao.getPass(num);
			
	if(pass.equals(password)){
		bdao.deleteBoard(num);
		response.sendRedirect("BoardList.jsp");
	}else{
%>
		<script type="text/javascript">
			alert("비밀번호가 틀렸습니다");
			history.go(-1);
		</script>
<%
	}
%>	
</body>
</html>