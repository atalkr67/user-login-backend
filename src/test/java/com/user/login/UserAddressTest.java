package com.user.login;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.user.login.entity.AddressEntity;
import com.user.login.entity.UserEntity;
import com.user.login.repository.UserLoginRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserAddressTest {

	@Autowired
	private UserLoginRepository userLoginRepo;
	
	@Test
	void testUserCreation() {
		AddressEntity address = new AddressEntity();
		address.setAddress("Ashiyana Ramnagri Sector-2");
		
		UserEntity user = new UserEntity();
		user.setDesignation("SDE");
		user.setEmailId("anubhav.sharma@sde.com");
		user.setName("Anubhav Sharma");
		user.setAddress(address);
		assertNotNull(userLoginRepo.save(new UserEntity()));
	}
	
	
}
