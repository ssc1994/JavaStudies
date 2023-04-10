<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>res_ex02</title>

	<style>
		.container{
			display: flex;					/*  */
			height:100vh;					/*  */
			background-color: lightgrey;	/* 백그라운드 색상 */
			justify-content: center;		/* 중앙에 콘넽츠 위치 */
			align-items: center;			/*  */
		}
		
		#wrap{
			border: 1px solid #777;			/* border두깨 */
			background-color: #ffffff;		/* 백그라운드 색상 */
			padding: 10px;					/* 여백 */
			text-align: center;				/* 글자 정렬 */
			font-size: 15px; 
		}
	
	
	</style>

</head>
<body>

	<!-- 
		태그의 class속성 - 식별할 수 있는(화면에서 중복 ㅇ)
		주로 디자인을 적용하는데 사용
		선택자 class는 .으로 나타내고 id는 #으로 지칭해서 나타냄
		
		태그의 id - 고유하게 식별하는 이름(화면에서 중복이 있으면 x)
	 -->

	<div class="container">
		<form action="res_ex02_result.jsp" method = "post" id="wrap">
			<h3>로그인 연습</h3>
			<input type="text" name="id" placeholder="아이디"><br>
			<input type="password" name="pw" placeholder="비밀번호"><br>
					
			<input type="submit" value="로그인">
		</form>	
	</div>
	


</body>
</html>