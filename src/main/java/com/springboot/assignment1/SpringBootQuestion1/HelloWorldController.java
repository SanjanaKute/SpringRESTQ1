package com.springboot.assignment1.SpringBootQuestion1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
		@GetMapping("/hello")
		public String helloWorld()  
		{  
		return "Hello World";  
		}  


}
