<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getCookie</title>
</head>
<body>
<%
	Cookie[] c = request.getCookies();
	String id = "";
	String id2 = "";
	if(c!=null){
		for(int i=0;i<c.length;i++){
			if(c[i].getName().equals("id")){
				id = c[i].getValue();
				break;
			}
		}
	}
	for(Cookie coo:c){
		if(coo.getName().equals("id2")){
			id2 = coo.getValue();
			break;
		}
	}
%>
id:<%= id %><br>
id2:<%= id2 %>
</body>
</html>