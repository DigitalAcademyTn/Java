package com.med.logreg.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.med.logreg.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	Optional<User> findByEmail(String email);

}
