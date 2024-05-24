package com.poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.entity.SP;
import com.poly.service.ShoppingCartService;


@Controller
@RequestMapping("item")
public class ItemController {
	@Autowired
	ShoppingCartService cart;

	@RequestMapping("index")
	public String cart(Model model) {
		model.addAttribute("items", SP.item.values());
		model.addAttribute("Count", cart.getCount());
		return "cart/spview";

	}

}
