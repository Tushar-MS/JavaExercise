package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
  public List<User> findAll() {
	 return userRepository.findAll();
  }
  
  public User findUserName(String name) {
	 return userRepository.findItemByUser(name);
   }
}
