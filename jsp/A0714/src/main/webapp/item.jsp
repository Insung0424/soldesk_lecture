<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="i" class="Bean.item">
	<jsp:setProperty property="*" name="i"/>
</jsp:useBean>

<%
	try{	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1",
						"JIS",
						"123456");
		String sql="insert into item values(?,?,?)";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,i.getName());
		pstmt.setInt(2, i.getPrice());
		pstmt.setString(3,i.getDes1());
		
		pstmt.executeQuery();
		con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
%>
완료
</body>
</html>