package co.sol.service;

import java.util.List;

import org.springframework.stereotype.Service;

import aa.bb.main.Basic;
import aa.bb.main.BoardVO;
import aa.bb.mapper.BMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service(value = "BServiceImpl")
@RequiredArgsConstructor
@Log4j
public class BServiceImpl implements BService {

	private final BMapper bm;

	@Override
	public Long submit(BoardVO bo) {
		bm.inkey(bo);
		return (long) bo.getBnum();
	}

	@Override
	public BoardVO get(int bnum) {
		return bm.read(bnum);
	}

	@Override
	public int modify(BoardVO bo) {
		return bm.update(bo);		
	}

	@Override
	public int del(int bnum) {
		return bm.delete(bnum);
	}

	@Override
	public List<BoardVO> getList() {
		return bm.getList();
	}

	@Override
	public boolean update(BoardVO bo) {
		return bm.update(bo) == 1;
	}

	@Override
	public boolean dele(int bnum) {
		return bm.delete(bnum) == 1;
	}

	@Override
	public List<BoardVO> getPage(Basic b) {
		return bm.getPage(b);
	}
	
	
}
