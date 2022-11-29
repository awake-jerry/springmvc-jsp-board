package com.jerry.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jerry.board.vo.BoardVO;

@Repository("boardDao")
public class BoardDAOJDBC implements BoardDAO {

	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> selectAll() {
		return boardMapper.selectAll();
	}

	@Override
	public BoardVO select(BoardVO boardVO) {
		return boardMapper.selectOne(boardVO);
	}

	@Override
	public void insert(BoardVO boardVO) {
		boardMapper.insertOne(boardVO);
	}

	@Override
	public void update(BoardVO boardVO) {
		boardMapper.updateOne(boardVO);
	}

	@Override
	public void updateCount(BoardVO boardVO) {
		boardMapper.updateViewcnt(boardVO);
	}

	@Override
	public void delete(BoardVO boardVO) {
		boardMapper.deleteOne(boardVO);
	}

}
