package com.example.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.board.model.BoardVO;

public interface BoardService {
	
	//등록
	void regist(HttpServletRequest request, HttpServletResponse response);
	
	//리스트조회
	ArrayList<BoardVO> getList(HttpServletRequest request, HttpServletResponse response);	
	
	//상세페이지
	BoardVO getContent(HttpServletRequest request, HttpServletResponse response);	
	
	// 수정
	void update(HttpServletRequest request, HttpServletResponse response);
	
	//삭제
	int delete(HttpServletRequest request, HttpServletResponse response);
	
	
	
}
