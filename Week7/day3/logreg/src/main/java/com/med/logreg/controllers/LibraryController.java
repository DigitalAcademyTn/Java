package com.med.logreg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.med.logreg.models.Library;
import com.med.logreg.services.LibraryService;

import jakarta.validation.Valid;


@Controller
public class LibraryController {

	@Autowired
	private LibraryService librayServ;

	// display route --Library form--
	@RequestMapping("/library")
	public String form(@ModelAttribute("library") Library library, Model m) {
		
		List<Library> libreries = librayServ.allLibraries();
		
        m.addAttribute("libList", libreries);

		return "/library/libraryForm.jsp";
	}
	
	

	// action route -- Create New Library
	@PostMapping("/library/new")
	public String create(@Valid @ModelAttribute("library") Library library, BindingResult result, Model m) {
		if (result.hasErrors()) {
			List<Library> libreries = librayServ.allLibraries();
	        m.addAttribute("libList", libreries);
			return "/library/libraryForm.jsp";
		} else {
			librayServ.createLibrary(library);
			return "redirect:/library";
		}
	}
	
	
	// display route -- show library books list
	@RequestMapping("/library/{id}")
	public String requestMethodName(@PathVariable("id") Long id, Model model) {
		
		Library thisLib = librayServ.findLibrary(id);
		model.addAttribute("library", thisLib);
		
		return "/library/booksLib.jsp";
	}
	

}
