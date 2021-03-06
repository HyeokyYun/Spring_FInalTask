package com.freehoon.web.board.dao;

import java.util.List;

import com.freehoon.common.Pagination;
import com.freehoon.web.board.model.BoardVO;



public interface BoardDAO {



	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;

	

	public BoardVO getBoardContent(int bid) throws Exception;

	

	public int insertBoard(BoardVO boardVO) throws Exception;

	

	public int updateBoard(BoardVO boardVO) throws Exception;

	

	public int deleteBoard(int bid) throws Exception;

	

	public int updateViewCnt(int bid) throws Exception;
	
	//총 게시글 개수 확인
	public int getBoardListCnt() throws Exception;


}

