package com.jbk.ApiTask.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task_1 {
	
	@GetMapping("/api")
	public String get() {
		return "hello";
		
	}
	
	@GetMapping("/api/login/{username}")
	public String getusername(@PathVariable String username) {
		return username;
			
	}
	
	@GetMapping("/api/login/{username}/{password}")
	public String getusernamePassword(@PathVariable String username,@PathVariable String password) {
		return "username ="+username+" "+"password="+password;
			
	}
	
	@DeleteMapping("/api/delete/{name}")
	public String deletename(@PathVariable String name) {
		return "delete ="+name;
	}
	
	@PutMapping("/api/update")
	public Login put(@RequestBody Login student) {
		System.out.println("Id :"+student.getId());
		System.out.println("username :"+student.getUsername());
		System.out.println("password :"+student.getPassword());
		System.out.println("mail :"+student.getMail());
		return student;
	
		
	}
	
	@PostMapping("/api/add")
	public Login post(@RequestBody Login student) {
		System.out.println("Id :"+student.getId());
		System.out.println("username :"+student.getUsername());
		System.out.println("password :"+student.getPassword());
		System.out.println("mail :"+student.getMail());
		return student;
	
		
	}

}
