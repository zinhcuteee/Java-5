package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
public class Lab1Bai42Controller {
    @RequestMapping("home")
    public String Home(Model model, HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        request.setAttribute("user", username);
        String password = request.getParameter("password");
        request.setAttribute("pass", password);
        // Create cookies for username and password
        Cookie usernameCookie = new Cookie("username", username);
        Cookie passwordCookie = new Cookie("password", password);

        // Set cookie expiration time (optional)
        usernameCookie.setMaxAge(24 * 60 * 60); // Set cookie to expire in 24 hours
        passwordCookie.setMaxAge(24 * 60 * 60); // Set cookie to expire in 24 hours

        // Add cookies to the response
        response.addCookie(usernameCookie);
        response.addCookie(passwordCookie);

        return "hello";
    }
}