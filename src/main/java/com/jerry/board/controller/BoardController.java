package com.jerry.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jerry.board.service.BoardService;
import com.jerry.board.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		List<BoardVO> list = boardService.selectList();
		model.addAttribute("list",list);
		return "board/list";
	}
}
