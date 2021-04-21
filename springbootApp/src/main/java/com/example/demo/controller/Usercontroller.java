package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.userrepository;
import com.example.demo.model.User;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class Usercontroller {
	
	@Autowired
	userrepository userRepo;
	
	@GetMapping("users")
	public List<User> getUsers() {
		return this.userRepo.findAll();
		
	}

}
