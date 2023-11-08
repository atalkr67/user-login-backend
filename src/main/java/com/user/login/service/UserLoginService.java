package com.user.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.login.entity.UserEntity;
import com.user.login.repository.UserLoginRepository;

@Service
public class UserLoginService {
	
	@Autowired()
	UserLoginRepository userLoginRepository;
	
	public List<UserEntity> userLoginService(){
		List<UserEntity> userList = userLoginRepository.findAll();
//		List<UserEntity> userListReturn = userList.stream().filter(filter -> )
		return userList;
	}
	
	public Optional<UserEntity> getUserByIdService(Long ownerId) {
		Optional<UserEntity> userList = userLoginRepository.findById(ownerId);
//		List<UserEntity> userListReturn = userList.stream().filter(filter -> )
		return userList;
	}

}
