package com.pp.melmontazh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	@RequestMapping(value="/about", method = RequestMethod.GET)
	public String about(){
		return "about";
		
	}
	
	@RequestMapping(value="/uploadimg", method = RequestMethod.GET)
	public String uploadimg(){
		return "uploadimg";
		
	}
}
