<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DeleteProc</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="member" class="bean.MemberBean">
	<jsp:setProperty property="*" name="member"/>
</jsp:useBean>
<%
	String id = request.getParameter("id");
	MemberDAO mdao = new MemberDAO();
	String pass = mdao.getPass(id);
	if(member.getPass1().equals(pass)){
		mdao.memberDelete(id);
		response.sendRedirect("MemberArray.jsp");
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