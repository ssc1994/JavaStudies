<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("이름");
    double height = Double.parseDouble(request.getParameter("키"));
    double weight= Double.parseDouble(request.getParameter("몸무게"));
    
    double bmi =  weight/(height/100 * height/100);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bmi</title>
</head>
<body>
	이름 : <%=name %><br>
	키 : <%=height %><br>
	몸무게 : <%=weight %><br>
	bmi : <%=bmi %><br>
	
	<% if(bmi>=25){ %>
	과체중
	<% }else if(bmi<=18){ %>
	저체중
	<% }else{ %>
	정상
	<% } %>

</body>
</html>