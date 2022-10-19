package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	// expose '/' that return "hello world"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! time on server is "+ LocalDateTime.now();
	}
	
	// expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDeilyWorkout() {
		return "Run 5k!";
	}
}