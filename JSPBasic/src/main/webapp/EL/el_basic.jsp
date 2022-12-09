<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>EL태그는 표현식을 대체합니다</h2>
	
	${1 + 2}<br>
	${1 > 2}<br>
	${1 == 2}<br>
	${1 == 2 ? '같음' : '다름'}<br>
	
	${1 < 2 || 1 > 2 }<br>	<!-- java에서쓰는 || 연산자도 사용가능 -->
	${1 < 2 or 1 > 2 }<br>	<!-- 하지만 el에서만 사용할 수 있는 or을 쓰는게 더 직관적임 -->

	${1 < 2 && 1 > 2 }<br>	<!-- java에서쓰는 && 연산자도 사용가능 -->
	${1 < 2 and 1 > 2 }<br>	<!-- 하지만 el에서만 사용할 수 있는 or을 쓰는게 더 직관적임 -->
	
	${ '홍길동' == '홍길동' }<br>
	${ '홍길동' eq '홍길동' }<br>
	
	${ ! false }<br>
	${ not false }<br>
	
	<!-- 
	대소비교를 할때 EL 태그로 나타낸다면 
		<  , lt 로 바꿀 수 있음 (little than)
		<= , le 로 바꿀 수 있음 (little or equals)
		>  , gt 로 바꿀 수 있음 (greater than)
		>= , ge 로 바꿀 수 있음 (greater than)
	 -->
	
	
	
</body>
</html>