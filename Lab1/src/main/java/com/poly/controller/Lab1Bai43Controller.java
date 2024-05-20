package com.poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.model.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("user")
public class Lab1Bai43Controller {
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpServletResponse response;

	@GetMapping("create")
	public String createGet() {
		return "user_create";
	}

	@PostMapping("create")
	public String createPost() {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password);

		request.setAttribute("user", user);
		return "user_detail";
	}

}
