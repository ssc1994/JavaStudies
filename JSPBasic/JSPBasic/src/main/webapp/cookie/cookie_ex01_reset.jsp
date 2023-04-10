<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	
    //쿠키 삭제  - 쿠키는 삭제가 없어서 동일한 이름의 쿠키의 시간을 0초로 만들어서 삭제함
    
    Cookie idCookie = new Cookie("user_id","kkk123");
    Cookie nameCookie= new Cookie("user_name","홍길동");
    
    idCookie.setMaxAge(0);
    nameCookie.setMaxAge(0);
    response.addCookie(idCookie);
    response.addCookie(nameCookie);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>