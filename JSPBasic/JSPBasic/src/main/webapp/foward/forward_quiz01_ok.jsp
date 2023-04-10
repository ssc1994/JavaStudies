<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	String name = request.getParameter("name");
    int kor = Integer.parseInt(request.getParameter("kor"));
    int eng = Integer.parseInt(request.getParameter("eng"));
    int math = Integer.parseInt(request.getParameter("math"));
    
    String avg = (String)request.getAttribute("avgl");
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>above</title>
	<style>
	.name{
	
	}
	</style>
	
</head>
<body>
	<h3>foward_quiz01_ok</h3>
<div class="name">
	이름 : <%=name %> <br>
	국어 : <%=kor %> <br>
	영어 : <%=eng %> <br>
	수학 : <%=math %> <br>
	평균 : <%=avg %> <br>
	평균이 <%=avg %>로 60점 이상입니다.
</div>
</body>
</html>