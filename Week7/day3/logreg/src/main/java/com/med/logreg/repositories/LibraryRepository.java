package com.med.logreg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.med.logreg.models.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {

    List<Library> findAll();
}
