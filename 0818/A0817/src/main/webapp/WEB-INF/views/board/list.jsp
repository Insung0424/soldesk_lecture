<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">실습환경</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">글목록 
			<button id="btn" type="button">글작성</button>
			</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<table width="100%"
					class="table table-striped table-bordered table-hover"
					id="dataTables-example">
					<thead>
						<tr>
							<th>글번호</th>
							<th>제목</th>
							<th>글쓴이</th>
							<th>작성날짜</th>
							<th>수정날짜</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="i" items="${list }">
							<tr class="odd gradeX">
								<td>${i.bnum }</td>
								<td><a href='/board/get?bnum=${i.bnum }'>${i.title }</a></td>
								<td>${i.writer }</td>
								<td><fmt:formatDate value="${i.redate }"
										pattern="yyyy-MM-dd" /></td>
								<td><fmt:formatDate value="${i.updateDate }"
										pattern="yyyy-MM-dd" /></td>
							</tr>
						</c:forEach>
					</tbody>

				</table>

			</div>
			<div class='pull-right'>
				<ul class="pagination">
					<c:if test="${pdto.prev }">
						<li class="page-item"><a class="page-link" href="/board/list?pNum=${pdto.start-1 }&amount=10">Previous</a></li>
					</c:if>
					<c:forEach var="page" begin="${pdto.start }" end="${pdto.end }">
						<li class="pageInfo_btn">
						<a class="page-link" href="/board/list?pNum=${page }&amount=10">${page }</a></li>
					</c:forEach>
					<c:if test="${pdto.next }">
						<li class="page-item"><a class="page-link" href="/board/list?pNum=${pdto.end+1 }&amount=10">Next</a></li>
					</c:if>
				</ul>
			</div>
		</div>
	</div>
</div>


<div class="modal" tabindex="-1" id="my">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">등록완료</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>글 내용을 등록완료 하였습니다</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">확인</button>
      </div>
    </div>
  </div>
</div>

<script type="text/javascript">
	$("#btn").on("click",function(){
		self.location="/board/submit";
	}); // 버튼을 통한 페이지이동

	$(document).ready(
		function() {
			var r='<c:out value="${result}"/>';
	
		check(r);
		
		function check(r){
			if(r===''){
				return;
			}
			if(parseInt(r) > 0){
				$(".modal-body").html("글"+ parseInt(r)+"번이 등록되었습니다")
			}
			$("#my").modal("show");
		}
	});
</script>

<%@ include file="../includes/footer.jsp"%>
