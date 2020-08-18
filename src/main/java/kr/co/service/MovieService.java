package kr.co.service;

import java.util.List;

import kr.co.vo.MovieVO;

public interface MovieService {

	// 게시글 작성
//	public void insert(BoardVO boardVO) throws Exception;
	
	//게시물 목록
	public List<MovieVO> list() throws Exception;
}