<%@page import="java.util.Iterator"%>
<%@page import="bean.MemberBean"%>
<%@page import="java.util.Vector"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLEncoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberArray</title>
</head>
<body>
<%
//모든 회원 정보를 가져오는 jsp
MemberDAO mdao = new MemberDAO();
//가변길이 vector를 이용하여 데이터를 저장후 
Vector<MemberBean> vec = mdao.allSelectMember();

%>
<center>
<table width="800" border="1">
<tr hieght="50">
<td width="150" align="center">아이디</td>
<td width="250" align="center">이메일</td>
<td width="200" align="center">전화번호</td>
<td width="200" align="center">취미</td>
</tr>

<% 
for(int i=0;i<vec.size();i++){
	MemberBean m = vec.get(i);
%>
<tr hieght="50">
<td width="150" align="center">
<a href="MemberIn.jsp?id=<%=m.getId()%>">
<%=m.getId()%></a></td>
<td width="250" align="center"><%=m.getEmail()  %></td>
<td width="200" align="center"><%=m.getTel()  %></td>
<td width="200" align="center"><%=m.getHobby()  %></td>
</tr>
<% 
}
%>
</table>
</center>

</body>
</html>