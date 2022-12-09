<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("UTF-8");
    DecimalFormat df = new DecimalFormat("0.00");
    
    int kor = Integer.parseInt(request.getParameter("kor"));
    int eng = Integer.parseInt(request.getParameter("eng"));
    int math = Integer.parseInt(request.getParameter("math"));
   	Double d = ((double)(kor+eng+math)/3);
   	String avg = df.format(d);
   	
   	request.setAttribute("avgl", avg);
    
   	if( d>=60){
    	request.getRequestDispatcher("forward_quiz01_ok.jsp").forward(request, response);
   	}else{
   		request.getRequestDispatcher("forward_quiz01_no.jsp").forward(request, response);
   	}
    
    
    
    
    %>
