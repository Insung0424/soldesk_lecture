package aa.bb.cc.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aa.bb.cc.beans.member;
import aa.bb.cc.validator.V;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@GetMapping("/up")
	public String up(member m) {
		return "up";
	}
	
	@GetMapping("/login")
	public String login(member m) {
		return "login";
	}
	
	@PostMapping("/confirm")
	public String Main(HttpSession session,member m) {
		member mem = (member) session.getAttribute("m");
		
		if(mem==null) {
			System.out.println("존재하지않는 ID입니다");
			return "index";
		}
		
		if(mem.getId().equals(m.getId()) && 
				mem.getPw().equals(m.getPw())) {
			return "Main";
		}
		
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@Valid member m, BindingResult r, HttpSession session) {
		if(r.hasErrors()) {
			return "up";
		}
		session.setAttribute("m", m);
		System.out.println("세션 등록 완료");
		return "index";
	}
	
	@GetMapping("/delete")
	public String delete(HttpSession session) {
		session.removeAttribute("m");
		System.out.println("세션삭제완료");
		return "index";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		V v = new V();
		binder.setValidator(v);
	}
}
