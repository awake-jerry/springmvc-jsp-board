package com.jerry.board.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jerry.board.service.BoardService;
import com.jerry.board.vo.BoardVO;

@RequestMapping(value="/board")
@Controller
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
	public ModelAndView view(@RequestParam  int wr_uid) {
		mav = new ModelAndView();
		BoardVO resultData = boardService.selectOne(wr_uid);
		mav.addObject("board", resultData);
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
	
//	@ResponseBody
//	@RequestMapping(value = "/viewCount", method = RequestMethod.POST)
//	public String viewCount(@RequestBody String param) throws IOException {
//		Map<String, Object> map = new ObjectMapper().readValue(param, Map.class);
//		System.out.println(map.get("wr_uid"));
//		
//		System.out.println("/board/viewCount");
//        return null;
//        
//	}
	
	@RequestMapping(value = "/viewCount", method = RequestMethod.POST )
	public @ResponseBody String viewCount(@RequestBody BoardVO board) {
		System.out.println("/board/viewCount");
		int i = boardService.updateViewcnt(board);
		return Integer.toString(i);
		
	}
	
}
