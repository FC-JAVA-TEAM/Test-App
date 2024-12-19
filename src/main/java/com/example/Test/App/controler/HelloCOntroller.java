package com.example.Test.App.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCOntroller {
	
	@GetMapping
	public String hello() {
		return "from Test app live";
	}

}
