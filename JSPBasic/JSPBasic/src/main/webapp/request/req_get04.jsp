<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //a태그로 넘어오는 값 출력
    String name1 = request.getParameter("name");
    String age1 = request.getParameter("age");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get2번예시</title>
</head>
<body>
	<%=name1 %>	
	<%=age1 %>
</body>
</html>