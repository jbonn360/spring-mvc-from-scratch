package com.gmail.nxhoaf;

import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	// Project guide here: https://nxhoaf.wordpress.com/2014/08/03/spring-mvc-creating-a-project-from-scratch-using-maven/
	// Good diagram to understand Spring MVC architecture here: https://www.baeldung.com/spring-controllers
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		Date date = new Date();
		model.addAttribute("serverTime", date);
		model.addAttribute("happyMessage", "Good things are coming");
		return "helloWorld";
	}
}
