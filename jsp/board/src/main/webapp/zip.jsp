<%@page import="javax.swing.text.Document"%>
<%@page import="member.ZipBean"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<jsp:useBean id="mMgr" class="DB.MemberMgr"/>
<%
	request.setCharacterEncoding("UTF-8");
	String check = request.getParameter("search");	//검색결과 유무 체크
	
	//우편번호(도로명) 검색 결과저장
	Vector<ZipBean> zlist = null;
	String area3 = null;
	
	//도로명 검색 결과가 있으면 
	//MemberMgr(DAO)의 ZipCodeSearch 매서드를 호출한다 
	if (check.equals("y")){
	    area3 = request.getParameter("area3");
	    zlist = mMgr.ZipCodeSearch(area3);
	}

%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>zip</title>
	<link href="style.css" rel="stylesheet" type="text/css">
	<script type="text/javascript">
		function zipSearch() {
			frm = document.zipFrm;
			if(frm.area3.value == ""){	//도로명 검색어가 없으면
				alert("도로명을 입력하세요.");
				return;				
			}
			//도로명 검색어가 있으면
			frm.action="zip.jsp";
			frm.submit();
		}
		
		function sendAdd(zipcode,adds){
			//검색결과 중 주소 선택 시 부모창(opener)에 검색어를 입력하고, 창을 닫는다
			opener.document.zipFrm.zipcode.value = zipcode;
			opener.document.zipFrm.address.value = adds;
			self.close();
		}
		
	</script>
</head>
<body bgcolor="aliceblue">

<h3>우편번호 검색 페이지</h3>
<form name="zipFrm" method="post" >
<table>
	<tr>
		<td>도로명 입력 : 
			<input name="area3">
			<input type="button" value="검색" onclick="zipSearch()">
		</td>
	</tr>

                <!-- 검색결과 시작 -->
                <%
                    if (check.equals("y")) {
                        if (zlist.isEmpty()) {	//검색을 했는데 결과가 없을때
                %>
                <tr>
                    <td align="center"><br />검색된 결과가 없습니다.</td>
                </tr>
 
                <%
                    } else {	//검색을 했고 결과가 있을때
                %>
                <tr>
                    <td><br />⨳ 주소를 클릭하면 자동으로 입력됩니다.</td>
 
                </tr>
                <%
                    for (int i = 0; i < zlist.size(); i++) 
                    	{
                   			ZipBean bean = zlist.get(i);
                   			
                            String rZipcode = bean.getZipcode();
                            String rArea1 = bean.getArea1();
                            String rArea2 = bean.getArea2();
                            String rArea3 = bean.getArea3();
                            
                            String adds = rArea1 + " " + rArea2 + " " + rArea3 + " ";
                %>
                <tr>
                    <td><a href='#' onclick="javascript:sendAdd('<%=rZipcode%>', '<%=adds%>')">
                        <%=rZipcode+""+adds %></a></td>
                </tr>
                <%
                    	} //for
					} //else
                    } //if
                %>
                <!-- 검색결과 끝 -->
	
	<tr>
		<td> <a href="#" onclick="self.close()">닫기</a></td>
	</tr>
</table>
<input type="hidden" name="search" value="y">
</form>

</body>
</html>