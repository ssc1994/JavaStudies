<%@page import="com.example.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //user안에 있는 원자값들을 출력
    User user = (User)request.getAttribute("user");
    
    String id = user.getId();
    String pw = user.getPw();
    String name = user.getName();
    String email =  user.getEmail();
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>bean_basic_result</h3>

	id : <%=id %><br>
	pw : <%=pw %><br>
	name : <%=name %><br>
	email : <%=email %><br>

</body>
</html>