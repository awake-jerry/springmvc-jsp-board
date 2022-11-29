package com.jerry.board.service;

import java.util.List;

import com.jerry.board.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> selectList();
	public BoardVO selectOne(BoardVO boardVO);
	public void insertOne(BoardVO boardVO);
	public void updateOne(BoardVO boardVO);
	public void updateViewcnt(BoardVO boardVO);
	public void deleteOne(BoardVO boardVO);

}
