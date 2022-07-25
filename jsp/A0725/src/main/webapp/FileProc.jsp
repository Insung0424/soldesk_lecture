<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileProc</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String f = "";
	String s="/upload";//실제로 만들어질 폴더명/ 
	
	String encType = "utf-8";
	int maxSize = 10*1024*1024;
	
	//파일이 저장될 경로값을 읽어오는 객체
	ServletContext context = getServletContext();
	f = context.getRealPath(s);
	out.print(f);
	out.print("<br>");
	try{
		if(-1 < request.getContentType().indexOf("multipart/form-data")){
			MultipartRequest multi =
					new MultipartRequest(request, f, maxSize, encType, new DefaultFileRenamePolicy());
									//	request, 파일, 최대사이즈, 인코딩, 파일이름중복시 덮어 쓸지
			%><%= multi.getParameter("name") %><%
			out.println(f);		
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>
</body>
</html>