package com.gura.step01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String person(HttpServletRequest request){
		String person = "JOEUN HEO";
		request.setAttribute("person", person);
		
		return "person";
	}
}
