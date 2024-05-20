package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lab1Bai2Controller {
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", "Spring Tool Suite 4");
		return "index";
	}

}
