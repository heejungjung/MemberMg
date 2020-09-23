package com.yi.mapper;

import com.yi.domain.ReplyVO;

public interface ReplyMapper {
	public void insert(ReplyVO vo);
	public ReplyVO read(int bno);
	public ReplyVO read1(int bno);
	public void delete(int rno);
	public int update(ReplyVO vo);
}
