package com.jerry.board.dao;

import java.util.List;

import com.jerry.board.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> selectAll();
	public BoardVO select(BoardVO boardVO);
	public void insert(BoardVO boardVO);
	public void update(BoardVO boardVO);
	public void updateCount(BoardVO boardVO);
	public void delete(BoardVO boardVO);
}
