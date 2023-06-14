package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	// url = http://localhost:80/hello

	// output = Hello World
	@GetMapping("/")
	public String helloWorld() {
		return "Hello CI/CD";
	}

	// url = http://localhost:8080/hello

	// output = Hello World
	@GetMapping("/hello")
	public String hello() {
		return "Hello Test-1";
	}

	// url = http://localhost:8080/hello/{name}
	@GetMapping("/hello/{name}")
	public String helloName(@PathVariable String name) {
		return String.format("Hello %s!", name);
	}
}
