package aa.bb.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aa.bb.main.BoardVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TMapperTests {

//	@Autowired
//	private TMapper tm;
//	
//	@Test
//	public void te() {
//		log.info("time==========");
//		log.info(tm.getTime());
//	}
	
	@Autowired
	private BMapper bm;
	
	
	@Test
	public void in() {
		BoardVO bo = new BoardVO();
		bo.setContent("content");
		bo.setWriter("author");
		bo.setTitle("title");
		bm.insert(bo);
		log.info(bo.toString());
	}
	
//	@Test
//	public void ink() {
//		BoardVO bo = new BoardVO();
//		bo.setContent("content4");
//		bo.setWriter("author4");
//		bo.setTitle("title4");
//		bm.inkey(bo);
//		log.info(bo.getBnum());
//		log.info(bo.toString());
//	}
	
	@Test
	public void read() {
		System.out.println("===========================");
		int bnum = 21;
		log.info(bm.read(bnum).toString());
	}
	
//	@Test
//	public void up() {
//		BoardVO bo = new BoardVO();
//		bo.setBnum(21);
//		bo.setTitle("ctitle");
//		bo.setContent("Changecontent");
//		bo.setWriter("author2");
//		bm.update(bo);
//		log.info(bo);
//	}
	
//	@Test
//	public void bt() throws Exception {
//		int bnum = 1;
//		bm.delete(bnum);
//		log.info(bm.getList().toString());
//	}
}
