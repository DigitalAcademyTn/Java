package com.med.sessionform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class FormController {
	
	@RequestMapping("/form")
	public  String form() {
		
		return "form.jsp";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public  String process(@RequestParam("email") String email,
			@RequestParam("password") String pas,
			HttpSession s,
			RedirectAttributes flash) {
		
		if (pas.length() < 4) {
			flash.addFlashAttribute("errorMsg", "the passord is too short");
			return "redirect:/form";
		}
		
		s.setAttribute("email", email);
		s.setAttribute("password", pas);
		
		System.out.println("you have been charged 20$ !!");
		
//You ever never render on POST request !!!
		
		return "redirect:/result";
	}
	
	
	
	@RequestMapping("/result")
	public String result() {
		
		return "result.jsp";
	}
	

}
