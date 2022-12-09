<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //포워드 이동
    //RequestDispatcher dp =  request.getRequestDispatcher("forward_ex03.jsp");
    //dp.forward(request, response)
    //3번페이지 에서 사용할 필요한 데이터를 담는방법 (request에 값을 저장)
    request.setAttribute("data", "홍길동");		//(키, 값)
    request.getRequestDispatcher("forward_ex03.jsp").forward(request, response);
    %>
    