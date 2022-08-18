package co.sol.service;

import org.springframework.stereotype.Service;

import co.sol.beans.MemVO;
import co.sol.mapper.MemDAO;
import lombok.RequiredArgsConstructor;

@Service(value="MemServiceImpl")
@RequiredArgsConstructor
public class MemServiceImpl implements MemService {

	private final MemDAO MD;
	
	@Override
	public void submit(MemVO m) {
		MD.submit(m);
	}

	@Override
	public MemVO log(String mem_id, String mem_pass) {
		MemVO m = MD.log(mem_id, mem_pass);
		return m;
	}

}
