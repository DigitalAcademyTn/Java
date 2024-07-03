
package com.med.relationship.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.med.relationship.models.Book;
import com.med.relationship.models.Library;
import com.med.relationship.sevices.BookService;
import com.med.relationship.sevices.LibraryService;

import jakarta.validation.Valid;



@Controller
public class BookController {
	
	
	private final BookService bookServ;
	
	@Autowired
	private LibraryService librayServ;

	public BookController(BookService bookServ) {
		this.bookServ = bookServ;
	}
	
	// Display route -- home page
	@RequestMapping("/books")
	public String index(Model m) {
		
		List<Book> books = bookServ.allBooks();
		
        m.addAttribute("booksList", books);

		return "index.jsp";
	}
	
	//display route --book form--
	@RequestMapping("/book")
	public String form(@ModelAttribute("book") Book book,Model m) {
		
		List<Library> librariesList = librayServ.allLibrarys();
		m.addAttribute("libList", librariesList);
		
		return "bookForm.jsp";
	}
	
	//action route -- Cretae New Book
	@PostMapping("/books")
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "bookForm.jsp";
        } else {
        	bookServ.createBook(book);
            return "redirect:/books";
        }
    }
	
	//display route -- edit page
	@RequestMapping("/book/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model m) {
		Book oldBook = bookServ.findBook(id);
		m.addAttribute("book", oldBook);
		return "edit.jsp";
	}
	
	
	
	 @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
	    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            model.addAttribute("book", book);
	            return "edit.jsp";
	        } else {
	            bookServ.update(book);
	            return "redirect:/books";
	        }
	    }
	 
	 @DeleteMapping("/books/{id}/delete")
	 public String requestMethodName(@PathVariable("id") Long id) {
		 bookServ.delete(id);
	 	return "redirect:/books";
	 }
	 
	
	
	
	
	
	

}
