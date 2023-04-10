package com.example.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.board.model.BoardDAO;
import com.example.board.model.BoardVO;

public class BoardServiceImpl implements BoardService {

	@Override
	public void regist(HttpServletRequest request, HttpServletResponse response) {
		//board_write에서 parameter받음
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.regist(writer, title, content);
	}

	
	
	@Override
	public ArrayList<BoardVO> getList(HttpServletRequest request, HttpServletResponse response) {

		//DAO반환
		BoardDAO dao = BoardDAO.getInstance();
		ArrayList<BoardVO> list = dao.getList();
		
		return list;
	}
	


	@Override
	public BoardVO getContent(HttpServletRequest request, HttpServletResponse response) {
		//a태그로 넘어오는 Parameter는 String으로 나온다
		String bno = request.getParameter("bno");
		
		//DAO생성 및 DAO의 getContent메서드 호출
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO vo = dao.getContent(bno);
		
		return vo;
	}


	@Override
	public void update(HttpServletRequest request, HttpServletResponse response) {
		//화면에서 넘어오는 값
		String bno = request.getParameter("bno");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.update(bno, title, content);
		
	}



	@Override
	public int delete(HttpServletRequest request, HttpServletResponse response) {
		//bno받아오기
		String bno = request.getParameter("bno");
		//DAO
		BoardDAO dao = BoardDAO.getInstance();
		int result = dao.delete(bno);
		//결과값 리턴
		return result;
	}
	
	
	
	

}
