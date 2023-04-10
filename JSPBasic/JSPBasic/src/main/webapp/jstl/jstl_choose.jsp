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
	
	<c:choose>
		<c:when test="${param.name eq '홍길동' }">
			<h3>홍길동</h3>		
		</c:when>
		
		<c:when test="${param.name eq '이순신' }">
			<h3>이순신</h3>
		</c:when>
		
		<c:otherwise>
			<h3> 둘다아님</h3>
		</c:otherwise>
	
	</c:choose>
</body>
</html>