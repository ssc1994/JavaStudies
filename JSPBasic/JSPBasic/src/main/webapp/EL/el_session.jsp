<%@page import="com.example.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	User vo = new User();
    	vo.setId("aaa123");
    	//세션저장
    	//1
    	session.setAttribute("vo", vo);
    	session.setAttribute("auth", "y");
    	//어플리케이션 저장
    	application.setAttribute("menu", "햄버거");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${ sessionScope.vo.id }<br>
	${ sessionScope.auth }<br>
	${ applicationScope.menu }<br>

</body>
</html>