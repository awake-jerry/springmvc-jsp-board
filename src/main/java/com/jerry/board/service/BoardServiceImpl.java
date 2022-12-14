package com.jerry.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerry.board.dao.BoardDAO;
import com.jerry.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardVO> selectList() {
		System.out.println("BoardServiceImpl.selectList");
		List<BoardVO> list = boardDao.selectAll();
		return list;
	}

	@Override
	public BoardVO selectOne(int wr_uid) {
		return boardDao.select(wr_uid);
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
	public int updateViewcnt(BoardVO boardVO) {
		return boardDao.updateCount(boardVO);
	}

	@Override
	public void deleteOne(BoardVO boardVO) {
		boardDao.delete(boardVO);
	}
	
}
