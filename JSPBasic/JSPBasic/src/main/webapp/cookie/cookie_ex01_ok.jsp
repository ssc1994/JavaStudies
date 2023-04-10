<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //쿠키 확인하기
    //브라우저에 쿠키는 request 객체에 자동으로 넘어와서 저장됨 (만료되기전까지 어디서든 사용가능)
    
    Cookie[] cookies = request.getCookies();
	
    //쿠키가 없다면 null이기 때문에 에러발생
    if(cookies != null){
		
    	for(Cookie c:cookies){
    		out.println(c.getName() );
    		out.println(c.getValue() +"<br>");
    	}
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>쿠키 사용하기</h3>
	
	<a href="cookie_ex01_reset.jsp">쿠키 삭제</a>
		
		
</body>
</html>