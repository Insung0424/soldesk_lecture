package aa.bb.mapper;

import java.util.List;

import aa.bb.main.Basic;
import aa.bb.main.BoardVO;

public interface BMapper {

	public List<BoardVO> getList();
	
	public void insert(BoardVO bo);
	
	public void inkey(BoardVO bo);
	
	public BoardVO read(int bnum);
	
	public int update(BoardVO bo);

	public int delete(int bnum);
	
	
	public List<BoardVO> getPage(Basic b);
	
}
