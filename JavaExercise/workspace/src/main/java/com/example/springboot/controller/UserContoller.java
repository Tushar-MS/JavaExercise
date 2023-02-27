package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.User;
import com.example.springboot.service.UserService;

@RestController
@RequestMapping("/company")
public class UserContoller {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public List<User> getAllUser(){
		return userService.findAll();
	}
	
	@GetMapping("/user/{name}")
	public User getUserName(@PathVariable String name){
		return userService.findUserName(name);
	}

}
