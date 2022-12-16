package com.ingris.calculator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/")
	public ModelAndView main(ModelAndView mav) {
		mav.setViewName("survey");
		return mav;
	}
	
	@GetMapping("/test")
	public ModelAndView test(ModelAndView mav) {
		mav.setViewName("test");
		return mav;
	}
	
	@GetMapping("/ajaxaboutYouResult")
	public Map<String, Object> aboutYouResult(@RequestParam Map<String,Object> param) {
		System.out.println("컨트롤러로 넘어왔다!");
		Map<String, Object> result = new HashMap<String, Object>();
		String sex =(String)param.get("sex");
		String age =(String)param.get("age");
		System.out.println("성별 : "+ sex +"\t 나이 :" + age);
		result.put("sex", sex);
		result.put("age", age);
		return result;
	}
	
	
}
