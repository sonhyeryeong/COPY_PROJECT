package com.ingris.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/")
	public ModelAndView main(ModelAndView mav) {
		mav.setViewName("layouts/test");
		return mav;
	}
	@GetMapping("/survey")
	public ModelAndView survey(ModelAndView mav) {
		mav.setViewName("survey");
		return mav;
	}
	
}
