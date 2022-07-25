<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberJoinProc</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); 
	String[] hobby = request.getParameterValues("hobby");
	String str = "";
	for(int i=0;i<hobby.length;i++){
		str+=hobby[i]+",";
	}
%>
<jsp:useBean id="member" class="Bean.MemberBean">
	<jsp:setProperty property="*" name="member"/>
</jsp:useBean>
<%member.setHobby(str);
String id = "JIS";
String pw = "123456";
String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
try{	
	//1.해당 데이터 베이스를 사용한다고 선언
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//2.데이터 베이스에 접속
	Connection con=DriverManager.getConnection(url,id,pw);
	String sql="insert into Mem values(?,?,?,?,?,?,?,?)";
	
	//3.접속 후 쿼리를 준비한다.
	PreparedStatement pstmt=con.prepareStatement(sql);
	
	//?에 맞게 데이터를 맵핑
	pstmt.setString(1, member.getId());
	pstmt.setString(2, member.getPass1());
	pstmt.setString(3, member.getEmail());
	pstmt.setString(4, member.getTel());
	pstmt.setString(5, member.getHobby());
	pstmt.setString(6, member.getJob());
	pstmt.setString(7, member.getAge());
	pstmt.setString(8, member.getInfo());
	
	pstmt.executeQuery();
	//insert,update,delete시 사용하는 메소드
	
	con.close();

}catch(Exception e){
	e.printStackTrace();
}
%>
오라클에 완료됨

</body>
</html>