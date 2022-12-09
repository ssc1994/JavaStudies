package com.example.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.test")
//1. url주소를 확장자 패턴으로 변경
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	//2. get요청과 post요청을 하나로 모음
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. 한글처리
		request.setCharacterEncoding("utf-8");
		
		//4. 요청분기
//		System.out.println(request.getRequestURI());
		
		String path = request.getContextPath();
		//문자열자르기 ->contextpath 이후 문자만 출력
		String command = request.getRequestURI().substring( path.length() );
		System.out.println(command);
		
		switch (command) {
		case "/controller/join.test":
				System.out.println("가입처리");
			break;
		case "/controller/login.test":
			System.out.println("로그인");
			break;
		case "/controller/logout.test":
			System.out.println("로그아웃");
			break;
		case "/controller/delete.test":
			System.out.println("탈퇴");
			break;
		case "/controller/update.test":
			System.out.println("수정");
			break;

		default:
			break;
		}
		
	}

	
	
	
}