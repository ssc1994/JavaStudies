<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>path_ex03</title>
</head>
<body>
	<h2>path_ex03</h2>
	<a href="../path_ex01.jsp">ex01(상대)</a><br>
	<a href="/JSPBasic/path/path_ex01.jsp">ex01(절대)</a>
	
	<hr/>
	
	<!-- a태그를 이용해서 session_login페이지로 상대경로, 절대 경로로 이동 -->
	<a href="../../session/session_login.jsp">session_login (상대) </a><br>
	<a href="/JSPBasic/session/session_login.jsp">session_login (절대) </a><br>
	<hr/>
	<!-- a태그를 이용해서 TestServlet으로 상대경로, 절대 경로로 이동 -->
	<a href="../../banana">TestServlet(상대)</a><br>
	<a href="/JSPBasic/banana">TestServlet(절대)</a>
	
	<hr/>
	<!-- img태그를 이용해서 html폴더안에 1.jpg참조 -->
	
	<img alt="상대경로" src="../../html/1.jpg">상대 (../../html/1.jpg)
	<img alt="절대경로" src="/JSPBasic/html/1.jpg"> 절대(/JSPBasic/html/1.jpg)<br>
	
	
</body>
</html>