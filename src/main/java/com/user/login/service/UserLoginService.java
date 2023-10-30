package com.user.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.login.entity.UserEntity;
import com.user.login.repository.UserLoginRepository;


public class UserLoginService {
	
	@Autowired
	UserLoginRepository userLoginRepository;
	
	public List<UserEntity> userLoginService(){
		List<UserEntity> userList = userLoginRepository.getOwnerList();
//		List<UserEntity> userListReturn = userList.stream().filter(filter -> )
		return userList;
	}
}
