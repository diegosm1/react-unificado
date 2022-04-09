package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8089")
public class AppController {
	
	@GetMapping("/hello")
	public String hello() {
        return "Hello world!";
    }
}
