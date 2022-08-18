package co.sol.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.sol.beans.MemVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemTests {
	
	@Autowired
	private MemDAO mdao;
	
	@Test
	public void test() {
		MemVO m = new MemVO();
		m.setMem_id("tID");
		m.setMem_pass("tPass");
		m.setMem_name("tNAME");
		mdao.submit(m);
		log.info(m.toString());
	}
	
	@Test
	public void Test() {
		String id = "testid";
		String pass = "testpass";
		MemVO m = mdao.log(id, pass);
		log.info(mdao.log(id, pass));
		log.info(m);
		
	}

}
