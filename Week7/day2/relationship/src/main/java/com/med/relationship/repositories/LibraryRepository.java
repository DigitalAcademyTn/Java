package com.med.relationship.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.med.relationship.models.Book;
import com.med.relationship.models.Library;

public interface LibraryRepository extends CrudRepository<Library, Long> {

    List<Library> findAll();
}
