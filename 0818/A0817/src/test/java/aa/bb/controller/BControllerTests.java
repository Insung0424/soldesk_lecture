package aa.bb.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import co.sol.service.BService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Log4j
public class BControllerTests {
	
	@Autowired
	private BService bm;

	@Setter(onMethod_= {@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mc;
	
	@Before
	public void setup() {
		this.mc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	
//	@Test
//	public void testList() throws Exception {
//		log.info(mc.perform(MockMvcRequestBuilders.get("/board/list"))
//				.andReturn().getModelAndView().getModelMap());
//	}
//	
//	
//	@Test
//	public void testSubmit() throws Exception {
//		log.info(mc.perform(MockMvcRequestBuilders.post("/board/submit")
//				.param("title", "testtitle")
//				.param("content", "testContext")
//				.param("writer", "testWriter")).andReturn());
//	}
//	
//	@Test
//	public void testModify() throws Exception {
//		log.info(mc.perform(MockMvcRequestBuilders.post("/board/modify")
//				.param("bnum", "44")
//				.param("title", "changetitle")
//				.param("content","changecontent")
//				.param("writer", "testWriter")).andReturn());
//	}
	
//	@Test
//	public void testDelete() throws Exception {
//		log.info(mc.perform(MockMvcRequestBuilders.post("/board/delete")
//				.param("bnum", "81")).andReturn());
//	}
	
	
}
