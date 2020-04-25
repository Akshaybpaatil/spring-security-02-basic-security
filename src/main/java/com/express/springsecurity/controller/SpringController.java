package com.express.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
}
