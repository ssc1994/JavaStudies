<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //세션이 없다면 리다이렉트
    
    if(session.getAttribute("user_id") == null){
    	response.sendRedirect("session_login.jsp");
    }
    
    
    String id = (String)session.getAttribute("user_id");
    String nick = (String)session.getAttribute("user_nick");
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%=nick %>(<%=id %>)님 환영합니다.
	
	<a href = "session_logout.jsp">session_logout </a>
</body>
</html>