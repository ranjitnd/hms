package com.hms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hms.model.User;
import com.hms.repository.UserRepository;

@RestController
@RequestMapping("/app")
@CrossOrigin("*")
public class ApplicationController {

	@Autowired
	UserRepository userRep;

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<?> login(@Valid @RequestBody User userInput) {
		System.out.println("******************** in the login service. userId = " + userInput.getUserId() + " --- password = " + userInput.getPassword());
		return userRep.findByUserId(userInput.getUserId()).map(user -> {
			if (user.getPassword().equals(userInput.getPassword())) {
				return ResponseEntity.ok().body(user);
			}
			System.out.println("******************** User not found");

			return ResponseEntity.notFound().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
