package com.user.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.user.login.entity.UserEntity;

@Repository
public interface UserLoginRepository extends JpaRepository<UserEntity, Long> {
	@Query(value="select o from UserEntity o")
	List<UserEntity> getOwnerList();
	
}
