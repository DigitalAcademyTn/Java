package com.med.helloviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
//	Model model = new Model()
	
	@RequestMapping("/")
	public String index(Model model) {
		String name = "adhar";
		
		model.addAttribute("username",name);
		
		return "index.jsp";
	}

	
	
	
	
	
}
