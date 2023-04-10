<%@page import="com.example.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("utf-8");	//한글처리
    
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    
    
    //데이터베이스로....
    //단순히 값이 적으면 그냥 사용해도 되지만, 값이 많으면 자바빈(객체)을 사용함
    //두가지 방식중 Setter메서드로 하나씩 개별값을 집어넣는 방법
    //User user = new User();
    //user.setId(id);
    //user.setPw(pw);
  	//user.setName(name);
    //user.setEmail(email);
    
    //두가지 방식중 생성자를 만들때 한번에 값을 넣는 방법 
    User user = new User(id,pw,name,email);
    
    //다음페이지에서 사용하고 싶다면 
    request.setAttribute("user", user); 		//3번페이지에서 활용
    
    request.getRequestDispatcher("bean_basic_result.jsp").forward(request, response);
    
    
    
    %>
    
    
    