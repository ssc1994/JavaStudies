<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bmi</title>
</head>
<body>

	<!-- 
	1. form태그를 이용해서 post형식으로 이름, 키와 몸무게를 입력받음
	2. req_quiz02.ok.jsp로 전송
	3. 해당 페이지에서는 넘어간 값을 bmi지수를 처리
	4. BMI공식 = kg/(cm/100 * cm/100) -> 문자열이기 때문에 형변환 진행
	화면에 이름 키 몸무게 bmi지수 출력
	if bmi지수가 25이상 과체중 18 이하 저체중 나머지 정상
	 -->
	 
	 <form action="req_quiz02_ok.jsp" method="post">
	 	이름 : <input type="text" name="이름"><br>
	 	키 : <input type="text" name="키"><br>
	 	몸무게 : <input type="text" name="몸무게"><br>
	 	<input type="submit" value="확인">
	 
	 </form>
	 
	 

</body>
</html>