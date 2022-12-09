<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  인코딩을 request.setCharacterEncoding("UTF-8"); 사용해서함 -->
   	<%
   	request.setCharacterEncoding("UTF-8");		//한글을 utf-8로 인코딩 처리
   	String id = request.getParameter("id");
   	String email = request.getParameter("email");
   	
   	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>post1번예시</title>
</head>
<body>
	
	<%=id %><br>
	<%=email %>

</body>
</html>