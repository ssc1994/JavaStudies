<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h2>formatNumber, formatDate, parseDate, parseNumber</h2>
	
	<!-- 
	format = 형식변환 (모양을 변경하는것)
	parse = 형변환 (데이터 타입을 변경하는것)
	 -->
	
	<h2>formatDate => 날짜를 날짜의 형태로 바꿈</h2>
	<c:set var="day" value="<%=new Date() %>"/>	
	<!-- "Fri Dec 02 16:27:18 KST 2022" -->
	<fmt:formatDate var="r_day" value="${day}" pattern="yyyy년MM월dd일 hh:mm:ss"/>
	${r_day }<br>
	<!-- "2022년12월02일 04:30:04" -->
	<fmt:formatDate var="r_day2" value="${day}" pattern="yy-MM-dd"/>
	${r_day2 }<br>
	<!-- "22-12-02" -->
	<hr/>
	
	
	<h2>parseDate =>  문자를 날짜의 형태로 변경</h2>
	<fmt:parseDate var="r_day3" value="2022-12-02" pattern="yyyy-MM-dd"/>
	${r_day3 }
	<!--출력값 : Fri Dec 02 00:00:00 KST 2022 -->
	<fmt:parseDate var="r_day4" value="2022-12-02 23:45:12" pattern="yyyy-MM-dd HH:mm:ss"/>
	${r_day4 }
	<!--출력값 : Fri Dec 02 23:45:12 KST 2022 -->
	<hr/>

	<h3>formatNumber => 숫자를 숫자의 형식으로 변경</h3>
	<fmt:formatNumber var="r_num" value="2000" pattern="0,000.000"/>
	${r_num }<br>
	<!--출력값 : 2,000.000  -->
	
	<h3>parseNumber => 문자를 숫자의 형태로 변경</h3>
	
	<fmt:parseNumber var="r_num2" value="1,000원" pattern="0,000원"/>
	${r_num2 }
	<!--출력값 : 1000  -->
	<hr/>
	<h3>실습</h3>
	<h2>아래값들을 2020년 05월 03일 형식으로 변경해서 출력</h2>
	
	<c:set var="TIME_A" value="2020-05-03"/>
	<c:set var="TIME_B" value="<%=new Date() %>"/>
	
	<fmt:parseDate var="TIME_A1" value="${TIME_A }" pattern="yyyy-MM-dd"/>
	<fmt:formatDate var="TIME_A2" value="${TIME_A1 }" pattern="yyyy년 MM월 dd일"/>
	${TIME_A2 }
	<BR>
	<fmt:formatDate var="TIME_B1" value="${TIME_B }" pattern="yyyy년 MM월 dd일"/>
	${TIME_B1 }
	
</body>
</html>