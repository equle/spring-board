package kr.co.service;

import kr.co.vo.MemberVO;

public interface MemberService {

	//회원가입
	public void join(MemberVO vo) throws Exception;
	
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
}