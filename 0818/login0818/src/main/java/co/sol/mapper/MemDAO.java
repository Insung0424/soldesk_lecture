package co.sol.mapper;

import org.apache.ibatis.annotations.Param;

import co.sol.beans.MemVO;

public interface MemDAO {

	public void submit(MemVO m);
	
	public MemVO log(@Param("mem_id") String mem_id,@Param("mem_pass") String mem_pass);
}
