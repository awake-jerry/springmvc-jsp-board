package com.jerry.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jerry.board.vo.BoardVO;

@Repository
public class BoardDAO {

	@Autowired
	BoardMapper boardMapper;
	
	public List<BoardVO> selectAll() {
		System.out.println("BoardDAO.selectAll");
		return boardMapper.selectAll();
	}

	public BoardVO select(BoardVO boardVO) {
		return boardMapper.selectOne(boardVO);
	}

	public void insert(BoardVO boardVO) {
		boardMapper.insertOne(boardVO);
	}

	public void update(BoardVO boardVO) {
		boardMapper.updateOne(boardVO);
	}

	public void updateCount(BoardVO boardVO) {
		boardMapper.updateViewcnt(boardVO);
	}

	public void delete(BoardVO boardVO) {
		boardMapper.deleteOne(boardVO);
	}

}
