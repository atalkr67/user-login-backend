package com.user.login.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="owner")
public class UserEntity {
	
	public UserEntity() {
		super();
	}

	@Id
	@Column(name="OwnerId")
	private Long ownerId;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Designation")
	private String designation;

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
