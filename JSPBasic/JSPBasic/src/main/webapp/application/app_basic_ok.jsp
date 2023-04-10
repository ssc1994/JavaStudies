<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    int total = (int)application.getAttribute("total");
    
    // 삭제는 removeAttribute
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>app_basic_ok.jsp</title>
</head>
<body>
	
	app에 유지되는 total 값<%=total %>
	<a href="app_basic.jsp"> 돌아가기 </a>
	
</body>
</html>