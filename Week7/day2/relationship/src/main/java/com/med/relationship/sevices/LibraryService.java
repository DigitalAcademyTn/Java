package com.med.relationship.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.relationship.models.Library;
import com.med.relationship.repositories.LibraryRepository;

@Service
public class LibraryService {
	
	
	// adding the library repository as a dependency
    @Autowired
    private LibraryRepository libraryRepo;
    
    
    
    
    // returns all the librarys
    public List<Library> allLibrarys() {
        return libraryRepo.findAll();
    }
    
    // create a library
    public Library createLibrary(Library b) {
        return libraryRepo.save(b);
    }
    
    // retrieves a library
    public Library findLibrary(Long id) {
        Optional<Library> optionalLibrary = libraryRepo.findById(id);
        if(optionalLibrary.isPresent()) {
            return optionalLibrary.get();
        } else {
            return null;
        }
    }
    
    public Library update(Library b) {
    	return libraryRepo.save(b);
    }
    
    public void delete(Long id) {
    		libraryRepo.deleteById(id);
    }

}
