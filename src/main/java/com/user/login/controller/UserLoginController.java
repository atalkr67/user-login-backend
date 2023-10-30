package com.user.login.controller;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.login.entity.UserEntity;
import com.user.login.repository.UserLoginRepository;

@RestController
public class UserLoginController {
	
	@Autowired
	UserLoginRepository userLoginRepository;

	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserEntity>> getData() {
		if(userLoginRepository.findAll().isEmpty()){
			IntStream.range(0,1000).forEach(i -> saveRandomUser());
		}
		return ResponseEntity.ok(userLoginRepository.findAll());
	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userEntity) {
		return ResponseEntity.ok(userLoginRepository.save(userEntity));
	}

	@GetMapping("/saveRandomUser")
	public ResponseEntity<UserEntity> saveRandomUser() {
		UserEntity user = new UserEntity();
		Random random = new Random();
		user.setAddress(nextString(random.nextInt(10)+10)+" "+nextString(random.nextInt(10)+10));
		user.setDesignation(nextString(random.nextInt(10)+10));
		user.setFirstName(nextString(random.nextInt(10)+10));
		user.setLastName(nextString(random.nextInt(10)+10));
		return ResponseEntity.ok(userLoginRepository.save(user));
	}

	public String nextString(int n){
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		for(int i=0;i<n;i++){
			builder.append(((char)(random.nextInt(26)+64)));
		}
		return builder.toString();
	}
}
