<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String[] inter = request.getParameterValues("inter");
	String[] major = request.getParameterValues("major");
	String area = request.getParameter("area");
	String txt = request.getParameter("textarea");
	
%>

<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
	 아이디 : <%=id %><br>
	 비밀번호 : <%=pw %><br>
	 Inter : <%=Arrays.toString(inter) %><br>
	 전공 : <%=Arrays.toString(major) %><br>
	 지역 : <%=area %><br>
	 textarea : <%=txt %><br>
	 


</body>
</html>