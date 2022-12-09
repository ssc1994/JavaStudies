package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.example.user.model.UserVO;
import com.example.user.service.UserService;
import com.example.user.service.UserServiceImpl;

@WebServlet("*.user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글처리
		request.setCharacterEncoding("utf-8");
		
		//요청분기
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		
		//uri에서 path의 랭스만큼 앞부분을 제거
		String command =uri.substring(path.length());
		System.out.println("요청경로 : " + command);
		
		//
		
		UserServiceImpl service =new UserServiceImpl();
		HttpSession session;
		UserVO vo ;
		int result;
		switch (command) {
		case "/user/user_join.user":
			request.getRequestDispatcher("user_join.jsp").forward(request, response);
			
			break;
			
			
			
		case "/user/joinForm.user":	// 회원가입기능	
				result = service.join(request, response);
				
				if(result>=1) {	// 아이디 중복
					 //메시지
					request.setAttribute("msg", "중복된 아이디  or email입니다");
					request.getRequestDispatcher("user_join.jsp").forward(request, response);
					
				}else {			// 가입 성공
					//MVC2에서 리다이렉트는 다시 컨트롤러를 태우는 요청이다
					response.sendRedirect("user_login.user");
				}
			break;
			
			
			
		case "/user/user_login.user" : // 로그인페이지
			request.getRequestDispatcher("user_login.jsp").forward(request, response);
			
			break;
			
			

		case "/user/loginForm.user":	//로그인 요청
			vo = service.login(request, response);
			
			if(vo==null) {	//로그인 실패
				request.setAttribute("msg", "아이디 혹은 비밀번호가 틀렸습니다");
				request.getRequestDispatcher("user_login.jsp").forward(request, response);
			}else {			//로그인 성공
				//세션에 아이디, 이름을 저장
				session = request.getSession();	//자바에서 현재 세션 얻는 방법
				session.setAttribute("user_id", vo.getId());
				session.setAttribute("user_name", vo.getName());
				
				//마이페이지로 이동
				response.sendRedirect("user_mypage.user");
			}
			break;
		
			
		case "/user/user_mypage.user":	//마이페이지
			
			request.getRequestDispatcher("user_mypage.jsp").forward(request, response);
			
			break;
			
			
			
		case "/user/user_logout.user":	//로그아웃
			
			session = request.getSession();
			session.invalidate();								//세션 무효화
			
			response.sendRedirect(path + "/index.main");		//메인으로 이동
			break;
			
			
			
		case "/user/user_modify.user":	//정보수정화면 진입
			/*
			 * 회원데이터를 가지고 나오는 작업
			 * service와 dao에 getInfo() 메서드를 선언
			 * service에서는 세션에서 아이디를 얻는다
			 * dao에서는 id를 전달받아 회원데이터를 조회하여 vo에서 저장
			 * controller에서는 조회한 vo를 저장하고 화면으로 가져나감
			 * 화면에서는input태그에 값을 출력한다
			 */
			vo = service.getInfo(request, response);
			
			
			//vo를 통째로 보내도 forward를 사용하기 때문에 다음페이지에서 받을수 있다
//			request.setAttribute("id", vo.getId());
//			request.setAttribute("pw", vo.getPw());
//			request.setAttribute("name", vo.getName());
//			request.setAttribute("email", vo.getEmail());
//			request.setAttribute("gender", vo.getGender());
			//회원데이터를 가지고 나오는 작업
			
			request.setAttribute("vo", vo);
			request.getRequestDispatcher("user_modify.jsp").forward(request, response);
			
			
			break;
			
		case "/user/updateForm.user":	//정보 수정
			/*
			 * 회원정보를 업데이트하는 작업
			 * service 와 dao에 update()메서드 생성
			 * service의 필요한 파라미터 값을 받음(pw name gender) 조건절 id
			 * dao에서는 데이터를 전달받아 update를 실행
			 * 업데이트 이후에는 컨트롤러를 통해 mypage로 리다이렉트
			 */
			
			result=service.update(request, response);

			if(result==0) {		//실패
//				response.sendRedirect("user_modify.user");
				request.setAttribute("msg", "양식에 맞춰 작성해주세요");
				request.getRequestDispatcher("user_modify.user").forward(request, response);
				
			}else {
				
//				response.sendRedirect("user_mypage.user");
				
				//out 객체를 이용해서 화면에 스크립트를 작성해서 보냄
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('정보가 수정되었습니다');");
				out.println("location.href='user_mypage.user'");
				out.println("</script>");
			}
		
			break;
			
		case "/user/user_delete.user":		//삭제
			result = service.delete(request, response);
			
			if(result == 1) {
				response.sendRedirect(path + "/index.main");
			}else {
				response.sendRedirect("user_mypage.user");
			}
			
			break;
			
			
			
		default:
			break;
		}
		
	}

}
