package com.user.login.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class AddressEntity {

	public AddressEntity(int addressId, String address) {
		super();
		this.addressId = addressId;
		this.address = address;
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="address")
	private String address; 
	
	@OneToMany(cascade = CascadeType.ALL,
            mappedBy = "address")
	private List<UserEntity> userEntity = new ArrayList<>();

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<UserEntity> getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(List<UserEntity> userEntity) {
		this.userEntity = userEntity;
	}
	
	
}
