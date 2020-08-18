package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.MovieVO;

@Repository
public class MovieDAOImpl implements MovieDAO {	

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<MovieVO> list() throws Exception {
		return sqlSession.selectList("movieMapper.list");
	}
	
	// 게시글 작성
//	@Override
//	public void insert(BoardVO boardVO) throws Exception {
//		sqlSession.insert("boardMapper.insert", boardVO);
//		
//	}

	
}