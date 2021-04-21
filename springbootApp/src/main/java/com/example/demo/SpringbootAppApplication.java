package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.userrepository;
import com.example.demo.model.User;

@SpringBootApplication
 public class SpringbootAppApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppApplication.class, args);
	}
	@Autowired
	userrepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		this.userRepo.save(new User("ben","souza", "ben@gamil.com"));
		this.userRepo.save(new User("robo","sophia", "sophia@gamil.com"));
		
	}

}
