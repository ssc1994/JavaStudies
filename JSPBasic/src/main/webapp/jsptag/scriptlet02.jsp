<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//화면에서 쓸 변수는 상단에 선언
	int a = 3;
	String str = "hello world";
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptlet02</title>
</head>
<body>

	<%-- 
	ctrl + shift + /
	<%
		out.println(a + "<br>");
		out.println(str + "<br>");
	%> --%>
	
	<%=a %><br>
	<%=str %><br>
	
	<h2>구구단 3단을 표현식을 통해서 출력</h2>
	<% for(int i = 1 ; i<=9 ; i++){ %>
		<%=a %> x <%=i %> = <%=i*a %> <br>
	<% } %>
	
	<h2>반복문으로 체크박스에 1~20까지 이름을 붙혀서 가로로 출력</h2>
	
	<% for( int i =1 ; i <=20 ; i++){ %>
			
			<input type="checkbox" name="same"><%=i %>번
		
	<% } %>
	
	<h2>반복문으로 체크박스에 1~20까지 이름을 붙혀서 가로로 출력</h2>
	<table>
		<tr>
		<% for( int i =1 ; i <=20 ; i++){ %>
				<td>
				<input type="checkbox" name="same">
				<%=i %>번
				</td>
			<%if(i%4==0) %></tr><tr>
		<% } %>
	</table>
	

</body>
</html>