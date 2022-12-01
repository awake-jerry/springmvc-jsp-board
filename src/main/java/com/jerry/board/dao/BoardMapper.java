package com.jerry.board.dao;

import java.util.List;

import com.jerry.board.vo.BoardVO;

public interface BoardMapper {
	
	List<BoardVO> selectAll();
	
	BoardVO selectOne(int wr_uid);
	
	void insertOne(BoardVO boardVO);
	
	void updateOne(BoardVO boardVO);
	
	void deleteOne(BoardVO boardVO);
	
	int updateViewcnt(BoardVO boardVO);
}
