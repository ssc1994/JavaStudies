<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get1번예시</title>
</head>
<body>

	<!-- action에는 지정된 페이지의 경로가 들어감 -->
	<!-- post방식은 form태그가 필요하고 method="post"를 추가함 -->
	<form action="req_get02.jsp" >
		아이디 : <input type="text"name="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		 
		동의 항목
		<input type="checkbox" name="agree" value="1">동의1
		<input type="checkbox" name="agree" value="2">동의2
		<input type="checkbox" name="agree" value="3">동의3
	
		<input type="submit" value = "확인">
		
	</form>

</body>
</html>