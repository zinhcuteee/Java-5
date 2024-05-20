package com.poly.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poly.model.Student;

@Controller
public class StudentController {

	@ModelAttribute("genders")
	public Map<Boolean, String> getGenders() {
		Map<Boolean, String> map = new HashMap<>();
		map.put(true, "Male");
		map.put(false, "Female");
		return map;
	}

	@ModelAttribute("faculties")
	public List<String> getFaculties() {
		return Arrays.asList("CNTT", "DLNHKS", "QTDN");
	}

	@ModelAttribute("hobbies")
	public Map<String, String> getHobbies() {
		Map<String, String> map = new HashMap<>();
		map.put("T", "Travelling");
		map.put("M", "Music");
		map.put("F", "Food");
		map.put("O", "Other");
		return map;
	}

	@GetMapping("/student/form")
	public String form(Model model) {
		model.addAttribute("sv", new Student());
		return "/form";
	}

	@PostMapping("/student/save")
	public String save(@Validated @ModelAttribute("sv") Student sv, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        return "/form";
	    }
		System.out.println(sv.getName());
		System.out.println(sv.getEmail());
		System.out.println(sv.getMarks());
		System.out.println(sv.getGender());
		System.out.println(sv.getFaculty());
		System.out.println(sv.getHobbies());
		return "/form";
	}
}