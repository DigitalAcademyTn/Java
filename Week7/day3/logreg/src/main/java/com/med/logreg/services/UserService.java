package com.med.logreg.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.med.logreg.models.Book;
import com.med.logreg.models.LoginUser;
import com.med.logreg.models.User;
import com.med.logreg.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	// TO-DO: Write register and login methods!
	public User register(User newUser, BindingResult result) {
		// TO-DO: Additional validations!

		Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
		if(potentialUser.isPresent()) {
			result.rejectValue("email", "regiterError", "Email already used");
		}
		
		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("password", "regiterError", "Password doesn't mash");
		}
		
		if (result.hasErrors()) {
			return null;
		}else {
			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			
			newUser.setPassword(hashed);
			// save the user
			return userRepo.save(newUser);

		}

	}

	public User login(LoginUser newLoginObject, BindingResult result) {
		// TO-DO: Additional validations!
		
		Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
		if(!potentialUser.isPresent()) {
			result.rejectValue("email", "loginError", "Email not found");
		} else {
			
			User user = potentialUser.get();
			
			if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
			    result.rejectValue("password", "loginError", "Invalid Password!");
			}
			
			if(result.hasErrors())
			{
				return null;
			}
			else {
				return user;
			}

		}
		
		
		return null;
	}
	
	
    // retrieves a book
    public User findUser(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        if(optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            return null;
        }
    }
	
	
}
