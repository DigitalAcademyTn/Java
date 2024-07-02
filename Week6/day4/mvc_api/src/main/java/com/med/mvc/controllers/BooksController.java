package com.med.mvc.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.med.mvc.models.Book;
import com.med.mvc.services.BookService;


@Controller
public class BooksController {

	private final BookService bookSer;

	public BooksController(BookService bookService) {
	        this.bookSer = bookService;
	    }

	
	@RequestMapping("/books")
	public String index(Model m) {
		
		List<Book> books = bookSer.allBooks();
		
        m.addAttribute("booksList", books);

		return "index.jsp";
	}
	
	@RequestMapping("/form")
	public String bookFrom() {
		return "bookForm.jsp";
	}
	
	
	
	@RequestMapping(value = "/create/form", method = RequestMethod.POST)
	public String create(
	    @RequestParam("title") String title,
	    @RequestParam("description") String description,
	    @RequestParam("language") String language,
	    @RequestParam("numberOFPage") Integer pages) 
	{
	    // CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
	    Book book = new Book(title, description, language, pages);
	    
	    bookSer.createBook(book);
	    return "redirect:/books";
	}
	
	
	@RequestMapping("/book/{id}")
	public String showBook(@PathVariable("id") Long id, Model m) {
		
		Book thisBook = bookSer.findBook(id);
		m.addAttribute("thisBook", thisBook);
		return "oneBook.jsp";
	}
	

	
	

}
