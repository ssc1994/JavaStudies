<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String num = request.getParameter("num");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생번호</title>
</head>
<body>
	<%=num %> 번 학생 선택<br>
	
	<a href="req_quiz03.jsp">돌아가기</a>

</body>
</html>