package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView getIndexPage() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
}
