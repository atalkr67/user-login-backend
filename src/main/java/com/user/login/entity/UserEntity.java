package com.user.login.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class UserEntity {
	
	public UserEntity() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UserId")
	private Long userId;
	
	@Column(name="UserName")
	private String name;
	
	@Column(name="EmailId")
	private String emailId;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Designation")
	private String designation;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address")
	private AddressEntity addressEntity;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = (long) userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

}
