package com.anderson.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeController {
	
	@RequestMapping("/resume")
	public String resume() {
		return "resume";
	}

}
