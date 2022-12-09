<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생번호</title>
</head>
<body>
<h3>다음을 구현하고 a태그 글릭시 req_quiz03_ok에 학생번호를 출력하세요</h3>
<br>
	<% for( int i = 1 ; i<=30 ; i++){ %>
		<a href="req_quiz03_ok.jsp?num=<%=i %>" > <%=i %>번 학생</a><br>
	<% } %> 
	
	
</body>
</html>