<%@page import="com.example.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	User vo = new User();
    vo.setId("hhh123");    
    vo.setName("홍길숙");
    vo.setEmail("hhh@naver.com");
    request.setAttribute("voo", vo);		//리퀘스트에 강제 저장
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : ${ requestScope.voo.id }<br>
	이름 : ${ requestScope.voo.name }<br>
	이메일 : ${ requestScope.voo.email }<br>
	<hr/>
	<!-- requestScope.은 생략을 하고 많이 사용함 
		 사용되는 순서 = request -> session -> application	-->
	아이디	: ${ voo.id }<br>
	이름 	: ${ voo.name }<br>
	이메일 	: ${ voo.email }<br>
</body>
</html>