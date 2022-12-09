<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<!-- core 라이브러리를 c라는 태그로 줄여서 사용 한다 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 출력문 -->
	<c:out value="${param.name }"/> <br>
	
	<!-- 변수로 선언 -->
	<c:set var="num" value="${param.age }"/>
	<c:out value="${num }"/><br>
	
	<hr/>
	<!-- if문(JAVA식) -->
	<%
	if(request.getParameter("name").equals("홍")){
		out.println("홍 입니다");
	}
	%>
	<!-- if문(EL식) -->
	<c:if test="${param.name eq '홍' }">
		<h3>홍 입니다</h3>
	</c:if>

	<c:if test="${param.age >= 20 }">
		<h3>성인 입니다</h3>
	</c:if>

	<c:if test="${param.age < 20 }">
		<h3>미성년자 입니다</h3>
	</c:if>
	
	<c:choose>
		<c:when test="${param.age >= 20 }">
			<h3>성인 입니다</h3>
		</c:when>
		<c:otherwise> 
			<h3>미성년자입니다</h3>
		</c:otherwise>
	</c:choose>
	
	
	
	
	
	
	
</body>
</html>