package com.user.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {
	
	@GetMapping("/getData")
	public String getData() {
		return "Hi";
	}
}
