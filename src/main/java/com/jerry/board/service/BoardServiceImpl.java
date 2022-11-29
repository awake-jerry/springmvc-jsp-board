package com.jerry.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerry.board.dao.BoardDAO;
import com.jerry.board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO boardDao;
	
	public List<BoardVO> selectList() {
		List<BoardVO> list = boardDao.selectAll();
		return list;
	}

	@Override
	public BoardVO selectOne(BoardVO boardVO) {
		return boardDao.select(boardVO);
	}

	@Override
	public void insertOne(BoardVO boardVO) {
		boardDao.insert(boardVO);
	}

	@Override
	public void updateOne(BoardVO boardVO) {
		boardDao.update(boardVO);
	}

	@Override
	public void updateViewcnt(BoardVO boardVO) {
		boardDao.updateCount(boardVO);
	}

	@Override
	public void deleteOne(BoardVO boardVO) {
		boardDao.delete(boardVO);
	}
	
}
