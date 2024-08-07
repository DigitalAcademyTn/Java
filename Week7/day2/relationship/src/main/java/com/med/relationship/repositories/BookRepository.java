package com.med.relationship.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.med.relationship.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	// this method retrieves all the books from the database
    List<Book> findAll();
    
}