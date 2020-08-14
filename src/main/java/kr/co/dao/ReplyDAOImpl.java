package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import jdk.jfr.Registered;
import kr.co.vo.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	@Inject SqlSession sql;
	
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception {
		return sql.selectList("replyMapper.readReply",bno);
	}

	@Override
	public void writdReply(ReplyVO vo) throws Exception{
		sql.insert("replyMapper.writeReply", vo);
	}

	@Override
	public void updateReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update("replyMapper.updateReply", vo);
		
	}

	@Override
	public void deleteReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.delete("replyMapper.deleteReply", vo);
	}

	@Override
	public ReplyVO selectReply(int rno) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne("replyMapper.selectReply", rno);
	}
}
