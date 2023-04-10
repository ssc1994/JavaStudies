<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%  
    	//
    	request.setCharacterEncoding("utf-8");
    
	    String id = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    String idCheck = request.getParameter("idCheck");
	    //로그인 성공이라 가장
	    if(id.equals("aaa123") && pw.equals("1234")){
	    	
	    	//로그인 성공시 id쿠키생성
	    	Cookie idCookie = new Cookie("user_id",id);
	    	idCookie.setMaxAge(1800);
	    	response.addCookie(idCookie);
	    	
	    	//idCheck쿠키
	    	//사용자가 체크박스를 체크했다면 idCheck를 생성 시간은 30초
		    Cookie idCheckCookie = new Cookie("IdCheck",id);
	    	
	    	if(idCheck!=null){
			    idCheckCookie.setMaxAge(999999999);
			    response.addCookie(idCheckCookie);
	    	}else{
	    		idCheckCookie.setMaxAge(0);
		    	response.addCookie(idCheckCookie);
	    	}
	    	
	    	response.sendRedirect("cookie_ex02_welcome.jsp");	//성공 페이지
	    }else{
	    	response.sendRedirect("cookie_ex02.jsp");		//로그인 페이지로 복귀
	    }
	    
	    
    
    %>
    
    