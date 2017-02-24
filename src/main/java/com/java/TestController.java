package com.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/HelloWorld.html")
	public ModelAndView firstPage() {
		return new ModelAndView("HelloWorld");
	}

}