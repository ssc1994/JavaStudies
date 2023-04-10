<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("utf-8"); //한글처리
    
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    
    //age에 따라서 다른결과 페이지로 이동
    int result = Integer.parseInt(age);
    
    if(result >= 20){
    	//강제 페이지 이동(응답)
    	response.sendRedirect("res_ex01_ok.jsp");
    }else{
		response.sendRedirect("res_ex01_no.jsp");    	
    }
    
    
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