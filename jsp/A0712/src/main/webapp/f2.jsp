<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>f2</title>
</head>
<body>
<%
	int java =Integer.parseInt(request.getParameter("java"));
	int jsp =Integer.parseInt(request.getParameter("jsp"));
	int jquery =Integer.parseInt(request.getParameter("jquery"));
	int spring =Integer.parseInt(request.getParameter("spring"));
%>
<%!
	double avg(int a, int b, int c, int d) {
		return (a+b+c+d)/4.0;
	}
	String pass(double a){
		String b;
		if(a >= 60){
			b = "프로젝트 투입";
		}
		else{
			b = "재교육실시";
		}
		return b;
	}
%>
	평균 :<%=avg(java,jsp,jquery,spring)%>
	<br>
	합격여부 :<%=pass(avg(java,jsp,jquery,spring))%>
</body>
</html>