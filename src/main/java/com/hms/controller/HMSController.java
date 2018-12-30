package com.hms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HMSController {
	
	@RequestMapping("/")
	public String home() {
		return "Hospital Management System application is up and running !!!";
	}

}
