package com.jerry.board.service;

import java.util.List;

import com.jerry.board.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> selectList();
	public BoardVO selectOne(int wr_uid);
	public void insertOne(BoardVO boardVO);
	public void updateOne(BoardVO boardVO);
	public int updateViewcnt(BoardVO boardVO);
	public void deleteOne(BoardVO boardVO);

}
