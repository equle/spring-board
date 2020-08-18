package kr.co.service;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.dao.BoardDAO;
import kr.co.dao.MovieDAO;
import kr.co.vo.BoardVO;
import kr.co.vo.Criteria;
import kr.co.vo.MovieVO;
import kr.co.vo.SearchCriteria;

@Service
public class MovieServiceImpl implements MovieService {

	@Inject
	private MovieDAO dao;

	@Override
	public List<MovieVO> list() throws Exception {
		// TODO Auto-generated method stub
		return dao.list();
	}
	
}