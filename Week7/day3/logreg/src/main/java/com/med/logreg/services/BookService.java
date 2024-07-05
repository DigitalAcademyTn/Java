package com.med.logreg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.logreg.models.Book;
import com.med.logreg.repositories.BookRepository;

@Service
public class BookService {
	
	// adding the book repository as a dependency
    @Autowired
    private BookRepository bookRepo;
    
    
 // returns all the books
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    
    // create a book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    //update book
    public Book update(Book b) {
    	return bookRepo.save(b);
    }
    
    
    //delete a book
    public void delete(Long id) {
    		bookRepo.deleteById(id);
    }


}
