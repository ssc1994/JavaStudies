<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    /* 
    세션은 서버와 정보를 유지하기 위해 사용하는 내장객체입니다
    setAttribute("이름", 값)으로 저장함
    */
    session.setAttribute("user_id", "ccc123");
    session.setAttribute("user_name", "이순신");
    
    session.setMaxInactiveInterval(3600); 		//1시간 //기본값은 30분
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="session_ex01_ok.jsp"> 세션확인하기</a>

</body>
</html>