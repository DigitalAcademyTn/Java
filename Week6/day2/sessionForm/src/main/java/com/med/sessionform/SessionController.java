package com.med.sessionform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/home")
public class SessionController {
	
	//HttpSession session = new HttpSession();
	
	@RequestMapping("/")
	public String index(Model m, HttpSession session) {
		
		String name = "Joe Doe";
		m.addAttribute("username", name);
		
		
		String otherName = "James";
		session.setAttribute("otherName", otherName);
		
		return "index.jsp";
	}
	
	
	@RequestMapping("/other")
	public String other(HttpSession s) {
		
		String thisName = (String) s.getAttribute("otherName");
		System.out.println(thisName);
		
		return "demo/cool.jsp";
	}
	
	
	

}
