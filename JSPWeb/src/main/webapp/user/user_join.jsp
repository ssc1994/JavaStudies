<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<section>
	<div align="center">
		<h3>회원가입연습</h3>

		<!--
			 태그에서 제공하는 인풋 유효성 검사 
			pattern ="js정규표현식"
			ex 영어 숫자 4~8자리) pattern="\w{4,8}" 
			required="required"
			-> 공백을 허용하지 않는다
			이메일은 자동으로 이메일 형식 검사가 들어가기 때문에 requred만 신경 쓰면 됨
			
			체크박스나 라디오박스 미리선택
			checked="checkeD"			
			
			설렉트 박스 미리선택
			selected="selected"
			
			인풋태그의 수정불가 (읽기전용)
			readonly="readonly"
			
			인풋태그 사용 안하기
			disabled="disabled"
		-->

		<form action="joinForm.user" method="post">
			<span style="color: red;">${msg }</span>
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" placeholder="4글자 이상 8글자 이하"
						pattern="\w{4,8}" required="required"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pw" pattern="\w{4,8}"
						required="required"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" pattern="[가-힣]{3,}"
						required="required"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<!-- 이메일은 자동으로 검사가 들어가기때문에 requred만 신경 쓰면 됨 -->
					<td><input type="email" name="email" required="required"></td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<!-- 체크박스나 라디오박스는 checked="checked"옵션으로 기본값을 설정 --> 
						<input type="radio" name="gender" value="F" checked="checked">여 
						<input type="radio" name="gender" value="M">남
					</td>
				</tr>
			</table>
			<input type="submit" value="가입">
			<!-- 추후에js로 기능을 붙임 
				onclick="location.href='경로'"
				-->
			<input type="button" value="로그인하기"
				onclick="location.href='user_login.user'">
		</form>
	</div>
</section>

<!-- 화면에서 사용할 JS -->
<script>
	var msg = '${msg}';
	if(msg!=''){
		alert(msg);
	}

</script>


<%@ include file="../include/footer.jsp"%>
