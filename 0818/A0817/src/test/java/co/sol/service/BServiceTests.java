package co.sol.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aa.bb.main.BoardVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BServiceTests {
	
	@Autowired
	@Qualifier("BServiceImpl")
	private BService bser;
	
//	@Test
//	public void aa() {
//		log.info(bser);
//	}
//	
	@Test
	public void su() {
		BoardVO bo = new BoardVO();
		bo.setTitle("title5");
		bo.setContent("content5");
		bo.setWriter("writer5");
		log.info(bser.submit(bo));
	}
//	
//	@Test
//	public void re() {
//		log.info(bser.get(46));
//	}
//	
//	@Test
//	public void upd() {
//		BoardVO bo = new BoardVO();
//		bo.setTitle("title6");
//		bo.setContent("content6");
//		bo.setWriter("writer6");
//		log.info(bser.modify(bo));
//		log.info(bser);
//	}
//	
//	@Test
//	public void getList() {
//		log.info(bser.getList());
//	}
//	
//	@Test
//	public void del() {
//		log.info(bser.getList());
//		bser.del(22);
//		log.info(bser.getList());
//	}
//	
//	@Test
//	public void up() {
//		BoardVO bo = bser.get(21);
//		// 수정하고자 하는 글을 가져온다
//		if(bo == null) {
//			// 존재 하지않는 다면 수정 작업을 취소하고
//			return;
//		}
//		bo.setContent("change content");
//		//있다면 변경내용을 set해주고 
//		log.info(bser.update(bo));
//		// update를 해준다
//	}
	
//	@Test
//	public void delete(int bnum) {
//		log.info(bser.getList());
//		
//		BoardVO bo = bser.get(bnum);
//		if(bo == null) {
//			return;
//		}
//		bser.dele(bnum);
//		
//		log.info(bser.getList());
//	}
}
