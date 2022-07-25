<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="FileProc.jsp" method="post" enctype="multipart/form-data">
이름 : <input type="text" name="name"><br>
파일 선택 : <input type="file" name="fi"><br>
<input type="submit" value="파일 업로드">
</form>
</body>
</html>