package com.user.login.controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.login.entity.UserEntity;
import com.user.login.repository.UserLoginRepository;
import com.user.login.service.UserLoginService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/getUsers")
public class UserLoginController {
	
	@Autowired
	UserLoginRepository userLoginRepository;
	
	@Autowired
	UserLoginService userLoginService;

	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserEntity>> getData() {
//		if(userLoginRepository.findAll().isEmpty()){
//			IntStream.range(0,1000).forEach(i -> saveRandomUser());
//		}
		//return ResponseEntity.ok(userLoginRepository.findAll());
		return new ResponseEntity<>(userLoginService.userLoginService(), HttpStatus.OK);
	}
	
	@GetMapping("/getAllUsers/{ownerId}")
	public ResponseEntity<Optional<UserEntity>> getUserById(@PathVariable Long ownerId){
		return ResponseEntity.ok(userLoginService.getUserByIdService(ownerId));
	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userEntity) {
		return ResponseEntity.ok(userLoginRepository.save(userEntity));
	}

	@GetMapping("/saveRandomUser")
	public ResponseEntity<UserEntity> saveRandomUser() {
		UserEntity user = new UserEntity();
		Random random = new Random();
		user.setUserId(183);
		user.setAddress("Bangalore");
		user.setDesignation("Software Engineer");
		user.setName("Atal Kumar");
		user.setEmailId("atalkr67gmail.com");
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
