package com.jerry.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jerry.board.service.BoardService;
import com.jerry.board.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	ModelAndView mav;
		
	@RequestMapping("/list")
	public String list(Model model) {
		List<BoardVO> list = null;
		if(boardService != null) {
			list = boardService.selectList();			
		} else {
			System.out.println("boardService is Null");
		}
		model.addAttribute("list",list);
		return "list";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView view(@RequestParam  BoardVO board) {
		BoardVO bindData = boardService.selectOne(board);
		mav.addObject("board", bindData);
		mav.setViewName("view");
		
		return mav;
		
	}
	
	@RequestMapping("/write")
	public String write() {
		return "write";
	}
	
	@RequestMapping(value = "/writeOk", method = RequestMethod.POST)
	public String writeOk(BoardVO board) {
		
		boardService.insertOne(board);
		return "redirect:/board/list";
	}
	
}
