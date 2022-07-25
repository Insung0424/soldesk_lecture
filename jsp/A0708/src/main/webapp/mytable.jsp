<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		text-align: center;
		width: 500px;
	}
	table td:nth-child(2){
		width:350px;
	}
	td{
		height: 50px;
	}
	.wi{
		width: 98%;
	}
	.nc{
		text-align: left;
	}
</style>
</head>
<body>
<form action=join.jsp method="post">
	<table border="1"> 
		<tr>
			<td>
				아이디
			</td>
			<td>
				<input type="text" placeholder="id 넣어라" name="id" class="wi">
			</td>
		</tr>
		<tr>
			<td>
				패스워드
			</td>
			<td>
				<input type="password" placeholder="pw 넣어라" name="pw1" class="wi">
			</td>
		</tr>
		<tr>
			<td>
				패스워드 확인
			</td>
			<td>
				<input type="password" name="pw2" class="wi">
			</td>
		</tr>
		<tr>
			<td>
				이메일
			</td>
			<td>
				<input type="email" name="em" class="wi">
			</td>
		</tr>
		<tr>
			<td>
				전화번호
			</td>
			<td>
				<input type="tel" name="tel" class="wi">
			</td>
		</tr>
		<tr>
			<td>
				취미
			</td>
			<td>
				<input type="checkbox" name="ho" value="read">독서
				<input type="checkbox" name="ho" value="music">음악
				<input type="checkbox" name="ho" value="camp">캠핑
				<input type="checkbox" name="ho" value="trip">여행
			</td>
		</tr>
		<tr>
			<td>
				좋아하는 영화
			</td>
			<td>
				<select name="mov">
					 <option value="클래식">클래스</option>

				     <option value="배트맨">배트맨</option>
				
				     <option value="앤트맨">앤트맨</option>
				
				     <option value="대부">대부</option>
				</select>

			</td>
		</tr>
		<tr>
			<td>
				연령대
			</td>
			<td>
				<input type="radio" name="age" value="20">20대
				<input type="radio" name="age" value="30">30대
				<input type="radio" name="age" value="40">40대
				<input type="radio" name="age" value="50">50대
			</td>
		</tr>
		<tr>
			<td>
				남기고 싶은말
			</td>
			<td>
				<textarea cols="30" rows="5" name="info"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2" class="nc">
				<input type="submit" value="회원가입">
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>
</body>
</html>