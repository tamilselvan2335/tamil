package com.example.OAUTH2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OAUTH2.model.Role;
import com.example.OAUTH2.model.User;

@RestController
public class UserController {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "hello"+name;
	}
	@PostMapping("/post")
	public String hello2(@RequestBody User user) {
		
		return "hello";
	}
	@PostMapping("/postRole")
	public String hello3(@RequestBody Role role) {
		
		return "hello";
	}
	
}
