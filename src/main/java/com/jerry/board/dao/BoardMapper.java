package com.jerry.board.dao;

import java.util.List;

import com.jerry.board.vo.BoardVO;

public interface BoardMapper {
	
	List<BoardVO> selectAll();
	
	BoardVO selectOne(BoardVO boardVO);
	
	void insertOne(BoardVO boardVO);
	
	void updateOne(BoardVO boardVO);
	
	void deleteOne(BoardVO boardVO);
	
	void updateViewcnt(BoardVO boardVO);
}
