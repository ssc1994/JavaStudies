<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

<div align="center" class="div_center">
	<h3>게시판 글 수정 페이지</h3>
	<hr>
	
	<form action="updateForm.board" method="post">
		
		<table border="1" width="500">
			
			<tr>
			<!-- 화면에 보일 필요는 없는데, 데이터를 보내야하는 경우 hidden태그를 사용함 -->
				<td>글 번호</td>
				<td>${vo.bno }	
					<input type="hidden" name="bno" value="${vo.bno }">
				</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer" value="${vo.writer }" readonly></td>
			</tr>
			<tr>
				<td>글 제목</td>
				<td>
					<input type="text" name="title" value="${vo.title }">
				</td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td>
					<textarea rows="10" style="width: 95%;" name="content"> ${vo.content }
					</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정 하기" onclick="location.href">&nbsp;&nbsp;
					<input type="button" value="목록" onclick="location.href='board_list.board'">        
				</td>
			</tr>
			
		</table>
	</form>
	
</div>

<%@ include file="../include/footer.jsp" %>