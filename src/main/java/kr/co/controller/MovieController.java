package kr.co.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.service.MovieService;
import kr.co.vo.SearchCriteria;

@Controller
@RequestMapping("/movie/*")
public class MovieController {

	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	@Inject
	MovieService service;
	
	
	// 게시판 목록 조회
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() throws Exception{
		logger.info("list");

		return "movie/list";
		
	}
	// 게시판 목록 조회
	@RequestMapping(value = "/getmv", method = RequestMethod.GET)
	public @ResponseBody String list(Model model, @ModelAttribute("scri") SearchCriteria scri) throws Exception{
		logger.info("getmv");
		
//		model.addAttribute("list", service.list());
		
		return "service.list()";
		
	}
	
	
}