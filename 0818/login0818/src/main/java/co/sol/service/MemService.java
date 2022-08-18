package co.sol.service;

import co.sol.beans.MemVO;

public interface MemService {
	
	public void submit(MemVO m);
	
	public MemVO log(String mem_id,String mem_pass);
}
