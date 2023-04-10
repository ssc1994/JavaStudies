<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>

<section>
	<div align="center">
		<form action="loginForm.user" method="post">
			<span style="color: red;">${msg }</span>
			<h3>로그인 연습</h3>
				아이디
				<input type="text" name="id" placeholder="아이디" pattern="\w{4,8}" required="required">
				<br>
				<br>
				비밀번호
				<input type="password" name="pw" pattern="\w{4,8}" placeholder="비밀번호" required="required">
				<br>
			<input type="submit" value="로그인" class="btn btn-default">
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