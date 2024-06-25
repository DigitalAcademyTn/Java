package com.med.hellospring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@RequestMapping("/hello")
	public String helloWorld() {
		
		return "<h1>hello there</h1> <hr> <p>this is spring</p>";
	}
	
    @RequestMapping("/cool")
    public String cool() {
            return "this is cool";
    }
    
//    ==== Query parameters ====
//    localhost:8080/search?q=java
    
    @RequestMapping("/search")
    public String search(@RequestParam(value="q") String searchQuery) {
    	return "you searched for " + searchQuery;
    }
    
    
//    ==== path varaiable ===
//  localhost:8080/hello/jane
    
    @RequestMapping("/hello/{name}")
     public String sayHello(@PathVariable("name") String username) {
    	 return "Hello " + username;
     }
    
 // joe has 4 apples
    @RequestMapping("/hello/{name}/{var}/{count}")
    public String findTwo(@PathVariable("name") String name,
    		@PathVariable("var") String var,
    		@PathVariable("count") int count) {
    	if(count > 5) {
    		return name + " has too many " + var; 
    	}
    	else {
    		return "you found " + name + " and they have " + count + " " + var;
    	}
    	
   	 
    }
    
    
    
    
    

}
