<%@page import="member.BoardBeanDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateProc</title>
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
	String pass = bdao.getPass(board.getNum());
	
	if(pass.equals(board.getPassword())){
		bdao.updateBoard(board);
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