<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp tag</title>
</head>
<body>
	<%
	//자바코드
	int a = 10;
	if(a>=10){
		out.println("10보다큼");		//system을 빼면 화면에서 출력이 가능해짐
	}else{
		out.println("10보다작음");		
	}
	%>
	<hr>
	<%
		for( int i  = 1 ; i<=10 ; i++){
			out.println(i+"<br>"); 		//태그로 인식
		}
	%>
	<hr>
	<%
	int num = 0;
	if(num>=0){
		out.println("<h6>num은 0보다 큽니다</h6>");
	}
	%>
	<hr>
	<%	if(num>=10){	%>
		<h6>num은 10보다 큼</h6>		
	<% }else{	%>
		<h6>num은 10보다 작음</h6>
	<% }	 %>
	<hr>
	<%--1. 구구단 3단 out.println과 , br태그를 사용해서 브라우저 화면에 출력 --%>
	<%
	int x = 3;
	for(int i = 1 ; i<=9 ; i++){
		out.println(x+" x "+i+" = " + x*i +"<br>");
	}
	%>
	<hr>
	<%-- 동일한 name을 가진 체크박스 20개를 브라우저에 생성 --%>
	<% for( int i = 1; i<=20; i++){%>
		<input type="checkbox" name="same">	
	
	<%// 		out.println(i+"번 "); 		%>
	<% if(i%5==0){%>
	<br>
	<%  }} %>
	

</body>
</html>