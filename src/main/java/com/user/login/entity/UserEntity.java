package com.user.login.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {
	
	public UserEntity() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Long userId;
	
	@Column(name="USER_NAME")
	private String name;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ADDRESS", referencedColumnName = "ADDRESS_ID")
	private AddressEntity address;

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

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "\"UserEntity\": {\n\t\"userId\":" + userId + ", \n\t\"name\":" + name + ", \n\t\"emailId\":" + emailId
				+ ", \n\t\"designation\":" + designation + ", \n\t\"address\":" + address + "\n}";
	}
	
}
