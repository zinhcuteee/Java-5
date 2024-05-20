package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poly.model.Product;

@Controller
public class B3ProductController {

	@GetMapping("/product")
	public String form(Product product) {
		product.setName("Iphone");
		product.setPrice(50.0);
		return "/formB3";
	}

	@PostMapping("/product/saveB3")
	public String save(@ModelAttribute Product product, Model model) {
		product.setPrice(product.getPrice() * 2);
		return "/formB3";
	}
}
