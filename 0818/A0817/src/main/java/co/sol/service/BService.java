package co.sol.service;

import java.util.List;

import aa.bb.main.Basic;
import aa.bb.main.BoardVO;

public interface BService {
	
	Long submit(BoardVO bo);
	
	BoardVO get(int bnum);
	
	int modify(BoardVO bo);
	
	int del(int bnum);
	
	List<BoardVO> getList();
	
	boolean update(BoardVO bo);
	
	boolean dele(int bnum);
	
	List<BoardVO> getPage(Basic b);
	
}
