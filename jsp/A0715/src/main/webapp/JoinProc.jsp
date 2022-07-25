<%@page import="bean.MemberDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JoinProc</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8");
String[] hobby = request.getParameterValues("hobby");
String str ="";
for(int i=0;i<hobby.length;i++){
	str += hobby[i]+" "; 
}
%>
<jsp:useBean id="member" class="bean.MemberBean">
	<jsp:setProperty property="*" name="member"/>
</jsp:useBean>
<%
	member.setHobby(str); 

	MemberDAO mdao = new MemberDAO();
	mdao.insertMember(member);
	
	//회원가입이 됬다면 회원정보를 보여주는 페이지로 강제이동
	response.sendRedirect("MemberArray.jsp");
%>



</body>
</html>