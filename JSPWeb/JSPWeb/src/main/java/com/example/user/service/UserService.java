package com.example.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.user.model.UserVO;

public interface UserService {
	public int join(HttpServletRequest request, HttpServletResponse response); //가입처리

	public UserVO login(HttpServletRequest request, HttpServletResponse response); //로그인

	public UserVO getInfo(HttpServletRequest request, HttpServletResponse response); //정보조회
	
	public int update(HttpServletRequest request, HttpServletResponse response); //정보수정
	
	public int delete(HttpServletRequest request, HttpServletResponse response); //정보수정
	
	
}
