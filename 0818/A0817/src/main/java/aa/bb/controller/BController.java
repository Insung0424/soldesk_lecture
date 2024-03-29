package aa.bb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aa.bb.main.Basic;
import aa.bb.main.BoardVO;
import aa.bb.main.PageDTO;
import co.sol.service.BService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequiredArgsConstructor
@Log4j
@RequestMapping("/board/*")
public class BController {

	private final BService service;
	
	@GetMapping("/list")
	public void list(Model m,Basic b) {
		System.out.println("over here");
		
		m.addAttribute("list",service.getPage(b));
		PageDTO pdto = new PageDTO(b,234);
		m.addAttribute("pdto",pdto);
	}
	
	@GetMapping("/list?pNum={#page}&amount={#amount}")
	public String listpage(Model m,Basic b,@RequestParam("pNum") int p,
			@RequestParam("amount") int a) {
		b.setPNum(p);
		b.setAmount(a);
		m.addAttribute("list",service.getPage(b));
		PageDTO pdto = new PageDTO(b,234);
		m.addAttribute("pdto",pdto);
		return "redirect:/board/list";
	}
	
	@GetMapping("/submit")
	public void submit() {}
	
//	@GetMapping("/get")
//	public void get(@RequestParam("bnum") int bnum, Model m) {
//		m.addAttribute("board",service.get(bnum));
//	}
	
	//글을 등록한 후 목록페이지로 넘어갈 때 글 번호를 같이 가지고 간다
	@PostMapping("/submit")
	public String submit(BoardVO bo,RedirectAttributes rt) {
		Long bnum = service.submit(bo);
		rt.addFlashAttribute("result",bnum);
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get","/modify"})
	public void get2(@RequestParam("bnum") int bnum, Model m) {
		m.addAttribute("board",service.get(bnum));
	}
	
	@PostMapping("/modi")
	public String modify(BoardVO bo, RedirectAttributes rt) {
		if(service.modify(bo)==1) {
			rt.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/delete")
	public String del(@RequestParam("bnum") int bnum, RedirectAttributes rt) {
		if(service.del(bnum)==1) {
			rt.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
	
	
}

