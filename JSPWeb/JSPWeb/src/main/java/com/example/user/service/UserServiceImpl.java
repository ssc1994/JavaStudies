package com.example.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.user.model.UserDAO;
import com.example.user.model.UserVO;

public class UserServiceImpl implements UserService{
	//컨트롤러의 역할을 분담
	
	//가입처리
	public int join(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
	
		//아이디나 이메일이 중복이 있는지 검사 --> 없으면 가입
		UserDAO dao = UserDAO.getInstance();
		int result = dao.idCheck(id, email);
		
		if(result>=1) {	//중복이 있다
			return 1;	//중복의 의미반환
			
		}else {		//중복이 없다
			UserVO vo = new UserVO(id, pw, name, email, gender);
			dao.join(vo);
			return 0;	//성공의 의미반환
		}
		
	}

	@Override
	public UserVO login(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		UserDAO dao = UserDAO.getInstance();
		UserVO vo = dao.login(id, pw);
		
		return vo;
	}

	@Override
	public UserVO getInfo(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
		String id =(String) session.getAttribute("user_id");
		
		UserDAO dao = UserDAO.getInstance();
		UserVO vo = dao.getInfo(id);
		
		return vo;
	}

	
	@Override
	public int update(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session=request.getSession();
		
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		
		UserDAO dao = UserDAO.getInstance();
		UserVO vo = new UserVO(id,pw,name,null,gender);
		int result = dao.update(vo);
		
		if(result==1) {
			session=request.getSession();
			session.setAttribute("user_name", name);
		}
				
		
		return result;	//0이면 실패 1이면 성공
	}
	
	
	

	@Override
	public int delete(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("user_id");
		
		UserDAO dao = UserDAO.getInstance();
		int result = dao.delete(id);
		
		if(result == 1) {
			session.invalidate();
		}
		
		

		return result;
	}
	
	
	
	
}
