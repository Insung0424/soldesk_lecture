<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
public class Human{
	String name;
	String gender;
	String[] color;
	String col="";
	Human(String name,String gender,String[] color){
		this.name=name;
		this.gender=gender;
		this.color=color;
	}
	public String getColor(){
		for(int i=0;i<color.length;i++){
			switch(color[i]){
			case "yellow":
				col+=color[i];
				col+=" ";
				break;
			case "green":
				col+=color[i];
				col+=" ";
				break;
			case "blue":
				col+=color[i];
				col+=" ";
				break;
			}
		}
		return col;
	}
	public String toString(){
		return name+" "+gender+" "+getColor();
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
<% 
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
String gender = request.getParameter("gender");
String color[] = request.getParameterValues("color");
Human h = new Human(name,gender,color);
%>
<%= h.toString() %>
</body>
</html>