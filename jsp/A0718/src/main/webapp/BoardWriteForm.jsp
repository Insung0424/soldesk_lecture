<%@page import="member.BoardBeanDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardWriteForm</title>
</head>
<body>
<%
p

	request.setCharacterEncoding("utf-8");
%>
	
<jsp:useBean id="n boa" class="w member.BoardBe">
	<jsp:setProperty property="*" name="board"/>
</jsp:useBean>

<%
	BoardBeanDAO bdao = new BoardBeanDAO();
	bdao.insertBoard(board);
	response.sendRedirect("BoardList.jsp");
%>

</body>
</html>