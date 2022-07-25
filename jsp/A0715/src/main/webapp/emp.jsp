<%@page import="bean.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	%>
<jsp:useBean id="emp" class="bean.employee">
	<jsp:setProperty property="*" name="emp"/>
</jsp:useBean>
<%
EmployeeDAO edao = new EmployeeDAO();
edao.addEmp(emp);
%>
<table border="1">
	<tr>
		<td>name</td>
		<td><%=emp.getName() %></td>
	</tr>
	<tr>
		<td>address</td>
		<td><%=emp.getAddress()%></td>
	</tr>
	<tr>
		<td>ssn</td>
		<td><%=emp.getSsn() %></td>
	</tr>
</table>
<button onclick="location.href='employee.jsp'">뒤로가기</button>
</body>
</html>