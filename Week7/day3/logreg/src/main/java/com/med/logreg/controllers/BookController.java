package com.med.logreg.controllers;

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

import com.med.logreg.models.Book;
import com.med.logreg.models.Library;
import com.med.logreg.models.User;
import com.med.logreg.services.BookService;
import com.med.logreg.services.LibraryService;
import com.med.logreg.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;



@Controller
public class BookController {
	
	@Autowired
	private BookService bookServ;
	
	@Autowired
	private LibraryService libraryServ;
	
	@Autowired
	private UserService userServ;
	
	@RequestMapping("/home")
	public String home(Model m, HttpSession s) {
		
		Long userId = (Long) s.getAttribute("user_id") ;
		if (userId == null) {
			return "redirect:/";
		}

    	User logedUser = userServ.findUser(userId);
		m.addAttribute("user", logedUser);
		List<Book> bookList=  bookServ.allBooks();
		m.addAttribute("booksList", bookList);
		return "home.jsp";
	}
	
	
	//display route --book form--
		@RequestMapping("/book")
		public String form(@ModelAttribute("book") Book book,Model m) {
			
			List<Library> librariesList = libraryServ.allLibraries();
			m.addAttribute("libList", librariesList);
			
			return "bookForm.jsp";
		}
		
		//action route -- Create New Book
		@PostMapping("/books")
	    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, Model m,HttpSession s) {
	        if (result.hasErrors()) {
	        	List<Library> librariesList = libraryServ.allLibraries();
				m.addAttribute("libList", librariesList);
	            return "bookForm.jsp";
	        } else {
	        	Long userId = (Long) s.getAttribute("user_id");
	        	User logedUser = userServ.findUser(userId);
	        	book.setUser(logedUser);
	        	bookServ.createBook(book);
	            return "redirect:/home";
	        }
	    }
		
		
		//display route -- edit page
		@RequestMapping("/book/{id}/edit")
		public String edit(@PathVariable("id") Long id, Model m, HttpSession s) {
			// Guard Route
			Long userId = (Long) s.getAttribute("user_id") ;
			if (userId == null) {
				return "redirect:/";
			}
			Book oldBook = bookServ.findBook(id);
			m.addAttribute("book", oldBook);
			return "edit.jsp";
		}
		
		
		// action route -- update book
		 @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
		    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {
		        if (result.hasErrors()) {
//		            model.addAttribute("book", book);
		            System.out.println("test");
		            return "edit.jsp";
		        } else {
		            bookServ.update(book);
		            return "redirect:/home";
		        }
		    }
		
		
		// Delete book
		 @DeleteMapping("/books/{id}/delete")
		 public String requestMethodName(@PathVariable("id") Long id) {
			 bookServ.delete(id);
		 	return "redirect:/home";
		 }
	
	

		//show one book info
		@RequestMapping("/book/{id}")
		public String showBook(@PathVariable("id") Long id,Model m, HttpSession s) {
			//Guard Route
			Long userId = (Long) s.getAttribute("user_id") ;
			if (userId == null) {
				return "redirect:/";
			}
			Book thisBook = bookServ.findBook(id);
			m.addAttribute("book", thisBook);
			return "show.jsp";
		}
		
	

}
