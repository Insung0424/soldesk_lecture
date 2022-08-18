package co.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.sol.beans.MemVO;
import co.sol.service.MemService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mem/*")
public class MemController {
	
	private final MemService mser;
	
	@GetMapping("/submit")
	public void sub() {
		
	}
	
	@PostMapping("/submit")
	public String submit(@RequestParam("mem_id") String id,
			@RequestParam("mem_pass") String pass,
			@RequestParam("mem_name") String name) {
		MemVO m = new MemVO();
		m.setMem_id(id);
		m.setMem_pass(pass);
		m.setMem_name(name);
		mser.submit(m);
		return "redirect:/mem/sign";
	}
	
	@GetMapping("/sign")
	public void si() {}
	
	@PostMapping("/log")
	public void log(@RequestParam("mem_id") String mem_id,
			@RequestParam("mem_pass") String mem_pass,Model m) {
		MemVO mvo = mser.log(mem_id, mem_pass);
		if(mvo != null) {
			m.addAttribute("mvo",mvo);
		}
		else {
			return;
		}
	}

}
