package com.poly.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.poly.service.CookieService;
import com.poly.service.ParamService;
import com.poly.service.SessionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/account/")
public class AccountController {

	@Autowired
	CookieService cookieservise;
	@Autowired
	ParamService paramservice;
	@Autowired
	SessionService sessionservice;

	@GetMapping("login")
	public String Login() {
		return "account/login";
	}

	@PostMapping("login")
	public String login2(@RequestParam("attach") MultipartFile attach) {
		String un = paramservice.getString("username", "");
		String pw = paramservice.getString("password", "");
		boolean hh = paramservice.getboolean("remember", false);

		System.out.println(attach.getOriginalFilename());

		if (un.equals("Vinh") && pw.equals("2711")) {
			if (hh) {
				cookieservise.add("user", un, 10);
				cookieservise.add("pass", pw, 10);
				cookieservise.add("img", attach.getOriginalFilename(), 10);
				System.out.println("Lưu cookie");
			} else {
				cookieservise.remove("user");
				cookieservise.remove("pass");
				cookieservise.remove("img");
			}
		} else {
			System.out.println("Đăng nhập thất bại!");
		}
		File saveFile = paramservice.save(attach, "photo");
		return "/account/login";
	}

}
