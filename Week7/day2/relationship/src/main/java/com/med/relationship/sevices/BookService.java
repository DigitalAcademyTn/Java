package com.med.relationship.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.med.relationship.models.Book;
import com.med.relationship.repositories.BookRepository;


@Service
public class BookService {
	
	// adding the book repository as a dependency
    private final BookRepository bookRepo;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepo = bookRepository;
    }
    
    
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
    
    public Book update(Book b) {
    	return bookRepo.save(b);
    }
    
    public void delete(Long id) {
    		bookRepo.deleteById(id);
    }

}
