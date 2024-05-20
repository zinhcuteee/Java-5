package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class B5ResultController {
	@RequestMapping("/a")
	public String m1() {
		return "a";
	}

	@RequestMapping("/b")
	public String m2(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "I come from b");
		return "redirect:/a";
	}

	@RequestMapping("/c")
	public String m3(RedirectAttributes params) {
		params.addAttribute("message", "I come from c");
		return "redirect:/a";
	}

	@RequestMapping("/d")
	public String m4(Model model) {
		model.addAttribute("message", "I come from d");
		return "a";
	}
}
