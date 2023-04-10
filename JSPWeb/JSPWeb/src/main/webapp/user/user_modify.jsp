<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<% %>

<section>
	<div align="center">
		<h3>회원정보수정</h3>
		<table>
		<tr><td>
			id:${vo.id }
		</td></tr>
		<tr><td>
			name:${vo.name }
		</td></tr>
		<tr><td>
			email:${vo.email }
		</td></tr>
		<tr><td>
			gender:${vo.gender }
		</td></tr>
		</table>
		<form action="updateForm.user" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" value="${vo.id }" pattern="\w{4,8}" required readonly></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="password" name="pw" value="${vo.pw }" pattern="\w{4,8}" ></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="${vo.name }" pattern="[가-힣]{3,}"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="email" value="${vo.email }" readonly></td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
							<input type="radio" name="gender" value="F" ${vo.gender eq 'F'?'checked':''}>여 
							<input type="radio" name="gender" value="M" ${vo.gender eq 'M'?'checked':''}>남
					</td>
				</tr>
			</table>
			<input type="submit" value="정보수정">
			<input type="button" value="마이페이지" onclick="location.href='user_mypage.user'">
		</form>

	</div>

</section>
<script>
	var msg = '${msg}';
	if(msg!=''){
		alert(msg);
	}

</script>

<%@ include file="../include/footer.jsp"%>
