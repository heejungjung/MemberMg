package com.yi.service;

import java.util.List;
import com.yi.domain.BoardVO;
import com.yi.domain.Criteria;

public interface BoardService {
	public void register(BoardVO board);
	
	public BoardVO get(String mid);
	public boolean modify(BoardVO board);
	public boolean remove(int id);
	public List<BoardVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
}
