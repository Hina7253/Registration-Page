package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.exam.entity.UserDtls;
import com.exam.repository.UserRepository;

import jakarta.servlet.http.HttpSession;
@Controller
public class UserController {
	
	private UserRepository repo;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDtls u, HttpSession session) 
	{
		System.out.println(u);
		repo.save(u);
		session.setAttribute("message", "Registration Successful");
		return "redirect:/";
	}

}
