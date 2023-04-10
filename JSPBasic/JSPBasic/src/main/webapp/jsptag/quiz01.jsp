<%@page import="java.util.Random"%>
<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    /* 
    점수를 저장하는 SET을 생성
    1~45까지 로또번호를 생성하고 set에 추가
    중복되지 않은 숫자의 6개의 로또번호를 정장하면 됨
    화면에 출력
    */
   	HashSet<Integer> set =  new HashSet<>();
    Random ran = new Random();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lotto</title>
</head>
<body>
	
	<% for( int i = 1 ; set.size()<6; ++i){  	%>
	<% 		set.add(ran.nextInt(45)+1); 		%>
	<%} 										%>
	
	추첨번호 : <%=set %><br>

</body>
</html>